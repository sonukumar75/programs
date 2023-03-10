package src.searching;

public class String_LinearSearch {
    public static void main(String[] args) {
        String []arr={"sonu","naresh","kanchan","muskan","kunal","karan"};
        String item="muskan";
        int temp=0;

        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(item)){
                System.out.println("The name is present in  String Array in index number "+i);
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("The name is  not present in String Array ");
        }
    }
}
