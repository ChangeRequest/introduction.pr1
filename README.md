Practice task 1 
===============
1\. Compute Hamming Distance
---------------
The Hamming distance between two strings of equal length is the number of positions at 
which the corresponding symbols are different.

For example:
```
                        karolin         1011101         2173896
                        kathrin         1001001         2233796
                          ^^^             ^ ^            ^^ ^
Hamming Distance:          3               2               3
```

##### Implementation notes

If strings length is not equal - return `-1`.

2\. Answer Bob
----------------
Bob is quite strange teenager and his responses are very (very!) limited:
* Bob answers 'Yeap.' if you ask him a question.
* He answers 'Chill out!' if you yell at him.
* He says 'Fine.' if you address him without actually saying anything.
* He answers 'Whatever.' to anything else.

3\. Console calculator
----------------
Create console calculator, that implements following operations:

* addition
* subtraction
* multiplication
* division
* exit
* help

##### Addition

Should be called with `add` keyword. 
After command is entered 2 numbers should be entered by user, separated with newline symbol(`\n`).
After command execution result of command execution should be printed to 
`System.out` and should contain both operands, operation and execution result: `1+2 3`

##### Subtraction

Should be called with `sub` keyword. 
After command is entered 2 numbers should be entered by user, separated with newline symbol(`\n`).
After command execution result of command execution should be printed to 
`System.out` and should contain both operands, operation and execution result: `1-2 -1`

##### Multiplication 

Should be called with `mul` keyword. 
After command is entered 2 numbers should be entered by user, separated with newline symbol(`\n`).
After command execution result of command execution should be printed to 
`System.out` and should contain both operands, operation and execution result: `2*2 4`

##### Division

Should be called with `div` keyword. 
After command is entered 2 numbers should be entered by user, separated with newline symbol(`\n`).
After command execution result of command execution should be printed to 
`System.out` and should contain both operands, operation and execution result: `2/2 1`

##### Exit

should be called with `exit` keyword. Should print `Bye-bye` before exiting the program.

##### Help 

Help message should be printed to `System.out` and user should be requested to make new choice.

#### Possible inputs and outputs of program.
```
>> Console calculator:
>> Enter 'add' to perform addition.
>> Enter 'sub' to perform subtraction.
>> Enter 'mul' to perform multiplication.
>> Enter 'div' to perform division.
>> Enter 'exit' to exit.
>> Enter 'help' to see help message.
>> Make your choice.
<< add
>> Enter first number:
<< 1
>> Enter second number:
<< 2
>> Result of 1+2 is 3
>> Make your choice.
<< exit
>> Bye-bye.
```
