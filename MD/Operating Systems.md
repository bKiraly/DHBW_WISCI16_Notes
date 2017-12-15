Operating Systems
===============

## Introduction

### History of Computers

* 1940-1949 - Relay and Vacuum tube computer
* 1950-1959 - Transistor computer
	* Mainframe computers
	* Batch processing
* 1960-1969 - IC computer
	* Minicomputers
	* Time-sharing systems
* 1970-1979 - Microprocessor
	* Personal computers
* 1980-1989 - PCs widespread
	* GUIs
* 1990-1999 - World wide web
* 2000-2009 - Mobile computers (smartphones)
* 2010-2017 - AI, machine learning, cloud
* 2018-? - Quantum computers?

### History of Operating Systems

* No OS, specialized computers
* Monitors
	* Allow operators to load and store programs
	* Direct memory access
	* Search data patterns in memory
	* Debug programs
* Batch OSes
	* Automatically start new program from batch
	* Sequential execution
* Time-sharing
	* Hardware resources are virtualized
	* Multiple users can use the system concurrently
* Multi-tasking operating systems
	* Each user can run multiple programs
* Complete virtualization
	* Separation of hardware and application layer
	* Multiple operating systems on a single computer
	* Cluster computers sharing VMs

------------------

* Distributed OSes
* Real-time OSes

## Fundamental concepts

### Users of operating systems

* End users
* Administrators
* Managers, decision makers
* Hardware engineers
* Application programmers
* System programmers

### Tasks of an OS

* Provide a runtime environment
* Provide a UI
* Hide hardware details from programmers/users
* Virtualize the hardware
* Reusable components (libraries)
* Make most efficient use of the hardware

### Structure of an OS

* Hardware
* Kernel
	* Hardware abstraction layer
	* Device drivers
	* Scheduler
	* Memory Management
	* User/Authorization management
	* I/O Management
		* File system
	* System services
	* System call interface

-----
* System libraries
* Applications
* UI

### Operating modes of the CPU

* Kernel mode
	* Direct access to physical memory
	* Direct access to hardware
	* Execute all instructions
* User mode
	* Allow access to virtual memory
	* No direct access to hardware
	* Execute a subset of instructions

### Types of Kernels

* Monolithic kernels
	* Have a lot of responsibilities
	* Contain lost of code
	* Device drivers run in kernel mode
* Microkernel
	* Only the most fundamental parts of the OS are in kernel mode
	* Device drivers do not run in kernel mode
	* Advantages
		* Much more stable
		* More secure
		* More flexible
		* Easier to maintain
	* Disadvantage
		* Slower

## Input/Output

### Von Neumann Architecture

* Specific memory addresses are assigned to I/O devices

### I/O models

* Program controlled I/O
	* Program loop reads/writes from device
	* Program loop reads/writes to memory
* Interrupt based I/O
	* 