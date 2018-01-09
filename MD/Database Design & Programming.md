Database Design & -Programming
============================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## Introduction

Recommended book: Information Modeling and Relational Databases by Terry Halpin
Relational databases - Based on Set theory
Hierarchical databases
Blockchain
NoSQL

A database is the backend of every computing system.
Persistent data storage for large amounts of data with simple access points
Data is much harder to recreate than hardware or software
Database applications are the 'active' part of DB systems

History of database systems:

* File system
	* Limited linkage and integrity management
	* Limited access control
* Excel files
	* Better linkage and integrity
	* Problems with data inconsistency
	* Security concerns
	* No centralized mechanism to replicate data across multiple systems
* Relational Databases
	* Database language
		* Structured Query Language (SQL)
		* De-facto standard
		* Different dialects
	* DBMS
		* Database management system
		* Logically accesses data
		* Different from the database itself
		* Companies are different
		* Different SQL dialects
	* Database structure
		* Responsibility of the database architect
		* Logical structure

Roles of database users

* Database administration
	* Installation, configuration, maintenance, upgrade
	* Administration
	* Monitoring and optimization
	* Backup and restore
* Database architect
	* Design and optimize databases
	* Structures data logically
* Application developer
	* Implements business process based on data from database

Relational database systems

* Commercial
	* DB2 (IBM)
	* Oracle DB (Oracle)
	* SQL Server / Access (Microsoft)
	* SQL Anywhere / Adaptive Server (Sybase)
	* SAP MaxDB (SAP)
* Open-source
	* MySQL (Oracle)
	* Ingres (Actian)
	* PostgreSQL
	* MariaDB

Features of a DBMS

* Consistent data storage / integrity
* Multi-user access
* Backup
* High-availability
* Consistency
* Isolation
* Access permission control
* Authentication

## Database Design

### Conceptual Design

ACID properties

* Atomicity
	* A transaction is either executed completely, or not at all
* Consistency
	* Integrity constraints are not violated
* Isolation
	* Separate systems are running as though they were the only instance
* Durability
	* The results are persistent

CAP

* Consistency
	* All systems have the same state of data
* Availability
	* Queries against the systems are always answered
* Partition tolerance
	* The system continues, even if parts are unavailable

Theory says that a system might fulfill at most two of them

* A and P
	* DNS system
	* Most web services
* C and A
	* Enterprise DB systems
	* Classical DB systems
* C and P
	* ATMs
	* Blockchain

Requirement engineering (Lots of interviews with the customer)

Procedure

* Reality
* Identification of subdomain
* Conceptual data model
* Logical data model
* Physical data model

*Skip, skip*

### Logical Design

Requirements

* Customer Requirements
* Written Documentation of the requirements
* Graphical representation
* Database
	* Weak entities
	* Not needed for business process
	* Is just an implementation artifact
	* Structured Attributes (Attributes that consist of multiple other (atomic) attributes)
	* Redundancy -> Normal forms
	* Relationships are expressed with a verb
	* The relation itself may be an entity
	* BPMN - Business Process Modeling Notation


### Physical Design

Normal forms

#### Keys
##### Primary Key
Primary key - Unique identifier of the given element e.g. the ID of a user
Surrogate primary key - A primary key consisting of multiple attributes (e.g. first name and last name)

##### Foreign key
The primary keys of other tables, used in relations

#### Attributes
##### Complex attributes
These attributes can be broken down to different sub-attributes (e.g. Name of a person -> First name, Last name)
##### Atomic attributes
These attributes can not be logically split any further (e.g. First name of a person)
##### NULL
The value `NULL` is used when the value of the attribute is not known. It can only be used if the attribute is **optional**, that is it is not **mandatory** to fill in the field. It represents *no data* for the entity, and is thus different from the empty string `""` and `0`.

#### Referential integrity

Entities on both sides of the relation must exist according to the rules of the database design

#### Relationships

