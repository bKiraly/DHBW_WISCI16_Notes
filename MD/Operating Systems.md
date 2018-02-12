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

> **Internal fragmentation** is the wasted space on a storage device that arises due to the fact that only whole blocks can be written, and those have a fixed size (usually 512 bytes)

&nbsp;

> **External fragmentation** arises when a file can not be written to a sequence of blocks, and gets broken up into parts that are re-assembled later.

&nbsp;

> **File systems** keep track of where each part of each file is located, along with meta-information about the file.

&nbsp;

> **Files** are abstractions of contiguous data

#### Contiguous file systems

* ISO 9660
* Used for CDs
* Data is only written, never erased

### First operating system for microprocessors

* CP/M
* Gary Kildall
* Control Program for Microprocessors (/monitor)
* Linked list file system

#### The origins of Windows

* Microsoft founded (1975)
* BASIC interpreter (4kiB ROM for Altair microprocessors)
* Microsoft licenses Xenix OS from AT&T
* Seattle Computer Products invents QDOS (Quick and Dirty OS)
	* Port of CP/M for 808x microprocessors
	* Sold for $50k to Microsoft
* New filesystem (FAT - File Allocation Table)
	* Table of all blocks and follow-ups stored separately
	* All loaded into main memory on startup
	* Much faster
	* Used for Floppy Disks and HDDs
	* Now used in USB sticks and memory cards
* DOS is invented

#### Competitors

* MIT develops CTSS (Compatible Time-Sharing System)
* Compatible with IBM hardware (ITS incompatible)
* MULTICS (Multiple Information Computing Service)
	* Cloud Computing

#### UNIX

* Developed for PDP-7
* Originally UNICS (Uniplexed Information and Computing System)
* For playing "space travel"
* File system + Bootloader + Scheduler
* Ported to the PDP-11
* Written in C

##### The legacy of Unix

* BSD
* Solaris
* AIX
* HP-UX
* GNU (Richard Stallman)
* MINIX (Andrew Tannenbaum)
* Linux (Linus Torvalds)

#### Ext4

* Inodes
* First 7 blocks direct lookup from inode
* Last 3 blocks are other index nodes
* Superblock - Root to folder structure and blocks

### OS history roadmap

| 	| Mainframe	| Minicomputers	| Microcomputers	| Mobile/Embedded Devices	|
|---|-----------|---------------|-------------------|---------------------------|
|'50| Many		| Many			|					|							|
|'60| OS/360	| MULTICS (MF)	| Many				| 							|
|'70| OS/370	| UNIX/VMS		| CPM				| 							|
|'80| 			| UNIX clones	| QDOS -> MS-DOS	| Many						|
|'90| OS/390	| Linux			| Windows & WinNT	| 							|
|'00| zOS		| MacOS			| WinXP				| iOS, Android, RTOS		|

#### Respective file systems

Unix

* UFS
* VFS
* FFS
* HFS

Linux

* ext2
* ext3
* ext4
	* I-nodes
* ReiserFS
* ZFS
* BtrFS

DOS/Windows

* NTFS
	* MFT
	* B+ Tree
* ReFS

### Journal

* Linear recording
* Planned changes
* data/Metadata
* Lets OS reach consistent state faster

### Network file systems

* SAN
	* Block level
	* File channel
	* iSCSI
* NAS
	* NFS
	* CIFS

## Process Management

> **Processes** are running (runnable) programs as well as their data and metadata

* Current program counter value
* Register Values
* Memory Contents
* Resources used (open files)
* Metadata (Process order, Authorizations)

### Multitasking

> **Multitasking** is the process of running multiple *processes* at the same time.

* No multitasking
* Quasiparallel execution (interleaved)
* Parallel execution (multiple CPUs)
* Cooperative multitasking (processes yield CPU deliberately)
* Preemptive multitasking (OS forces process to yield the CPU)

### Process life-cycle

1. Process creation
	* OS at system start
	* By user
	* By other processes
		* by System call
			* fork (Unix)
			* create process (Windows)
2. Process Termination
	* System shutdown
	* Regular termination
	* Exceptions
	* By other processes
	* By users / Administrators

### Process management in Unix

* Chaining
* Spawning
* Forking
* Waiting
* Joining

### Process states

* Runnable
	* Can be run by the scheduler
* Running
* Waiting
	* When making blocking system calls
* Terminated

### Policy vs Mechanism

Separation of Policy (what to do) and mechanism (how)

