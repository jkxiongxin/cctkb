package cct.test;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.test.AbstractTransactionalSpringContextTests;

public class baseTest extends AbstractTransactionalSpringContextTests{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	public static void print(String a){
		System.out.print(a);
	}
	public String[] getConfigLocations() {
	    String[] configLocations = { "file:src/applicationContext.xml"};
	    return configLocations;
	}
}
