package cct.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import cct.entity.cctGroup;
import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description ���cctС��Ķ�����
 * @sourseName
 * addGroupAction.java
 * @reName addCctGroupAction.java
 * @rewriter ����
 * @rewriteContent all
 * package cct.action;
//2015-4-19�鿴----����
//2015/4/23��д,����ΪaddCctGroupAction
public class addGroupAction {
	
     private String groupName;//����
     private String headmanA;//�鳤A
     private String category;//С������
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getHeadmanA() {
		return headmanA;
	}
	public void setHeadmanA(String headmanA) {
		this.headmanA = headmanA;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
     public String execute()
     {
    	 return "success";
     }
}
 *
 */
public class addCctGroupAction extends ActionSupport{
	private cctGroup cctGroup;//����ӵ�С��
	private String message;//״̬��Ϣ
	private cctGroupService cctGroupService;//С�����ݿ�����Ĵ���
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public cctGroup getCctGroup() {
		return cctGroup;
	}
                                     
	public cctGroupService getCctGroupService() {
		return cctGroupService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//���Է�����޸����ڸ�ʽ
			String createTime = dateFormat.format( now ); 
			cctGroup.setCreateTime(createTime);
			cctGroup.setEndTime("");
			cctGroup.setGroupBrief("");
			cctGroup.setHeadmanB("");
			cctGroup.setRemarks("");
			cctGroup.setState(0);
			cctGroup.setMember("");
			if(cctGroupService.addGroup(cctGroup)){
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
	
	public void setMessage(String message) {
		this.message = message;
	}

	//setter��getter����
	public void setCctGroup(cctGroup cctGroup) {
		this.cctGroup = cctGroup;
	}
	public void setCctGroupService(cctGroupService cctGroupService) {
		this.cctGroupService = cctGroupService;
	}

	public String getMessage() {
		return message;
	}
	
}
