package com.example.algorithm.practice06.service.impl;

import java.util.ArrayList;

import com.example.algorithm.practice06.Rotation;
import com.example.algorithm.practice06.constants.ArrayRotationConstants;
import com.example.algorithm.practice06.service.CircularArrayRotation;

public class CircularArrayRotationImpl extends Rotation implements CircularArrayRotation {
	private ArrayList<Integer> circularArray;
	
	public CircularArrayRotationImpl(ArrayList<Integer> circularArray) {
		this.circularArray = circularArray;
	}
	
	/**
	 * 몇 번 회전할 것인지 계산
	 * 
	 * @param 회전 횟수 RotationCount
	 */
	@Override
	public void calculate(int RotationCount) {
		for (int index = ArrayRotationConstants.FRIST_INDEX; index < RotationCount; index++) {
			rotate();
		}
	}

	/**
	 * 방향 선택 (오른쪽, 왼쪽, 위, 아래, 대각선)
	 * 
	 * enum
	 * 
	 * return 방향
	 */ 
	@Override
	protected int choiceDirection() {
		return 0;
	}
	
	/**
	 * 배열 회전
	 */
	@Override
	protected void rotate() {
		int value = this.circularArray.get(getLastIndex());
		this.circularArray.add(ArrayRotationConstants.FRIST_INDEX, value);
		this.circularArray.remove(getLastIndex());
	}
	
	/**
	 * 배열 마지막 인덱스
	 */
	private int getLastIndex() {
		return circularArray.size() - 1;
	}
	
	/**
	 * 입력받은 인덱스의 배열 값
	 * 
	 * @param 입력받은 인덱스 inputIndex
	 * @return 배열의 값
	 */
	public int getArrayValue(int inputIndex) {
		return circularArray.get(inputIndex);
	}
	
}
