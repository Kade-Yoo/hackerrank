package com.example.algorithm.practice08;

import java.util.ArrayList;

public class BeautifulQuardruples {

	private ArrayList<Number> front;
	private ArrayList<Number> rear;
	private int count;
	private int equalCount;
	
	public BeautifulQuardruples() {
		this.front = new ArrayList<>();
		this.rear = new ArrayList<>();
		this.count = 0;
		this.equalCount = 0;
	}
	
	public int solve(int A, int B, int C, int D) {
		setNumber(front, A, B);
		setNumber(rear, C, D);
		setCount();
		setEqualNumCount();
		
		return this.count - this.equalCount;
	}
	
	/**
	 * ����� ���� ���ؼ� �־��ش�.
	 * 
	 * @param �Է¹��� ���� number
	 */
	private ArrayList<Number> setNumber(ArrayList<Number> number, int firstRange, int secondRange) {
		Number tempNumber = new Number();
		
		for(int firstIndex = 1; firstIndex < firstRange; firstIndex++) {
			for(int secondIndex = 1; secondIndex < secondRange; secondIndex++) {
				tempNumber.setFirstNum(firstIndex);
				tempNumber.setSecondNum(secondIndex);
				number.add(tempNumber);
				System.out.println("temp First Num : " + tempNumber.getFirstNum());
				System.out.println("temp Second Num : " + tempNumber.getSecondNum());
			}
		}
		
		return number;
	}
	
	// ��ü count
	private void setCount() {
		this.count = front.size() + rear.size();
	}
	
	// ���ڰ� ��� �������
	private void setEqualNumCount() {
		for(Number frontNumber : this.front) {
			for(Number rearNumber : this.rear) {
				if(frontNumber.getFirstNum() == frontNumber.getSecondNum()
						&& frontNumber.getFirstNum() == rearNumber.getFirstNum()
						&& frontNumber.getSecondNum() == rearNumber.getSecondNum()) {
					this.equalCount++;
					System.out.println("equal Count : "+this.equalCount);
				}
			}
		}
	}
}
