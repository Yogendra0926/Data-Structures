a="1001"
a=a[::-1]
digit=0
for i in range(len(a)):
  digit+=(2**i)*int(a[i])
print(digit)



