package arrays;

public class bestTimeSellStocks {

	public static int maxProfitStocks(int[] prices) {

		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < minPrice) {
				minPrice = prices[i];
			} else if (prices[i] - minPrice > maxProfit) {
				maxProfit = prices[i] - minPrice;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int[] prices = { 1, 3, 7, 1 };
		System.out.println(maxProfitStocks(prices));
	}

}
