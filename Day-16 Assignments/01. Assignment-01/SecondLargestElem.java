// Write a java program to find the second largest element in an array 

public class SecondLargestElem {
    public static void secondLargestElem(int arr[]) {
        int largestElem = arr[0], secondLargestElem = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestElem) {
                secondLargestElem = largestElem;
                largestElem = arr[i];
            } else if (arr[i] > secondLargestElem && arr[i] < largestElem) {
                secondLargestElem = arr[i];
            }
        }
        System.out.println("Largest Element in array : " + largestElem);
        System.out.println("Second Largest Element in array : " + secondLargestElem);
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 4, 45, 99 };
        // int arr[] = {-10, -20, -4, -45, -99};
        secondLargestElem(arr);
    }
}