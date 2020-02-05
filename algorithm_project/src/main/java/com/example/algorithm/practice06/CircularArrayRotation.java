package com.example.algorithm.practice06;

import java.util.ArrayList;

public class CircularArrayRotation {

	private ArrayList<Integer> circularArray;
	
	/**
	 * �ش� Ŭ������ �������� 
	 * 
	 * @param circularArray
	 */
	public CircularArrayRotation(ArrayList<Integer> circularArray) {
		this.circularArray = circularArray;
	}
	
	// ��� ��
	public int getValue(int inputIndex) {
		return circularArray.get(inputIndex);
	}
	
	private int getLastIndex() {
		return circularArray.size() - 1;
	}
	
	// ȸ��
	private void rotateArray() {
		int value = this.circularArray.get(getLastIndex());
		this.circularArray.add(0, value);
		this.circularArray.remove(getLastIndex());
	}
	
	// �ݺ�
	public void calculate(int iteratorCount) {
		for (int index = 0; index < iteratorCount; index++) {
			rotateArray();
		}
	}
}
