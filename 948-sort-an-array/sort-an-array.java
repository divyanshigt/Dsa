class Solution {
 
    private void merge(int arr[],int low,int mid,int high){
       int i=low,k=low,j=mid+1;
       int temp[]=new int[arr.length];
        while(i<=mid&&j<=high){
        if(arr[i]<arr[j]){
            temp[k++]=arr[i++];

        }else{
            temp[k++]=arr[j++];
        }
       }
       while(i<=mid){
        temp[k++]=arr[i++];
       }
       while(j<=high){
        temp[k++]=arr[j++];

       }
       for(int p=low;p<=high;p++){
        arr[p]=temp[p];
       }
    }
    private void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            
           mergeSort(arr,low,mid);
           mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }
}