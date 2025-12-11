FOLW CHART
.......................
[JSP Form] 
      |
      v
[CustomerController Servlet]
      |
      v
[Customer Model Object]
      |
      v
[CustomerDAO (JDBC)]
      |
      v
[MySQL - Customer Table]


FINAL DISCRIPTION :

This project implements a complete Customer Management module using JSP, Servlets, and JDBC.
The system stores customer details in a MySQL table named Customer, which contains fullname, username, and password fields.
The CustomerController servlet receives form data from the JSP page, constructs a Customer object, and communicates with the CustomerDAO class to perform the required database operations.

CustomerDAO contains all CRUD operations, such as inserting a new customer, validating login credentials, updating records, and deleting entries.
It interacts with the MySQL database through prepared statements for secure and efficient execution. 
The Customer model class represents the data structure used throughout the application.

Overall, the files work together to provide a functional registration and login system where user inputs flow from JSP → Servlet → DAO → Database.
