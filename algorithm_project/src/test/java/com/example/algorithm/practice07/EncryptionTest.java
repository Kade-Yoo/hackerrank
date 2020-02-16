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
		String inputText = "haveaniceday";
		
		encryption.calculateRoot(inputText);
		assertThat(encryption.encryptText(
						encryption.makeMatrix(inputText))).isEqualTo("hae and via ecy");
	}
	
	@Test
	public void test02() {
		String inputText = "a";
		
		encryption.calculateRoot(inputText);
		assertThat(encryption.encryptText(
						encryption.makeMatrix(inputText))).isEqualTo("a");
	}
	
	@Test
	public void test03() {
		String inputText = "feedthedog";
		
		encryption.calculateRoot(inputText);
		assertThat(encryption.encryptText(
						encryption.makeMatrix(inputText))).isEqualTo("fto ehg ee dd");
	}
}