### Scheduling mechanism

1. Interrupt
	* Timer interrupt
	* System call
	* Exception
	1. Save program counter
	2. Switch to privileged mode
	3. Jump to kernel entry (interrupt vector)
2. Save registers
3. Check cause of interrupt
4. Handle interrupt
5. Figure out which process has been interrupted
6. Decide whether the same or different process should be scheduled (see Scheduling policy)
7. Save PID of scheduled process, restore CPU registers
8. Switch to non-privileged mode
9. Jump to where the scheduled process was interrupted

### Scheduling policy

#### Goals

* Prioritization
* Fairness
* Preventing priority inversion
* Efficiency
* Maximize total throughput
* Maximize responsiveness
* No starvation
* Predictability
* Meet deadlines at cost

#### Policies

* FCFS (First Come, First Served)
* SJF (Shortest Job First)
* SRTF (Shortest Remaining Time First)
* Priority first
* NDF (Nearest Deadline First)
* RR (Round Robin)
* ML (Multilevel - RR with priorities)
* RR with dynamic priorities
* MLF (Multilevel with Feedback)
* Random

### IPC

* File systems
	* Crude
	* Archaic
* Signals
	* e.g. SIGSEGV
* Message Queues
	* Asynchronous communication
* Pipelining
* Socket

### LWP (Lightweight Processes - Threads)

> **Threads** are processes that cooperate and share a common address space

Lost update problem
Inconsistent read problem

> **Race conditions** occur if two or more threads try to access the same resource, and the result depends on the execution order.

#### Solution: Locks

* The critical section is *locked* in order to prevent out-of-order execution of updates
* Semaphors (term by Dijkstra)
	* counter n
	* queue
	* 2 operation
	* P -> if n > 0: n-=1 else put operation in queue
	* V -> increment n by 1, if there is at least one thread in the waiting queue, wake it
	* Special case: Start value of 1 -> mutex (mutual exclusion)
* Monitors (invented by Hoare)
	* Monitors monitor a certain resource, to make sure it is not accessed in parallel
* Implemented using atomic operation on the hardware level -> `atomic int`
* Peterson algorithm -> Spinlock `while(turn == task) /*Do nothing*/;`
* //Therac-25

### Memory abstraction

#### No memory abstraction

* Problems
	* Not enough physical memory
	* Relocation problem
	* No memory protection
* Solutions
	* Overlays (program only loads necessary parts)
	* Swapping (programs are progressively written to a swap file on disk)
		* Segment register -> loaded with the base address of the start of the program
		* Segment limit register -> limit register to achieve memory protection
		* Problem: Fragmentation -> Very slow when low on memory
	* VAX (Virtual Address Extension)
		* The memory is divided into page frames (4 kiB)
		* Page frames are assigned to processes, to extend their virtual memory
		* Memory Management Unit (MMU) offers *hardware support* for virtual memory
		* Virtual address: 32 bit address, 20 bit program number + 12 bit offset
		* Staged page table -> Only has the addresses that are needed
		* Problem: If the memory addresses are stored in the RAM you need *double* the memory accesses
		* Solution: TLB (Translation Lookaside Buffer)
		* Cached inside MMU
	* Paging -> Same as sawpping, but swaps infrequently used pages to disk
* Memory Management Mechanism
	* Program accesses initial memory address
		1. Page number in TLB -> MMU translates address :)
		2. Page number not in TLB -> Fetch PT goto 1
		3. Page number not in Page Table (PT) -> Interrupt - OS handles interrupt
			* Page on disk -> reload, goto 2
			* page is reserved, but not yet accessed -> update PT, goto 2
			* Page does not belong to process -> Abort, Segfault (SIGSEGV)
* Memory Management Policy
	* Optimal
		* The page accessed furthest in the future is dumped
		* NRU (Not Recently Used)
			* TLB records access in special bit in PT
			* OS clears those bits from time to time
		* FIFO
			* First in, first out
		* FIFO with 2nd chance (clock algorithm)
			* if a page is about to be paged out, it is given a second chance
		* LRU (Last Recently Used)
			* The page that was used last recently gets dumped
		* NFU (Not Frequently Used)
			* The page that is used least frequently gets dumped

### Deadlocks

* Mutual exclusion
	* No two processes can use resources simultaneously
* Hold and await
	* Can acquire and will not refuse even ig the process is stuck
* No preemption
	* OS can not force release of resource
* Circular wait
	* A waits for B, B waits for A
