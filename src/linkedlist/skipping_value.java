package linkedlist;

public class skipping_value {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        int n = arr.length;
        int[] result = new int[n];



        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product *= arr[j];
                }
            }
            result[i] = product;
        }

       
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
