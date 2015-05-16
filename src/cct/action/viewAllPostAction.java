package cct.action;

import java.util.List;

import cct.entity.post;
import cct.service.postService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description �����������û��������ݿ���ȡ������
 * ���û����ܱ���������ҳ��
 *
 */
@SuppressWarnings("serial")
public class viewAllPostAction extends ActionSupport{
	private postService postService;//�ܱ������Ĵ������
	private String nickName;//��ѯ����
	private List<post> list;//�����ѯ���
	private String message;//��ѯ���
	/* (non-Javadoc)
	 * @author ����
	 * @createDate 2015/4/23
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			list=postService.getPostsByNickName(nickName);
			if(list==null)//��ѯ���Ϊ��
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
