Split-the-Bill Application

Overview:
The Split Bill Application is a web-based system developed to manage and simplify shared expenses among multiple users. It allows users to add expenses, automatically split the amount among participants, and store all data in a structured database.

Features:
- Add users  
- Add expenses  
- Automatic equal expense splitting  
- Store and retrieve data using MySQL  
- View users, expenses, and split details

Technologies Used:

1.Backend
- Java  
- Spring Boot  
- Spring Data JPA  
- REST APIs
  
2.Database
- MySQL  
- MySQL Workbench  

3.Tools
- IntelliJ IDEA  
- Postman  
- Maven

--> How to Run the Project:

1.Clone the repository:
  git clone https://github.com/srushhtireddy/Split-the-Bill-App.git

2.Open the project in IntelliJ IDEA.

3.Configure MySQL in application.properties.

4.Run the Spring Boot application.

5.Access the application:
--> http://localhost:8080

API Endpoints:

1.User APIs: 
POST/users → Add user
GET/users → Get all users

2.Expense APIs:
POST/expenses → Add expense
GET/expenses → Get all expenses

3.Database Tables:
User → Stores user details
Expense → Stores expense details
Split → Stores split calculations

Conclusion:

This project demonstrates how shared expenses can be managed efficiently using backend logic and database integration. It reduces manual effort and ensures accurate calculations.

Screenshots:

(Database Tables):
[user](https://github.com/user-attachments/assets/60df8104-413d-489b-a23a-b932432d66a6)
[split](https://github.com/user-attachments/assets/c367f8b5-1a7b-4a22-b0fe-7b59147dfa27)
[Expense](https://github.com/user-attachments/assets/6d5779c0-0557-4b12-bf14-72e14e4336ba)

Postman Requests:
[user](https://github.com/user-attachments/assets/08e4fd72-2024-4465-80b1-746790f09a98)
[Expense](https://github.com/user-attachments/assets/7ee741d3-1b87-4f5c-9cc5-763878ed3d51)

Code Snippet:
[system flow](https://github.com/user-attachments/assets/dbb027f0-f0a8-4f9e-a04b-c470ed3981e0)
