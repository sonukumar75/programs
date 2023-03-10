public class Interger_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2, 1, 34, 56, 5, 3};
        int temp = 0;
        int item = 3;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == item) {
                System.out.println("The element is present" + i + "index position");
                temp = temp + 1;
            }

        }
        if (temp == 0) {
            System.out.println("The Element is not present in this Array");
        }
    }
}
