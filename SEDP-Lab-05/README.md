# SEDP Lab 05 — LSP, ISP and DIP

[Original questions](Question.md)

| Task | Violation | Refactoring |
|---|---|---|
| 1 — LSP | A speaker inherits unsupported video recording | Separate VideoRecordable and AudioPlayable capabilities |
| 2 — ISP | A printer must implement unsupported scan and fax methods | Split into Printable, Scannable and Faxable |
| 3 — DIP | ReportGenerator creates a concrete database internally | Constructor injection through DataSource |

## Run

From this folder, with JDK 8 or newer:

```sh
javac -d out lsp/*.java isp/*.java dip/*.java
java -cp out lsp.Main
java -cp out isp.Main
java -cp out dip.Main
```

## Expected output

### Task 1

```text
Basic Speaker is playing audio.
Security Camera is recording video.
Security Camera is recording video.
```

### Task 2

```text
Simple Printer is printing.
All-in-One Printer is printing.
All-in-One Printer is scanning.
All-in-One Printer is faxing.
```

### Task 3

```text
Report: Sample data from MySQL.
Report: Sample data from MongoDB.
```

The database classes simulate data retrieval; no external database connection is required.

Reference: [Microsoft Learn — Dangers of Violating SOLID Principles](https://learn.microsoft.com/en-us/archive/msdn-magazine/2014/may/csharp-best-practices-dangers-of-violating-solid-principles-in-csharp).
