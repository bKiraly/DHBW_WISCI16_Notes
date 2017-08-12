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

$O(n)$ Describes the *upper bound* of the runtime of the algorithm
$\Omega(n)$ describes the *lower bound* of the runtime of the algorithm
$\Theta(n)$ describes an upper *and* a lower limit of the runtime

For more information on the $\Theta$ notation is found on [this Wikipedia page](https://en.wikipedia.org/wiki/Big_O_notation).

### Explanations of Symbols of Mathematical definitions

$\Omega \dots$ Omega (Capital Greek letter)
$f(x) \dots$ f of x (The function f with the value x)
$| \dots$ Is in the set if the following is true
$\exists \dots$ There exists
$\forall \dots$ For all
$: \dots$ The following applies
$\land \dots$ And
$\lor \dots$ Or
$\iff \dots$ Is equivalent with

### Relations 

See the [Logic and Algebra](Logic%20and%20Algebra.html)

### Trees and Graphs

> A **directed graph** is a pair of (V,E), where
>
> * V (Vertices) is an endless set
> * E (Edges) is a binary relation (u,v) to V with $E \subseteq V \times V$
> * Edges define connections between vertices in *specific directions*

&nbsp;

> An **undirected graph** similar to a directed graph, except the connections have *no directions*

Nomenclature

* Head: The first element of the edge
* Tail: The second element of the edge
* Sling: An edge points from one vertex to the same vertex
* Neighboring vertices are vertices that are connected by an edge
* in-degree of an edge is the in-turning vertices
* out-degree of an edge is the out-turning vertices of an edge
* degree of an edge is the sum of in-degree and out-degree of an edge

> A **path** with length k from an vertex $u$ to a vertex $u'$ in a graph G is a *sequence of vertices* with the following characteristics:
> 
> * $v_0 = u$: start vertex
> * $v_k = u'$: end vertex
> * $v_i$ is element in the set E for 0 < i < k

Path length is the number of intermediate vertex $v_i$

$u$ has to be reachable from $u'$. The path is *simple* if it contains no vertex more than once.

> A **cycle** is a path with $u =u'$. A graph with a cycle is called a *cyclic graph*; one without is called an *acyclic graph*

A simple cycle only contains equal vertices $u$ and $u'$.

If all edges are reachable in a graph the graph is called *connected.*

### Forests and trees

> A **forest** is an acyclic undirected graph.

&nbsp;

> A **tree** is a connected acyclic undirected graph. A special case is a *rooted tree*. One special vertex is denoted as a root R. The depth of x is is the shortest distance between x and the root node. The maximum depth of the tree is the *height* of the tree.

The ancestor of node x in a tree is a node along the shortest path from x to r. Descendants of x are all nodes whose ancestor is x. x is its own ancestor and descendant. A *real* ancestor/descendant is one which is not equal to x.

A *child* of a node is a direct descendant of the node, and the original node is its parent. A node with no children is called a leaf. A node that is not a leaf is an inner node.

An *ordered tree* is a rooted tree with ordered child nodes.

A *binary tree* is an ordered rooted tree with each node having 0 to 2 children. The node has a left and right child. In a *complete binary tree* every inner node has 2 child nodes.

### Presentations

### Datastructures

#### Fields

* Arrays
* Advantages
	* Direct random access
	* Sequential reads
* Disadvantages
	* Static size
	* Element ordering is expensive

#### Lists

* Linked lists
* Attributes
	* Head/Tail (first/last element)
	* Follower/predecessor (next/prev)
	* Key (key(x))
* Operations
	* search
	* insert
	* delete
* Advantages
	* Dynamic
	* Elements can be added/removed as desired
	* Changing order of elements is easier
* Disadvantages
	* Search

#### Stacks and Queues

* Queues $\rightarrow$ FIFO
	* Head/Tail
	* Enqueue
	* Dequeue
* Stacks $\rightarrow$ LIFO
	* Top
	* stack-empty
	* push
	* pop

### Search Trees and Hash Tables Presentations

#### Search Trees

* Binary search trees
* Balanced search trees
* Red-Black trees

#### Hash Tables

Mapping a unique key to a specific value

* Direct Addressing
* Indirect Addressing
* Open Addressing