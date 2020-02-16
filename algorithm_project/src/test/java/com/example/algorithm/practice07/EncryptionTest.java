package com.example.algorithm.practice07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncryptionTest {
	private Encryption encryption;
	
	/**
	 * @Before은 JUnit 3버전 이전에 사용하던 것
	 * JUnit 4버전 이후에는 @BeforeEach를 사용
	 */
	@BeforeEach
	public void init() {
		encryption = new Encryption();
	}
	
	@Test
	public void test01() {
		String inputStr = "chillout";
		
		encryption.calculateRoot(inputStr);
		assertThat(
				encryption.getResult(
						encryption.divideStr(inputStr))).isEqualTo("a");
	}
}
