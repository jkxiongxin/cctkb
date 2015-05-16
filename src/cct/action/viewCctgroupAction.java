package cct.action;

import java.util.List;

import net.sf.json.JSONObject;
import cct.entity.cctGroup;
import cct.service.viewCctgroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @description ͨ��״̬�鿴С��
 * @version 1.0
 * @createDate 2015/5/16
 */
public class viewCctgroupAction extends ActionSupport{
	private int pageNo;//ҳ��
	private int number;//ÿҳ����
	private int state;//С��״̬
	private viewCctgroupService viewCctgroupService;//�鿴С��Ĵ�����
	private JSONObject jsonObj=new JSONObject();;//���ض���
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			List<cctGroup> list=viewCctgroupService.getCctGroups(pageNo, number, state);
			if(list==null||list.size()<=0)//�޽��
			{
				jsonObj.put("state", "fail");//ʧ��
			}
			else {
				jsonObj.put("list", list);
				jsonObj.put("state", "success");//�ɹ�
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
