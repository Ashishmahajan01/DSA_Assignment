import java.lang.*;
import java.util.*;
public class Hw2{
	
	public static void thirdlargestele(int arr[]){
		Arrays.sort(arr);
		System.out.println("Third largest element = " + (arr.length - 3));
	}
	
	
	public static void main(String [] args){
		int arr[] = {1,2,5,9,7,6,8,4,3,5};
		thirdlargestele(arr);
	}

}