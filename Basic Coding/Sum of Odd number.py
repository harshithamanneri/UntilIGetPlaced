n=int(input())
arr=list(map(int,input().split()))
odd_sum=0
for i in range(n):
  if arr[i]%2!=0:
    odd_sum+=arr[i]
print(odd_sum)
