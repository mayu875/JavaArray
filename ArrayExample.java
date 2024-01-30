
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {10,20,30,40,50};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value that you want to search : ");
		int value = sc.nextInt(); 
		
		int result = search(a, value);
		if(result != -1) {
			System.out.println("Value are found");
		}else {
			System.out.println("Value are not found");
		}
	}
	
	static int search(int arr[], int value) {
		for(int i=0;i< arr.length;i++) {
			if(arr[i]==value) {     
				return 1;
			}
		}
		return -1;
	}
}
..........................................................................................................................................

import java.util.Scanner;

public class ArrayExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []stv = new int[5];
		Scanner sc = new Scanner(System.in);
		
	for(int i=0;i<stv.length;i++) {
	System.out.println("Enter the value 1"); 
		 stv[i] = sc.nextInt();	
	}
	
	System.out.println("Output"); 
	for(int ds:stv) {
		System.out.println(ds); 

	}
        }
}