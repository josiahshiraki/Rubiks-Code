# Rubiks-Code
# Purpose: Creates a Rubiks Cube Object and solves 
# Creation Date: November 18th, 2021

# Things I have learned during this project:
#   understand functions in a object class
#   understand how a to effectively call functions in both the object class and other subsections of the file (i.e Main Class)
#   understand how to use for and while loops effectively, How to prevent infinte loops when using a while loop by inserting a kill switch if statement
#   How to effectively use the console to debug code through inserting System print lines 
#   As you look through the code, you may notice that as I worked on this project I learned how to create more effective for loop statements. For example Instead of creating 6 different for loops to look through each face of the cube, I instead made a nested for loop and created a function in which the entire cube is rotated

# Improvements to make on the next version
#   Add more documentation to the important functions in order to more clearly understand my thought process
#   Find and create a more effective way to create the Put white on top of the cube (first function called in order to solve the cube) I was working on a second version of this to make it more efficient but I ran out of time
#   Recreate this project using a code language like Java script in order to make a physical model of the cube
#   Create a function that collects all moves in order to solve the cube, stores them in an array. With that, create another function that iterates through the array, this will delete and mutate unnecessary moves. for example, if in the array there are 3 left turns in succession, this function would delete all three and turn it into one right turn.
#   In insertEdges method, I think a lot of the code can be turned into outside private methods. Not only will this make the code easier to read, but also much easier to work with and debug
