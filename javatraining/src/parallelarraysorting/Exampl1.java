package parallelarraysorting;

import java.util.Arrays;

public class Exampl1 {
	public static void main(String[] args) {
		int[] arr= {9,1,8,2,7,3,6,4,5,0};
		System.out.println("Before sorting");
		for(int i :arr) {
			System.out.println(i);
		}
			Arrays.parallelSort(arr);
			System.out.println("After parallel sorting");
			for(int j:arr) {
				System.out.println(j);
		}

	}

}
