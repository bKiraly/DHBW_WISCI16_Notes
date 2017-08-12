Intro to IT
=========

> **Disclaimer**
> These notes are translated and compiled on the courtesy of Dávid Lázár based on the notes of the German course by Julius Englert. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## Basics of IT – Intro to Computer Systems
## History of Computers

| Generation	| Duration	| Technology		| Operations/sec	|
|---------------|---------------|-----------------------|-----------------------|
| 0		| -1944	 	| Relays, Mechanic	| ~100			|
| 1		| 1945-1954	| Electron tubes	| 40 000		|
| 2		| 1955-1964	| Transistors		| 200 000		|
| 3		| 1964-1970	| Chip			| 1 000 000		|
| 4		| From 1971	| Highly integrated Chip| 10 000 000+		|



## Basic terms from Data Processing

Data Processing in Modern Days:

* Data as an input in a Computer
* Data that is processed by a Computer
* Data that is prodused by a Computer

> **Data** Characters without kontext

&nbsp;
> **Information** Context orientated Data

&nbsp;
> **Character** Elements for presenting Information (this has to be previously agreed on)

&nbsp;
> **Character set** Limited amount of characters

&nbsp;
> **News** A combination of Characters, its primary purpose is transfering Information

&nbsp;
> **Data processing** A process which relates to the acquisition, storage, transmission and transformation

&nbsp;
> **Transmission** Mapping ensures correct data transmission between two systems

&nbsp;
> **EDI** Electronic Data Interchange

&nbsp;
> **EDP** Electronic Data Processing

&nbsp;
> **Algorithm** Well-defined, finite, terminating, (non)deterministic process.

Data processing systems

* Electronically working unit, which automatically processes data with stored programs
* Mathematical, forming, transferring storing operations
* Advantages: Automatic and fast execution of operations

> **Computer Science** The science of processing data with computers


## Main areas
### Technical computer science

* Hardware
* Technology
* Phisics
* Electricity
* Construction
* Processors
### Practical computer science

* Software
	* Operating Systems
	* Programs
* Compiler
### Theoretical computer science

* Formal languages
* Automation Theory
* Proofs
### Applied computer science

* Use of computers in different areas
* Robots, AIs,...

### Other areas:

* Business informatics
* Legal c.s.
* ...

### Computer		
> A **computer** is a memory-programmable calculation system
		
A computer must

* Freely programmable
* Memory for recording programs
* Connect devices for input and output of data

Outline of a Computer

* Hardware
* System software (operating system)
* Application software

> **Hardware** Physical devices forming the system
> 
&nbsp;
> **System software** It is connecting the applications to the hardware and telling the hardware what to do.

&nbsp;
> **Applications** Serves the special data processing application

## Computer architectures
> **Computer architectures** Technical realization of data processing systems

Definition of the display of the internal data
Definition of the representation of the external data

* CPU
* machine instructions (format of the instructions)
* Interfaces (internal and external)

Construction plan, according to which the functional units are assembled

#### Classification according to Flynn

* Machine processes only one command or more at a given time
* Machine processes only one or more data at a time (date with files)

> **SISD Architecture** Single Instruction Single Data Stream
> **SIMD Architecture** Single Instruction Multiple Data Stream
> **MISD Architecture** Multiple Instruction Single Data Stream
> **MIMD Architecture** Multiple Instruction Multiple Data Stream

### Computer architecture, von Neumann architecture

* Most of today's computers are built according to the "Neumann architecture" principle
* This principle implements the EVA principle 

