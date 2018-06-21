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
