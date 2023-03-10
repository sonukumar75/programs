public class mergesort {
    int []array;
    int []tempMergeArr;
    int length;
    public static void main(String [] args) {
        int a[] = {4, 2, 5, 7, 1, 7, 9,4};
        mergesort ob=new mergesort();
        ob.sort(a);
        for (int i:a){
            System.out.print(i + " ");
        }
    }

    public void sort(int a[]){
        this.array=a;
        this.length=a.length;
        this.tempMergeArr=new int[length];
        divideArray(0,length-1);
    }
    public void divideArray(int lowerind,int higherind ){

        if(lowerind<higherind){
            int mid=lowerind+(higherind-lowerind)/2;
            divideArray(lowerind,mid);
            divideArray(mid+1,higherind);
            mergeArray(lowerind,mid,higherind);
        }
    }
    public void mergeArray(int lowerind,int mid,int higherind){
        for(int i=lowerind;i<=higherind;i++){
            tempMergeArr[i]=array[i];
        }
        int i=lowerind;
        int j=mid+1;
        int k=lowerind;
        while(i<=mid && j<=higherind){
            if(tempMergeArr[i]<=tempMergeArr[j]){
                array[k]=tempMergeArr[i];
                i++;
            }
           else{
               array[k]=tempMergeArr[j];
               j++;
            }
           k++;
        }
        while(i<=mid){
            array[k]=tempMergeArr[i];
            k++;
            i++;

        }
    }

}
