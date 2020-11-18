import java.util.Scanner;

public class ArrayMain {
    private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args){
        int[] myInts = getInts(5);
        for(int i=0; i<myInts.length; i++){
            System.out.println("Element " + i +", value "+myInts[i]);
        }
        System.out.println("The average is " + getAverage(myInts));
    }

    public static int[] getInts(int number){
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i=0; i<values.length; i++){
            values[i] = userInput.nextInt();
        }
        return values;
    }

    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum = sum + array[i];
        }
        return (double) sum/(double) array.length;
    }

}
