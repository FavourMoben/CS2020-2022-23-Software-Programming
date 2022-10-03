import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner rangeValue = new Scanner(System.in);
        System.out.print("Please type the range: ");
        int range = rangeValue.nextInt();
        int minn = 0;
        for (int i = minn; i<= range; i++ ) {
            if ((i + 1) % 5 == 0 && i % 2 != 0 && i * 3 <= 100) {
                System.out.println(i);
                System.out.println(i * 3);
            }
         }
    }
}