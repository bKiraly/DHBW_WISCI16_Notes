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
If a set $\Phi$ contains no elements, we call it an *empty set*. We denote $\Phi = \{\}$

Given two sets $A$ and $B$, we say:

$$
A \subseteq B \iff a \in A \Rightarrow a \in B\\
A = B \iff A \subseteq B \land B \subseteq A\\
A \subset B \iff A \subseteq B \land B \not = A\\
A \cup B = \{x: x \in A \lor x \in B\}\\
A \cap B = \{x: x \in A \land x \in B\}\\
A \backslash B = \{x: x \in A \land x \not \in B\}\\
\overline{A} = U\backslash A
$$

$\subseteq$ read *is a subset of*
$\subset$ read *is exclusive subset of*
$\cup$ read *union*

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

## Relations
## Special Relations
## Basic Logic