package com.ust.test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ThirdTest {
  @Test(priority=1,description="this is executed first")
  public void f() 
  {
	  System.out.println("from test method f()");
  }
  @Test(priority=2,description="this is executed second based on priority")
  public void a()
  {
	  System.out.println("from test method a()");
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("from beforetest()");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("from aftertest()");
  }
}
