# SimpleWebService

A Spring Boot REST service that greets a name.

## Run

Requires Java 17 or later and Maven.

```sh
mvn spring-boot:run
```

## Endpoint

`GET /hello?name={name}` returns the plain-text response `{name} Hello !`.

For example:

```sh
curl "http://localhost:8080/hello?name=Sunil"
```

Response:

```text
Sunil Hello !
```

## Technical Documentation

For a more detailed project overview, architecture, dependency summary, and testing notes, see [TECHNICAL_DOCUMENTATION.md](./TECHNICAL_DOCUMENTATION.md).
