package CustomMath.src;
import java.util.ArrayList;

public final class CustomMath {
    public static double divide(int x, int y) throws ArithmeticException{
        if(y == 0){
            throw new ArithmeticException("ArithmeticException: divide by zero");
        }
        return (double)x / (double)y;
    }
    public static int trunc(float num){
        return (int)num;
    }
    public static int trunc(double num){
        return (int)num;
    }
    public static <T extends Number> int[] trunc(T []numbers) {
        int l = numbers.length;
        int []result = new int[l];
        for(int i = 0; i < l; i++){
            result[i] = trunc(numbers[i].floatValue());
        }
        return result;
    }

    public static int min(ArrayList<Integer> array) throws Exception{
        if(array.isEmpty()){
            throw new Exception("Exception: The array is empty. Please try again.");
        }
        int n = array.get(0);
        for(int element : array){
            n = n < element ? n : element;
        }
        return n;
    }

    public static int max(ArrayList<Integer> array) throws Exception{
        if(array.isEmpty()){
            throw new Exception("Exception: The array is empty. Please try again.");
        }
        int n = array.get(0);
        for(int element : array){
            n = n > element ? n : element;
        }
        return n;
    }

    public static int sum(ArrayList<Integer> array) throws Exception {
        if(array.isEmpty()){
            throw new Exception("Exception: The array is empty. Please try again.");
        }
        int sum = 0;
        for(int element : array){
            sum += element;
        }
        return sum;
    }
}
