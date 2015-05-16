package cct.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;
import cct.entity.cctuser;
import cct.service.*;


public class findMemberByNameAction extends  ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String realName;
	private findMemberService findMemberService;
	private JSONObject jsonObj=new JSONObject();
     public String execute()
     {
    	 cctuser cctuser=null;
    	 cctuser=findMemberService.findMemberByName(realName);
    	 if(cctuser!=null)
    	 {
    		jsonObj.put("isNull","false");
    		jsonObj.put("userName", cctuser.getUserName());
    		jsonObj.put("realName", cctuser.getRealName());
    		jsonObj.put("nickName", cctuser.getNickName());
    		jsonObj.put("nativePlace", cctuser.getNativePlace());
    		jsonObj.put("privilege", cctuser.getPrivilege());
    		jsonObj.put("theClass", cctuser.getTheClass());
    		jsonObj.put("dormitory", cctuser.getDomitory());
    		jsonObj.put("email", cctuser.getEmail());
    		jsonObj.put("QQ", cctuser.getQq());
    	 }
    	 else {
    		 jsonObj.put("isNull","true");
		}
    	 return Action.SUCCESS;
     }
 	public findMemberService getFindMemberService() {
		return findMemberService;
	}
	public void setFindMemberService(
			findMemberService findMemberService) {
		this.findMemberService = findMemberService;
	}
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
}
