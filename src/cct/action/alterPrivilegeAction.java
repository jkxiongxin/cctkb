package cct.action;

import cct.service.alterUserService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/5/4
 * @version 1.0
 * @description 修改成员权限的动作类
 *
 */
public class alterPrivilegeAction extends ActionSupport{
	private alterUserService alterUserService;//修改用户权限的代理对象
	private String userName;//用户名
	private int privilege;//权限
	private String message;//操作结果
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			message=alterUserService.alterUserPrivilege(userName, privilege);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public alterUserService getAlterUserService() {
		return alterUserService;
	}
	public void setAlterUserService(alterUserService alterUserService) {
		this.alterUserService = alterUserService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
