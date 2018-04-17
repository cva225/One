package com.testNG.sel;

import org.testng.annotations.Test;

public class GroupingMechanismInTNG {
	
	/*@Test(groups="a1")
	public  void ram() {
		System.out.println("ram mtd");
	}
	@Test(groups="a2")
	public  void lakshmi() {
		System.out.println("lakshmi mtd");
	}
	
	@Test(groups="a3")
	public  void cva() {
		System.out.println("cva mtd");
	}
	
	@Test(groups="a4")
	public  void hari() {
		System.out.println("hari mtd");
	}
	*/
	
	
////////////////////////////////////////////////////////////////////////////////////////
	//***groupping mechanism with multiple groups****/////::::::

	@Test(groups= {"rt","st"})
	private void m1() {
		System.out.println("m1 mtd st and rt");
       }
	
	@Test(groups= {"rt"})
	private void m2() {
		System.out.println("m2 mtd rt");
       }
	
	@Test(groups= {"st"})
	private void m3() {
		System.out.println("m3 mtd st");
       }
	
	@Test(groups= {"rt","st","cva"})
	private void m4() {
		System.out.println("m4 mtd rt,st,cva");
       }
	
	/*@Test(groups= {})
	private void m5() {
		System.out.println("m5 mtd");
       }*/
	
	
	
	
}
