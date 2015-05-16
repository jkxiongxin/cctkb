package cct.action;

import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
import cct.service.knowledgeClassService;

/**
 * @author xx
 * @createDate 2015/5/5
 * @version 1.0
 * @description getKnowledgeClass
 */
public class getKnowledgeClassAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONObject jsonObj = new JSONObject();// return message
	private knowledgeClassService knowledgeClassService;//代理对象
	private int pageNo;//页数
	private int number;//每页记录数
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			jsonObj= knowledgeClassService.getKnowledgeclass(pageNo,number);
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

	public knowledgeClassService getKnowledgeClassService() {
		return knowledgeClassService;
	}

	public void setKnowledgeClassService(
			knowledgeClassService knowledgeClassService) {
		this.knowledgeClassService = knowledgeClassService;
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

}
