package cct.action;

import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

import com.opensymphony.xwork2.ActionSupport;

public class updateKnowledgeClassAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private knowledgeclass knowledgeclass;
	private knowledgeClassService knowledgeClassService;
	private String message;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(knowledgeClassService.updateKnowledgeClass(knowledgeclass).equals("success"))
			{
				message="success";//更新知识点成功
			}
			else {
				message="fail";//修改知识点失败
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
