# NonDigitMaxNum

The `NonDigitMaxNum` Java program determines the largest integer less than or equal to a given starting number that does not contain a specified digit. 

## Description

The program includes the `maxOfnonDigit` method which performs the following:
1. Takes two parameters:
   - `number`: The starting number from which to search.
   - `nonDigit`: The digit that should not be present in the resulting number.
2. Iterates backwards from the given number to find the largest number that does not contain the `nonDigit`. 

If such a number is found, it is returned; otherwise, the method returns `0`.

Example Output

For number = 1000 and nonDigit = 9, the output will be:

Method Details

maxOfnonDigit(int number, int nonDigit)

Finds the maximum number less than or equal to number that does not contain the digit nonDigit. The method:

Iterates from the provided number downwards.
Converts the current number to a string and checks if it contains the specified digit.
Returns the first number that does not contain the digit.
Limitations
The current implementation is less efficient for large values of number due to repeated string conversions and checks.
If nonDigit is not a valid digit (0-9), the behavior may not be as expected. Ensure nonDigit is within the valid range.
