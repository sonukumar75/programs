package All_practice_problem;

public class QuickSort {
    public static void main(String [] args){
        int a[]={2,4,1,8,5,3,9,6};
        int len=a.length;
        QuickSort ob=new QuickSort();
        ob.sort(a,0,len-1);
        ob.PrintArray(a);
    }
    int partition(int a[],int i,int j) {
        int pivot = a[(i + j) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        return i;
    }
    void sort(int []a,int i,int j){
        int pi=partition(a,i,j);
        if(i<pi-1){
            sort(a,i,pi-1);
        }
        if(pi<j){
            sort(a,pi,j);

        }
    }
    void PrintArray(int []a){
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
