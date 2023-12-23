# Spring Boot REST API Project

## Description
Spring Boot project that implements a RESTful API with CRUD operations to manage books.

## Prerequisites
- Java 11 or higher
- Maven
- Spring Boot
- MySQL (or another preferred database)

## Configuration
1. Clone this repository 
2. Configure the database in `src/main/resources/application.properties`
3. Run the application

## Endpoints
- **GET /books:** Get all books.
- **GET /books/{id}:** Get a specific book by ID.
- **POST /book/add:** Add a new book.
- **PUT /book/update/{id}:** Update an existing book.
- **DELETE /book/delete/{id}:** Remove a book.
