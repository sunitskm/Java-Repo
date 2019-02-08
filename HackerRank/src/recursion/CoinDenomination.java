package recursion;

public class CoinDenomination {
	public static int coinCombo(int n,int[] coins,int currentCoin) {
		if(n==0) {
			return 1;
		}
		if(n<0) {
			return 0;
		}
		int total=0;
		for(int i=currentCoin;i<coins.length;i++) {
			total+=coinCombo(n-coins[i], coins,i);
		}
		return total;
		
		
	}
	public static void main(String[] args) {
		int[]coins = {1,2};
		System.out.println(coinCombo(5,coins,0));
	}
}
