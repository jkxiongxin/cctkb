package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �ظ����Ӧ�Ķ�����
 *
 */
public class replyrecord {
	private int replyId;//�ظ����
	private String knowledgeId;//֪ʶ���
	private int replyClass;//�ظ����
	private String nickName;//�ǳ�
	private String content;//����
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
