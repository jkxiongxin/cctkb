package cct.action;

import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/5/16
 * @version 1.0
 * @description 禁用小组
 * 
 */
public class shutDownCctGroupAction extends ActionSupport {
	private String groupId;// 小组编号
	private String message;// 状态信息
	private cctGroupService cctGroupService;// 小组操作的代理类

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (cctGroupService.banCctgroup(groupId) == false)// 禁用
			{
				message = "fail";
			} else {
				message = "success";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getGroupId() {
		return groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public cctGroupService getCctGroupService() {
		return cctGroupService;
	}

	public void setCctGroupService(cctGroupService cctGroupService) {
		this.cctGroupService = cctGroupService;
	}

}
