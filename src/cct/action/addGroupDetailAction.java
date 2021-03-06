package cct.action;

import cct.service.addGroupService;
/**
 * @author 李想
 * @CreateDate 2015/4/19
 * @version 1.0
 * @Description :增加小组对应的action
 * @UpdateUser:    
 * @UpdateDate:     
 * @UpdateRemark:
 *@see #execute()
 */
public class addGroupDetailAction {
	
	private String groupId;//小组编号
	private String groupName;//小组名
	private String groupBrief;//小组简介
	private String headmanA;//组长A
	private String headmanB;//组长B
	private String member;//成员
	private String category;//类型
	private String createTime;//创建时间
	private String endTime;//预计结束时间
	private int state;//状态
	private String remarks;//备注
	private addGroupService addGroupService;//添加小组的代理对象
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
	 * @author 李想
	 * @Discription 实现添加小组功能并且根据情况返回结果
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
