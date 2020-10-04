def bubbleSort(arr):
    arrLen = len(arr)
    for i in range(arrLen-1):
        wasSwapped = False
        for j in range(0, arrLen-i-1):
            if arr[j] > arr [j+1]:
                arr[j], arr[j+1] = arr[j+1], arr[j]
                wasSwapped = True  
        if not wasSwapped:
            break
    print("Sorted Array ", arr)

bubbleSort([4,2,5,3,1,7])