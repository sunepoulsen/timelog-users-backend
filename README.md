# TimeLog Users Backend

TimeLog backend to store required settings for each user

## Build and running

### Build actions

| Action | Command |
| ------ | ------- |
| Clean  | `./gradlew clean` |
| Build  | `./gradlew build` |
| Run component tests | `./gradlew :timelog-users-component-tests:test --tests * -Pcomponent-tests` |
| Run stress tests | `./gradlew :timelog-users-stress-tests:test --tests * -Pstress-tests` |
| Run stress tests with the local profile | `./gradlew :timelog-users-stress-tests:test --tests * -Pstress-tests -Dstress.test.profile=local` |

### Run the application

We used `docker-compose` to run the application. `./gradlew run` is not supported.

To run the application do

```bash
cd timelog-users-backend-service/docker/local
docker-compose up -d
```

The application will be exposed on random ports. To see them run

```bash
cd timelog-users-backend-service/docker/local
docker-compose ps
```
