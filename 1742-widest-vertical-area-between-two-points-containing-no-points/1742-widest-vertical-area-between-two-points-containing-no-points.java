class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        sort(points,0,points.length -1);
        int max=0;
        for(int i=0;i<points.length-2;i++){
            int p=points[i+1][0]-points[i][0];
            if(max<p)
                max=p;
        }
        return max;
    }
    void sort(int arr[][],int left,int right){

        if(left<right){
            int mid = (left+right)/2;
            sort(arr,left,mid);
            sort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }
    void merge(int arr[][],int left,int mid, int right){
        int size1=mid-left+1;
        int size2=right-mid;
        int arr1[][]=new int[size1][2];
        int arr2[][]=new int[size2][2];
        for(int i=0;i<size1;i++)
            arr1[i][0]=arr[left+i][0];

        for(int i=0;i<size2;i++)
            arr2[i][0]=arr[mid+1+i][0];
        
        int i=0;
        int j=0;
        int k=left;

        while(i<size1 && j<size2){
            if(arr1[i][0]>arr2[j][0]){
                arr[k][0]=arr2[j][0];
                j++;
            }else{
                arr[k][0]=arr1[i][0];
                i++;
            }
            k++;
        }
        while(i<size1){
            arr[k][0]=arr1[i][0];
            k++;
            i++;
        }
        while(j<size2){
            arr[k][0]=arr2[j][0];
            k++;
            j++;
        }

        
    }

}