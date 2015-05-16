package cct.action;

import cct.service.changeMemberStateService;
/**
 * @author 李想
 * @createDate 2015/5/5
 * @version 1.0
 * @description 改变用户状态的动作类
 * @adder 熊鑫
 * @addDate 2015/5/5
 * @addContent 添加message用于返回执行结果
 */
public class changeMemberStateAction {
	private String userName;//用户名
	private int state;//欲修改的状态
	private changeMemberStateService changeMemberStateService;//改变用户状态的代理类
	private String message;//返回信息
	public String execute()
	{
		if(changeMemberStateService.changeMemberState(userName, state)==true)//修改成功
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
