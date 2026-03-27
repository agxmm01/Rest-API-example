# 🛠️ Rest API Example

This project is a **simple Java Spring Boot REST API example** designed
for students and beginners to understand how REST APIs work.

A REST API allows clients (like web or mobile apps) to communicate with
the server using **HTTP requests** such as GET, POST, PUT, DELETE. This
project shows how to build and structure a RESTful backend easily.

------------------------------------------------------------------------

## 🚀 What You'll Learn

By exploring this project, you will learn:

-   🔹 How to build a REST API using **Spring Boot**
-   🔹 How to implement **CRUD operations**
-   🔹 How HTTP methods (GET, POST, PUT, DELETE) work
-   🔹 How to structure a backend application
-   🔹 How to interact with the API using tools like **Postman**

------------------------------------------------------------------------

## 🧠 What is REST API?

**REST (Representational State Transfer)** is an architectural style for
building web APIs.

  HTTP Method   Action
  ------------- ----------------------
  GET           Retrieve data
  POST          Create new data
  PUT           Update existing data
  DELETE        Remove data

This example project helps you understand these basics in practice.

------------------------------------------------------------------------

## 🗂️ Project Structure

A typical Spring Boot REST API project looks like this:

    src/main/java/...  
    ├── controller/      # API endpoints
    ├── model/           # Data models/entities
    ├── repository/      # Database access
    ├── service/         # Business logic
    └── Application.java # Main application

------------------------------------------------------------------------
## Screenshots
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 42 34 AM" src="https://github.com/user-attachments/assets/7a94fb7b-51f4-406c-85b6-ea54517e3917" />
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 47 38 AM" src="https://github.com/user-attachments/assets/9db81b70-8533-4728-ad0f-d728199b020c" />
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 48 02 AM" src="https://github.com/user-attachments/assets/88fbee55-95a9-4ad6-8405-1ca0503623d9" />
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 51 03 AM" src="https://github.com/user-attachments/assets/385a9243-aedb-4a43-a7cd-b8dc59e6af4f" />
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 52 00 AM" src="https://github.com/user-attachments/assets/d7446527-3d57-4640-8399-8b2632d229cf" />
<img width="1440" height="900" alt="Screenshot 2026-03-27 at 9 52 44 AM" src="https://github.com/user-attachments/assets/bed14343-14eb-4832-a1b3-0d7c6ba1458b" />


------------------------------------------------------------------------
## 🛠️ How to Run the Project

### 1️⃣ Clone the repository

``` bash
git clone https://github.com/agxmm01/Rest-API-example.git
cd Rest-API-example
```

### 2️⃣ Build & Run

Just go to RestExampleApplication.java and click on run

The backend server will start on:

👉 http://localhost:8080

------------------------------------------------------------------------

## 📍 How to Test the API

You can test the REST API using tools like:

-   Postman
-   cURL
-   VSCode REST Client

Try sending these requests:

  Request                             Description
  ---------------------------         -------------
  GET /students/yourEndpoint           Read data
  POST /students/yourEndpoint          Create data
  PUT /students/yourEndpoint/{id}      Update data
  DELETE /students/yourEndpoint/{id}   Delete data

Replace `/yourEndpoint` with the actual api defined in the code(in controller class). 

------------------------------------------------------------------------

## 🎯 Why This is Useful

This project is perfect for beginners to understand backend development
with Java and Spring Boot. It is simple, hands‑on, and practical for
real‑world learning.

------------------------------------------------------------------------

## 👨‍💻 Author

Developed by **Agampal Singh**\
GitHub: https://github.com/agxmm01
