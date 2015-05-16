package cct.entity;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 知识点类别表对应的对象类
 *
 */
public class knowledgeclass {
	private String classId;//小组编号
	private String className;//小组名
	private String classBrief;//小组简介
	private int knowledgeNumber;//知识点编号
	private int visitorVolume;//访问者数量
	private int replyVolume;//回复数
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
