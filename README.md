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

If you do this call, you should expect an OOM error:

```
$ curl http://localhost:8080
```

Please try to find the cause of the issue, and propose a feasible solution.
