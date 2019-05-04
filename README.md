# Command Pattern

In this exercise, we want to implement a simple pocket calculator based on the Command pattern.
The simple pocket calculator can execute the basic compute operations 'add', 'substract', 'multiply', and 'divide'. 

@startuml
top to bottom direction
skinparam linetype polyline
skinparam linetype ortho

class Invoker{
+ <color:testsColor(testMethods[Invoker])>setCommand (receiver: Calculator, left:int, right: int, op: String)</color>
- <color:testsColor(testMethods[Invoker])>commandPicker(receiver: Calculator, left:int, op: String, right: int): Command</color>
}
interface Command{
+ <color:testsColor(testMethods[Command])>execute()</color>
}
class Client{
+ {static} main (args: String[])
}
class AddCommand{
+<color:testsColor(testMethods[AddCommand])>AddCommand(calc: Calculator, left:int , right: int)</color>
+<color:testsColor(testMethods[AddCommand])>execute()</color>
}
class SubCommand{
+<color:testsColor(testMethods[SubCommand])>SubCommand(calc: Calculator, left:int , right: int)</color>
+<color:testsColor(testMethods[SubCommand])>execute()</color>
}
class MultCommand{
+<color:testsColor(testMethods[MultCommand])>MultCommand(calc: Calculator, left:int , right: int)</color>
+<color:testsColor(testMethods[MultCommand])>execute()</color>
}
class DivCommand{
+<color:testsColor(testMethods[DivCommand])>DivCommand(calc: Calculator, left:int , right: int)</color>
+<color:testsColor(testMethods[DivCommand])>execute()</color>
}
class Calculator{
+ <color:testsColor(testMethods[Calculator])>add(left: int, right: int)</color>
+ <color:testsColor(testMethods[Calculator])>sub(left: int, right: int)</color>
+ <color:testsColor(testMethods[Calculator])>mult(left: int, right: int)</color>
+ <color:testsColor(testMethods[Calculator])>div(left: int, right: int)</color>
}

Invoker --> Command: -cmd
AddCommand .up.|> Command
SubCommand .up.|> Command
MultCommand .up.|> Command
DivCommand .up.|> Command
AddCommand --> Calculator :-calculator
SubCommand --> Calculator :-calculator
MultCommand --> Calculator :-calculator
DivCommand --> Calculator :-calculator
Client --> Calculator
Client .down.> AddCommand
Client .down.> SubCommand
Client .down.> MultCommand
Client .down.> DivCommand
@enduml 
 

**You have the following tasks:**

1. ✅[Implement a command interface ](testClass[Command])

2. ✅[Implement the add command](testClass[AddCommand])

3. ✅[Implement the substract command](testClass[SubCommand])

4. ✅[Implement the multiply command](testClass[MultCommand])

5. ✅[Implement the divide command](testClass[DivCommand]) and make sure that division by zero is not possible.

6. ✅[Complete the Invoker](testMethods[Invoker],testAttributes[Invoker]) and make sure that the correct
compute operations are picked by the method `commandPicker`. Please note: the parameter sequence in the methods `commandPicker` and `setCommand` are different. 

7. ✅[Complete the Calculator](testMethods[Calculator],testAttributes[Calculator]). The Calculator is the 
 Receiver. 
 
8. Check that your calculator is doing the computations correctly (testCalc1,testCalc2,testCalc3,testCalc4). Please print the computation result as a String using `System.out.println()`.
  
