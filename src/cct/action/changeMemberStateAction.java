package cct.action;

import cct.service.changeMemberStateService;
/**
 * @author ����
 * @createDate 2015/5/5
 * @version 1.0
 * @description �ı��û�״̬�Ķ�����
 * @adder ����
 * @addDate 2015/5/5
 * @addContent ���message���ڷ���ִ�н��
 */
public class changeMemberStateAction {
	private String userName;//�û���
	private int state;//���޸ĵ�״̬
	private changeMemberStateService changeMemberStateService;//�ı��û�״̬�Ĵ�����
	private String message;//������Ϣ
	public String execute()
	{
		if(changeMemberStateService.changeMemberState(userName, state)==true)//�޸ĳɹ�
		{
			message="success";
		}
		else{
			message="fail";
		}
		return "success";
	}
	
	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getState() {
		return state;
	}


	public void setState(int state) {
		this.state = state;
	}


	public changeMemberStateService getChangeMemberStateService() {
		return changeMemberStateService;
	}
	public void setChangeMemberStateService(
			changeMemberStateService changeMemberStateService) {
		this.changeMemberStateService = changeMemberStateService;
	}

}
