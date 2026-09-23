
public class VarArgsSum {

    public static int sum(int... nums) {
        int sum = 0;
        for (int elem : nums) {
            sum += elem;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Sum : " + sum(10, 20, 30));
        System.out.println("Sum : " + sum(10, 20, 30, 40, 50));
    }
}
