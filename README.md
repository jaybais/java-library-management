# Java Library Management System

A REST API for managing books, members, and checkouts — built with Java and Spring Boot as a structured learning project, with a focus on building real integrations using the Claude API.

## Tech Stack

- Java 21
- Spring Boot 3.5.14
- Spring Data JPA
- H2 Database (in-memory)
- Maven

## How to Run

1. Clone the repository
2. Navigate to the project folder
3. Run the following command:
```bash
   ./mvnw spring-boot:run
```
4. App runs at `http://localhost:8080`
5. H2 Console available at `http://localhost:8080/h2-console`

## Project Status

✅ Phase 1 — Project setup & GitHub publishing  
✅ Phase 2 — Book entity, H2 database, repository layer  
✅ Phase 3 — Custom query methods  
✅ Phase 4 — Service layer (interface + implementation)  
✅ Phase 5 — REST controller with full CRUD endpoints  

> **Note:** Active development on this repository may be slower in the near term as I focus on building with the Claude API. 

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/books` | Get all books |
| GET | `/api/books/{id}` | Get a book by ID |
| POST | `/api/books` | Add a new book |
| PUT | `/api/books/{id}` | Update a book |
| DELETE | `/api/books/{id}` | Delete a book |

## Planned Features

- Member management (CRUD)
- Checkout and return system
- Claude API integration

## Stretch Goals

- Search by title, author, or genre
- Overdue detection
- Spring Security (basic auth)
- PostgreSQL (replacing H2)
- Global exception handling with `@ControllerAdvice`
- Pagination

## Learning Goals

This project is being built as a hands-on path toward Java/Spring Boot development on an Agile team. Each phase introduces a new layer of the stack — entity modeling, repository patterns, service abstraction, REST design — and the next focus is integrating with the Claude API to explore AI-powered backend features.