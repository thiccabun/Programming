// Zack Friedman 3/28/19

import java.util.ArrayList;

public class RemoveDuplicates {
	public static void removeDuplicate(ArrayList<Integer> list) {

	} // removeDuplicate end
	public static int[] eliminateDuplicates(int[] list) {
		int[] temp = new int[list.length];
		int size = 0;
		for (int i = 0; i < list.length; i++) {
			boolean isInArray = false;
			for (int j = 0; j < i && !isInArray; j++) {
				if (list [j] == list[i]) {
					isInArray = true;
				} // end of if statement
			} // end of for loop
			if (!isInArray) {
				temp[size] = list[i];
				size++;
			} // end of if statement
		} // end of for loop
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = temp[i];
		} // end of for loop
		return result;
	} // end of eliminateDuplicates method
}