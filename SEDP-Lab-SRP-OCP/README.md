# SEDP Lab — SRP and OCP

## Task 1: Single Responsibility Principle

GpaValidator validates GPA (0.0–4.0), TranscriptPrinter formats and prints student records, and SmsAlertService prints guardian alerts for GPA below 2.0. Student stores data and Main coordinates the workflow.

## Task 2: Open/Closed Principle

An if/else calculator that checks STANDARD, EXPRESS and OVERNIGHT violates OCP because every new shipping type requires editing the calculator. Each shipping strategy now owns its own formula; ShippingCalculator delegates to the interface.

Run from this folder with JDK 8 or newer:

```sh
javac -d out srp/*.java ocp/*.java
java -cp out srp.Main
java -cp out ocp.Main
```

For 5 kg, standard costs 50 taka, express 125 taka, overnight 250 taka and drone 450 taka when the drone provider is installed.

Main discovers compiled classes ending in Shipping in its package directory. This lab uses an exploded class directory (not a JAR). Adding DroneShipping requires only its new Java file, with no registration or existing class changes.
