# task-2-Student-record-management-system

 #  Student Record Management System - Java (Console-Based)

This is a simple and interactive **Student Record Management System** built using Java. It allows users to **Add**, **View**, **Update**, and **Delete** student records using a menu-driven command-line interface. The application uses **ArrayList** for dynamic data storage and applies **Object-Oriented Programming** principles.



##  Project Overview

Managing student data efficiently is essential in any academic environment. This console-based application provides a user-friendly interface for performing CRUD operations on student records — including ID, name, and marks.


##  Features

* Add new student with ID, name, and marks  
* View all added student records in tabular format  
* Update student details by entering their ID  
* Delete a student by their ID  
* Menu-driven interface with easy navigation  
* Real-time data stored using ArrayList  
* Follows core Java & OOP concepts  



##  Technologies Used

- Java (JDK 21+)
- IntelliJ IDEA 
  


##  Project Structure
* Student.java : Main class containing menu and logic
* StudentRecord.java : POJO (Plain Old Java Object) for student data
* README.md : Project documentation




1: Program Starts
As soon as the Java program runs, a menu is displayed on the console:

markdown
Copy
Edit
1. Add Student  
2. View Students  
3. Update Student  
4. Delete Student  
5. Exit  
   2: User Selects an Option
The user enters any number between 1 to 5 based on the desired action.

3️: Operation is Performed (Based on User Choice)
* Option 1: Add Student
The program asks for Student ID, Name, and Marks as input.

This data is stored in an object and added to the ArrayList.

* Option 2: View Students
The program loops through the ArrayList and displays each student record one by one.

* Option 3: Update Student
The program asks for the Student ID to update.

If the ID is found in the ArrayList:

It asks for the new Name and Marks and updates the existing record.

* Option 4: Delete Student
The program asks for the Student ID to delete.

If the ID is found in the list:

That student record is deleted from the ArrayList.

 * Option 5: Exit
The program stops and exits.

4️: Loop Continues
The menu keeps showing again and again until the user selects option 5 (Exit).






##  Sample Console Flow


 Student Record Management System 
1. Add Student
2. View Students
3. Update Student
4. Delete Student
5. Exit
Enter your choice: 1

Enter Student ID: 101
Enter Student Name: Muskan
Enter Student Marks: 95.0
Student added successfully.

Enter your choice: 2

Student Records:
ID: 101, Name: Muskan, Marks: 95.0

 In the same way, you can also update and delete.


