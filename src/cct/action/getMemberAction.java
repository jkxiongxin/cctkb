package cct.action;

import net.sf.json.JSONObject;
import cct.service.viewUsersService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/28
 * @version 1.0
 *
 */
@SuppressWarnings("serial")
public class getMemberAction extends ActionSupport{
	private int pageNo;//页数
	private int number;//查询个数
	
	private viewUsersService viewUsersService;
	JSONObject jsonObj;//返回对象
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			jsonObj=viewUsersService.getUserLimitNo(pageNo, number);
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





	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public void setViewUsersService(viewUsersService viewUsersService) {
		this.viewUsersService = viewUsersService;
	}
}
