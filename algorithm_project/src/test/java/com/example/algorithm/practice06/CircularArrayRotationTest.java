package com.example.algorithm.practice06;

import static org.assertj.core.api.Assertions.assertThat;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class CircularArrayRotationTest {
	
	CircularArrayRotation rotation;
	
	private void init(ArrayList<Integer> array) {
		rotation = new CircularArrayRotation(array);
	}
	
	@Test
	public void solveFirstCase() {
		Integer n = 3;
		Integer k = 2;
		Integer q = 3;

		// Array 입력 
		ArrayList<Integer> inputArray = new ArrayList<>();
		inputArray.add(1);
		inputArray.add(2);
		inputArray.add(3);
		
		init(inputArray);
		rotation.calculate(k);
		
		assertThat(rotation.getValue(0)).isEqualTo(2);
		assertThat(rotation.getValue(1)).isEqualTo(3);
		assertThat(rotation.getValue(2)).isEqualTo(1);
	}
	
	@Test
	public void solveSecondCase() throws IOException {
		// console 입력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Integer n = Integer.parseInt(st.nextToken());
		Integer k = Integer.parseInt(st.nextToken());
		Integer q = Integer.parseInt(st.nextToken());

 		// Array 입력 
		ArrayList<Integer> inputArray = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		for (int index = 0; index < n; index++) {
			inputArray.add(Integer.parseInt(st.nextToken()));
		}

		// 계산
		init(inputArray);
		rotation.calculate(k);
		
		// 정답 저장
		int answer[] = {2, 3, 1};
		for (int index = 0; index < q; index++) {
			st = new StringTokenizer(br.readLine());
			int inputIndex = Integer.parseInt(st.nextToken());
			assertThat(rotation.getValue(inputIndex)).isEqualTo(answer[index]);
		}
	}
}
