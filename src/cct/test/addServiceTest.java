package cct.test;


import org.junit.BeforeClass;
import org.junit.Test;
import cct.service.addUserService;

public class addServiceTest extends baseTest {
	private addUserService addUserService;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		String userName="аміЮ";
		try{
			Boolean a=addUserService.addUser(userName);
			System.out.print(a);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		fail("Not yet implemented");
		
	}

	public void setAddUserService(addUserService addUserService) {
		this.addUserService = addUserService;
	}
	public addUserService getAddUserService() {
		return addUserService;
	}
}
