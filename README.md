# ToDoList

ToDoList is a simple Rest API built with Spring boot Java & PostgreSQL to practice the making of crud operations & API testing using Postman.

# Requests used in testing


# Creating a new task 
localhost:8080/tasks/CreateTask 

# Test data:
{
  "title": "Learn software testing",
  "description": "Understand how to write test cases",
  "priority": "medium",
  "dueDate": "2024-10-20",
  "status": "done"
}

# Expected result:
User-created successfully

# Actual result:
User-created successfully

________________________________________________________________________________

# Presenting all tasks 
localhost:8080/tasks/GetAllTasks


# Expected result:
Tasks presented successfully

# Actual result:
Tasks presented successfully

________________________________________________________________________________
# Presenting a task by id 
localhost:8080/tasks/{id}

# Test data:
7

# Expected result:
Task presented successfully

# Actual result:
Task presented successfully

____________________________________________________________________________________
# Updating an existing task 
localhost:8080/tasks/UpdateTask/{id}

# Test data:
id: 7
{
  "title": "Learn software testing",
  "describtion": "Understand how to make rest APIs",
  "priority": "medium",
  "dueDate": "2024-10-20",
  "status": "done"
}

# Expected result:
Task updated successfully

# Actual result:
Task updated successfully

________________________________________________________________________________

# Deleting an existing task by id 
localhost:8080/tasks/DeleteTask/{id}

# Test data:
7

# Expected result:
Task deleted successfully

# Actual result:
Task deleted successfully

__________________________________________________________________________________
# Deleting an existing task by id 
localhost:8080/tasks/DeleteAllTasks

# Expected result:
All tasks deleted successfully

# Actual result:
All tasks deleted successfully

