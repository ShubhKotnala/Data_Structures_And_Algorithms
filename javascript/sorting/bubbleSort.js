/* Author : Shubhankar Kotnala
 * Problem : Sort a given array using Bubble Sort
 * Explanation : Bubble sort puts the largest element
 * at the end of the array in each iteration.
 */
function bubbleSort(arr){
    var len = arr.length;
    for(var i = 0; i<len; i++){

        //to break the control loop to increase the efficiency of the code
        var wasSwapped = false;
        for(var j=0; j< len - i; j++){
            if(arr[j] > arr[j+1]){
                var tempHolder = arr[j];
                arr[j] =arr[j+1];
                arr[j+1] = tempHolder;
                wasSwapped = true;
            }
        }
        //If swapping is not performed in the entire iteration, the array is sorted
        if(!wasSwapped)
            break;
    }

    console.log("Sorted Array ", arr);
}

bubbleSort([4,2,5,3,1,7]);