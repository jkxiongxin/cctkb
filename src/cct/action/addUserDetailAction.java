package cct.action;


import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cct.entity.cctuser;
import cct.service.addUserDetailService;


/**
 * @author  李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 新增cct成员具体信息
 * @see #execute()
 *
 */
public class addUserDetailAction extends ActionSupport{
	

	private static final long serialVersionUID = 1L;
	private cctuser cctuser;
	private addUserDetailService addUserDetailService;//添加用户信息的代理类
	private String message;//结果信息
	/**
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @return success即添加信息成功 fail即添加失败
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
