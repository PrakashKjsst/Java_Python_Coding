def balanced_bracket(brackets):
    stack = []
    bracket_map = {')':'(','}':'{',']':'['}
    for bracket in brackets:
        if bracket in bracket_map.values():
            stack.append(bracket)
        elif bracket in bracket_map.keys():
            if stack and stack[-1] == bracket_map[bracket]:
                stack.pop()
            else:
                return "Unbalanced Brackets"
    return "Balanced Brackets" if not stack else "Unbalanced Brackets"

if __name__ == "__main__":
    input_string = "{([])}"
    result  = balanced_bracket(input_string)
    print(result)
