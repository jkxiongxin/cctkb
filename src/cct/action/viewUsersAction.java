package cct.action;



/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 查看所有成员的动作类                                                                                                  
 * @see #execute() 默认方法
 * 2015/4/28废弃
 *
 */
public class viewUsersAction {
	/*private viewUsersService viewUsersService;//查看所有成员的代理对象

	**
	 * @author 李想
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @return fail 成员表为空 success查询成功
	 *
	public String execute()
	{
		  HttpServletRequest request=ServletActionContext.getRequest();
		List<cctuser> List1=null;
		List1=viewUsersService.viewUser();
		request.setAttribute("cctusers", List1);
		if(viewUsersService.viewUser()!=null)//如果查询出结果不为空
		return "success";
		return "fail";
}
	public viewUsersService getViewUsersService() {
		return viewUsersService;
	}
	public void setViewUsersService(viewUsersService viewUsersService) {
		this.viewUsersService = viewUsersService;
	}
	*/
}
