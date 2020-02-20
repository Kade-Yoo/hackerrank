package com.example.algorithm.practice08;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BeautifulQuardruplesTest {

	private BeautifulQuardruples beautifulQuardruples;
	
	@BeforeEach
	public void init() {
		beautifulQuardruples = new BeautifulQuardruples();
	}
	
	@Test
	public void solve() {
		int inputNum[] = { 1, 2, 3, 4 };
		
		assertThat(beautifulQuardruples.solve(inputNum[0], inputNum[1], inputNum[2], inputNum[3])).isEqualTo(11);
	}
}
