def insertionSort(arr): 
    arrLen = len(arr)
    for i in range(1, arrLen):  
        key = arr[i] 
        j = i-1
        while j >=0 and key < arr[j] : 
                arr[j+1] = arr[j] 
                j -= 1
        arr[j+1] = key 
    print("Sorted Array " ,arr)

insertionSort([4,2,5,3,1,7]) 
