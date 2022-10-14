function linearSearch(arr1,key){
    for(i=0;i<arr1.length;i++)
    {
        if(arr1[i]==key)
        {
            return arr1[i];
        }
    }
    return -1;
}
var arr1 = [7,68,54,45,10];
let key = 68;
let data = linearSearch(arr1,key);
if(data==-1)
{
    console.log(`Not found ${key}`);
}
else{
    console.log(`Found ${key}`);
}

// Time Complexity:  O(N)