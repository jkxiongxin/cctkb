package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description С����Ӧ�Ķ�����
 * @rewriteDate 2015/4/23
 * @rewriteContent
 * ��������ΪcctGroup
 *
 */
public class cctGroup {
	private String groupId;//С����
	private String groupName;//С����
	private String groupBrief;//С����
	private String headmanA;//�鳤A
	private String headmanB;//�鳤B
	private String member;//��Ա
	private String category;//С������
	private String createTime;//����ʱ��
	private String endTime;//����ʱ��
	private int state;//״̬
	private String remarks;//��ע
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
}
