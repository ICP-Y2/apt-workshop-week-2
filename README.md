# APT-Workshop-Week-2  
## Learning Logs – Workshop 2  
### (Terminal + DAO + MySQL)

In **Workshop 1**, entries were stored only in **Java collections (in memory)**.

This created several limitations:

- Data disappeared when the application closed  
- No persistent storage existed  
- The application did not reflect real-world system design  

Real applications store data in **databases**, not temporary memory.

In **Workshop 2**, we solve this problem by connecting the application to a **MySQL database** and implementing the **DAO (Data Access Object) pattern**.

Now:

- Entries are stored permanently in MySQL  
- Data remains available after restarting the application  
- The system follows a more realistic **database-driven architecture**

---

# Objective

Convert the Learning Logs application to use:

- **MySQL database**
- **JDBC**
- **DAO architecture**
- **Maven for build & execution**

This workshop focuses on working with **Learning Entries**.

Students will implement the **EntryDAO** methods to store and retrieve entries from the database.

---

# Tasks to Complete


### Task 1: Setup the Database

1. Install and start Xampp. Download from [**here**](https://www.apachefriends.org/download.html) . Make sure `apache` and `mysql` are connected after installation.
2. Open phpMyAdmin and import the following files inside db folder. Click on the `admin` button on the right of mysql. 

- `sql/learnninglogs.sql`
- `sql/seed.sql`

**DATABASE SETUP:** Please read [**README.MD**](./db/README.md) in the **db** folder.
  
This will:
- Create the `topics` and `entries` table
- Insert initial sample data provided

---

## Task 2: Implement EntryDAO

Implement the following methods inside `EntryDAO`.

### Required Methods

```java
boolean insertEntry(Entry entry);

ArrayList<Entry> fetchAllEntries();
```

### Bonus Method

```java
HashMap<Integer, Entry> fetchEntriesByTopic(String topic);
```

---

## Application Behavior

Your program must now:

- Insert learning entries into **MySQL**
- Retrieve entries from **MySQL**
- Display entries in the **terminal**
- No longer store entries in **Java collections**

---

# Constraints

- Terminal-based program only  
- Must use **MySQL**  
- Must use **JDBC**  
- Must follow **DAO pattern**  
- No frameworks (No Spring / No Hibernate)  
- Keep the code **simple and readable**

---

# Test Cases

## Compulsory Tasks (Core Functionality)

These test cases verify that the **required DAO methods** work correctly.

Methods being tested:

```java
boolean insertEntry(Entry entry);
ArrayList<Entry> fetchAllEntries();
```

| TC | Description | Input | Expected Result |
|----|-------------|------|----------------|
| 1 | Insert a single entry | Topic: Java, Text: Learned about classes | Entry successfully inserted into database |
| 2 | Insert multiple entries | Entries under Java and MySQL topics | All entries stored correctly in DB |
| 3 | Fetch all entries | View entries command | All stored entries displayed in terminal |
| 4 | Restart application and fetch entries | Restart app → View entries | Previously stored entries still exist |
| 5 | Insert entry with empty text | Press Enter for entry text | Entry should not be inserted |
| 6 | Insert entry with long text | Large learning note | Entry inserted successfully |
| 7 | Fetch entries when database has no entries | View entries | Message displayed: `No entries available` |
| 8 | Verify auto-generated entry ID | Insert entry | Database automatically generates ID |

---

## Bonus Task (Advanced Query)

These test cases verify the **optional DAO method**.

Method being tested:

```java
HashMap<Integer, Entry> fetchEntriesByTopic(String topic);
```

| TC | Description | Input | Expected Result |
|----|-------------|------|----------------|
| 1 | Fetch entries for a valid topic | Topic: Java | Only entries related to Java returned |
| 2 | Fetch entries for another topic | Topic: MySQL | Only MySQL entries returned |
| 3 | Fetch entries for topic with no entries | Topic: Python | Empty result returned |
| 4 | Fetch entries for non-existing topic | Topic: Blockchain | Handled gracefully (empty result or message) |
| 5 | Verify map structure | Topic: Java | Returned structure contains TopicID → Entry mapping |

---

# What You Learn in This Workshop

- Connecting **Java to MySQL**
- Using **JDBC**
- Working with **PreparedStatement**
- Inserting records into a database
- Fetching records from a database
- Structuring code using the **DAO pattern**
- Understanding **persistent storage vs memory storage**
