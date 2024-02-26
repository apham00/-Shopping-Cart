Rules:
You may not use ChatGPT (or any other AI system) for this assignment
You may not post the instructions to this assignment to any website
You may look for information online for how to accomplish individual aspects of this assignment, but if you do so you need to cite your source as a comment in your code at the location where the found code was used.


Create a shopping cart application with the following properties:

The store sells the following products with the given tags:
Bread - Food
Ice Cream - Food, Desert, Milk
Lettuce - Food
Cupcake - Food, Desert
Cake - Food, Desert
Phone - Electronics
Watch - Electronics


Your shopping cart should use an ArrayList to store classes that implement a "Product" interface.

Your menu created/displayed in your main method, however, your main method should not use any print/println/printf calls.
Instead using the singleton pattern create a class that will handle all output.  You can have the singleton class take a fully formed string that it will then print or you can create methods that will emulate print/println/printf

Products have a getSalePrice method
All products have a base price of $5.00

The tags have the following meaning:
Food sets price * 0.75
Desert sets price * 1.25
Milk sets price * 1.15
Electronics sets price * 2.25

Your program should provide the following menu options:
        1) Author info
        2) Add Bread
        3) Add Ice Cream
        4) Add Lettuce
        5) Cupcake
        6) Cake
        7) Add Phone
        8) Add Watch
        9) Print prices
        0) Exit

        When a menu option from 2 through 8 is selected add a product (combination of decorators) to the products array list

        When option 1 is selected print your name and id to the screen

        When option 9 is selected print the name and sale price of all products that have been added.

Grading:
3 a serious attempt was made to complete the assignment
2 assignment uses the singleton pattern for printing
4 decorator pattern used to calculate prices
1 program compiles
-5 author info not printed correctly
