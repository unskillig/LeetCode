
public class Run {

	public static void main(String[] args) {
		TwoSum.solveProblem();
		
		for(int i = 0; i < TwoSum.getSums().size(); i++){
			System.out.print(TwoSum.getSums().get(i));
			
			if(i % 2 != 0 && i < TwoSum.getSums().size()-1){
				System.out.print("|");
			}
		}

	}

}
