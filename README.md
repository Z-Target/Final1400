# Final1400
I need a ton of help with a final exam in CSIS 1400. Please help me out.

Create a new Java project called Final1400
Create a package called final1400;
the package should include 2 classes:FinalExam and FinalExamApp which include a main method.


FinalExam
- rows: int
- columns: int
---------------------------------------------
<constructor> FinalExam(row:int, column: int)
+ CreateArray(): int[][]
+ CalculateArray(sumArray: int[][]): int


Class FinalExam:
Create class FinalExam according to the UML diagram.
In the method createArray() use the two fields to createa multi-dimensional array, use Random from java util to assign random numbers between (2 -10) to populate the array - Hint use nested for loop. Notice this method returns a multi-dimensional array.
In the method calculateArray(int sumArray[][]), Calculate the sumof all the array indexes and assign it to a variable called totalHint use nested loop; and return the total as int.

Class FinalExamApp:
This class has main method, in main ask user to enter 2 numbersCreate an instance of FinalExam and name it “myFinal”, pass the twonumbers as argument.
Call method createArray() on myFinal and save the returned array as myArray.
Print the elements in myArray.
Call calculateArray() and pass it myArray. Save the returned int value as “total”.
Print the returned "total"
