
public class StockProfitProblem {

	private static int[] stockValues = {45, 24, 32, 35, 40, 10, 42, 1, 50, 3, 3, 49, 3, 99};
	
	
	public static int solveProblem(){
		
		int maxProfit = -1, buyPrice = 0, sellPrice = 0;
		buyPrice = stockValues[0];
		
		for(int i = 0; i < stockValues.length-1; i++){
			
			sellPrice = stockValues[i+1];
			
			if(sellPrice - stockValues[i] > maxProfit){
				buyPrice = stockValues[i];
				maxProfit = sellPrice - buyPrice;
			}
			else if(sellPrice - buyPrice > maxProfit){
				maxProfit = sellPrice - buyPrice;
			}
			
		}
		
		return maxProfit;
		
		
	}


	public static int[] getStockValues() {
		return stockValues;
	}


	public static void setStockValues(int[] stockValues) {
		StockProfitProblem.stockValues = stockValues;
	}
	
	
	
	
	
	
}
