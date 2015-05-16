package cct.action;

import cct.entity.groupstage;
import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 修改阶段的动作类
 *
 */
public class alterGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private groupstage groupstage;//修改后的阶段
	private String message;//结果状态
	private groupstageService groupstageService;//小组阶段的代理类
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			if(groupstageService.alterGroupstage(groupstage))
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
	public String getMessage() {
		return message;
	}
	public void setGroupstage(groupstage groupstage) {
		this.groupstage = groupstage;
	}
	public void setGroupstageService(groupstageService groupstageService) {
		this.groupstageService = groupstageService;
	}

}
