package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ֪ʶ�������Ӧ�Ķ�����
 *
 */
public class knowledgeclass {
	private String classId;//С����
	private String className;//С����
	private String classBrief;//С����
	private int knowledgeNumber;//֪ʶ����
	private int visitorVolume;//����������
	private int replyVolume;//�ظ���
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getClassBrief() {
		return classBrief;
	}
	public void setClassBrief(String classBrief) {
		this.classBrief = classBrief;
	}
	public int getKnowledgeNumber() {
		return knowledgeNumber;
	}
	public void setKnowledgeNumber(int knowledgeNumber) {
		this.knowledgeNumber = knowledgeNumber;
	}
	public int getVisitorVolume() {
		return visitorVolume;
	}
	public void setVisitorVolume(int visitorVolume) {
		this.visitorVolume = visitorVolume;
	}
	public int getReplyVolume() {
		return replyVolume;
	}
	public void setReplyVolume(int replyVolume) {
		this.replyVolume = replyVolume;
	}
}
