# NonDigitMaxNum

This Python program determines the largest integer less than or equal to a given starting number that does not contain a specified digit.

## Description

The program includes the function `max_of_non_digit` which:
1. Takes two parameters:
   - `number`: The starting number from which to search.
   - `non_digit`: The digit that should not be present in the resulting number.
2. Iterates backwards from the given number to find the largest number that does not contain the `non_digit`.

If such a number is found, it is returned; otherwise, the function returns `0`.

Example Output

For number = 1000 and non_digit = 9, the output will be:

The maximum number is 998

Function Details
max_of_non_digit(number, non_digit)

Finds the maximum number less than or equal to number that does not contain the digit non_digit. The function:

Iterates from the provided number downwards.
Checks if the digit non_digit is not in the string representation of the current number.
Returns the first number that does not contain the digit.