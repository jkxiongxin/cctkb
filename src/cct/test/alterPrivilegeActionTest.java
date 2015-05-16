package cct.test;

import org.junit.BeforeClass;
import org.junit.Test;

import cct.action.alterPrivilegeAction;

public class alterPrivilegeActionTest extends baseTest{
	private alterPrivilegeAction alterPrivilegeAction;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test() {
		try {
			alterPrivilegeAction.setUserName("1");
			alterPrivilegeAction.setPrivilege(1);
			alterPrivilegeAction.execute();
			print(alterPrivilegeAction.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	public alterPrivilegeAction getAlterPrivilegeAction() {
		return alterPrivilegeAction;
	}

	public void setAlterPrivilegeAction(alterPrivilegeAction alterPrivilegeAction) {
		this.alterPrivilegeAction = alterPrivilegeAction;
	}

}
