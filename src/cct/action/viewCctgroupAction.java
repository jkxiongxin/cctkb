package cct.action;

import java.util.List;

import net.sf.json.JSONObject;
import cct.entity.cctGroup;
import cct.service.viewCctgroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @description 通过状态查看小组
 * @version 1.0
 * @createDate 2015/5/16
 */
public class viewCctgroupAction extends ActionSupport{
	private int pageNo;//页码
	private int number;//每页数量
	private int state;//小组状态
	private viewCctgroupService viewCctgroupService;//查看小组的代理类
	private JSONObject jsonObj=new JSONObject();;//返回对象
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<cctGroup> list=viewCctgroupService.getCctGroups(pageNo, number, state);
			if(list==null||list.size()<=0)//无结果
			{
				jsonObj.put("state", "fail");//失败
			}
			else {
				jsonObj.put("list", list);
				jsonObj.put("state", "success");//成功
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
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
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public viewCctgroupService getViewCctgroupService() {
		return viewCctgroupService;
	}
	public void setViewCctgroupService(viewCctgroupService viewCctgroupService) {
		this.viewCctgroupService = viewCctgroupService;
	}
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	
}
