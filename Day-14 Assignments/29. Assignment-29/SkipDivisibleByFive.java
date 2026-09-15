// 29.    Write a Java program to print numbers from 1 to 50, skipping all numbers divisible by 5 using continue.

public class SkipDivisibleByFive {
    public static void main(String[] args) {
        for(int i=1; i<=50; i++){
            if(i % 5 == 0){
                continue;
            }else{
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
}
