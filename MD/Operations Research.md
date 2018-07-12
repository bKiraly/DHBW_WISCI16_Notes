Operations Research
================
## Definition
> **Operations research** is a discipline that deals with the application of analytical mathematics for decision making.

## Steps
* Define the problem
* **Create mathematical model that fits the problem**
	* Real-world is too complex
	* Simplifies real-world concepts
* **Derive solutions**
	* Approach depends on the model
		* Linear programming
			* Functions of form $Z(x_1,x_2,x_3, \dots, x_n) = c_1*x_1 + c_2*x_2 + \dots + c_n*x_n$
			* Try to find the best set of $x_1, \dots, x_n$ so that the value of $Z$ is maximized or minimized
			* Goal: minimize/maximize $Z$
			* $Z$ is the *objective function*
			* $Z$ often has *constraints* which limit the values the variables can take
			* Standard form:
$$
\begin{aligned}
&\text{Select } x_1, x_2, \dots, x_n \text{ so that} \\
&Z = c_1*x_1 + c_2*x_2 + \dots + c_n*x_n \text{is maximal} \\
&\text{One or more constraints of form } \\
&a_1*x_1 + a_2*x_2 + \dots +a_n*x_n \leq b_1 \\
&\text{May be applied}
\end{aligned}
$$
			> **Feasible solutions** are solutions that do not violate any of the constraints. **Infeasible** solutions are those where one or more constraints are violated.
 
			 * &nbsp;
 
			> **Optimal solutions** are solutions where that are *feasible* and have the highest possible value for the objective function $Z$
			
			* Possibilities for optimal solutions
				* No feasible solutions (contradicting constraints)
				* No optimal solution (unbounded along at least one axis)
				* One optimal solution (one of the Corner-Point Feasible solutions)
				* Infinitely many optimal solutions (includes at least two CPF solutions)
		* Integer programming
		* Graph theory
		* Dynamic programming
		* Game theory
		* Queue theory
		* Simulation theory
* Test model
* Apply model
* Implementation

## The Simplex method

* Algebraic procedure based on geometry
* Geometry
	* Find CPF solutions
	* Optimality test: if no adjacent solutions are better ($Z'$ negative in both cases), then it must be an optimal solution
	* If not, then move to the best one ($Z'$ highest)
	* Repeat
* Iterative algorithm
* Algebraic solution
	* Create slack variables to normalize equations
	* Nonnegativity constraints are left alone
	* e.g. $x_1 \leq 4 \Rightarrow x_1+x_3 = 4 \land x_3 \geq 0$
	* In the end all equations are of form $$ \begin{aligned}
& \sum_1^n(a_k*x_k) = b_k \\
\text{and } & x_j \geq 0, 1\leq j\leq n
\end{aligned}$$
	* **Augmented solution** -- solution for the original variables with corresponding slack variables
	* **Basic solution** is an augmented CP solution
	* **Basic Feasible** (BF) solutions is an augmented CPF
	* Properties of basic solutions
		* The number of basic variables is equal to the number of functional constraints
		* Number of nonbasic variables is equal to the number of variables minus the number of constraints

```mermaid
graph TB
A[Initialize] --> B{Solution optimal?}
B -- yes --> C(Stop)
B -- no --> D(Find better adjacent solution)
D --> B
```

### Tabular method

1. Change the equations to the augmented form as before
2. Create table with the coefficients á la Gaussian method of elimination
3. Check if the coefficients for $(0)$ are non-negative
4. If no
	4.1. Find the column of the lowest coefficient, call it the **Pivot column**, and the variable corresponding to the coefficient the **Entering basic variable**
	4.2. Find the positive coefficients in the pivot column
	4.3. Divide the right-hand side by the pivot column for both, find the lowest result
	4.4. The row with the lowest result is your **Pivot row** and the variable corresponding to it the **Leaving basic variable**
	4.5. The intersection of the two is the **Pivot number**
	4.6. Divide the equation so that the pivot number is one
	4.7. In all equations change the coefficient of the *leaving basic variable*, so that the coefficient of the *entering basic variable* is zero
	4.8. The entering basic variable is now the basic variable is now the basic variable of the equation in the pivot row
	4.9. Goto 3
5. If yes then the solution is optimal, calculate Z from the coefficients of equation $(0)$

### Equality constraints

* If we have an equality constraint (constraint of form $\sum_{1}^n(ai*xi) = b$) we use the *Big $M$ method*
	* Introduce artificial variable $\bar{x_4}$
	* Create penalty $M$, which is a very large number

### Dealing with negative numbers

* Use the same as before, but replace the free variable with two other variables, each of which is non-negative
* For example $x_1$ is replaced with $x_1 = x_1^+ -x_1^- x_1^+,x_1^- > 0$

## Post-Optimality analysis

* Re-Optimization
	* For a very large problem small changes can benefit from previous solutions
* Shadow price
	* Shows the behavior of the price assuming small changes in inputs
* Sensitivity analysis
	* Sensitivity analysis shows the robustness of the model to changes to the assumptions
	* Allows acceptable ranges around coefficients

## Duality

* Every linear programming model has a corresponding problem called a *dual*
* Used in sensitivity analysis
* Original problem is then called the *primal* problem
* Constructed by using using the formula in the slides
* If the primal has no solution, then the dual also has no solutions

## Integer programming

> **Integer programming** is a type of problems, where all the decision variables are *integers*

### Binary Integer programming

> **Binary integer programming** is a type of problems, where all the decision variables are *boolean values*

## Branch and Bound Algorithm
### Initialization
Set $Z^* = -\infty$ and apply step 2 and 3 from below to the original problem. 
### Iteration
1. Branching - Among the remaining subproblems, select one created *most recently*. Branch from this node by fixing the next variable to 0 or 1 (two separate branches)
2. Bounding - For each new subproblem, obtain its bound by applying LP relaxation. Round down Z for the resulting solution
3. Fathoming - For each new subproblem, apply the three fathoming tests and discard subproblems that are fathomed by the tests. If all subproblems are fathomed this way, the solution is optimal
	1. Is the bound $\leq Z^*$
	2. Its LP relaxation has no feasible solution
	3. Optimal solutions for LP relaxation is integer

## Game Theory

> **Game theory** is the formal mathematical description of competitive scenarios

We will focus on two player zero sum game (sum of all winnings equals zero)

> **Strategy** is a predetermined rule that specifies all responses for each state of the game

The goal of game theory is to develop a rational criteria to develop a strategy

**Assumptions**

* Both players are rational
* Both players choose strategies that promote their own welfare

> **Vale of the game** refers to the payout to player one if both players play optimally. If it is zero, the game is said to be *fair*.
