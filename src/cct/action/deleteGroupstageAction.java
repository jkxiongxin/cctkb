package cct.action;

import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 删除小组阶段
 *
 */
public class deleteGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupStageId;//小组阶段的编号
	private String message;//状态信息
	private groupstageService groupstageService;//小组阶段的代理
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(groupstageService.deleteGroupstage(groupStageId))
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
	//getter和setter方法
	public String getMessage() {
		return message;
	}
	public void setGroupStageId(String groupStageId) {
		this.groupStageId = groupStageId;
	}
	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}
	
}
