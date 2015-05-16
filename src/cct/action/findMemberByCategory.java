package cct.action;

import net.sf.json.JSONObject;
import cct.service.findMemberService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @version 1.0
 * @description ����鿴��Ա
 * @adder ����
 * @addDate 2015/5/9
 * @addContent ���ӷ�ҳ
 * 
 */
public class findMemberByCategory extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String type;
	private int pageNo;// ��ǰҳ��
	private int number;// ÿҳ����
	private JSONObject jsonObj = new JSONObject();
	private findMemberService findMemberService;

	public String execute() {
		jsonObj = findMemberService.findMemberBycategory(type, pageNo, number);
		return Action.SUCCESS;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public JSONObject getJsonObj() {
		return jsonObj;
	}

	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}

	public findMemberService getFindMemberService() {
		return findMemberService;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public void setFindMemberService(findMemberService findMemberService) {
		this.findMemberService = findMemberService;
	}
}
