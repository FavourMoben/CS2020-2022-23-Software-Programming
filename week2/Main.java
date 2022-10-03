import java.util.*;
public class Main {
    public static void main(String[] args){
        // final int[] array = new int[5];
        // if (Objects.isNull(array[0])){
        //     System.out.println("True");
        // }else {
        //     System.out.println("False");
        // }
        System.out.println("Hello world");
        System.out.println("I can now use \"escape sequence\" and can print even reserved characters like \\");
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please input x: ");
        // int x = input.nextInt();
        // Scanner input2 = new Scanner(System.in);
        // System.out.println("Please input x: ");
        // int y = input2.nextInt();
        // System.out.printf("%d + %d == %d \n",x,y,sum(x,y));

        DynamicArray array = new DynamicArray();
        for (int i=0;i < 6; i ++){
            array.append(i);
        }
        }
    public static int sum(int x,int y){
        return x + y;
    }
}
class DynamicArray {
    DynamicArray() {
        this.maxCap = 10;
        this.array = new int[maxCap];
        this.index = 0;
    }
    public int[] append(int value){
        // if the array is not empty then do this
        if (this.array[this.index] == null) {
            this.array[this.index] = value;
            this.index ++;
            return this.array;
        }
        else if (this.array.length - 1 == this.index && this.array[this.index] == null) {
            this.maxCap *= 2;
            this.newArray = new int[this.maxCap];
            for (int i = 0; i<this.array.length; i++ ){
                this.newArray[i] = this.array[i];
            }
            this.array = this.newArray;
            return this.array;
        }

   }
}