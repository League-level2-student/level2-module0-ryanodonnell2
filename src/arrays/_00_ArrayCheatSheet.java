package arrays;
import java.util.Random;
public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] s = {"One","Two","Three","Four","Five"};
		//2. print the third element in the array
		System.out.println(s[2]);
		//3. set the third element to a different value
		s[2]="Guess";
		//4. print the third element again
		System.out.println(s[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		//6. make an array of 50 integers
		int[] x = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random randy = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = randy.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = x[0];
		int max = 1;
		for (int i = 0; i < x.length; i++) {
			if(min>x[i]) {min = x[i];}
			if(max<x[i]) {max = x[i];}
		}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
		System.out.println("Min is: " + min);
		System.out.println("Max is: " + max);
		//9 print the entire array to see if step 8 was correct
		//10. print the largest number in the array.
		
		for (int i = 0; i < x.length-1; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i]>x[j]) {
					int temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
				}
				
			}
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
}