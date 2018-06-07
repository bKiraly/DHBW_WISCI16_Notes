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

