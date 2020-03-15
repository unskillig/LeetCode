import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class TwoSum {

	private static int[] values = {3, 5, 7, 2, 4, 8};
	private static List<Integer> sums = new ArrayList<Integer>();
	private static int sum = 9;
	
	public static void solveProblem(){
		
		Hashtable<Integer, Integer> temp = new Hashtable<>();
		
		
		for(int i = 0; i < values.length; i++){
			
			int sumMinusValue= sum-values[i];
			temp.put(values[i], values[i]);
			
			if(temp.contains(sumMinusValue)){
				sums.add(values[i]);
				sums.add((int)temp.get(sumMinusValue));
			}
			
			
		}
		
		
		
	}

	public static int[] getValues() {
		return values;
	}

	public static void setValues(int[] values) {
		TwoSum.values = values;
	}

	public static List<Integer> getSums() {
		return sums;
	}

	public static void setSums(List<Integer> sums) {
		TwoSum.sums = sums;
	}

	public static int getSum() {
		return sum;
	}

	public static void setSum(int sum) {
		TwoSum.sum = sum;
	}
	
	
	
	
	
	
	
	
	
	
}
