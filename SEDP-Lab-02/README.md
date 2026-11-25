# SEDP Lab 02 — Library Membership System

[Original question](Question.md)

Encapsulation protects member fields, including the automatically generated final member ID. Inheritance and method overriding provide different borrowing limits. The base describe() calls getMaxBooksAllowed() so it prints the actual subtype's limit.

## Run

From this folder:

```sh
javac -d out *.java
java -cp out task02.Main
```

## Expected output

```text
Member ID: 1
Name: Rahim
Book limit: 3
Max books allowed: 3

Member ID: 2
Name: Karim
Book limit: 5
Annual fee: 2500.0
Max books allowed: 5

Member ID: 3
Name: Nila
Book limit: 4
Max books allowed: 4

Error: Name cannot be blank. Using Guest.
Member ID: 4
Name: Guest
Book limit: 3
Max books allowed: 3
```

Student semesters outside 1–8 are rejected. Member IDs are unique within a sequential program run. Annual fees are assumed to be nonnegative.

Reference: [Java method overriding](https://dev.java/learn/inheritance/overriding/).
