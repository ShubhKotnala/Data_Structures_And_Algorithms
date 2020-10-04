def selectionSort(arr):
    arrLen = len(arr)
    for i in range(arrLen-1):
        minValue = arr[i]
        minIndex = i
        for j in range(i+1, arrLen-1):
            if arr[j] < minValue:
                minValue = arr[j]
                minIndex = j

        arr[i], arr[minIndex] = arr[minIndex], arr[i]
    print("Sorted Array " ,arr)

selectionSort([4,2,5,3,1,7])            