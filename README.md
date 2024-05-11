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

## Overview
This project is a backend system for managing rooms in a hotel, including features such as adding rooms, retrieving rooms, and managing room prices. It utilizes GORM for database operations and Spring Boot for building the application.

## Project Structure

### Controllers
The `RoomController` handles HTTP requests related to room management, including adding rooms, retrieving rooms, and filtering rooms based on price and availability.

### Models
The `Room` model represents a hotel room and includes attributes such as room number, room type (AC or non-AC), availability, and price. The `Type` enum defines the room types.

### Services
The `RoomService` class contains the business logic for managing rooms, including adding rooms, retrieving rooms, and filtering rooms based on price and availability.

### Repository
The `RoomRepository` interface defines database operations for the `Room` entity, including methods for retrieving rooms by price, type, and availability.

## Running the Application
To run the application, follow these steps:

1. Clone the repository: `git clone <repository_url>`
2. Navigate to the project directory: `cd Hotel-Room-Management-System`
3. Run the application: `mvn spring-boot:run`

## Configuration
The application is configured to use an in-memory H2 database. You can modify the database configuration in the `application.properties` file.

### Default Configuration
- **Database URL**: jdbc:h2:mem:h2db
- **Username**: sa
- **Password**: Anish@1430
- **Port**: 8082

## Dependencies
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok

## Usage
You can access the following APIs:

- **Add Room**: POST /room
- **Add Multiple Rooms**: POST /rooms
- **Get All Rooms**: GET /rooms
- **Get Room by ID**: GET /rooms/id/{id}
- **Get Rooms by Price**: GET /name/price/{price}
- **Remove Rooms by IDs**: DELETE /rooms/ids
- **Get Rooms Below Price and Available**: GET /name/price/{price}/and/available
- **Get Rooms Below Price or Available**: GET /name/price/{price}/or/available
- **Get Rooms Above Price and Available**: GET /name/price/{price}/available
- **Get Rooms with AC or Available**: GET /name/AC/or/available

## Documentation
API documentation with examples is available using tools like Postman or Swagger. Additionally, code comments have been added for clarity and maintenance.



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

