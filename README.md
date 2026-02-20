```markdown
# Anguler-Back (StoreTech Backend API)

Spring Boot backend for a simple **StoreTech** application.

Currently this project exposes a REST API for **Customer management (CRUD)** and is intended to be consumed by an Angular frontend (CORS is enabled on the controller).

## What’s inside
- Customer REST endpoints under `/customer/*`
- Service + repository layers (`CustomerService` → `CustomerRepositoryImpl`)
- MySQL database connection configured in `application.yml`
- Flyway migrations enabled (migration folder present)

## Tech Stack
- **Java 22**
- **Spring Boot 4.0.2**
  - spring-boot-starter-web
  - spring-boot-starter-data-jpa (dependency included; current implementation uses `JdbcTemplate`)
- **MySQL** (mysql-connector-j)
- **Flyway** (spring-boot-starter-flyway + flyway-mysql)
- **Lombok**
- **Springdoc OpenAPI UI** (`springdoc-openapi-starter-webmvc-ui`)

## Prerequisites
- **JDK 22** installed and available on your PATH (`java -version`)
- **Maven** installed (`mvn -v`)
- **MySQL** running locally (or reachable from your machine)

## Configuration
The app reads configuration from:
- `src/main/resources/application.yml`

Current settings (from the repo):
- `spring.datasource.url: jdbc:mysql://localhost:3306/StoreTech`
- `spring.datasource.username: root`
- `spring.datasource.password: ...`
- `spring.flyway.enabled: true`

> Note: Avoid committing real database passwords. Prefer environment variables or a local-only config file.

### Database
Create a database named `StoreTech` in MySQL.

Flyway migrations are enabled and are expected to live in:
- `src/main/resources/db/migration`

⚠️ `V1__init.sql` exists but is currently **empty**. That means you must create the required schema yourself (or fill in the migration).

The repository expects a table named `customer` with **9 columns** in this order (based on the SQL used in `CustomerRepositoryImpl`):
1. `CustID`
2. `CustTitle`
3. `CustName`
4. `DOB`
5. `salary`
6. `CustAddress`
7. `City`
8. `Province`
9. `PostalCode`

## Install & Run
### 1) Build
```bash
mvn clean package
```

### 2) Run (dev)
```bash
mvn spring-boot:run
```

The Spring Boot entry point is `edu.icet.Main`.

## REST API
Base URL depends on your Spring Boot port (default is typically `8080` unless changed).

### Customer endpoints
Base path: `/customer`

- `POST /customer/addCustomer`
  - Body: `CustomerDto`
- `PUT /customer/updatecustomer`
  - Body: `CustomerDto`
- `DELETE /customer/delete-customer/{id}`
- `GET /customer/getallcustomers`
  - Returns: `List<CustomerDto>`

### CustomerDto shape
`CustomerDto` fields:
- `id: String`
- `title: String`
- `name: String`
- `dob: java.util.Date`
- `salary: Double`
- `address: String`
- `city: String`
- `province: String`
- `postalCode: String`

## API Docs (OpenAPI / Swagger)
This project includes Springdoc OpenAPI UI.

If Springdoc is enabled with default settings, try:
- `/swagger-ui/index.html`
- `/v3/api-docs`

(If these URLs don’t work, the project may need additional Springdoc configuration.)

## Project Status / Notes
- `ItemController` exists but currently has no endpoints.
- `ProductServiceImpl` is currently a stub (not wired as a Spring bean).

## License
No license file is currently included. Add one if you plan to share or distribute this project.
```
