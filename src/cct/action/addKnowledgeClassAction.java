package cct.action;

import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/5/5
 * @version 1.0
 * @description ����֪ʶ��Ķ�����
 *
 */
public class addKnowledgeClassAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private knowledgeclass knowledgeclass;//֪ʶ�����
	private knowledgeClassService knowledgeClassService;//֪ʶ�����
	private String message;//��Ϣ
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(knowledgeClassService.addKnowledgeClass(knowledgeclass).equals("success"))
			{
				message="success";
			}
			else {
				message="fail";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public knowledgeclass getKnowledgeclass() {
		return knowledgeclass;
	}
	public void setKnowledgeclass(knowledgeclass knowledgeclass) {
		this.knowledgeclass = knowledgeclass;
	}
	public knowledgeClassService getKnowledgeClassService() {
		return knowledgeClassService;
	}
	public void setKnowledgeClassService(knowledgeClassService knowledgeClassService) {
		this.knowledgeClassService = knowledgeClassService;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
