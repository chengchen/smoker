#!/usr/bin/env bash

generate_user_ids() {
    # generate maximum 1200 user ids
    NB_USER_IDS=$RANDOM
    let "NB_USER_IDS %= 1200"

    # generate in json array
    IDS="[1"
    for i in `seq 2 ${NB_USER_IDS}`;
    do
        IDS+=",$i"
    done
    IDS+="]"

    echo ${IDS}
}

# do 1000 times
for i in `seq 1 500`;
do
    USER_IDS=$(generate_user_ids)
    RESPONSE=$(curl -s -w " [Status: %{http_code}]" -X POST http://localhost:8080 -H "Content-Type: application/json" -d ${USER_IDS})
    echo "Call ${i} => ${RESPONSE}"
done
