package com.example.algorithm.practice07;

import com.example.algorithm.practice07.model.Matrix;

/**
 * 1�� trim
 * 2�� length
 * 3�� �ø�, ����
 * 4�� ���ڿ� �迭�� ��ȯ
 * 5�� ��ȣȭ�� ���ڿ� ���
 */
public class Encryption {
	private Matrix matrix;
	
	public Encryption() {
		this.matrix = new Matrix();
	}

	/**
	 * Root ��� �Լ�
	 * @param ��ȣȭ�� ���ڿ� inputText
	 */
	public void calculateRoot(String inputText) {
		int textSize = inputText.trim().length();
		
		for(int index = 1; index < textSize; index++) {
			int lower = index * index;
			int greater = (index + 1) * (index + 1);
			
			if(lower < textSize && textSize < greater) {
				matrix.setRowSize(index);
				matrix.setColumnSize(index + 1);
				break;
			} else if(lower == textSize){
				matrix.setRowSize(index);
				matrix.setColumnSize(index);
				break;
			}
		}
		
		// rowSize * column >= textSize
		int rowSize = matrix.getRowSize();
		if(rowSize * matrix.getColumnSize() < textSize) {
			matrix.setRowSize(rowSize + 1);
		}
	}
	
	/**
	 * �Է¹��� ���ڸ� ��ķ� ����� �Լ�
	 * row * column
	 * 
	 * @param ��ȣȭ�� ���ڿ� inputText
	 * @return ���
	 */
	public String[] makeMatrix(String inputText) {
		String[] matrixArr = new String[this.matrix.getRowSize()];
		int columnSize = this.matrix.getColumnSize();
		
		for(int rowIndex = 0; rowIndex < matrixArr.length; rowIndex++) {
			String tempText = "";		
			// Text�� column ũ��� ����
			for(int columnIndex = columnSize * rowIndex;
					columnIndex <  columnSize * (rowIndex + 1); 
					columnIndex++) {
				// �Է� ���ڿ� ���̺��� ũ�ų� ���� ���
				if(columnIndex >= inputText.length()) {
                    break;
                }
				tempText += inputText.charAt(columnIndex);
			}
			matrixArr[rowIndex] = tempText;
		}
		return matrixArr;
	}
	
	/**
	 * ��ȣȭ �Լ�
	 * 
	 * @param ��� matrixArr
	 * @return ��ȣȭ�� ���ڿ�
	 */
	public String encryptText(String[] matrixArr) {
		String encryptedText = "";
		int columnSize = matrix.getColumnSize();
		
		for(int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
			for(int rowIndex = 0; rowIndex < matrixArr.length; rowIndex++) {
				// Text ���̱����� ���
				if(columnIndex < matrixArr[rowIndex].length() ) {
					encryptedText += matrixArr[rowIndex].charAt(columnIndex);
				}
			}
			
			// ��ĭ ����
			encryptedText += ((columnIndex == columnSize -1) ? "" : " "); 
		}
		return encryptedText;
	}
}
