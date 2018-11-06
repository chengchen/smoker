# Potato

Buggy potato app for interview purpose

## Requirements

* Java
* Maven
* Docker

## How to play with it

Build and run the app with:

```
$ mvn clean install
$ docker-compose up
```

If you execute this script which launches some calls to the exposed API, you should expect an OOM error:

```
$ ./test.sh
```

* Please try to find the root cause of the issue and explain what is happening under the hood.
* Propose and implement a realistic solution to fix this OOM error without changing the business requirements.
