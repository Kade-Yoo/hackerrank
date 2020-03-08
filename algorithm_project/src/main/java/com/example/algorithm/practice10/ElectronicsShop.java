package com.example.algorithm.practice10;

public class ElectronicsShop {
	/**
	 * 키보드 1개와 USB 1개를 구매하여 가장 많이 쓸 수 있는 금액
	 * 
	 * @param keyboards 키보드 비용
	 * @param drives USB 비용
	 * @param totalCost 예산
	 */
	public int getMoneySpent(int[] keyboards, int[] drives, int totalCost) {
        int maxCost = 0;
        
        for(Integer keyboardCost : keyboards) {
            for(Integer driveCost : drives) {
            	Integer sumCost = keyboardCost + driveCost;
            	
                if(maxCost < sumCost && sumCost <= totalCost) {
                    maxCost = sumCost;
                }
            }
        }
        
        return maxCost == 0 ? -1 : maxCost;
    }

}
