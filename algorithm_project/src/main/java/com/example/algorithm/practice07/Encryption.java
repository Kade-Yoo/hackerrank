package com.example.algorithm.practice07;

import com.example.algorithm.practice07.model.Matrix;

public class Encryption {
	private Matrix matrix;
	
	public Encryption() {
		this.matrix = new Matrix();
	}

	/**
	 * 1번 trim
	 * 2번 length
	 * 3번 올림, 내림
	 * 4번 문자열 나누기
	 * 5번 문자열 출력
	 */
	public void calculateRoot(String inputText) {
		int strSize = inputText.trim().length();
		
		for(int index = strSize; index > 0; index--) {
			if((index * index) < strSize 
				&& strSize < ((index + 1) * (index + 1))) {
				matrix.setRowSize(index);
				matrix.setColumnSize(index + 1);
				break;
			} else if(index * index == strSize){
				matrix.setRowSize(index);
				matrix.setColumnSize(index);
				break;
			}
		}
		
		int rowSize = matrix.getRowSize();
		if(rowSize * matrix.getColumnSize() < strSize) {
			matrix.setRowSize(rowSize + 1);
		}
	}
	
	public String[] divideStr(String inputText) {
		String[] answer=new String[matrix.getRowSize()];
		int columnSize = matrix.getColumnSize();
		
		for(int rowIndex = 0; rowIndex < answer.length; rowIndex++) {
			String tempStr = "";		
			for(int columnIndex = columnSize * rowIndex;columnIndex <  columnSize * (rowIndex+1); columnIndex++) {
				if(columnIndex >= inputText.length()) {
                    break;
                }
				tempStr += inputText.charAt(columnIndex);
			}
			answer[rowIndex] = tempStr;
		}
		return answer;
	}
	
	public String getResult(String[] strEncrypted) {
		String resultText = "";
		int columnSize = matrix.getColumnSize();
		
		for(int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
			for(int rowIndex = 0; rowIndex < strEncrypted.length; rowIndex++) {
				if(columnIndex < strEncrypted[rowIndex].length() ) {
					resultText += strEncrypted[rowIndex].charAt(columnIndex);
				}
			}
			
			resultText += ((columnIndex == columnSize -1) ? "" : " "); 
		}
		return resultText;
	}
}
