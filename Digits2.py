a=int(input("Enter the number: "))
a=str(a)
prime_count=0
for i in a:
    b=int(i)
    count=0
    for j in range(2, b):
        if b % j == 0:
            count += 1
    if count == 0:
        prime_count += 1
print(a)
print(prime_count)