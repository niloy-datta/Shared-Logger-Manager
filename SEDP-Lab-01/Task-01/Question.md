# SEDP Lab 01

## Task 1

Create a Student class to represent student information using encapsulation.

The Student class should have the following private properties:

- studentId (int): A unique identifier for each student.
- name (String): The name of the student.
- age (int): The age of the student.
- grade (char): The grade of the student.

### Requirements

1. All properties must be declared private.
2. Provide getter and setter methods for name, age, and grade.
3. The studentId should be generated automatically whenever a new student object is created.
4. The studentId must not be modifiable externally, so do not provide a setter for it.
5. Create a parameterized constructor to initialize the student's name, age, and grade.
6. In the main() method, create at least three Student objects and display their information using getter methods.
7. Update the name, age, or grade of at least one student using setter methods and display the updated information.
