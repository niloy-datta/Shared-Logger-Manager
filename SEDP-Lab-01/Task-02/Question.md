# SEDP Lab 01 — Task 02

## Original Question

### Task 1
**Problem: Library Membership System**

Build a small membership model for a library, applying encapsulation and inheritance.

- Create class Member with private fields: memberId (int, auto-generated - use a private static int counter that increments every time a new Member is created, and NEVER expose a setter for memberId), name (String), and maxBooksAllowed (int, default value 3).
- Provide a constructor that takes only 'name' (memberId is generated automatically), getters for all fields, and a method describe() that prints the member's id, name and book limit.
- Create subclass PremiumMember extends Member with an extra private field annualFee (double). Its constructor takes name and annualFee. Override describe() to also print the annual fee, and override a new method getMaxBooksAllowed() so that Premium members can borrow 3 + (annualFee / 1000) books, rounded down (use integer division), instead of the default 3.
- Create subclass StudentMember extends Member with an extra private field semester (int). Its constructor takes name and semester. Override getMaxBooksAllowed(): semesters 1-4 allow 2 books, semesters 5-8 allow 4 books.
- In Main, create one plain Member, one PremiumMember, and one StudentMember. Call describe() and print getMaxBooksAllowed() for each. Also attempt to create a member with a blank name and have the constructor reject it (print an error and default the name to "Guest").
