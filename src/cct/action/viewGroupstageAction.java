package cct.action;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.groupstage;
import cct.service.groupstageService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description �鿴�׶εĶ�����
 *
 */
public class viewGroupstageAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String groupId;//С���
	private List<groupstage> list;//�׶��б�
	private String message;//״̬��Ϣ
	private groupstageService groupstageService;//С��׶δ���
	private JSONObject jObject;//��������
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
	//getter��setter����
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
