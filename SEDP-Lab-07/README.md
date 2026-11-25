# SEDP Lab 07 — Strategy and Decorator Patterns

## Task 1 — Movie Ticket Pricing System

The same TicketBooking instance switches among Regular, Student, Senior and Group pricing. Group pricing applies 5% per person, capped at 40%.

```sh
cd MovieTicket
javac -d out *.java
java -cp out Main
```

Expected prices for base price 500: 500, 400, 350 and 300 (12-person group).

## Task 2 — Custom Pizza Ordering System

Cheese and Mushroom add fixed amounts. Stuffed Crust increases the current cost by 15%, making decorator order significant.

From the Lab 07 folder:

```sh
cd PizzaOrdering
javac -d out *.java
java -cp out Main
```

Expected totals: 310.50 for cheese, mushroom and then stuffed crust; 300.00 for stuffed crust, cheese and then mushroom.
