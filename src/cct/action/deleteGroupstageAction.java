package cct.action;

import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description ɾ��С��׶�
 *
 */
public class deleteGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupStageId;//С��׶εı��
	private String message;//״̬��Ϣ
	private groupstageService groupstageService;//С��׶εĴ���
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
	//getter��setter����
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
