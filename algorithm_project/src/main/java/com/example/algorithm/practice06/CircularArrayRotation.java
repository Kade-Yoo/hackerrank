package com.example.algorithm.practice06;

import java.util.ArrayList;

public class CircularArrayRotation {

	private ArrayList<Integer> circularArray;
	
	/**
	 * 해당 클래스내 범위에서 
	 * 
	 * @param circularArray
	 */
	public CircularArrayRotation(ArrayList<Integer> circularArray) {
		this.circularArray = circularArray;
	}
	
	// 결과 값
	public int getValue(int inputIndex) {
		return circularArray.get(inputIndex);
	}
	
	private int getLastIndex() {
		return circularArray.size() - 1;
	}
	
	// 회전
	private void rotateArray() {
		int value = this.circularArray.get(getLastIndex());
		this.circularArray.add(0, value);
		this.circularArray.remove(getLastIndex());
	}
	
	// 반복
	public void calculate(int iteratorCount) {
		for (int index = 0; index < iteratorCount; index++) {
			rotateArray();
		}
	}
}
