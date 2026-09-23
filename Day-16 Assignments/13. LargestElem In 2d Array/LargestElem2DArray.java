
public class LargestElem2DArray {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 10, 6 }, { 7, 8, 9 } };
        int largestElem = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] > largestElem){
                    largestElem = arr[i][j];
                }
            }
        }
        System.out.println("Largest Element in array is : " +largestElem);
    }
}
