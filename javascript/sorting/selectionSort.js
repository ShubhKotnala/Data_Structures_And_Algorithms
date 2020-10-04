/* Author : Shubhankar Kotnala
 * Problem : Sort a given array using Selection Sort
 * Explanation : Selection sort selects the smallest 
 * element and puts it to the beginning of the array,
 * like a queue
 */
function selectionSort(arr){
    var len = arr.length;
    for(var i =0; i<len; i++){
        var min = arr[i];
        var minIndex = i;
        for(var j=i+1; j<len; j++){

            //find the index of min value in 
            //array left
            if(arr[j] < min){
                min = arr[j];
                minIndex = j;
            }
        }
        
        //Swap the current 'i' element and
        //the index got from this iteration
        var tempHolder = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = tempHolder;
        
    }
    console.log("Sorted Arrar ", arr);
}

selectionSort([4,2,5,3,1,7]);