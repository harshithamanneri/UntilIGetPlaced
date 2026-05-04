def total_energy(arr, k):
    n = len(arr)
    base = n // k
    extra = n % k
    
    result = 0
    index = 0
    
    for i in range(k):
        # distribute extra elements
        size = base + (1 if i < extra else 0)
        
        sub = arr[index:index+size]
        index += size
        
        energy = max(sub) - min(sub)
        result += energy
    
    return result


# Input
arr = [1, 5, 3, 8, 2]
k = 2

print(total_energy(arr, k))