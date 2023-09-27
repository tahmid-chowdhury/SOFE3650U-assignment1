# SOFE 3650U Assignment 1: Design Patterns
Group Members:
- [Armaghan Nasir](https://github.com/Armaghan180) - 100820948
- [Rushirajsinh Rathod](https://github.com/rushirajrathod) - 100826456
- [Tahmid Chowdhury](https://github.com/tahmid-chowdhury) - 100822671

Date: September 27, 2023

## UML Diagram
![A UML diagram of our design](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/UML.png)

## Structure of Repository
> A brief description of the structure of our repository (i.e. what the folders contain)
- The **['root'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main)** folder contains the **['source'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/source)** and **['test'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/test)** folders, as well as the **['README.md'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/README.md)** and **['UML.png'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/UML.png)** files
- The **['source'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/source)** folder contains the source files, **['GroceryProduct.java'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/source/GroceryProduct.java)** and **['GroceryProductFactory.java'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/source/GroceryProductFactory.java)** (as well as the individual product classes), to be used by **['TestDriver.java'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/test/TestDriver.java)** in the **['test'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/test)** folder
- The **['test'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/test)** folder contains the **['TestDriver.java'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/test/TestDriver.java)** file, which demonstrates that the source code stored in the **['source'](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/tree/main/source)** folder works

## Test Methods
> A description of the test method that we developed and the execution of it

Our test method, 'TestDriver.java' is a simple demonstration of the Factory Method pattern. It's contents are as shown below.
![The test method that we developed](https://github.com/tahmid-chowdhury/SOFE3650U-assignment1/blob/main/TestMethod.png)
1. First, two concrete factory objects, "appleFactory" and "bananaFactory", are created, which implement the "GroceryProductFactory" interface.
2. Using these factories, an "Apple" and "Banana", extensions of the abstract class "GroceryProduct" are created.
3. The "initializePriceFromDatabase" method is called on both objects, which gets and sets their prices from 'database.txt'.
4. Finally, the prices of an apple and banana are printed.
