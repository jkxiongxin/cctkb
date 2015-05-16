package cct.action;

import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/5/5
 * @version 1.0
 * @description 增加知识点的动作类
 *
 */
public class addKnowledgeClassAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private knowledgeclass knowledgeclass;//知识点类别
	private knowledgeClassService knowledgeClassService;//知识点代理
	private String message;//信息
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
