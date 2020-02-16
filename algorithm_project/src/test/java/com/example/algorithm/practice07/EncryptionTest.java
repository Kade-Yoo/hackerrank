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
