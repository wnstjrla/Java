package test01;

import java.util.Arrays;
import java.util.HashSet;

public class HashSet_StreamDistinct {

	public static void main(String[] args) {
		 String[] arr = { "H", "E", "L", "L", "O" };
		 HashSet<String> hashSet = new HashSet<>(Arrays.asList(arr));
		 String[] resultArr = hashSet.toArray(new String[0]);
		 System.out.println(resultArr.length);
		 System.out.println(Arrays.toString(resultArr));
		 
		 int[] arr1 = {1, 1, 1, 2, 2, 3, 6, 6};
		 int[] other = Arrays.stream(arr1).distinct().toArray();
		 System.out.println(Arrays.toString(other));
	}

}
