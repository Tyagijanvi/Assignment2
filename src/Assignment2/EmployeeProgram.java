package Assignment2;
//Base class Employee
class Employee {
 // Method to get the role of the employee
 public String getRole() {
     return "Employee";
 }
}

//Subclass Manager that extends Employee
class Manager extends Employee {
 // Overriding getRole() method
 @Override
 public String getRole() {
     return "Manager";
 }
}

//Subclass Developer that extends Employee
class Developer extends Employee {
 // Overriding getRole() method
 @Override
 public String getRole() {
     return "Developer";
 }
}

public class EmployeeProgram {
	 public static void main(String[] args) {
	        // Creating a reference of Employee and assigning a Manager object
	        Employee emp1 = new Manager();
	        
	        // Creating a reference of Employee and assigning a Developer object
	        Employee emp2 = new Developer();
	        
	        // Calling getRole() using the Employee reference
	        System.out.println("emp1's role: " + emp1.getRole());  // Manager's getRole() is invoked
	        System.out.println("emp2's role: " + emp2.getRole());;  // Developer's getRole() is invoked
	
	 }
}
