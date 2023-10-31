//Alternate positive and negative numbers
//https://practice.geeksforgeeks.org/problems/array-of-alternate-ve-and-ve-nos1401/1
class Solution {
    void rearrange(int arr[], int n) {
    
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        
        int i=0;
        while(i<n){
            if(arr[i]>=0){
                positives.add(arr[i]);
            }else{
                negatives.add(arr[i]);
            }
            i++;
        }
        int j=0;
        int k=0;
        Boolean isPos=true;
        i=0;
        while(j<positives.size() && k<negatives.size()){
            if(isPos){
                arr[i] = positives.get(j);
                j++;
                isPos=false;
            }else{
                arr[i] = negatives.get(k);
                k++;
                isPos=true;
            }
            i++;
        }
        while(j<positives.size()){
            arr[i] = positives.get(j);
            i++;
            j++;
        }
        while(k<negatives.size()){
            arr[i] = negatives.get(k);
            k++;
            i++;
        }
    }

}
