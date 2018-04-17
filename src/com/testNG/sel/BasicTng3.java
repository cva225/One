package com.testNG.sel;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicTng3 {
	@Test
	public  void bb1() {
		System.out.println("bb1 mtd");
	}
	@Test
	public  void bb2() {
		System.out.println("bb2 mtd");
		}
	@Test
	public  void bb3() {
		System.out.println("bb3 mtd");
	}

}


///testng1.xml    (BasicTNG,BasicTng2,BasicTng3 are executed in alphabetical order)