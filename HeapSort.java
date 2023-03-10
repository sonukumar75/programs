public class Heapsort {
    public static void main(String [] args){
        int []arr={22,13,17,11,10,14,12};
        Heapsort ob=new Heapsort();
        ob.sort(arr);
        ob.PrintArray(arr);
    }
    void sort(int []arr){
        int length=arr.length;
                    for(int i=length/2-1;i>=0;i--){
                        heapify(arr,length,i);
                    }
                    for(int i=length-1;i>=0;i--){
                        //swap large value of heapify method ki
                        int temp=arr[0];
                        arr[0]=arr[i];
                        arr[i]=temp;
                        heapify(arr,i,0);
                    }
    }
    void heapify(int []arr,int n,int i){
        int largest=i;// iske ander parent node ki index position a gyi hai
        int li=2*i+1;  // iske ander Left node ki index position a gyi hai

        int ri=2*i+2; //iske ander Right node ki index position a gyoi hai

        if(li<n&&arr[li]>arr[largest]){
                largest=li;
        }
        if(ri<n&&arr[ri]>arr[largest]){
            largest=ri;
        }
        if(largest!=i){
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            heapify(arr,n,largest);

        }
    }
    void PrintArray(int []arr){
        System.out.println("Using Heapipy Method");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
