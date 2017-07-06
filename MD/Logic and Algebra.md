Logic and Algebra
=================

> **Disclaimer**
> These are notes created for my personal use. They mostly cover the contents of the lectures. I take no responsibility for the correctness of anything stated in the contents, although I strive for making them as accurate as possible. If you find any factual or formal mistakes in these notes, please don't hesitate to contact me at [kiraly.bence.1025@gmail.com](mailto:kiraly.bence.1025@gmail.com).

## Table of Contents

[TOC]

## Literature
Script: Beedgen, R: Elemente der Informatik
Additional information: Any books with discrete mathematics

## Structure of Business IT
* Application methodology
	* Applications
* Big programming
	* Databases, Big data
* Small programming
	* Algorithms
* Theory
	* **Our lecture**
	* Theoretical foundation of Databases
	* Languages (SQL, ABAP)

## Set theory
### Definition
> A **set** is a *unordered* collection of *unique* real or abstract entities. The entities within the set are called *elements*. The set is then a separate entity from its elements.

Example
: $$S = \{a, b, c\} = \{c, b, a\}\\
nS = \{a, a, b, c\} \text{is not a set}
$$

### History

Developed in the 19th century by Georg Cantor

### Set Operations

If $x$ is one of the objects inside a set $A$, we call it an *element* of $A$. We denote $x \in A$.
If a set $\Phi$ or $\emptyset$ contains no elements, we call it an *empty set*. We denote $\Phi = \{\}$

Given two sets $A$ and $B$, we say:

$$
A \subseteq B \iff a \in A \Rightarrow a \in B\\
A = B \iff A \subseteq B \land B \subseteq A\\
A \subset B \iff A \subseteq B \land B \not = A\\
A \cup B = \{x: x \in A \lor x \in B\}\\
A \cap B = \{x: x \in A \land x \in B\}\\
A \backslash B = \{x: x \in A \land x \not \in B\}\text{ alternative notation: } A - B\\
\overline{A} = U\backslash A\\
A \Delta B = (A \backslash B) \cup (B \backslash A)
$$

$\subseteq$ read *is a subset of*
$\subset$ read *is exclusive subset of*
$\cup$ read *union*
$\cap$ read *intersection*
$\Delta$ read *symmetrical difference*

#### Illustration Using Venn-diagrams

