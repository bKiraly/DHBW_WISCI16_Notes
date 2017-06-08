System Analysis and Design
=========================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## General Info
System Analysis and Design are the first two phases of software development.

## Phases of Software Life Cycle
* Concept
* Development
	* Program release to the customer
* Usage
	* Defect report
	* Feature request
* Support
	* Upgrades and Updates

Length of the software LC

* Usage
* Usability
* From a few weeks to multiple years
* The maintenance is not done by the original developers

### Development Phase
* Precise definition
* Clear structuring of the program
* Complete documentation

#### Software development models
* Waterfall model (Basic + Royce)
	* Basic
		* Only move forward to the next phase
		* Never move back
	* Royce
		* Moving back to the *directly preceding* node is possible
	* Requirements need to be clearly defined in the beginning
	* Unsuitable for large projects due to changing requirements
* Iterative model
	* Iterates between different phases
	* Can go forwards and back between phases
	* Can handle small changes to the requirements
* Prototyping (What is a prototype? Varieties of prototypes)
	* Creating a basic working model of the project to establish ideas
	* Types of prototypes
		* Horizontal prototype
			* Covers a broad range of functionality
			* Does not go into detail about the implementation
		* Vertical prototype
			* Detailed testing of a single functionality
* Evolution model
* V model
* Agile methods
	* Extreme programming (XP)
	* SCRUM
* Design thinking

Testing

* Aim / Goal of testing
* Definition of testing
* Structure of a test-case
* Manual / Automatic tests - Difference, Pros, Cons
* Test techniques: Black box / White box
* Test varieties
	* Performance
	* Desktop
	* Regression
	* Positive/negative


-----
#### Software testing

Definition
: 
> **Software testing** is a process of executing a program or application with the intent of finding the unintended features.

It can also be stated as the process of validating and verifying that a software:

* Meets the business and technical requirements that guided it’s design and development
* Works as expected
* Can be implemented with the same characteristic. 

Test properties
* Continuously performed
* Planed (conditions, type,...)
* Types: Static/Dynamic 

Structure of a test case

* Inputs
* Execution parameters
* Expected outputs

Manual test

* The tester plays the role of the end user themselves
* \+ Low cost
* \+ Versatile
* \- Can be run less often
* \- Limitations on simulated scenarios
* \- Takes time

Automatic tests

* An automatic tool tests the program whenever a change is made
* \+ Can test often
* \+ Provides results immediately
* \+ Can simulate any scenario (large-scale load test, race conditions)
* \- Development of automated tests costs money and time
* \- Changes to the program require the test suit to be readjusted
* \- Might not check scenarios a human tester would


-------

## Object-Oriented Method

> A **method** is a series of steps to reach a desired output. In CS it is usually used for a collection of concepts, representations and processes that reach a certain goal.

Concepts of Object Oriented Development

* Found in all phases of development
* They were designed for object oriented programming languages
* Programming languages that implement only a subset of object-oriented principles are called **object-based programming languages**

Steps of the Object Oriented process

* Modelling of a specification
	* Implementation is ignored
	* Object-oriented analysis is used to represent the specification
	* Semantic data modelling should be used for this
		* Static concepts
			* Associations
			* Packages
		* Dynamic concepts
			* State machines
			* Requirements

Notation

* Graphics
* Texts
* UML

Methodical development

* Application of rules that fit the situation
* No given sequence
* Use previous solutions
* Recognizing patterns

Development method of (Balter 1999)

* Establishing goals
	* Division of Analysis and Design
	* Establish an interface between the two
* Person groups in the project
	* Specialists
		* Are aware of the business problem
		* Provided by the customer
		* Knows what the solution should achieve
	* OOA Experts
		* Know the process of OO development
		* Support the specialists to use the right methods
	* Software developers
		* Involved in the design phase
		* They will develop the software
	* Software specialists
		* Code the project
		* Help design complex systems
* Properties of this method
	* Object-Oriented
	* Use UML
	* Using design patterns
	* OO analysis
	* 3 tier architecture
	* Communication between UI and back-end
	* Relational or OO databases
	* Using Java or C++
	* QA

