# Module 1 - Database Basics

---

## Table of Contents

1. [Why do we need a Database?](#1-why-do-we-need-a-database)
2. [Data vs Information vs Database vs DBMS](#2-data-vs-information-vs-database-vs-dbms)
3. [DBMS over File System](#3-dbms-over-file-system)
4. [Properties of DBMS](#4-properties-of-dbms)
5. [Advantages and Disadvantages of DBMS](#5-advantages-and-disadvantages-of-dbms)
6. [Database Users](#6-actors-in-a-database-system)

---

## 1. Why do we need a Database?

### Story

Imagine we own a chocolate manufacturing company.

Every day thousands of chocolate bars are produced.

For every batch we store:

- Batch ID
- Manufacturing Date
- Expiry Date
- Quantity Produced
- Factory Location
- Ingredients Used
- Distributor Details

### Customer Complaint Example

Customer says:

> "This chocolate tastes bad."

Using the **Batch ID**, we can instantly find:

- Manufacturing Date
- Factory
- Ingredients
- Distributor
- Remaining products in the market

This allows us to quickly recall the defective batch.

### Other Company Data

The company also stores:

- Employees
- Salaries
- Attendance
- Suppliers
- Customers
- Orders
- Inventory

As data grows into millions of records, managing it using normal files becomes difficult.

**Solution:** Use a **Database managed by a DBMS**.

[⬆ Back to top](#table-of-contents)

---

## 2. Data vs Information vs Database vs DBMS

### 2.1 What is Data?

#### Definition

Data is raw, unprocessed facts.

#### Examples

- Rahul
- 24
- ₹50,000
- Batch B102
- 1200 kg

These values alone don't provide meaningful information.

---

### 2.2 What is Information?

#### Definition

Information is processed and meaningful data.

#### Example

##### Data

- Rahul
- 24
- ₹50,000

##### Information

Rahul is a **24-year-old employee** earning **₹50,000 per month**.

---

### 2.3 What is a Database?

#### Definition

A database is an organized collection of related data.

#### Example

| Employee ID | Name | Department | Salary |
|-------------|------|------------|--------|
| 101 | Rahul | Production | 50000 |
| 102 | Anjali | HR | 45000 |

---

### 2.4 What is Metadata?

#### Definition

Metadata means **data about data**.

It describes the structure of the stored data.

#### Metadata Example

| Column | Datatype |
|----------|-----------|
| ID | INTEGER |
| Name | VARCHAR(50) |
| Salary | DECIMAL(10,2) |

Metadata includes:

- Table Name
- Column Names
- Datatypes
- Constraints
- Relationships
- Primary Keys

---

### 2.5 What is DBMS?

#### Definition

A **Database Management System (DBMS)** is software used to create, store, retrieve, update, delete, and manage databases.

It acts as a bridge between users/applications and the database.

#### Examples

- MySQL
- PostgreSQL
- Oracle
- SQL Server
- MongoDB

---

### 2.6 Responsibilities of a DBMS

A DBMS should:

- Store and retrieve data efficiently.
- Manage large volumes of information.
- Define appropriate storage structures for different types of data (image, text, etc.).
- Provide mechanisms to insert, update, delete, and query data.
- Ensure data security and controlled access.

---

## 3. DBMS over File System

### 3.1 Data Redundancy

#### Problems

- Wasted storage
- More maintenance
- Difficult updates

---

### 3.2 Data Inconsistency

#### Meaning

Duplicate copies have different values.

#### Example

**HR**

Salary = ₹55,000

**Accounts**

Salary = ₹50,000

**Question**

Which salary is correct?

---

### 3.3 Difficulty Accessing Data

Suppose the manager asks:

- Employees from Chennai
- Joined after 2022
- Salary > ₹60,000

#### File System

Manual search or a custom program is required.

#### DBMS

```sql
SELECT *
FROM Employee
WHERE City = 'Chennai'
AND JoiningYear > 2022
AND Salary > 60000;
```

Result appears immediately.

---

### 3.4 Data Isolation

#### File System

- Employee.txt
- Salary.txt
- Attendance.txt
- Department.txt

Information is scattered across multiple files.

DBMS stores related data using tables and relationships.

[⬆ Back to top](#table-of-contents)

---

### 3.5 Integrity Constraints

Examples:

- Salary > 0
- Age > 18
- Email must be unique
- Marks between 0 and 100

DBMS automatically enforces constraints using:

- PRIMARY KEY
- FOREIGN KEY
- UNIQUE
- CHECK
- NOT NULL

---

### 3.6 Atomicity

#### Definition

Either the complete transaction succeeds or nothing happens.

#### Example

Transfer ₹1000

Rahul → -1000

Priya → +1000

If power fails after deducting Rahul's money,

DBMS rolls back the transaction.

No money is lost.

---

### 3.7 Concurrent Access

Two accountants update salary simultaneously.

Original Salary

₹50,000

User A

₹55,000

User B

₹52,000

Without concurrency control,

one update may overwrite another.

DBMS prevents this using transactions and locking.

---

### 3.8 Security

DBMS provides:

- Authentication
- Authorization
- Role-Based Access
- Table Permissions
- Row Permissions
- Audit Logs

#### Example

- HR → Salaries
- Sales → Orders
- Production → Inventory
- Intern → Read-only

[⬆ Back to top](#table-of-contents)

---

## 4. Properties of DBMS

### 4.1 Self-Describing Nature

The DBMS knows everything about the database because it stores metadata in a **Data Dictionary** or **System Catalog**.

---

### 4.2 Program-Data Independence

Applications don't directly depend on how data is stored.

Storage changes do not require rewriting programs.

---

### 4.3 Data Abstraction

Users don't need to know where or how data is stored.

They simply query the database.

---

### 4.4 Multiple Views

Different users like HR, Finance, Production, and Sales use the same database but see only the information relevant to them.

[⬆ Back to top](#table-of-contents)

---

## 5. Advantages and Disadvantages of DBMS

### 5.1 Advantages

- Reduces data redundancy
- Reduces data inconsistency
- Faster data retrieval
- Better security
- Supports multiple users
- Maintains data integrity
- Provides backup and recovery
- Supports transactions (ACID)
- Easy data sharing

---

### 5.2 Disadvantages

#### Expensive

Includes:

- Software licenses
- DBAs
- Maintenance
- Backup

---

#### Complex

Requires understanding of:

- Tables
- SQL
- Relationships
- Indexing
- Transactions

---

#### Storage Overhead

Extra storage is required for:

- Actual data
- Metadata
- Indexes
- Transaction logs
- System catalogs
- Security information
- Backups

---

#### Performance Overhead (for Small Applications)

Extra processing due to:

- Constraint checking
- Authentication
- Authorization
- Logging
- Locking
- Transaction management

---

#### Data Migration Can Be Difficult

Example:

Changing from **MySQL** to **PostgreSQL** may require rewriting:

- SQL syntax
- Stored Procedures
- Triggers

---

#### Centralized System

##### Failure Affects Many Users

Since data is stored centrally, a failure affects many users.

Organizations use:

- Backups
- Replication
- Failover Systems

##### Security Risk

If the centralized database is compromised,

a large amount of organizational data can be exposed.

---

## 6. Actors in a Database System

### 6.1 Actors on the Scene

These are the people who directly interact with the database.

#### A. Database Administrator (DBA)

A Database Administrator (DBA) is responsible for the overall administration, security, backup, recovery, and performance of the database system.

---

#### B. Database Designers

Database designers analyze the application's requirements and design the database schema, relationships, and constraints.

---

#### C. End Users

These are the people who actually use the database to perform their work.

They are divided into four types.

##### 1. Casual Users

Use the database occasionally.

- Runs few queries.

---

##### 2. Naive (Parametric) Users

These users perform the same task repeatedly using predefined forms.

- Don't write queries.
- Simply use the UI.

---

##### 3. Sophisticated Users

These users understand databases well.

- Write SQL queries.

---

##### 4. Standalone Users

These users maintain their own personal databases using ready-made software.

---

### 6.2 Workers Behind the Scene

These people usually don't use the company database directly.

Instead, they build and maintain the DBMS software itself.

#### A. System Designers and Implementers

These people develop the DBMS software.

---

#### B. Tool Developers

They build additional software that works with the DBMS.

Examples:

- Backup tool
- Report generation tool
- GUI

---

#### C. Operators and Maintenance Personnel

These people keep the database servers running.

Responsibilities:

- Install software updates
- Replace faulty hardware
- Monitor servers
- Start and stop database services
- Perform routine maintenance
- Ensure backups are running successfully

[⬆ Back to top](#table-of-contents)