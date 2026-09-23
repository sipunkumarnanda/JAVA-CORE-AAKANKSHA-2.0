
public class VarArgsMin {

    public static int minimum(int... nums) {
        int min = nums[0];
        for (int elem : nums) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("Minimun : " + minimum(10, 20, 30, 40, 9, 15));
    }
}
