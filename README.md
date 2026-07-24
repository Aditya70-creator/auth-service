# 🔐 Auth Service (Microservices Architecture)

A secure Authentication and Authorization microservice built with **Spring Boot 3**, **Spring Security**, **JWT (JSON Web Tokens)**, and **PostgreSQL**. This service handles user registration, secure login, role-based access control, and user profile management.

---

# 🚀 Tech Stack

- **Java 21**
- **Spring Boot 3.2.5**
- **Spring Security**
- **JWT (jjwt 0.12.6)**
- **Spring Data JPA (Hibernate)**
- **PostgreSQL**
- **SpringDoc OpenAPI (Swagger UI)**
- **Docker**
- **Maven**

---

# 📁 Project Structure

```text
auth-service
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com.technomatrix.authservice
│   │   │       ├── config
│   │   │       ├── controller
│   │   │       ├── dto
│   │   │       ├── entity
│   │   │       ├── repository
│   │   │       ├── security
│   │   │       ├── service
│   │   │       └── AuthServiceApplication.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│   │
│   └── test
│
├── pom.xml
└── README.md
```

---

# ⚙️ Prerequisites

Make sure the following software is installed:

- Java 21
- Maven
- PostgreSQL 17+
- IntelliJ IDEA (Recommended)
- Git

---

# 🛠️ Database Setup

Create the PostgreSQL database:

```sql
CREATE DATABASE auth_service_db;
```

---

# ⚙️ application.properties

```properties
spring.application.name=auth-service

# Server
server.port=8081

# PostgreSQL
spring.datasource.url=jdbc:postgresql://localhost:5432/auth_service_db
spring.datasource.username=postgres
spring.datasource.password=your_password

# Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect

# JWT
jwt.secret=404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970
jwt.expiration=86400000
```

---

# ▶️ Running the Project

## Clone the Repository

```bash
git clone https://github.com/your-username/auth-service.git
```

```bash
cd auth-service
```

---

## Run Using IntelliJ IDEA

Open the project in **IntelliJ IDEA** and run:

```
AuthServiceApplication.java
```

The application will start on:

```
http://localhost:8081
```

---

## Run Using Maven

```bash
mvn spring-boot:run
```

---

# 🐳 Docker Support

## Build Docker Image

```bash
docker build -t auth-service .
```

## Run Docker Container

```bash
docker run -p 8081:8081 auth-service
```

---

# 📖 Swagger Documentation

Once the application starts, open:

```
http://localhost:8081/swagger-ui/index.html
```

Swagger UI provides interactive API documentation where every endpoint can be tested directly.

---

# 🔌 API Endpoints

## 1️⃣ Register User

**POST**

```
/register
```

### Request Body

```json
{
  "username": "aditya_mitra",
  "email": "aditya@example.com",
  "password": "mypassword123"
}
```

---

## 2️⃣ Login User

**POST**

```
/login
```

### Request Body

```json
{
  "username": "aditya_mitra",
  "password": "mypassword123"
}
```

### Response

```text
JWT Token
```

---

## 3️⃣ Get User Profile

**GET**

```
/profile
```

### Headers

```http
Authorization: Bearer <your_jwt_token>
```

### Response

Returns the authenticated user's profile information.

---

# 🔒 Security Features

- User Registration
- Secure Login
- JWT Authentication
- Password Encryption (BCrypt)
- Role-Based Authorization
- Protected APIs
- Spring Security Filter Chain

---

# 🧪 Testing

You can test the APIs using:

- Postman
- Swagger UI
- cURL

---

# 📦 Dependencies

- Spring Web
- Spring Security
- Spring Data JPA
- PostgreSQL Driver
- Validation
- Lombok
- JWT (jjwt)
- SpringDoc OpenAPI

---

# 👨‍💻 Author

**Aditya Mitra**

Backend Developer | Java | Spring Boot | PostgreSQL | Microservices

---