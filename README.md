# To-Do List API
This project is a simple RESTful API for managing a to-do list, built using Spring Boot and PostgreSQL. Users can create, read, update, and delete to-do items.\

# Features
Add Task: Create a new to-do item.
View Tasks: Retrieve all tasks or a specific task by its ID.
Update Task: Modify an existing task.
Delete Task: Remove a task by its ID.

# Technologies Used
Backend: Spring Boot (Java)

Database: PostgreSQL

Testing: Postman (API testing)

Tools: Maven, Spring Data JPA

# Installation
# Prerequisites
Java 11 or higher
Maven
PostgreSQL
Postman (optional, for manual testing) 

# Steps
1. Clone the repository:
git clone https://github.com/MazenTarek20/ToDoList/edit/main/README.md

2. Navigate to the project directory:
cd todo-list-api


3. Set up the PostgreSQL database:
Create a database for the application in PostgreSQL.
Configure your PostgreSQL credentials in the application.properties file:

spring.datasource.url=jdbc:postgresql://localhost:5432/todo_db

spring.datasource.username=your_username

spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update

4. Build and run the application:
mvn clean install
mvn spring-boot:run

5. The API should now be running at http://localhost:8080
  
 # API Endpoints
 # 1. Create a new task
    URL: /tasks
    Method: POST
    Request Body:
{
  "title": "task title",
  "description": "task description",
  "priority": "priority",
  "dueDate": "year-mm-dd",
  "status": "status"
}

#  2. Get all tasks
    URL: /tasks
    Method: GET
    Response: 200 OK
   
   # 3. Get a task by ID

    URL: /tasks/{id}
    Method: GET
    Response: 200 OK
    
# 4. Update a task
    URL: /tasks/{id}
    Method: PUT
    Request Body:
{
  "title": "updated title",
  "describtion": "updated description",
  "priority": "updated priority",
  "dueDate": "updated date",
  "status": "updated status"
}

# 5. Delete a task

    URL: /tasks/{id}
    Method: DELETE
    Response: 204 No Content


