# Hedgehog Problem

A simple Java application used to calculate maximum number of apples a hedgehog can achieve when navigating through the
squares of a 2D matrix.

# Overview

Starting from top left square of the garden (0,0) and finishing at the bottom right square of garden (m-1, n-1).

The hedgehog can only move right one square or down one square.

# Input/Output

The top two numbers of the Input.txt will be M and N which dictate the size of the garden by how many rows and columns
there are.

The next lines are the number of apples in each square of the garden.

This will then produce the result in Output.txt for the maximum possible number of apples the hedgehog can get once it
moves from the top left square to the bottom right square whilst following the rules of only being able to move right or
down.

```
Input.txt:
3 3
1 2 3
1 2 3
1 2 3


Output.txt:
12
```

# Running

Update [HedgehogProblemOutput](src/main/java/HedgehogProblemOutput.java) class with desired garden matrix size and
number of apples in each square.

Run application from [Main](src/main/java/Main.java) class.