### Object Oriented Analysis

Goals of the System Analysis

* Find the problem that needs to be fixed
* Creation of a conceptual model
	* Consistency
	* Completeness
	* Clarity
	* Feasibility

This phase *deliberately ignores* all implementation aspects

The requirements are

* unclear
* use-cases
* contradictory
* different levels of abstraction

Properties of the OO analysis approach

* Use objects
* Abstraction of the real world through objects

#### Results of the analysis

* Specification
	* This is the basis for the contract
	* Modelling of the project
		* Object Oriented concepts
		* Static model
			* Class system
			* Associations
			* Inheritance
			* Packaging
			* Data
		* Dynamic model
			* Workflows
			* Business processes
			* State automata

Prototypes

* UI prototype
* Horizontal prototype

#### People in the OOA Team

* System analyst
* Specialist
* Future users

### Object Oriented Design

* Technical environment and implementation details are taken into account
* Standardization

#### 3 tier architecture

* Front-end
	* User Interface
* Middleware
	* Program
* Back-end
	* Data

Products of the OOD

* OOD model
* Describes how the code will function in the future
* Interaction of different elements

Parts of the OOD model

* Static model
	* 3 tier model
	* Divided into parts (packages)
	* Dynamic model
* Dynamic model
	* Describes the structure of the program

## Analysis process

### Customer requirements
####Structure of customer requirements

* Setting goals
	* Must-criteria
		* Requirements. These have to be delivered
	* Optional criteria
		* Things that you should aim to deliver, but can be cut if necessary
	* Things that are excluded
* Usage
	* Usage area
		* Where will the system be used?
	* Target group
		* Who will use the program
	* Details of usage
		* Time constraints, etc.
* Environment
	* Software
	* Hardware
	* Orgware
* Functionality
	* Precise description
	* Typical workflows
* Data
	* What kind of data is stored, how much and how long
* Delivery
	* What exactly should be delivered
* UI
	* What should the UI look like
* QA
	* What is used for QA
* Additions

### Methodical structure

* To an extend rules should be followed
* Creativity is also required

Types of people

* Anarchists
	* Does not follow rules
* Behaviorists
	* Clear roles
	* Clear responsibilities
* Storyboarder
	* Deals with business processes
* Information modeler
	* Deals with data
* Architects
	* Frameworks and Patterns

### Definition of the Analysis Process

> An **analysis process** is the process to create an OO analysis.

Properties of a good model

* Understandable
* Simple
* Accurate
* Requires a lot of effort
* Specialists are needed to design it
* It should not be too flexible
* Each addition needs to justify the complexity it adds

### Balanced Macroprocess

* Identification of business processes
* Creation of classes for business processes
* Build static models
* Build dynamic models
* Parallel development of the two

Normally static models are used first, then the dynamic models

Integrating QA

#### Analysis in General

* Realizing business processes
* Building packages

#### Steps of developing a static model

1. Identify classes
	* Abstract objects
	* Class diagram
	* Description of class
2. Identify associations
	* Connections in Class Diagram
3. Identify attributes
	* See what is an attribute, and what is a class
4. Define inheritance
	* Classes might inherit from each other
5. Specialize associations
	* Work out the exact correlations
6. Specify attributes

#### Steps of developing a dynamic model

1. Create scenarios
	* Sequence diagram
	* Communication diagram
2. Create state automata
	* State diagram
3. Describe operations
	* Activity diagram

#### Alternative Macroprocesses

* Scenario based macroprocess
	* Based on Business process
* Data based macroprocess
	* Based on Data

### Common mistakes in the analysis process

#### 100% syndrome

* Stuff doesn't need to be perfect right away
* Further iteration could correct that

#### Premature optimization

* "Premature optimization is the root of all evil."
* Too heavy QA too early

#### Bureaucratic following of a method

* Following the method too closely
* Use creativity

#### Mixing the phases

* Clean separation of Design- and Analysis phases

* Token
* Field
* Dice