package cct.action;

import cct.service.alterUserService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/5/4
 * @version 1.0
 * @description �޸ĳ�ԱȨ�޵Ķ�����
 *
 */
public class alterPrivilegeAction extends ActionSupport{
	private alterUserService alterUserService;//�޸��û�Ȩ�޵Ĵ������
	private String userName;//�û���
	private int privilege;//Ȩ��
	private String message;//�������
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
