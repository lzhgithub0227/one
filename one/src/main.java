import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt(100);
        System.out.println(num);
        // 随机生成一个整数
        while (true){
            System.out.println(">>>输入一个数字:");
            int num_input = sc.nextInt();
            if (num_input > num){
                System.out.println(">>>输入的数字大了!");
            }
            if (num_input < num){
                System.out.println(">>>输入的数字小了!");
            }

            if (num_input == num){
                System.out.println(">>>猜对了!");
                break;
            }


        }



    }
}
