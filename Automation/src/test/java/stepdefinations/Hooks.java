package stepdefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before("@MobileTest")
	public void beforevalidation() {
		System.out.println("===============Before Mobile Test==================");
	}
	
	@After("@MobileTest")
	public void aftervalidation() {
		System.out.println("===============After Mobile Test==================");
	}
	
	@Before("@WebTest")
	public void beforewebvalidation() {
		System.out.println("===============Before Web Test==================");
	}
	
	@After("@WebTest")
	public void afterwebvalidation() {
		System.out.println("===============After Web Test==================");
	}

}
