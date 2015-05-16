package cct.entity;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 小组阶段时间表对应的对象类
 *
 */
public class groupstage {
	private String groupId;//小组编号
	private String groupStageId;//阶段表编号
	private int state;//状态
	private String startTime;//开始时间
	private String endTime;//结束时间
	private String stageName;//阶段名
	private String goal;//目标
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
