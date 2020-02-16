package com.example.algorithm.practice07;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EncryptionTest {
	private Encryption encryption;
	
	/**
	 * @Before�� JUnit 3���� ������ ����ϴ� ��
	 * JUnit 4���� ���Ŀ��� @BeforeEach�� ���
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
