package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description С��׶�ʱ����Ӧ�Ķ�����
 *
 */
public class groupstage {
	private String groupId;//С����
	private String groupStageId;//�׶α���
	private int state;//״̬
	private String startTime;//��ʼʱ��
	private String endTime;//����ʱ��
	private String stageName;//�׶���
	private String goal;//Ŀ��
	public String getGroupId() {
		return groupId;
	}
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}
	public String getGroupStageId() {
		return groupStageId;
	}
	public void setGroupStageId(String groupStageId) {
		this.groupStageId = groupStageId;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getStageName() {
		return stageName;
	}
	public void setStageName(String stageName) {
		this.stageName = stageName;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
}
