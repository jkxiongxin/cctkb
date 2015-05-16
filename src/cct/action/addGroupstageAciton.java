package cct.action;

import cct.entity.groupstage;
import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 阶段添加的动作类
 *
 */
public class addGroupstageAciton extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private groupstageService groupstageService;
	private groupstage groupstage;
	private String message;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(groupstageService.addGroupstage(groupstage)!=true)
			{
				message="fail";
			}
			else {
				message="success";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	//getter和setter方法
	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}
	public void setGroupstage(groupstage groupstage) {
		this.groupstage = groupstage;
	}
	public String getMessage() {
		return message;
	}
}
