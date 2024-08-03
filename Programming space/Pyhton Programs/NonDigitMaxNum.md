# Max of Non-Digit

This Python program determines the largest integer less than or equal to a given starting number that does not contain a specified digit. If the digit is not valid (i.e., not between 0 and 9), the program returns an error message.

## Description

The program includes the `max_of_non_digit` function which:
1. Validates the `non_digit` parameter to ensure it is between 0 and 9.
2. Iterates backwards from the given `number` to find the largest number that does not contain the `non_digit`.
3. Returns the largest valid number, or an error message if `non_digit` is invalid.
4. 
### Example Output

For `number = 143` and `non_digit = 4`, the output will be:

```plaintext
139
```

For `non_digit = 98`, which is not between 0 and 9, the output will be:

```plaintext
 non_digit should be in 0 to 9
```

## Code Details

- **`max_of_non_digit(number, non_digit)`**

  Finds the maximum number less than or equal to `number` that does not contain the digit `non_digit`. The function:
  - Checks if `non_digit` is in the range 0 to 9. If not, returns an error message.
  - Iterates from `number` downwards.
  - Checks if `non_digit` is not present in the string representation of the current number.
  - Returns the largest number that meets the criteria.

- **Main Execution Block**

  Initializes `number` and `non_digit`, calls `max_of_non_digit`, and prints the result. Modify these variables to test different cases.

## Limitations

- The `non_digit` parameter should be a single digit between 0 and 9. Values outside this range are considered invalid.
- The function performs a linear search which may not be efficient for very large numbers.
