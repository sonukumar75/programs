class SelectionSort{
    public static void main(String [] args){
        int [] a={36,1,2,12,5};
        int min,temp=0;
        for(int i=0;i<a.length;i++){
            min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]){
                   min=j;
                }
            }
                    temp=a[i];
                    a[i]=a[min];
                    a[min]=temp;
        }
        System.out.println("Sorted Array is :");
        for(int i=0;i<a.length;i++){
                System.out.print(" "+a[i]);
        }
    }
}