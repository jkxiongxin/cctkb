package cct.action;

import java.util.List;

import cct.entity.cctGroup;
import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description ���ݹ���Ա�����С����Ϣ���С��
 *
 */
public class viewAllCctGroupAction extends ActionSupport {
	
	/**
	 * 
	 */
	private cctGroupService cctGroupService;
	private List<cctGroup> list;
	private static final long serialVersionUID = 1L;
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			list=cctGroupService.getAllCctGroups();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return SUCCESS;
	}
	public List<cctGroup> getList() {
		return list;
	}
	public void setCctGroupService(cctGroupService cctGroupService) {
		this.cctGroupService = cctGroupService;
	}
}
