package testing;
import java.util.Scanner; 

public class W4P2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] valueArray = new int[10];
		Duplicate dup = new Duplicate();
        //Asking user to enter 
        System.out.println("Please enter integer values: ");
        for (int i = 0; i < 10; i++)
        {
            //allows user to enter numbers 
        	System.out.println("Number " + i + ": ");
            //store values in array
            valueArray[i] = sc.nextInt();
        }
        dup.AmountDupNums(valueArray);
        System.out.println("Amount of duplicate numbers = " + dup.counter);
        sc.close();
	}

}
