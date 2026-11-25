# SEDP Lab 06 — Shared Logger Manager

Singleton pattern with double-checked locking, a volatile instance and synchronized log operations. Three threads share the same logger; the main thread joins them and displays the logs in insertion order before clearing the list.

## Run

From this folder:

```sh
javac -d out LoggerManager.java Main.java
java -cp out Main
```

Expected: one `Logger initialized.` line, three logged messages with totals 1, 2 and 3, followed by the three stored messages. Thread order may vary.
