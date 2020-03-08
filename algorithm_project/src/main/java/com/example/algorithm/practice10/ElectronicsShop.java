package com.example.algorithm.practice10;

public class ElectronicsShop {
	/**
	 * Ű���� 1���� USB 1���� �����Ͽ� ���� ���� �� �� �ִ� �ݾ�
	 * 
	 * @param keyboards Ű���� ���
	 * @param drives USB ���
	 * @param totalCost ����
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
