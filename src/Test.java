package CustomMath.src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import CustomMath.src.CustomMath;

public class Test {
    public ArrayList<Integer> getRandomNumbers(int length) throws Exception{
        if(length <= 0){
            throw new Exception("Exception: Length can't be less than zero!");
        }
        ArrayList<Integer> array = new ArrayList<Integer>(length);
        for(int i = 0; i < length; i++){
            array.add(CustomMath.trunc(Math.random() * 1000));
        }
        return array;
    }

    public static void main(String []args){
        try {
            switch (args[0]) {
                case "-test1":
                    Test t = new Test();
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter length of number array : ");
                    int length = scanner.nextInt();
                    ArrayList<Integer> numbers = t.getRandomNumbers(length);
                    System.out.println("Numbers = " + numbers);
                    System.out.println("Length = " + length);
                    System.out.println("Min value = " + CustomMath.min(numbers));
                    System.out.println("Max value = " + CustomMath.max(numbers));
                    System.out.println("Sum = " + CustomMath.sum(numbers));
                    break;
                case "-test2":
                    Float[] a = {1.2F, 34.4F, 2.5F, 234.45F};
                    int[] b = new int[a.length];
                    System.out.println("5 / 2 = " + 5 / 2);
                    System.out.println("5 / 2 = " + CustomMath.divide(5, 2));
                    System.out.println("a = " + Arrays.toString(a));
                    b = CustomMath.<Float>trunc(a);
                    System.out.println("b = " + Arrays.toString(b));
                    break;
                default:
                    System.out.println("Please enter flag options in the program.");
                }
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
