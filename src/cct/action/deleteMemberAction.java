package cct.action;

import com.opensymphony.xwork2.ActionSupport;

import cct.service.deleteMemeberService;
/**
 * @author ����
 * @createDate 2015/5/5
 * @version 1.0
 * @description ɾ����Ա�Ķ�����
 *
 */
public class deleteMemberAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;//�û���
	private deleteMemeberService deleteMemberService;//ɾ���û��Ĵ������
	private String message;//�������
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public deleteMemeberService getDeleteMemberService() {
		return deleteMemberService;
	}
	public void setDeleteMemberService(deleteMemeberService deleteMemberService) {
		this.deleteMemberService = deleteMemberService;
	}
	public String execute()
	{
		if(deleteMemberService.deleteMember(userName)==true)
			message="success";
		else
			message="fail";
		return SUCCESS;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
