# SEDP Lab 03 — Original Questions

## Task 1 - Apply SRP: Refactor a Student Record God-Class

You are given (conceptually) a single class StudentRecordManager that currently:

(a) validates a student's GPA is between 0.0 and 4.0,

(b) formats and prints a transcript, and

(c) 'sends' (prints) an SMS alert to the guardian if GPA drops below 2.0.

Refactor this into at least three SRP-compliant classes of your own design, each with exactly one responsibility, and a small Main/coordinator class that uses all three together to replicate the original behaviour for at least two sample students.

## Task 2 - Apply OCP: Extensible Shipping Cost Calculator

Design a shipping-cost system for an online store. Start by identifying the OCP violation in an if/else version that checks a shippingType string for "STANDARD" (cost = weight * 10), "EXPRESS" (cost = weight * 25), and "OVERNIGHT" (cost = weight * 50).

Refactor it using an interface ShippingStrategy with a method calculateCost(double weight), and one implementing class per shipping type. Then, as PROOF that your design satisfies OCP, add a brand-new DroneShipping type (cost = weight * 70, plus a flat 100 taka handling fee) by creating ONLY one new class - do not touch any existing class when adding it. In Main, demonstrate cost calculation for all four shipping types, including the new Drone type.
