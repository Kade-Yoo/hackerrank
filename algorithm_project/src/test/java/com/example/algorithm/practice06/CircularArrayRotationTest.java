package com.example.algorithm.practice06;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.junit.jupiter.api.Test;

import com.example.algorithm.practice06.service.CircularArrayRotation;
import com.example.algorithm.practice06.service.impl.CircularArrayRotationImpl;
import com.example.algorithm.practice06.util.ArrayUtils;

public class CircularArrayRotationTest {
	
	CircularArrayRotation rotation;
	
	private void init(ArrayList<Integer> array) {
		rotation = new CircularArrayRotationImpl(array);
	}
	
	@Test
	public void solveFirstCase() {
		// Array �Է� 
		ArrayList<Integer> inputArray = new ArrayList<>();
		inputArray.add(1);
		inputArray.add(2);
		inputArray.add(3);
		
		// �ʱ�ȭ
		init(inputArray);
		// ȸ��
		rotation.calculate(2);
		
		assertThat(rotation.getArrayValue(0)).isEqualTo(2);
		assertThat(rotation.getArrayValue(1)).isEqualTo(3);
		assertThat(rotation.getArrayValue(2)).isEqualTo(1);
	}
	
	@Test
	public void solveTempCase() {
		// Array �Է� 
		Integer input[] = {1, 2, 3};
		ArrayList<Integer> inputArray = ArrayUtils.asArrayList(input);
		
		// �ʱ�ȭ
		init(inputArray);
		// ȸ��
		rotation.calculate(2);
		
		assertThat(rotation.getArrayValue(0)).isEqualTo(2);
		assertThat(rotation.getArrayValue(1)).isEqualTo(3);
		assertThat(rotation.getArrayValue(2)).isEqualTo(1);
	}
	
	@Test
	public void solveSecondCase() throws IOException {
		// console �Է�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Integer n = Integer.parseInt(st.nextToken());
		Integer k = Integer.parseInt(st.nextToken());
		Integer q = Integer.parseInt(st.nextToken());

 		// Array �Է� 
		ArrayList<Integer> inputArray = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int index = 0; index < n; index++) {
			inputArray.add(Integer.parseInt(st.nextToken()));
		}

		// �ʱ�ȭ
		init(inputArray);
		// �迭 ȸ��
		rotation.calculate(k);
		
		// ���� ����
		int answer[] = {2, 3, 1};
		for (int index = 0; index < q; index++) {
			// console �Է�
			st = new StringTokenizer(br.readLine());
			int inputIndex = Integer.parseInt(st.nextToken());
			
			assertThat(rotation.getArrayValue(inputIndex)).isEqualTo(answer[index]);
		}
	}
}