![Venn-Diagrams](https://raw.githubusercontent.com/bKiraly/DHBW_WISCI16_Notes/master/IMG/Logic%20and%20Algebra/set-operations-illustrated-with-venn-diagrams.png)
Source: Wikimedia Foundation

#### Special Cases with the Empty Set

$$
\text{for } \Phi = \{\}\\
\Phi \subseteq \Phi \text{ is the only subset of } \Phi\\
\Phi \in A \forall A \\
\Phi \not \in \Phi
$$

#### Set Cardinality and Powersets

The number of elements in a set $A$ is the *cardinality* of the set. We denote $\|A\| = x$

The set of all subsets of set $A$ is called the *powerset* of $A$.  We denote $\mathcal{P}(A) = \{B \subseteq A\}$.

$\|\mathcal{P}(A)\| = 2^{\|A\|}$ because of the following

>let $A$ be an arbitrary finite set with $\|A\| = n (n \in \Bbb{N})$ with elements $\{a_1; a_2; a_3; ...; a_n\}$

>$$
A' = A \backslash \{a_n\}\\
B = \{\{a_n\}; \{a_1; a_n\}; \{a_2; a_n\}; ...; \{a_1; a_2; ... ; a_n\}\} = \{b \cup \{a_n\} \forall b \in \mathcal{P} (A')\}\\
\|B\| = \|\mathcal{P}(A')\|\\
\mathcal{P} (A) = \mathcal{P} (A') \cup B\\
\|\mathcal{P}(A)\| = 2*\|\mathcal{P}(A')\|\\
\mathcal{P}(\Phi) = \{\Phi\}\\
\|\mathcal{P}(\Phi)\| = 1\\
\Rightarrow \mathcal{P}(A) = 2^n\\
Q.E.D
$$

#### Laws of de Morgan

Given two sets $A$ and $B$

* $\overline{A \cup B} = \overline{A} \cap \overline{B}$
> 
$$
x \in \overline{A \cup B}\\\iff x \not \in (A \cup B)\\
\iff x \not \in A \land x \not \in B\\
\iff x \in \overline{A} \land x \in \overline{B}\\
\iff x \in \overline{A} \cap \overline{B}\\
\therefore \overline{A \cup B}  = \overline{A} \cap \overline{B}\\
Q.E.D.
$$

* $\overline{A \cap B} = \overline{A} \cup \overline{B}$
>
$$
x \in \overline{A \cap B}\\
\iff x \not \in A \lor x \not \in B\\
\iff x \in \overline{A} \lor x \in \overline{B}\\
\iff x \in \overline{A} \cup \overline{B}\\
\therefore \overline{A \cap B} = \overline{A} \cup \overline{B}\\
Q.E.D.
$$

### Proof of induction

Example:

Let's prove that $0 + 1 + 2 + 3 + \dots + n = {n(n+1) \over 2}$ or:

$$\sum_{1}^{n}(k) = {n(n+1) \over 2}$$

#### Step 1: Show the assumption holds for an example

Let $n$ be $0$.

Then

$$ 0 = {0(0+1) \over 2}$$

This is a true statement, therefore the assumption holds for $n = 0$

#### Step 2: Assume that the assumption is correct for any integer n

Let $n_1$ be arbitrary, and assume the statement holds, so:

$$\sum_{1}^{n_1}(k) = {n_1(n_1+1) \over 2}$$

#### Step 3: Show that the assumption therefore holds for another integer n+1

Now we have to prove, that form the previous assumption follows that it holds for $n_2 = n_1+1$:

$$
\sum_{1}^{n_1}(k) = {n_1(n_1+1) \over 2} \Rightarrow \sum_{1}^{n_2}(k) = {n_2(n_2+1) \over 2}\\
n_2 = n_1+1 \Rightarrow \sum_{1}^{n_2}(k) = \sum_{1}^{n_1}(k)+n_2\\
\Rightarrow \sum_{1}^{n_2}(k) = {n_1(n_1+1) \over 2}+n_1+1 = {n_1(n_1+1) + 2(n_1 + 1) \over 2}\\
= {(n_1 + 1)(n_1 + 2) \over 2} = {n_2(n_2+1) \over 2}\\
\Rightarrow \sum_{1}^{n_2}(k) = {n_2(n_2+1) \over 2}\\
Q.E.D
$$

The proposition is proven, because it holds for $0$ and any integer greater than that (as we can just repeatedly apply the previous formula to add one to the number and the proof would still hold). In general a proposition proven by induction holds for all integers that are greater than the element we have chosen in step 1.

*Fun times.*

### The Cartesian product

> The **Cartesian product** or *product set* of two sets $A$ and $B$ is a set of the form
> $$
\{(a, b): a \in A; b \in B\}
$$

### Russel's paradox

$$
\text{let } R = \{S: S \not \in S\} \text{be a set of all sets that do not contain themselves}\\
\text{Then } R \in R \iff R \not \in R
$$

This is a [logical paradox](https://en.wikipedia.org/wiki/Russell%27s_paradox).

A real-life interpretation of Russel's paradox is the [barbers paradox](https://en.wikipedia.org/wiki/Barber_paradox). The proposition is the following

> A barber who shaves everyone who does not shave themselves, shave himself?

### The Unit Circle

$$
A = B = \Bbb{R}\\
S \subseteq A \times B\\
S = \{(x,y): x^2+y^2 = 1: x \in \Bbb{R}; x \in \Bbb{R}\}
$$

### Generalization of the Cartesian Product in n-dimensions

Given sets $M_1; M_2; \dots ; M_n$
Cartesian Product of all is represented as $M_1 \times M_2 \times \dots \times M_n$

## Relations

> A binary **relation** is a subset of a product set. Alternatively:
$$
R \subseteq A \times B
$$

[Wiki link](https://en.wikipedia.org/wiki/Binary_relation#Relations_over_a_set)

Tables in relational databases are *sets*.

### Multiplying relations

Let $R_1 \subseteq M_1\times M_2$; $R_2 \subseteq M_2\times M_3$
Then $R_1 \circ R_2 = \{(x,y) | (x,z) \in R_1; (z,y) \in R_2\}$

### Using Matrices to represent Relations

> A **relation matrix** may be used for representing a relation between the two sets

## Special Relations

> A relation is **reflexive** if all members of its base set are related to themselves. Formally: $\forall x \in M: (x,x) \in R$

&nbsp;

> A relation is **symmetric** if the inverse of the relation is the equal to the relation itself. Formally: $\forall (x; y) \in R: (y;x) \in R$

&nbsp;

> A relation is **asymmetric** if $\forall (x;y) \in R: (y;x) \not \in R$

 &nbsp;

> A relation is **transitive** if one element being related to another, and that other element being related to a third, it means that the first element is also related to the third. Formally: $(x;y); (y;z) \in R \Rightarrow (x;z) \in R$

More information on special kinds of relations are found on the [binary relations Wikipedia page](https://en.wikipedia.org/wiki/Binary_relation#Relations_over_a_set).

## Basic Logic