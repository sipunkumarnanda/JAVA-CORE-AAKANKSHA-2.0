
public class CheckPalindrome {
    public static boolean checkPalindrome(int arr[]){
        int i = 0, j = arr.length - 1;

        while (i <= j) {
            if (arr[i] != arr[j]) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int arr2[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1,9 };

        if(checkPalindrome(arr)){
            System.out.println("The given array is palindrome");
        }else{
            System.out.println("The given array is not palindrome");
        }

    }
}
