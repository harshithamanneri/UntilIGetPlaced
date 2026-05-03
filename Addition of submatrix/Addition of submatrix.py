class Solution:
	def subMatrixSum(self,arr, n, m, x1, y1, x2, y2):
	    tot_sum=0
	    x1-=1
	    y1-=1
	    x2-=1
	    y2-=1
	    for i in range(x1,x2+1):
	        for j in range(y1,y2+1):
	            tot_sum+=arr[i][j]
	    return tot_sum