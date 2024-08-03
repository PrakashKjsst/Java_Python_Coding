# BalancedBrackets Java Program

## Overview

The `BalancedBrackets` Java program checks if a string of brackets is balanced or not. A string is considered balanced if every opening bracket has a corresponding closing bracket in the correct order. For example, `{[()]}` is balanced, whereas `{[[)]}` is not.

## Functionality

- **Input:** A string of brackets.
- **Output:** A message indicating whether the brackets are balanced or unbalanced.

### Input Example

- `{[()]}`

### Output Example

- `Brackets are balanced`

### Input Example

- `{[[)]}`

### Output Example

- `Brackets are not balanced`

## How It Works

1. **Initialize a Stack:** The program uses a `Stack` to keep track of opening brackets.
2. **Iterate Through Characters:** Each character in the input string is examined.
   - **Push Opening Brackets:** If the character is an opening bracket (`{`, `[`, or `(`), it is pushed onto the stack.
   - **Check Closing Brackets:** If the character is a closing bracket (`}`, `]`, or `)`):
     - Check if the stack is not empty and the top of the stack is the corresponding opening bracket.
     - If it matches, pop the top of the stack.
     - If it doesn't match or the stack is empty, the brackets are unbalanced.
3. **Final Check:** After processing all characters, check if the stack is empty.
   - If empty, the brackets are balanced.
   - If not, the brackets are unbalanced.
