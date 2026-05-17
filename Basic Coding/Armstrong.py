def armstrong(num):
    order = len(str(num))
    sum = 0
    temp = num
    while temp > 0:
        digit = temp % 10
        sum += digit ** order
        temp //= 10
    return sum == num   
n = int(input("Enter a number: "))
if armstrong(n):
    print(f"{n} is an Armstrong number.")   
else:
    print(f"{n} is not an Armstrong number.")