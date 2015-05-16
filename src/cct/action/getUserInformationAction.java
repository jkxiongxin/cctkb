package cct.action;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONObject;
import cct.entity.cctuser;
import cct.service.getUserInformationService;

import com.opensymphony.xwork2.ActionSupport;

public class getUserInformationAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private getUserInformationService getUserInformationService;
	private JSONObject jsonObj=new JSONObject();
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		String userName=ServletActionContext.getRequest().getSession().getAttribute("userName").toString();
		try {
			cctuser cctuser=getUserInformationService.getCctuser(userName);
			if(cctuser==null)
			{
				jsonObj.put("state", "fail");
			}
			else{
				jsonObj.put("state", "success");
				jsonObj.put("cctuser", cctuser);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public getUserInformationService getgetUserInformationService() {
		return getUserInformationService;
	}
	public void setgetUserInformationService(
			getUserInformationService getUserInformationService) {
		this.getUserInformationService = getUserInformationService;
	}
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	
}
