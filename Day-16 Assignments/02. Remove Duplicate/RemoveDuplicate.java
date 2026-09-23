// Write a java program to remove duplicate from an array
public class RemoveDuplicate {
    public static void main(String[] args) {
       int arr[] = { 10, 20, 10, 30, 20, 40 , 39};
        int k = 0;

        for(int i=0; i<arr.length; i++){
            boolean isSeen = false;
            for(int j=0; j<i; j++){    // inner loop runs from 0 to i-1 to check if the element has appeared before or not 
                if(arr[i] == arr[j]){
                    isSeen = true;
                    break;
                }
            }

            if(!isSeen){
                arr[k] = arr[i];
                k++;
            }
        }
        for (int i = 0; i<k; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}
  