* [1..1]
	* Simple
	* The one entity should have a foreign key to another
* [1..n]
	* The attribute that there are many of includes the a foreign key for the other attribute
* [n..m]
	* There is an associative table, additional attributes can also be added
* Recursive relationship
	* The entity has a field for another foreign key to the primary key of its own table.
* Dependency relationship
	* A depends on B
	* Primary Key, Foreign key concept (incomplete)
	* Associative table -> complete


### Normal Forms

#### 1. Normal form

Attributes must be atomic

#### 2. Normal form

Attributes must be *functionally dependent* from the primary key

#### 3. Normal form

Attributes must be *directly* dependent on the primary key

#### Boyce-Codd Normal form

There must not be any *functional dependency* between different attributes

### Parts of a database package

* DB Engine
* DB Design (eg. MySQL Workbench)
* CLI (eg. mysql)
* Programming Interface / Connectivity (eg. JDBC)
* Maintaining / Administration (eg. phpMyAdmin)
* Development tools (eg. Eclipse, PHP, Python, Notepad++, APEX, PowerBuilder)

## Database Programming

### SQL

* Standardization: ISO 9075:yyyy
* Standard not completely observed by DB vendors

### Extended Backus-Naur-From

* Originally developped by Nikolaus Wirth
	* Definition language
	* Standardized
* EBNF

#### Data definition

##### Schema management
Create
`CREATE SCHEMA <Schema-Name>`
Delete
`DROP SCHEMA <Schema-Name> [CASCADE | RESTRICT]`

##### Tables
Create
```
CREATE TABLE [Schema-name.]<Table-Name>
(
<Attribute-Defintion>,
[<Table-Integrity-Constraints>]
)
```
Attribute definition
`<Attribute-Definition> ::= <Attribute-Name> TYPE <Type-Definition>`

##### Data types

* INT
* SMALLINT
* BIGINT
* DEC/NUM (p [,q]) - Fractional number (p digits, out of which q are fractional digits)
* FLOAT
* REAL (DOUBLE)
* CHAR(n) - Character string of length N
* VARCHAR(n) - *Variable-length* CHAR
* NVARCHAR(n) - NVARCHAR with *Unicode*
* CLOB - Character Large Object, stores long texts
* BLOB - Binary Large Object, stores large binary data (eg. Images)
* BOOLEAN
* DATE
* TIME
* TIMESTAMP

##### Integrity constraints

* `UNIQUE`
* `NOT NULL`
* `DEFAULT`
* `CHECK (<Condition>)`
* `PRIMARY KEY`
* `REFERENCES <Table-Name> [<Attribute-Name>]`
* `[ON DELETE CASCADE | SET NULL | SET DEFAULT | RESTRICT | NO ACTION]`

##### Foreign keys and referential integrity

* A foreign key in one table *always* points to a foreign key in another table

##### Modification of tables

`ALTER TABLE [<Schema-Name>.]<Table-Name> DROP [COLUMN] <Attribute-Name> [CASCADE | RESTRICT]`

##### Views and Indexes

Saved select statement
`CREATE VIEW <View-Name> [<List-Of-Options>] <Select-Statement>`

##### Table constraints

`CREATE TABLE <Table-Name> (<field> SMALL INT PRIMARY KEY CHECK(<field> between 0 and 100))`

##### Foreign keys

`CREATE TABLE <Table-Name> (ID INT PRIMARY KEY, <field> INT REFERENCES <Other-Table>(<field>))`

##### Complex Primary Keys

`CREATE TABLE <Table-Name> (customer_number INT, company_code INT, PRIMARY KEY(customer_number, company_code))`

#### Indexes

`CREATE [Unique] INDEX <Name> ON <Table> (<Attribute-Name> [ASC-DESC])`

#### Joining tables

`SELECT <Table1>.<field> <Table2>.<field> FROM <Table1> INNER JOIN <Table2>`

### Administration
### Data Structures
### Performance Tuning