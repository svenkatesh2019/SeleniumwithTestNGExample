package seleniumwithTestNG;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class TestNGClass {
  @Test
  public void f1() {
	  System.out.println("this is function 1");
  }
  
  @Test
  public void f2() {
	  System.out.println("this is function 2");
  }
  
  @Test
  public void f3() {
	  System.out.println("this is function 3");
  }
  @BeforeMethod
  public void beforemethod_demo()
  {
	  
	  System.out.println("will be executed before every method");
  }
  
  @AfterMethod
  public void aftermethod_demo() {
	  System.out.println("after every method");
  }
  
  @BeforeTest
  public void beforetest_demo()
  {
	  System.out.println("before each test");
  }
  
  @AfterTest
  public void aftertest_Demo()
  {
	  System.out.println("after each test");
  }
  
  
}
