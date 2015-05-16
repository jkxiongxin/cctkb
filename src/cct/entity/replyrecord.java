package cct.entity;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 回复表对应的对象类
 *
 */
public class replyrecord {
	private int replyId;//回复编号
	private String knowledgeId;//知识编号
	private int replyClass;//回复类别
	private String nickName;//昵称
	private String content;//内容
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public String getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getReplyClass() {
		return replyClass;
	}
	public void setReplyClass(int replyClass) {
		this.replyClass = replyClass;
	}
	
}
