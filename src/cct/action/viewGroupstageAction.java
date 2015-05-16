package cct.action;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.groupstage;
import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 查看阶段的动作类
 *
 */
public class viewGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupId;//小组号
	private List<groupstage> list;//阶段列表
	private String message;//状态信息
	private groupstageService groupstageService;//小组阶段代理
	private JSONObject jObject;//返回载体
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			list=groupstageService.getAllGroupstage(groupId);
			if(list.size()!=-1)
			{
				message="success";
			}
			else {
				message="fail";
			}
			jObject.put("list", list);
			jObject.put("message", message);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	//getter和setter方法
	public void setjObject(JSONObject jObject) {
		this.jObject = jObject;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}
	
}
