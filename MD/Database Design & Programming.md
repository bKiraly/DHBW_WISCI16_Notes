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

Homework: What data should be put in a database in your area of work?

## Database Design

### Conceptual Design
### Logical Design
### Physical Design

## Database Programming

### SQL
### Administration
### Data Structures
### Performance Tuning