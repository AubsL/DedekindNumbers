# DedekindNumbers
Here is where I will post code relating to calculating Dedekind numbers

How to run:

recursiveBUU.java will calculate for 6 variables. If you want to run for a different number, then go into the code and change the value for "numVar" to a number between 0 and 6 (there isn't an array big enough to run 7 variables). This algorithm is the one most easily generalized.

BUU.java calculates 6 variables and gives the total runtime in milliseconds, averaged among 10 runs.

propTestPrototype.java will run and provide a probabilistic guess for the Dedekind number of 5 variables. I can add the generalization, but it's simple to remove the number of for loops and calculate for less than 5 variables.

All code will run on the command line in Java, save for main.c because that program is inefficient and slow, I just wanted a C demonstration.
