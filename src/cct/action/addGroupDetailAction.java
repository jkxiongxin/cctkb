package cct.action;

import cct.service.addGroupService;
/**
 * @author ����
 * @CreateDate 2015/4/19
 * @version 1.0
 * @Description :����С���Ӧ��action
 * @UpdateUser:    
 * @UpdateDate:     
 * @UpdateRemark:
 *@see #execute()
 */
public class addGroupDetailAction {
	
	private String groupId;//С����
	private String groupName;//С����
	private String groupBrief;//С����
	private String headmanA;//�鳤A
	private String headmanB;//�鳤B
	private String member;//��Ա
	private String category;//����
	private String createTime;//����ʱ��
	private String endTime;//Ԥ�ƽ���ʱ��
	private int state;//״̬
	private String remarks;//��ע
	private addGroupService addGroupService;//���С��Ĵ������
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getGroupBrief() {
		return groupBrief;
	}
	public void setGroupBrief(String groupBrief) {
		this.groupBrief = groupBrief;
	}
	public String getHeadmanA() {
		return headmanA;
	}
	public void setHeadmanA(String headmanA) {
		this.headmanA = headmanA;
	}
	public String getHeadmanB() {
		return headmanB;
	}
	public void setHeadmanB(String headmanB) {
		this.headmanB = headmanB;
	}
	public String getMember() {
		return member;
	}
	public void setMember(String member) {
		this.member = member;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	

	/**
	 * @author ����
	 * @Discription ʵ�����С�鹦�ܲ��Ҹ���������ؽ��
	 * @return	String
	 * @throws Exception
	 */
	public String execute() throws Exception
	{
		if(addGroupService.addGroup(groupId, groupName, groupBrief, headmanA, headmanB, member, category, createTime, endTime, state, remarks)==true)
			
		return "success";
		return "fail";
	}
	public addGroupService getAddGroupService() {
		return addGroupService;
	}
	public void setAddGroupService(addGroupService addGroupService) {
		this.addGroupService = addGroupService;
	}
}
