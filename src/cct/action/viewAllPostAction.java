package cct.action;

import java.util.List;

import cct.entity.post;
import cct.service.postService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 获得命令，根据用户名从数据库中取出所有
 * 该用户的周报，反馈给页面
 *
 */
@SuppressWarnings("serial")
public class viewAllPostAction extends ActionSupport{
	private postService postService;//周报操作的代理对象
	private String nickName;//查询依据
	private List<post> list;//保存查询结果
	private String message;//查询结果
	/* (non-Javadoc)
	 * @author 熊鑫
	 * @createDate 2015/4/23
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			list=postService.getPostsByNickName(nickName);
			if(list==null)//查询结果为空
			{
				message="no";
			}
			else {
				message="yes";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public List<post> getList() {
		return list;
	}
	public String getMessage() {
		return message;
	}
	public void setPostService(postService postService) {
		this.postService = postService;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	
}
