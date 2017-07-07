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

-----

* Token
* Field
* Dice


## Basic concepts of Object-oriented Analysis

### Objects
> An **Object** is an entity of interest of a measurement.

Example
: 

* Person
* Abstract concept

> And **Object in Object-oriented programming** consist of a *state* and a pre-defined *behavior*. Every object has an *identity* (unique identifier), and can be *linked* to other objects.

&nbsp;

> The **state** of an object consists of the values of the attributes of the object. It can be changed through the *behavior* of the object.

#### UML notation of Objects

We call UML diagrams with objects **object diagrams**.

Just like classes, except we use
```
$objectName : $ClassName
```
For the name

![UML object diagram](https://www.tutorialspoint.com/uml/images/uml_object_diagram.jpg)

> The **object identity** uniquely identifies the object.

&nbsp;
> **Object equality** describes two objects, whose all attributes *except for the identities* are the same.

&nbsp;
> The **secrecy principle** describes the process of disallowing objects from accessing outside objects, as well as outside objects from directly accessing data in the object

&nbsp;
> **External objects** are objects, that have real-world equivalents. **Internal objects** are objects that are only used for OOA convenience.

### Classes

> A **class** is a definition for a set of objects, that has a *structure*, *behavior* and *relationships* (eg. inheritance). A class also has a way of creating new objects.

In UML classes have class names.

> **Abstract classes** are classes, that can not be used for object creation. These are useful for inheritance.

In UML abstract classnames are in *italics*.

### Attributes

In UML Attribute names are in lower case, the attribute name within a class has to be unique. To access use ClassName.attributeName

> 
> **Class attributes** are attributes that are the same for each object. In UML they are underlined.

### Operation

> **Operations** of an object are blocks of behavior, that can be executed independently. They have access to the objects state. The collection of all operations of an object is called the *behavior* of the object.

The object must exist to use an operation. The deletion of the object is also an operation.

> **Class operations** are operations, which can be run on the class instead of the object. This affects class attributes.

&nbsp;
> The **constructor operation** is an operation for creating objects. All non-abstract classes must have one.

Example
: 
Class diagram
![Class Diagram](https://raw.githubusercontent.com/bKiraly/DHBW_WISCI16_Notes/master/IMG/System%20Analysis%20and%20Design/UML_Classdiagram.PNG)
Object diagram
![Object diagram](https://raw.githubusercontent.com/bKiraly/DHBW_WISCI16_Notes/master/IMG/System%20Analysis%20and%20Design/UML_Objectdiagram.PNG)

## Static Concepts in OOD

### Association

> An **association** is a connection between two *objects*. If the two objects are of the same class, the association is called *reflexive*.

Associations are represented by a solid line between the two objects in an object diagram. In a class diagram the *cardinality* is usually also denoted, as well as the *name* of the association.

> **Cardinality** described the number of objects that can be associated with each other. It is denoted with * for anything, number for the number of objects, or x..y for a range.

### Roles

> **Roles** are associations that have special behavior with the object.

Reflexive roles are a behave according to the rules of reflexive associations.

### Associative Class

> **Associative Classes** are classes for the creation of objects that are assigned to an association.

### Aggregation and Composition

> An **aggregation** implies multiple parts of the same object. It is a close association.

An aggregation is represented by a white paralellogram.

> A **composition** is a special case of aggregations. The aggregate class is composed of the part-class. If the aggregate object is deleted, all its part-objects are also deleted.

A composition is represented by a black paralellogram.

### Inheritance

> **Inheritance** describes a relation between a more general class called the *superclass* and a more specialized class called a *subclass*. It is called an *is-a-relation*. Subclasses inherit every property of the superclass.

Single inheritance means a subclass may only inherit from a single superclass. This is usually used, as multiple inheritance is difficult to implement.

For more information see Java slides.

In UML inheritance is denoted with a white triangle pointing at the superclass on a line connecting the subclass to the superclass.

* Advantages
	* Reusability
	* Changeability
* Disadvantages
	* The *Secret principle* is lost
	* The ability to isolate classes is lost

An inherited operation can be redefined.

## Dynamic Concepts of OOD

### Use Case

* Identification of use-cases
	* In IT
		* Sequence of Transactions
		* Done by an actor
		* Transactions are closed, only after all steps are done
	* In a Company
		* A business process
		* Activities to satisfy customers
* Specification of use-cases
	* Separating functionality from User Interface (UI)
	* Types
		* Informal
		* Semi-formal
			* Definitions
			* Success conditions
			* Failure conditions
* Creation of a Sequence- and Communications diagram
	* Sequence diagram
		* Messages between the actor and the objects
		* Object lines vs time
		* Operations go between object lines
		* If a message reaches the object, the object will be activated
		* Small rectangle symbolizes the running time of the operation
		* Control is symbolized by an arrow
		* Messages on the sequence diagram need to be represented 1:1 on the class diagram
		* Sequence diagrams use *objects*

* Creation of State diagrams

### Message

> A **message** opens and runs an operation with the same name as the message

Lifetime of the object is denoted with

* {new} if the object is created during the  sequence
* {destroyed} if the object is destroyed during the sequence
* {transient} if the object is created and destroyed during the sequence

Permanent and temporary relations

* Permanent relations are associations between the classes
* Temporary relations only exist during the sequence

### Scenario

Not sure if we skipped this? It might have been a bad translation for use-cases.

### Sequence- and Communications Diagrams

> **Communications- and Sequence diagrams** describe what might be called during execution.

Difference between the two: Sequence diagram shows a specific timeline, the communications diagram is general

### State Automaton

> A **state automaton** consists of states and state changes. **States** is a time period, in which the object waits for an event.

The lifecycle of each element can be represented with a state automaton

* Entry
* Exit
* Do
* Include

### Activity Diagram

> An **activity diagram** is a special case of a state diagram used for actions.