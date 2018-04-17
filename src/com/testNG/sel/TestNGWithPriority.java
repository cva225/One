package com.testNG.sel;

import org.testng.annotations.Test;
import org.testng.annotations.Test;          /////**depends upon the pripority  tests are
                                                //executed and 
public class TestNGWithPriority {               //if enabled = true (test will executed)
	@Test(priority=3,enabled=true)              //if enabled = false (test will not execute)
	public  void sai() {
		System.out.println("sai mtd");}
	
	@Test(priority=6,enabled=true)
	public  void naga() {
		System.out.println("chanti mtd");}

	@Test(priority=5,enabled=true)
	public  void chanti() {
		System.out.println("Chanti mtd");}
	
	@Test(priority=4,enabled=false)
	public  void vinay() {
		System.out.println("vinay mtd");}
	
	@Test(priority=2,enabled=true)
	public  void sravan() {
		System.out.println("Sravan mtd");}
	
	@Test(priority=1,enabled=false)
	public  void Cva() {
		System.out.println("Cva mtd");}
	
	
	
	
}