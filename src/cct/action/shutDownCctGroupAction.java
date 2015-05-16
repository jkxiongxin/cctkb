package cct.action;

import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/5/16
 * @version 1.0
 * @description ����С��
 * 
 */
public class shutDownCctGroupAction extends ActionSupport {
	private String groupId;// С����
	private String message;// ״̬��Ϣ
	private cctGroupService cctGroupService;// С������Ĵ�����

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if (cctGroupService.banCctgroup(groupId) == false)// ����
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
