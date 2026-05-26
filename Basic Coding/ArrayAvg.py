n=int(input())
arr=list(map(int,input().split()))
arsum=0
for i in arr:
  arsum+=i
print(arsum//n)