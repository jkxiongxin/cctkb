package cct.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cct.entity.cctuser;
import cct.service.loginService;

import com.opensymphony.xwork2.ActionSupport;



/**
 * @author 李想
 * @see #execute()
 * @CreateDate 2015/4/20
 * @Description 登陆的动作类
 * @version 1.0
 * @rewriter 熊鑫	
 * @rewriteDate 2015/4/30
 * @rewriteContent 重写登陆方法
 */
public class loginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String userName;//用户名
     private String password;//密码
     private loginService loginService;//登陆动作的代理类
     private String message;//状态信息
    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     * @CreateDate 2015/4/20
     * @version 1.0
     * @author 李想
     * @return success登陆成功 fail登陆失败
     */
    public String execute()
    {	
    	HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session=request.getSession();
		try
		{ 
			cctuser cctuser=null;
			if(userName!=null)
			{
				if(session.getAttribute(userName)==null)//判断用户是否登陆
				{
					if(loginService==null||userName==null)//判断loginService和userName是否被注入
					{
						message="loginWrong";
						return SUCCESS;
					}
					else
					{
						cctuser=loginService.login(userName, password);
						if(cctuser==null)//用户名或密码不正确
						{
							message="error";
							return SUCCESS;
						}
						else if(cctuser.getState()==2){//用户被禁用
							message="ban";
							return SUCCESS;
						}
						else{//登陆成功
							session.setAttribute("userName", userName);
							session.setAttribute("nickName", cctuser.getNickName());
							session.setAttribute("privilege", cctuser.getPrivilege());
							message="success";
							return SUCCESS;
						}
					}
				}
			}
		}
		catch(Exception e)
		{
			message="loginWrong";//登陆出错
			e.printStackTrace();
			return SUCCESS;
		}
		return SUCCESS;
    }
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public loginService getLoginService() {
		return loginService;
	}
	public void setLoginService(loginService loginService) {
		this.loginService = loginService;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	

	
}
