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
	 * �� �� ȸ���� ������ ���
	 * 
	 * @param ȸ�� Ƚ�� RotationCount
	 */
	@Override
	public void calculate(int RotationCount) {
		for (int index = ArrayRotationConstants.FRIST_INDEX; index < RotationCount; index++) {
			rotate();
		}
	}

	/**
	 * ���� ���� (������, ����, ��, �Ʒ�, �밢��)
	 * 
	 * enum
	 * 
	 * return ����
	 */ 
	@Override
	protected int choiceDirection() {
		return 0;
	}
	
	/**
	 * �迭 ȸ��
	 */
	@Override
	protected void rotate() {
		int value = this.circularArray.get(getLastIndex());
		this.circularArray.add(ArrayRotationConstants.FRIST_INDEX, value);
		this.circularArray.remove(getLastIndex());
	}
	
	/**
	 * �迭 ������ �ε���
	 */
	private int getLastIndex() {
		return circularArray.size() - 1;
	}
	
	/**
	 * �Է¹��� �ε����� �迭 ��
	 * 
	 * @param �Է¹��� �ε��� inputIndex
	 * @return �迭�� ��
	 */
	public int getArrayValue(int inputIndex) {
		return circularArray.get(inputIndex);
	}
	
}
