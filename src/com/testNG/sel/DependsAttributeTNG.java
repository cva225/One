package com.testNG.sel;

import org.testng.annotations.Test;

public class DependsAttributeTNG {
	
	//**"depends" on method level**//::::::::
	
	/*@Test
	public  void soori() {
		System.out.println(" Soori mtd");
	}
	@Test
	public  void purush() {
		System.out.println("puru  mtd");
	}
	@Test
	public  void babu() {
		System.out.println("babu mtd");
	}
	@Test(dependsOnMethods="purush")
	public  void chethan() {
		System.out.println("chethan mtd");}

		
	@Test(dependsOnMethods="soori")
		public  void cav() {
			System.out.println("cva mtd");}

			*/
		
		
/////////////////////////////////////////////////////////////////////////////////////	
	//** "depends" on group Level**//:::::
	
	
	@Test(dependsOnGroups= {"poorna","prabha","krishna"})
	public  void hari() {
		System.out.println(" hari mtd");
	}
	
	@Test(groups= {"krishna"})
	public  void krishna() {
		System.out.println("krishna  mtd");
	}
	
	@Test(groups= {"prabha"})
	public  void Prabha() {
		System.out.println(" prabha mtd");
	}
	@Test(groups= {"Cva"})
	public  void Cva() {
		System.out.println("Cva mtd");
	}
	
	
	@Test(groups= {"poorna"})
	public  void poorna() {
		System.out.println(" poorna mtd");
	}
	@Test
	public  void teja() {
		System.out.println("teja mtd");
	}
	@Test(dependsOnGroups= {"Cva","poorna"})
	public  void sudha() {
		System.out.println(" Sudha mtd");
	}
	
	
	
	
	
	
	
	
}
