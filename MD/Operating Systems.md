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

### I/O Models

* Program controlled I/O
	* Program loop reads/writes from device
	* Program loop reads/writes to memory
* Interrupt based I/O
	* Interrupt CPU when data is available
	* CPU is free to do other things, until the interrupt
* Direct memory access
	* I/O Devices directly read/write to memory
	* Interrupt CPU when read/write is complete

### Interrupts

#### Types of Interrupts

* Hardware interrupts (asynchronous, external) e.g. User hits key
* Software interrupts (synchronous, internal) e.g. Program wants to access OS resources (System calls)
* Faults (synchronous?, internal?) e.g. Bus faults

#### Interrupt vectorization

| Int #	| Address	|
|-------|---------------|
| 0	| 0x00000012	|
| 1	| 0x10202012	|
| 2	| 0x12345641	|

#### Masking of Interrupts

Certain bitmasks can be set, to mask interrupts to avoid interrupting time-critical code

#### Prioritization

Certain interrupts take precedence over others

#### Interrupt handling

* Check for interrupts
	* If none: continue with cycle
* If yes
* Check if interrupt is masked
	* If yes: continue with cycle
* Check if priority is high enough
	* If no: continue with cycle
* Save value of IP to stack
* Find cause of interrupt
* Switch to kernel mode
* Jump to interrupt vector

#### Evolution of I/O Support

* No support
* Reuse I/O routines from monitor/early OS
* Mandatory use of OS for I/O

##### Buffering

Advantages

* More efficient when reading multiple times
* More efficient when writing data (writes are non-blocking)

Disadvantages

* Danger of losing data
* Danger of data inconsistencies
* Consumes more memory

Buffer locations

* Hardware layer (I/O controller)
* Driver layer
* File system layer
* System libraries
* Application layer

#### User-interface evolution

* Lights/switches
* Teletypes/printers
* Keyboards/mice
* GUIs
* Voice control

### Storage devices

#### HDDs

* CHS
* Typical block size: 512 bytes
* PMR
* SMR
* HAMR
* MAMR

### I/O Scheduling

* FIFO
* Elevator algorithm
	* Start going in the direction of the first request
	* Keep moving in that direction until you reach the last request in that direction
	* Then switch directions and repeat
* Priority-based scheduler
* Anticipatory scheduler
* NOOP scheduler

### File systems and fragmentation

> **Internal fragmentatio** is the wasted space on a storage device that arises due to the fact that only whole blocks can be written, and those have a fixed size (usually 512 bytes)

&nbsp;

> **External fragmentation** arises when a file can not be written to a sequence of blocks, and gets broken up into parts that are re-assembled later.

&nbsp;

> **File systems** keep track of where each part of each file is located, along with meta-information about the file.

&nbsp;

> **Files** are abstractions of contiguous data