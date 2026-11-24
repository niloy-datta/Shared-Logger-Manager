# SEDP Lab 01 — Encapsulation

## Task 1: Student Information

- [Original question](Question.md)
- [Student class](Student.java)
- [Main class](Main.java)

The Student class uses private fields and public getters/setters. A private static counter generates sequential IDs for students created during a program run. The studentId field is final and has no setter.

## Run

From this folder:

```sh
javac Student.java Main.java
java Main
```

## Sample output

```text
Student ID: 1
Name: Rahim
Age: 20
Grade: A

Student ID: 2
Name: Karim
Age: 21
Grade: B

Student ID: 3
Name: Nila
Age: 19
Grade: A

Updated student information:
Student ID: 2
Name: Karim Ahmed
Age: 22
Grade: A
```
