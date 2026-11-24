# SEDP Lab 03 — SRP and OCP

[Original questions](Question.md)

## Task 1 — Single Responsibility Principle (SRP)

- `Student`: stores student data.
- `GpaValidator`: validates GPA from 0.0 to 4.0 inclusive.
- `TranscriptPrinter`: formats and prints transcripts.
- `SmsAlertService`: prints guardian alerts when GPA is below 2.0.
- `Main`: coordinates the three services for sample students.

## Task 2 — Open/Closed Principle (OCP)

An if/else calculator checking STANDARD, EXPRESS and OVERNIGHT must be modified whenever a new shipping type is introduced. This violates OCP with respect to adding shipping types.

The ShippingStrategy interface defines calculateCost(double weight). ShippingCalculator delegates to the selected strategy rather than checking shipping type strings.

| Strategy | Formula | Cost for 5 kg |
|---|---|---:|
| StandardShipping | weight * 10 | 50 taka |
| ExpressShipping | weight * 25 | 125 taka |
| OvernightShipping | weight * 50 | 250 taka |
| DroneShipping | weight * 70 + 100 | 450 taka |

### OCP proof

[DroneShipping extension commit](https://github.com/niloy-datta/Shared-Logger-Manager/commit/9ee169441cbc8134a54aa1e3b85fed4fcd26ffe4) added only DroneShipping.java. No existing file was modified in that commit. The original commit predates the folder rename to SEDP-Lab-03.

Main discovers compiled classes ending in Shipping in its package directory. Run with an exploded class directory, not a JAR.

## Run

From SEDP-Lab-03 with JDK 8 or later:

```sh
javac -d out srp/*.java ocp/*.java
java -cp out srp.Main
java -cp out ocp.Main
```

## Reference

[Software Engineering for Self-Directed Learners — Principles](https://se-education.org/se-book/principles/)
