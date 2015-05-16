package cct.action;

import cct.entity.groupstage;
import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description �޸Ľ׶εĶ�����
 *
 */
public class alterGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private groupstage groupstage;//�޸ĺ�Ľ׶�
	private String message;//���״̬
	private groupstageService groupstageService;//С��׶εĴ�����
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
