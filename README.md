# Football Manager (Spring Boot) — early version

University coursework, 2019. A Spring Boot application for managing football teams and players, persisted in PostgreSQL with Lombok-reduced boilerplate. Packaged with Maven and Docker.

> **Status:** archived as a learning artifact. A more polished REST API version of the same idea lives in [Man](https://github.com/DzenInCode/Man).

## Stack

| Layer | Technology |
|---|---|
| Framework | Spring Boot 1.5 |
| Persistence | Spring Data JPA · PostgreSQL |
| Boilerplate | Lombok |
| Build | Maven (with `mvnw` wrapper) |
| Container | Docker |
| Java | 12 |

## Domain

Football teams and players — basic CRUD, persisted in PostgreSQL.

## Build & run

```bash
./mvnw package
docker build -t footbol .
docker run -p 8080:8080 footbol
```

## What I learned from this project

- Spring Boot project layout, dependency injection, JPA entity mapping
- PostgreSQL containerization for local dev
- Lombok annotations (`@Data`, `@Entity`) reducing Java boilerplate
- Maven wrapper (`mvnw`) for reproducible builds without a local Maven install
