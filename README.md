# type-system-java

This repository is built to be opened in Gitpod.io.

[![Open in Gitpod](https://gitpod.io/button/open-in-gitpod.svg)](https://gitpod.io/#https://github.com/blalasaadri/type-system-java)

## Available commands
Once the Gitpod environment has started, you will have the following custom commands available:
- `build` will compile the current project (equivalent to `mvn package`)
- `clean` will delete compiled artifacts (equivalent to `mvn clean`)
- `run` will run the application (equivalent to `java -jar target/type-system-java-1.0-SNAPSHOT.jar`)
- `run-tests` will run the tests (equivalent to `mvn test`)

## Project structure
In this project, all production code is in the `./src/main/java` directory while the test code is in the `./src/test/java` directory.
When compiled (using `build` or `mvn package`), the compiled artifacts will be in the `./target/` directory.

All files which are prefixed with `.gitpod` are intended for the use with Gitpod.io and are, in general, not relevant to the user.
The same is true for the directory `.settings` and the files `.classpath` and `.project` - these are generated when initializing the workspace and are not checked in.
