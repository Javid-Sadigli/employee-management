# Employee Management System

This is a Spring Boot-based web application for managing employee information. It uses Thymeleaf for rendering dynamic HTML pages, allowing users to perform CRUD operations on employee records through a user-friendly interface.

## Table of Contents

- [Features](#features)
- [Getting Started](#getting-started)
- [Installation](#installation)
- [Running the Application](#running-the-application)
- [Pages and Functionality](#pages-and-functionality)
- [Configuration](#configuration)
- [Built With](#built-with)
- [Contributing](#contributing)



## Features

- **Employee Management**: Add, view, edit, and delete employee information.
- **User Interface**: Built with Thymeleaf to serve dynamic HTML pages.
- **CRUD Operations**: Supports Create, Read, Update, and Delete operations on employees.
- **Database Integration**: Uses a relational database to store employee data.

## Getting Started

Follow these steps to set up and run the project locally.


### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/Javid-Sadigli/employee-management.git
   cd employee-management
   ```

2. **Start the database**

   You can start the database inside Docker by running the written `docker-compose.yaml` file using the following command :

   ```bash
   docker-compose up --build -d
   ```

3. **Build the Project**

   ```bash
   .\gradlew build
   ```

## Running the Application

To start the application, use one of the following commands:

```bash
.\gradle bootRun
```

The application will be available at `http://localhost:8080`.

## Pages and Functionality

The following are the main pages and their functionalities:

| Page                  | URL                        | Description                         |
|-----------------------|----------------------------|-------------------------------------|
| Home - Employee List  | `/`                        | List all employees                  |
| Add Employee          | `/addnew`                  | Form to add a new employee          |
| Update Employee       | `/showFormForUpdate/{id}`  | Form to edit an existing employee   |
| Delete Employee       | `/deleteEmployee/{id}`     | Deletes an employee by ID          |

Each page is rendered using Thymeleaf templates with forms and buttons for managing employee data.

## Configuration

Customize the application settings in the `application.properties` file:

- **Server Port**: Change the default server port (8080):

   ```properties
   server.port=8080
   ```

- **Database Settings**: Update `spring.datasource` properties to match your database configuration.

## Built With

- [Spring Boot](https://spring.io/projects/spring-boot) - Framework for building Java applications
- [Thymeleaf](https://www.thymeleaf.org/) - For server-side rendering of HTML templates
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa) - For ORM and database access
- [MySQL](https://www.mysql.com/) - Database for storing employee data

## Contributing

If you'd like to contribute, please fork the repository and use a feature branch. Pull requests are welcome!

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/YourFeature`)
3. Commit your Changes (`git commit -m 'Add some feature'`)
4. Push to the Branch (`git push origin feature/YourFeature`)
5. Open a Pull Request

<br>

# Thanks for your attention!