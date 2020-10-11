package demo;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParametersDemo {

	@Test(priority=1, dependsOnGroups= {"smoke.*"})
	@Parameters({"MyName"})
	public void test1(@Optional("Lois") String name) {
		System.out.println("Inside Test 1");
		System.out.println("Name is: " + name);
	}
	
	@Test(priority=2)
	public void test2() {
		System.out.println("Inside Test 2");
	}
	
	@Test(groups=("smoke1"))
	public void test3() {
		System.out.println("Inside Test 3");
	}
}
