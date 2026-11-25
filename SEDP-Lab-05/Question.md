# SEDP Lab 05 — Original Questions

## Task 1 - Fix an LSP Violation: Media Devices

You are given a base class MediaDevice with a method recordVideo(), and a subclass BasicSpeaker extends MediaDevice whose recordVideo() throws an exception because a speaker cannot record video.

Redesign the hierarchy (similar to the Bird/Penguin fix) so that recording capability is expressed through a separate interface (e.g. VideoRecordable) implemented only by devices that truly support it (e.g. SecurityCamera), while BasicSpeaker only implements what it can honestly do (e.g. playAudio()).

Demonstrate in Main that iterating over a list of VideoRecordable devices never risks hitting a device that cannot record.

## Task 2 - Fix an ISP Violation: Office Machine

You are given one fat interface OfficeMachine with print(), scan(), and fax(). A modern SimplePrinter class is forced to implement scan() and fax() with exception-throwing stubs. Split OfficeMachine into Printable, Scannable, and Faxable interfaces. Implement SimplePrinter (Printable only) and AllInOnePrinter (all three). Demonstrate in Main that SimplePrinter is never forced to provide scan()/fax() methods at all.

## Task 3 - Fix a DIP Violation: Report Generator

You are given a ReportGenerator class whose constructor directly creates 'new MySQLDatabase()' internally and calls a fetchData() method on it. Introduce a DataSource interface with a method fetchData(), have MySQLDatabase implement it, inject the DataSource into ReportGenerator's constructor instead of creating it internally, then create a second implementation MongoDatabase and prove in Main that ReportGenerator can be switched from MySQLDatabase to MongoDatabase by only changing the object passed into the constructor - ReportGenerator's own source code must not change.
