
public class MergeTwoArray {
    public static void main(String[] args) {
        int arr1[] = { 10, 20, 30, 40 };
        int arr2[] = { 15, 25, 35, 50 };
        int mergedArr[] = new int[arr1.length + arr2.length];
        int j = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] <= arr2[i]) {
                mergedArr[j] = arr1[i];
                j++;
                mergedArr[j] = arr2[i];
                j++;
            } else {
                mergedArr[j] = arr2[i];
                j++;
                mergedArr[j] = arr1[i];
                j++;
            }
        }

        System.out.println("Merged Array is ");
        for (int elem : mergedArr) {
            System.out.print(elem + " ");
        }
    }
}