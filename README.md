# Product Catalog System

## Introduction
This project is a simple Product Catalog System built using Spring Boot, Spring Data JPA, Thymeleaf, and Bootstrap. It provides a platform for managing products and categories within a catalog. Users can add new products, view existing products, add new categories, and display categories.

## Features
- **Add Product**: Users can add products to the catalog by providing details such as product name, price, and category.
- **Display Product**: Users can view all products in the catalog in a sortable tabular format, including their names, prices, and categories.

## Technologies Used
- **Java**: The primary programming language used for backend development.
- **Spring Boot**: Provides a robust framework for building web applications with minimal configuration.
- **Spring Data JPA**: Simplifies data access and manipulation by providing a higher-level abstraction over JPA (Java Persistence API).
- **Thymeleaf**: A modern server-side Java template engine used for HTML templating.
- **Bootstrap**: A popular CSS framework for building responsive and visually appealing web pages.
- **DataTables**: A powerful jQuery plugin for rendering tables with enhanced features such as searching, sorting, pagination, and more.
- **H2 Database**: A lightweight in-memory database used for simplicity in this demonstration project.

## Folder Structure
Your folder structure seems well-organized. Here's a breakdown of the structure:

```
product-catalog/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── springjpa/
│   │   │           └── productcatalog/
│   │   │               ├── controller/
│   │   │               │   └── ProductController.java
│   │   │               ├── entity/
│   │   │               │   └── Product.java
│   │   │               ├── repository/
│   │   │               │   └── ProductRepository.java
│   │   │               ├── service/
│   │   │               │   └── ProductService.java
│   │   │               └── ProductCatalogApplication.java
│   │   └── resources/
│   │       ├── static
│   │       └── templates/
│   │           ├── addProduct.html
│   │           ├── displayProducts.html
│   │           └── index.html
│   └── test/
│       └── java/
│           └── com/
│               └── springjpa/
│                   └── productcatalog/
│                       └── ProductcatalogApplicationTests.java
└── pom.xml
```

- **src/main/java/com/springjpa/productcatalog/controller**: Contains the controller classes responsible for handling HTTP requests and responses.
- **src/main/java/com/springjpa/productcatalog/entity**: Contains the entity classes representing the data model of the application.
- **src/main/java/com/springjpa/productcatalog/repository**: Contains the repository interfaces responsible for database operations.
- **src/main/java/com/springjpa/productcatalog/service**: Contains the service classes that implement the business logic of the application.
- **src/main/java/com/springjpa/productcatalog**: Contains the main application class (`ProductCatalogApplication.java`).
- **src/main/resources/static**: Contains static resources such as CSS, JavaScript, and image files.
- **src/main/resources/templates**: Contains Thymeleaf HTML templates for rendering web pages.
- **src/test/java/com/springjpa/productcatalog**: Contains test classes for unit and integration testing.
- **pom.xml**: Maven configuration file that defines dependencies and build settings for the project.

This structure follows common conventions in a Spring Boot project, making it easy to navigate and understand the codebase.
## Installation and Setup
1. **Clone this repository**: Use `git clone` command to clone this repository to your local machine.
2. **Install Java and Maven**: Ensure you have Java JDK 8 or higher and Apache Maven installed on your system.
3. **Open the project**: Open the cloned project directory in your preferred IDE (Integrated Development Environment).
4. **Run the application**: Locate the `ProductCatalogApplication.java` file and run it as a Java application.
5. **Access the application**: Once the application is running, access it through the provided URLs in your web browser.

## Usage
- **Home Page**: Navigate to the home page to access options such as adding products and displaying products
- **Add Product**: Fill out the product information form to add new products to the catalog.
- **Display Product**: View all products in the catalog in a tabular format, including their details.

## Contributing
Contributions are welcome! If you have any suggestions, enhancements, or bug fixes, feel free to fork this repository, make your changes, and submit a pull request.

## License
This project is licensed under the [MIT License]. You are free to use, modify, and distribute this software as per the terms of the license.
