package cct.action;

import net.sf.json.JSONObject;

import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @version 1.0
 * @createDate 2015/5/1
 * @description 分页查询
 *
 */
@SuppressWarnings("serial")
public class getGroupAction extends ActionSupport{
	private JSONObject jsonObj=new JSONObject();//返回对象
	private int pageNo;//页数
	private int number;//每页大小
	private cctGroupService cctGroupService;//数据库操作对象
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			jsonObj=cctGroupService.getCctGroupFY(pageNo, number);
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
	public void setCctGroupService(cctGroupService cctGroupService) {
		this.cctGroupService = cctGroupService;
	}
	
}
