package cct.action;

import com.opensymphony.xwork2.ActionSupport;

import cct.service.addUserService;
/**
 * @author ����
 *@version 1.0
 *@see #execute()
 *@CreateDate 2015/4/19
 *@Description ����³�Ա��action
 *@alterMan ����
 *@alterDate 2015/4/30
 *@alterContent ɾ������������cctuser,����message��Ϊajax���ز���
 */
public class addUserAction extends ActionSupport{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;//�û���
	private addUserService addUserService;//����û����ܵ�service
	private String message;//������Ϣ
	public String getMessage() {
		return message;
	}
    /**
     * @author ����
     * @Version 1.0
     * @Description ����addUserService����Ӧ������cct��Ա���������ݿ���
     * @return String
     */
    public String execute()
    {
    	if(addUserService.addUser(userName)==true)
    	{
    		message="��ӳɹ�";
    		return "success";
    	}
    	else
    	{
    		message="���ʧ�ܣ����û��Ѵ���";
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
