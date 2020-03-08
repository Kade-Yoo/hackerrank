package com.example.algorithm.practice10;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElectronicsShopTest {
	private ElectronicsShop shop;

	@BeforeEach
	public void init() {
		shop = new ElectronicsShop();
	}
	
	@Test
	public void solve() {
		int[] keyboards = {3, 1};
		int[] drives = {5, 2, 8};
		int totalCost = 10;
		
		assertThat(shop.getMoneySpent(keyboards, drives, totalCost)).isEqualTo(9);
	}
}
