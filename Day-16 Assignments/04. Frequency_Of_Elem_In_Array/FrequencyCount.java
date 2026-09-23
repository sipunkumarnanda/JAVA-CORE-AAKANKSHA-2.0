// Write a java program to count frequency of each elemnt in an array

public class FrequencyCount {
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 20, 40 };

        for (int i = 0; i < arr.length; i++) {
            boolean hasSeen = false;
            for (int l = 0; l < i; l++) {
                if (arr[i] == arr[l]) {
                    hasSeen = true;
                    break;
                }
            }
            int count = 1;
            if (!hasSeen) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
            } else {
                continue;
            }
            System.out.println(arr[i] + " Frquency : " + count);
        }
    }
}
