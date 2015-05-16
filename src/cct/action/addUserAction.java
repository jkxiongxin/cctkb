package cct.action;

import com.opensymphony.xwork2.ActionSupport;

import cct.service.addUserService;
/**
 * @author 李想
 *@version 1.0
 *@see #execute()
 *@CreateDate 2015/4/19
 *@Description 添加新成员的action
 *@alterMan 熊鑫
 *@alterDate 2015/4/30
 *@alterContent 删除了无用属性cctuser,并将message作为ajax返回参数
 */
public class addUserAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;//用户名
	private addUserService addUserService;//添加用户功能的service
	private String message;//反馈信息
	public String getMessage() {
		return message;
	}
    /**
     * @author 李想
     * @Version 1.0
     * @Description 调用addUserService的相应方法将cct成员保存至数据库中
     * @return String
     */
    public String execute()
    {
    	if(addUserService.addUser(userName)==true)
    	{
    		message="添加成功";
    		return "success";
    	}
    	else
    	{
    		message="添加失败，该用户已存在";
    		return SUCCESS;
    	}
    }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public addUserService getAddUserService() {
		return addUserService;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setAddUserService(addUserService addUserService) {
		this.addUserService = addUserService;
	}

}