#### Components of Neumann architecture
![Von-Neumann architecture](https://upload.wikimedia.org/wikipedia/commons/thumb/e/e5/Von_Neumann_Architecture.svg/510px-Von_Neumann_Architecture.svg.png)

* Arithmatic unit
	* Execution of the arithmetic and logical operations
* Control unit
	* Initiates the transfer of the instructions from the main memory into the processor
	* Interpret (decode) the encoded statements
	* Initializes the components necessary for executing the instructions via the control signal
* Memory unit
	* Also main memory or memory
	* Programs and data are stored here
* Input Device
	* Data and programs are entered into the computer system and run into the memory via data paths(BUS)
* Output Device
	* Output of results and / or data
	* The results calculated by the CPU are transferred to the output via data paths

#### The processor

* Central component of the computer system
* The actual data processing takes place here
* The execution unit for arithmetic operations is the Arithmetical-Logical-Unit (ALU)
* Data and instructions loaded from the main memory are temporarily stored in memory records in the register
* Today, a distinction is made between two process location architectures
* RISC Reduced Instruction Set Computing
* CISC Complex Instruction Set Computing

#### Types of memory

* Volatile Memory (RAM)
* Non-volatile memories (ROM)
* Network storage (NAS, SAN)
* RAID systems

> **NAS Network Attached Storage** Special servers in a network that are optimized as a file server

&nbsp;
> **SAN Storage Area Network** Network structure in which servers of a computer network are connected to storage units via a separate high-performance network

&nbsp;
> **RAID systems** Redundant Array of Independent Disks

#### Memory Hierarchy

The memory of the computer is divided into several, progressively slower and higher-capacity chunks.

* Registers (<=1ns, 100s of Bytes)
* Cache: L1 (~5ns, 16KiB), L2 -> SRAM (~10ns, 1MiB) and L3 ->DRAM (30 ns, 16 MiB)
* RAM (~100ns, ~8GB)
	* Core memory
* Flash memory (100 microSec, ~0.5TB)
* Permanent storage -> Usually HDDs (~4ms, Terabytes)
* Archival storage (minutes, >= 1PB)

This is illustrated on the following picture
![Memory levels](http://cse1.net/recaps/img/4-hierarchy.jpg)

#### Von Neumann Cycle

* FETCH instruction from memory
	* The content of the storage cell determined by the Instruction-Counter (IC) is loaded from the working memory into the instruction register (IR)
* DECODE instructions 
	* FETCH OPERANDS from memory 
* EXECUTE 
* WRITE BACK result 
* UPDATE INSTRUCTION POINTER 

### Harvard Architecture 
	Programs and data in separate memory 

## Measures of implementation times
### Machine Cycle Time

* The time at which a run of instructions is measured
* Cycle time can also be measured in MIPS (Millions of Instructions per Second)

## Clock Speed

* Each CPU generates a series of electronic pulses according to a pre-determined Rate -> Clock Speed
* The control unit in the CPU manages the stages of the machine run by following predefined internal instructions -> Microcode
* Microcode are predefined, elementary circuits, and logical operations that the processor runs through when executing instructions

## Moore's law

* Every 12 months, the chip's transistor density is doubled

		
## Computer Types

* Supercomputer
* Mainframe
* Minicomputer
* Macrocomputer

## Who is who in Computer Science?

* User
	* Users of the applications
* System administrator		
	* Maintenance and support of operating systems
	* Management of system users
	* Network management
	* Administration of servers
	* Manage access rights to databases

> Access Control List (**ACL**)
>
* Helpdesk 
	* Central office to help employees and customers
	* According to ITIL: Sing Point of Contact
* ITIL 
	* Infrastructure Information Library
	* Best practice standard of IT service management

## IT service management according to ITIL

1. Single Point of Contac - Incident Management:
	* Customer logs in at helpdesk
2. First-Level Support - Problem Management:
	* Helpdesk looks for solution (previous problems)
3. Second-Level Support - Laboratory:
	* Helpdesk ticket goes to the department
4. Third-level support.
	* Laboratory / Development solves the problem

In the worst case, a series must be recalled

## Standards in IT
> Standards make it much easier for IT, because this way we don't have to define that many exceptions!

## Categories of standards
### De-facto Standards: 
* Standardization was done without conceptual preliminary work and formal plan as such.
### De-jure Standard: 
* Formal, legal standardization, authorized by authorized Bodies
### International bodies: 
* Bodies established by government agreements
* Bodies not governed by government agreements
### Examples
* ITU 
	* International Telecommunication Union
	* International allocation and registration of broadcast- and reception frequencies
* IEEE: 
	* Institute of Electrical and Electronics Engineers
	* Working groups develop standards for specific areas
* ISO: 
	* Internation Standards Organization
	* Association of standardization organizations
	* E.g., B. ISO OSI model


## Practical Part

* number system conversion
* units (kilo, mega, giga)
* logical operations (circuit algebra)
* unicode chars
* floating point conversion
* circuit elements

## Units

> A **Bit** is the smallest amount of data, it can have the value 1 or 0, short "b".

> A **Byte** it 8 bits.


| Symbol	| Prefix (SI/Binary)	| SI Meaning	| Binary meaning	| Size difference (sidenote)	|
|---------------|-----------------------|---------------|-----------------------|-------------------------------|
| k		| kilo/kibi		| 10^3		| 2^10			| 2,40%				|
| M		| mega/mebi		| 10^6		| 2^20			| 4,86%				|
| G		| giga/gibi		| 10^9		| 2^30			| 7,37%				|
| T		| tera/tebi		| 10^12		| 2^40			| 9,95%				|
| P		| peta/pebi		| 10^15		| 2^50			| 12,59%			|
| E		| exa/exbi		| 10^18		| 2^60			| 15,29%			|
| Z		| zetta/zebi		| 10^21		| 2^70			| 18,06%			|
| Y		| yotta/yobi		| 10^24		| 2^80			| 20,89%			|


## Number system conversion

### Decimal to Other Base System

* **Step 1** - Divide the decimal number to be converted by the value of the new base.
* **Step 2** - Get the remainder from Step 1 as the rightmost digit (least significant digit) of new base number.
* **Step 3** - Divide the quotient of the previous divide by the new base.
* **Step 4** - Record the remainder from Step 3 as the next digit (to the left) of the new base number.

Repeat Steps 3 and 4, getting remainders from right to left, until the quotient becomes zero in Step 3.


**Example** (29 in Binary)

| Operation	| Result	| Remainder	|
|---------------|---------------|---------------|
| 29 / 2	| 14 		| 1		|
| 14 / 2 	| 7 		| 0		|
| 7 / 2 	| 3 		| 1		|
| 3 / 2 	| 1 		| 1		|
| 1 / 2 	| 0 		| 1		|

*29* in binary is *11101*.

### Other Base System to Decimal System

* **Step 1** - Determine the column (positional) value of each digit (this depends on the position of the digit and the base of the number system).
* **Step 2** - Multiply the obtained column values (in Step 1) by the digits in the corresponding columns.
* **Step 3** - Sum the products calculated in Step 2. The total is the equivalent value in decimal.

**Example** (11101 to decimal)
	
in base 2 = in base 10

$11101 = ((1 × 2^4) + (1 × 2^3) + (1 × 2^2) + (0 × 2^1) + (1 × 2^0))$

### Other Base System to Non-Decimal System

	* **Step 1** - Convert the original number to a decimal number (base 10).
	* **Step 2** - Convert the decimal number so obtained to the new base number.

## Unicode characters

### ASCII characters

> **ASCII** stands for American Standard Code for Information Interchange and its the the most basic 7 bit table.

**ASCII table breakdown**
	
* **0-31** and 127 are controll characters
* **32-126** Symbols and Alphanumeric characters
	* **48-57** Numbers
	* **65-90** Capital leters from the american alphabet
	* **97-122** small leters from the american alphabet
	* **rest** Symbols

###Creation of UTF-8 characters

| Number of bytes	| Bits for code print	| First code point	| Last code point	| Byte 1	| Byte 2	| Byte 3	| Byte 4	|		
|-----------------------|-----------------------|-----------------------|-----------------------|---------------|---------------|---------------|---------------|
| 1 [0]			| 7			| U+0000		| U+007F		| 0xxxxxxx	| -		| -		| -		|
| 2			| 11			| U+0080		| U+07FF		| 110xxxxx	| 10xxxxxx	| -		| -		|
| 3			| 16			| U+0800		| U+FFFF		| 1110xxxx	| 10xxxxxx	| 10xxxxxx	| -		|
| 4			| 21			| U+10000		| U+10FFFF		| 11110xxx	| 10xxxxxx	| 10xxxxxx	| 10xxxxxx	|
	
[0] Theese are the ASCII characters

In UTF-8 the byte tells how many bytes a character consists of 
	
* **0xxxxxxx** means that its the first byte of a1 byte character
* **110xxxxx** means that its the first byte of a 2 byte character, because it starts with 2 *1*s and a *0*s
* **1110xxxx** means that its the first byte of a 3 byte character, because it starts with 3 *1*s and a *0*s
* **...**
* **11111110** means that its the first byte of a 7 byte character, because it starts with 7 *1*s and a *0*s (this is a VERY rare case)
* **10xxxxxx** means that its a trailing byte in a multi byte character

## Presentation of data types

###Data Types

| Types		| Size (bits)	| Minimum Value	| Maximum Value	|
|---------------|---------------|---------------|---------------|
| byte		| 8		| -128		| 127		|
| char		| 16		| 0		| 2^16-1	|
| short		| 16		| -2^15		| 2^15-1	|
| int		| 32		| -2^31		| 2^31-1	|
| long		| 64		| -2^63		| 2^63-1	|
| float		| 32		| -2^149	| complicated	|
| double	| 64		| -2^1074	| complicated	|
| boolean	| 1		| 0 / false	| 1 / true	|
	
### Integer Types (byte, char, short, int, long)

> **Sign** if its 0 than the number is positive if its 1 its negative.

An integer type is stored this way:
*Note char is an unsigned short, meaning it has no sign bit.*

| Sign	| Digits 		|
|-------|-----------------------|
| 1 bit	| rest of the bits	|
| 0 bit	| all of the bits	|

### Floating-point types (float, double)

> In computing, **floating-point** arithmetic is arithmetic using formulaic representation of real numbers as an approximation so as to support a trade-off between range and precision. Its elements are always integers.

&nbsp;
> **Significant digits** (significand) are the first few digits of a number (it can't start with a zero).

&nbsp;
> **Base** is the base of the number System, in *decimal* its *10*.

&nbsp;
> **Exponent** is the base to the power of that integer.

Floating point types are stored like this

| Type	 	| Sign	| Exponent	| Significand field 	| Total bits	|
|---------------|-------|---------------|-----------------------|---------------|
| Single(float)	| 1	| 8	 	| 23		 	| 32	 	|
| Double	| 1 	| 11 		| 52 			| 64	 	|


## Logical operations (circuit algebra)

> Any logical statement which contains a finite number of logical variables can be analyzed using a table which lists all possible values of the variables: a **truth table**.

### Unary operations

> **Unary operations** are operations with only one argument.
	
| Name						| Short | Description				| Symbol	|
|-----------------------------------------------|-------|---------------------------------------|---------------|
| Tautology					| true	| The output is allways true		| $1$		|
| Never true/unary falsum			| false	| The output is allways false		| $0$		|
| Unary(or logical) Identity / Projection	| eq	| output = input			|		|
| Unary(or logical) negation (NOT)		| NOT	| output = the oposite of the input	| $\lnot$	|

### Binary operations

| Operation name		| Short name		| Symbol 	| q/p 	| T/T | T/F | F/T | F/F |
|-------------------------------|-----------------------|---------------|-------|-----|-----|-----|-----|
| Contridiction			| false			| $0$	 	| -	| F   | F   | F   | F   |
| Tautology			| true			| $1$	 	| -	| T   | T   | T   | T   |
| Logical disjunction		| OR			| $\lor$	| -	| T   | T   | T   | F   |
| Logical NOR			| NOR			| $\lnot\lor$	| -	| F   | F   | F   | T   |
| Exclusive disjunction		| XOR			| $\lxor$	| -	| F   | T   | T   | F   |
| Logical biconditional		| XNOR			| iff\*		| -	| T   | F   | F   | T   |
| Logical Conjunction		| AND			| $\land$	| -	| T   | F   | F   | F   |
| Logical NAND			| NAND			| $\lnot\land$	| -	| F   | T   | T   | T   |
| Material implication		| implication		| $\Rightarrow$	| -	| T   | F   | T   | T   |
| Material nonimplication	| nonimplication	|$\not\Rightarrow$| -	| F   | T   | F   | F   |
| Converse implication		| reverse implication	| $\Leftarrow$	| -	| T   | T   | F   | T   |
| Converse nonimplication	| reverse nonimplication|$\not\Leftarrow$| -	| F   | F   | T   | F   |

> **OR** means, that its true, if one of the inputs is true.

&nbsp;
> **XOR** means, that its true, if only one of the inputs is true.

&nbsp;
> **XNOR**, is the same eqvivalence, meaning ((A→B) ∧ (B→A)), but it also means NOT XOR. 

&nbsp;
> **AND** means, that its true, if all inputs are true.

&nbsp;
> **Implication** means, that its true, if the *if A, then B* is true. 

&nbsp;
> **Converse implication** is implication to the other direction.

## Circuit

### Basic circuit elements

| Name		| Description									| Looks														|
|---------------|-------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------|
| Switch	| A basic switch that opens and closes the circuit				|![Switch circuit representation](https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/SPST-Switch.svg/150px-SPST-Switch.svg.png)		|
| Diode		| It restricts the current to flow only in one direction			|![Diode circuit representation](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b4/Diode_symbol.svg/180px-Diode_symbol.svg.png)	|
| Transistor	| It is an electronic switch or in circuit algebra an AND (used in computers	|![Transistor circuit representation](https://upload.wikimedia.org/wikipedia/commons/thumb/9/9b/BJT_PNP_symbol.svg/120px-BJT_PNP_symbol.svg.png)	|
| Electron Tube	| An earlier version of transistors, still used in audio engineering		|														|
| Relay		| The earliest version of transistors, still used in high voltage switches	|														|


### Diods and Transistors

<center><iframe width="560" height="315" src="https://www.youtube.com/embed/7ukDKVHnac4" frameborder="0" allowfullscreen></iframe></center>

### Basic gates

| Name (Circuit Algebra equivalent)	| Looks(old)												|  Looks(new)												|
|---------------------------------------|-------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------|
| NOT					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/NOT_ANSI.svg/150px-NOT_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/e/ef/NOT_IEC.svg/150px-NOT_IEC.svg.png)		|
| AND					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/AND_ANSI.svg/150px-AND_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/0/0f/AND_IEC.svg/150px-AND_IEC.svg.png)		|
| OR					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/b/b5/OR_ANSI.svg/150px-OR_ANSI.svg.png)		|![](https://upload.wikimedia.org/wikipedia/commons/thumb/4/42/OR_IEC.svg/150px-OR_IEC.svg.png)		|
| XOR					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/0/01/XOR_ANSI.svg/150px-XOR_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/4/4e/XOR_IEC.svg/150px-XOR_IEC.svg.png)		|
| NAND					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/f2/NAND_ANSI.svg/150px-NAND_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d8/NAND_IEC.svg/150px-NAND_IEC.svg.png)	|
| NOR					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6c/NOR_ANSI.svg/150px-NOR_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/6/6d/NOR_IEC.svg/150px-NOR_IEC.svg.png)		|
| XNOR					|![](https://upload.wikimedia.org/wikipedia/commons/thumb/d/d6/XNOR_ANSI.svg/150px-XNOR_ANSI.svg.png)	|![](https://upload.wikimedia.org/wikipedia/commons/thumb/5/56/XNOR_IEC.svg/150px-XNOR_IEC.svg.png)	|


### Basic circuits

####RS-Latch / JK flip-flop
[![](https://upload.wikimedia.org/wikipedia/commons/1/14/Transistor_Bistable_interactive_animated_EN.svg)](https://upload.wikimedia.org/wikipedia/commons/1/14/Transistor_Bistable_interactive_animated_EN.svg)
Click the picture for interactive animation.

####A 4-bit synchronous counter using JK flip-flops
![](https://upload.wikimedia.org/wikipedia/commons/thumb/f/fc/4-bit-jk-flip-flop_V1.1.svg/921px-4-bit-jk-flip-flop_V1.1.svg.png)

