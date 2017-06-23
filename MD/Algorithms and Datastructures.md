Algorithms and Data-structures
==========================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## Course Administration

* Lecturer: Claudia Kausch
* Company: MID

Introduction to Quantities

## Introduction

### Case Study: Google

Within one second Google can find a million results from billions of pages.

### Algorithm

> An **algorithm** is a defined set of actions for solving a problem.

In general algorithms include:

* Input data (parameter)
* Output data (result)
* Working steps and intermediate results

### Pseudocode

1. // codes a comment
2. := assignment
3. [i] field of an array
4. Data-structures have properties (attributes). These can be called by functions

### Analyzing algorithms

A good algorithm is:

* fast (low number of steps)
* Random access machine
* Not hardware-specific

#### Random access machine

* Executes each instruction in order
* Each execution costs $c_i$
* The process of evaluating run-time complexity
	* Examining the structure of the algorithm
	* Making some simplifying assumptions

#### Problems of analyzing algorithms

* The number of elements depends on the series itself
* With the same number of elements the same algorithm needs a different number of steps (eg. a sorted list gets sorted quickly)

#### Assumptions

##### Best-case
Describes the algorithms behavior under optimal conditions

##### Worst-case
Describes the algorithms behavior under the worst conditions

##### Average case
Describes the average runtime for any input. It is difficult.

Example
: Insertion sort:
Best-case: linear relationship
Worst-case: n-square relationship
Average case: n-square relationship

#### $\Theta$ notation

* We ignore constants
* Due to the point that $n^2$ grows faster than $n$, we ignore all linear constants
* We are then left with the fastest-growing characteristic of the running time of the algorithm
* We denote: $\Theta$ (Big-O notation)
* The faster the most significant function grows, the higher the runtime of the algorithm for large $n$

Example
: Insertion sort has an average complexity of $\Theta(n^2)$
In contrast Bogosort has an average complexity of $\Theta(n!)$
$n!$ grows faster than $n^2$, therefore Insertion sort is faster than Bogosort for large lists

#### Analyzing Algorithms Based on Design Methodology or Paradigm

There are a few structured algorithms and paradigms
One common paradigm is **divide and conquer**:

* Divide up the problem into subproblems
* "Conquer" said subproblems
* Combine the subporblems

Example
: Mergesort
Mergesort divides the list into two sub-list
Then it calls itself on the sub-lists to sort it, until the sub-list has size one
Then it combines the two sorted lists into a sorted list and returns that
Assumptions: $n = k^2$
Thus, the number of recursions is $\log_2(n)$
Thus the whole algorithm has a time complexity of $\Theta(n*\log(n))$