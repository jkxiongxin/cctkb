package cct.action;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;
import cct.service.postService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����	
 * @createDate 2015/5/1
 * @version 1.0
 * @description ��ҳ��ѯ�ܱ�
 *
 */
public class getPostAction extends ActionSupport{

	/**
	 * 
	 */
	/**
	 * 
	 */
	private static final long serialVersionUID = 8684796594443397302L;
	private String nickName;//�ǳ�
	private int pageNo;//ҳ��
	private int number;//ÿҳ��¼��
	private postService postService;//������ 
	private JSONObject jsonObj=new JSONObject();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			nickName=(String) ServletActionContext.getRequest().getSession().getAttribute("nickName");
			jsonObj=postService.getPostFY(pageNo, number, nickName);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	public void setPostService(postService postService) {
		this.postService = postService;
	}
	
}
