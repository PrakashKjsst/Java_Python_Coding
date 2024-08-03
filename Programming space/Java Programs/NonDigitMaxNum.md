# NonDigitMaxNum

The `NonDigitMaxNum` Java program determines the largest integer less than or equal to a given starting number that does not contain a specified digit. If the digit is not valid (i.e., not between 0 and 9), the program returns an error message.

## Description

The program includes the `maxOfnonDigit` method which performs the following:
1. Validates the `nonDigit` parameter to ensure it is within the valid range of 0 to 9.
2. Iterates backwards from the provided `number`.
3. Checks each number to ensure it does not contain the specified `nonDigit`.
4. Returns a string indicating the largest number that does not contain the `nonDigit`, or an error message if `nonDigit` is invalid.

### Example Output

If `number = 1000` and `nonDigit = 9`, the output will be:

```plaintext
The maximum number is 999
```

If `nonDigit = 10`, the output will be:

```plaintext
nonDigit must be between 0 and 9.
```

## Code Details

- **`maxOfnonDigit(int number, int nonDigit)`**

  Finds the maximum number less than or equal to `number` that does not contain the digit `nonDigit`. The method:
  - Checks if `nonDigit` is between 0 and 9. If not, returns an error message.
  - Iterates from `number` downwards.
  - Checks if `nonDigit` is not present in the string representation of the current number.
  - Returns the largest valid number or an empty string if no valid number is found.

- **`main(String[] args)`**

  The entry point of the program that initializes values for `number` and `nonDigit`, calls `maxOfnonDigit`, and prints the result.

## Limitations

- The current implementation uses a linear search which might be inefficient for very large numbers.
- The `nonDigit` parameter should be a single digit (0-9). Values outside this range are considered invalid.

