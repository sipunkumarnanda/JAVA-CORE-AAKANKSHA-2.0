// Write a java program to reverse an array with out using another array

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40, 50 };
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        System.out.print("After reversing the array is : ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
