package cct.action;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cct.entity.cctuser;
import cct.service.addUserDetailService;


/**
 * @author  ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ����cct��Ա������Ϣ
 * @see #execute()
 *
 */
public class addUserDetailAction extends ActionSupport{
	

	private static final long serialVersionUID = 1L;
	private cctuser cctuser;
	private addUserDetailService addUserDetailService;//����û���Ϣ�Ĵ�����
	private String message;//�����Ϣ
	/**
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @return success�������Ϣ�ɹ� fail�����ʧ��
	 */
	public String execute()
	{
		cctuser.setUserName(ServletActionContext.getRequest().getSession().getAttribute("userName").toString());
		if(addUserDetailService.addUserDetail(cctuser))
		{
			message="success";
		}
		else 
		{
			message="fail";
		}
			return "success";
		
	}
	public addUserDetailService getAddUserDetailService() {
		return addUserDetailService;
	}
	public void setAddUserDetailService(addUserDetailService addUserDetailService) {
		this.addUserDetailService = addUserDetailService;
	}
	public cctuser getCctuser() {
		return cctuser;
	}
	public void setCctuser(cctuser cctuser) {
		this.cctuser = cctuser;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
