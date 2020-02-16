package com.example.algorithm.practice07;

import com.example.algorithm.practice07.model.Matrix;

/**
 * 1번 trim
 * 2번 length
 * 3번 올림, 내림
 * 4번 문자열 배열로 변환
 * 5번 암호화된 문자열 출력
 */
public class Encryption {
	private Matrix matrix;
	
	public Encryption() {
		this.matrix = new Matrix();
	}

	/**
	 * Root 계산 함수
	 * @param 암호화할 문자열 inputText
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
	 * 입력받은 문자를 행렬로 만드는 함수
	 * row * column
	 * 
	 * @param 암호화할 문자열 inputText
	 * @return 행렬
	 */
	public String[] makeMatrix(String inputText) {
		String[] matrixArr = new String[this.matrix.getRowSize()];
		int columnSize = this.matrix.getColumnSize();
		
		for(int rowIndex = 0; rowIndex < matrixArr.length; rowIndex++) {
			String tempText = "";		
			// Text를 column 크기로 나눔
			for(int columnIndex = columnSize * rowIndex;
					columnIndex <  columnSize * (rowIndex + 1); 
					columnIndex++) {
				// 입력 문자열 길이보다 크거나 같을 경우
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
	 * 암호화 함수
	 * 
	 * @param 행렬 matrixArr
	 * @return 암호화된 문자열
	 */
	public String encryptText(String[] matrixArr) {
		String encryptedText = "";
		int columnSize = matrix.getColumnSize();
		
		for(int columnIndex = 0; columnIndex < columnSize; columnIndex++) {
			for(int rowIndex = 0; rowIndex < matrixArr.length; rowIndex++) {
				// Text 길이까지만 사용
				if(columnIndex < matrixArr[rowIndex].length() ) {
					encryptedText += matrixArr[rowIndex].charAt(columnIndex);
				}
			}
			
			// 빈칸 삽입
			encryptedText += ((columnIndex == columnSize -1) ? "" : " "); 
		}
		return encryptedText;
	}
}
