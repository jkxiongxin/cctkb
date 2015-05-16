package cct.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import cct.entity.cctuser;
import cct.service.loginService;

import com.opensymphony.xwork2.ActionSupport;



/**
 * @author ����
 * @see #execute()
 * @CreateDate 2015/4/20
 * @Description ��½�Ķ�����
 * @version 1.0
 * @rewriter ����	
 * @rewriteDate 2015/4/30
 * @rewriteContent ��д��½����
 */
public class loginAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    private String userName;//�û���
     private String password;//����
     private loginService loginService;//��½�����Ĵ�����
     private String message;//״̬��Ϣ
    /* (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     * @CreateDate 2015/4/20
     * @version 1.0
     * @author ����
     * @return success��½�ɹ� fail��½ʧ��
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
				if(session.getAttribute(userName)==null)//�ж��û��Ƿ��½
				{
					if(loginService==null||userName==null)//�ж�loginService��userName�Ƿ�ע��
					{
						message="loginWrong";
						return SUCCESS;
					}
					else
					{
						cctuser=loginService.login(userName, password);
						if(cctuser==null)//�û��������벻��ȷ
						{
							message="error";
							return SUCCESS;
						}
						else if(cctuser.getState()==2){//�û�������
							message="ban";
							return SUCCESS;
						}
						else{//��½�ɹ�
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
			message="loginWrong";//��½����
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
