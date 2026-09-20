public class quick_sort {
    public static int Partition(int[] arr, int low, int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                //swaping
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
        i++;
        int temp=arr[i];
        arr[i]=pivot;
        arr[high]=temp;
        return i;


    }
    public static void qs(int[] arr, int low, int high ){
        if(low<high){
            int pidx=Partition(arr,low, high);

            qs(arr, low, pidx-1);
            qs(arr,pidx+1,high);

        }

        
        

    }
    public static void main(String[] args){
        int[] arr={2,4,5,3,8,7};
        int n=arr.length;
        qs(arr,0,n-1);

        for(int i =0;i<n;i++){
            System.out.print(arr[i]);
        

        }
        System.out.println("");




    }
    
}
