# Hotel Room Management System

## Overview

This project implements a Hotel Room Management System using Spring Boot. It provides REST APIs for managing rooms in a hotel.

## Tech Stack

- Java
- Spring Boot
- H2 Database
- Hibernate
- RESTful API
- Maven

## Features

- Add a single room
- Add multiple rooms at once
- Get all rooms
- Get room by ID
- Get rooms by price
- Remove rooms by IDs
- Get available rooms below a certain price
- Get available rooms or below a certain price
- Get available rooms or air-conditioned rooms sorted by price
- Get available rooms above a certain price

## Project Structure

- **controller**: Contains the REST controller classes.
- **model**: Contains the entity classes (e.g., Room).
- **repository**: Contains the Spring Data JPA repository interfaces.
- **service**: Contains the service classes that implement business logic.

## Setup

1. Clone the repository.
2. Ensure you have Java and Maven installed.
3. Run the project using Maven: `mvn spring-boot:run`.
4. Access the APIs using a REST client such as Postman.

## Configuration

The application is configured to use an in-memory H2 database. The default port is 8082.

## Usage

- **POST /room**: Add a single room.
- **POST /rooms**: Add multiple rooms at once.
- **GET /rooms**: Get all rooms.
- **GET /rooms/id/{id}**: Get room by ID.
- **GET /name/price/{price}**: Get rooms by price.
- **DELETE /rooms/ids**: Remove rooms by IDs.
- **GET /name/price/{price}/and/available**: Get available rooms below a certain price.
- **GET /name/price/{price}/or/available**: Get available rooms or below a certain price.
- **GET /name/AC/or/available**: Get available rooms or air-conditioned rooms sorted by price.
- **GET /name/price/{price}/available**: Get available rooms above a certain price.

## Contributors

- Anish Kumar Sharma

