import java.util.Scanner;
public class App{
    public static void main(String[] args) {
        int value1 = input(1);
        int value2 = input(2);
        System.out.printf("sum : %d\n", value1 + value2);
    }
    public static int input(int a){
        System.out.printf("type Num %d: ",a);
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        return value1;
    }
}