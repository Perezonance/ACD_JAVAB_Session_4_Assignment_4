package assignment_4;

public class Recursion {
	private static int step = 1;
	private static int[] tempArr;
	public static void main(String[] args) {
		
		int[] arr = {5, 4, 3, 2, 1};
		
		print(arr);
		
		Recursion.recursiveCall(arr, arr.length, 0);
		
		print(arr);
	}
	
	static int minIndex(int arr[], int a, int b){
		if(a == b)
			return a;
		
		int c = minIndex(arr, a + 1, b);
		
		return (arr[a] < arr[c])? a : c;
	}
	
	static void recursiveCall(int arr[], int n, int index){
		if(index == n)
			return;
		int min = minIndex(arr, index, n-1);
		
		if(min != index){
			int temp = arr[min];
			arr[min] = arr[index];
			arr[index] = temp;
		}
		
		recursiveCall(arr, n, index + 1);
	}
	
	/*
	static void recursiveCall(int[] abc, int n){
		tempArr = new int[n];
		int min = abc[0];
		int index = 0;
		for(int i = step; i < n; i++){
			System.out.print(abc[i]);
			if(abc[i] <= min){
				min = abc[i];
				index = i;
			}
		}
		int temp = abc[step - 1];
		abc[step - 1] = abc[index];
		abc[index] = temp;
		
		step++;
		if(step == n)
			print(tempArr);
		else
			recursiveCall(abc, n);
	}
	*/
	
	static public void print(int[] arr){
		System.out.print("[");
		for (int i : arr) {
			System.out.print(i +" ");
		}
		System.out.println("]");
	}
}
