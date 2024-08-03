def max_of_non_digit(number,non_digit):
    while(number > 0):
        if str(non_digit) not in str(number):
            return number
        else:
            number -= 1
    return 0;

if __name__ == "__main__":
    number = 143
    non_digit = 4
    result = max_of_non_digit(number,non_digit)
    print(result)
