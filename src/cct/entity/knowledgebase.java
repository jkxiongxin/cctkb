package cct.entity;


/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ֪ʶ����Ӧ�Ķ�����
 * @rewriter ����
 * @rewriteDate 2015/4/21
 * @RewriteSource
 * 	private String title;//����
	private String knowledgeId;//֪ʶ����
	@SuppressWarnings("rawtypes")
	private java.util.Set replyrecords;//�ظ���
	private String uploader;//�ϴ���
	private String content;//����
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	private String createTime;
	private int attention;
	private String saveUrl;
	private String attachmentA;
	private String attachmentB;
	private String attachmentC;
	private int state;
	private String auditor;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public String getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	public String getSaveUrl() {
		return saveUrl;
	}
	public void setSaveUrl(String saveUrl) {
		this.saveUrl = saveUrl;
	}
	public String getAttachmentA() {
		return attachmentA;
	}
	public void setAttachmentA(String attachmentA) {
		this.attachmentA = attachmentA;
	}
	public String getAttachmentB() {
		return attachmentB;
	}
	public void setAttachmentB(String attachmentB) {
		this.attachmentB = attachmentB;
	}
	public String getAttachmentC() {
		return attachmentC;
	}
	public void setAttachmentC(String attachmentC) {
		this.attachmentC = attachmentC;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getAuditor() {
		return auditor;
	}
	public void setAuditor(String auditor) {
		this.auditor = auditor;
	}
	@SuppressWarnings("rawtypes")
	public java.util.Set getReplyrecords() {
		return replyrecords;
	}
	@SuppressWarnings("rawtypes")
	public void setReplyrecords(java.util.Set replyrecords) {
		this.replyrecords = replyrecords;
	}
 */
public class knowledgebase {
	private String title;//����
	private String knowledgeId;//֪ʶ���
	private String uploader;//�ϴ���
	private String classId;//���
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	private String createTime;//�ϴ�ʱ��
	private int attention;//��ע��
	private String pageName;//���ɵľ�̬�ļ���
	private String attachmentName;//������
	private int state;//״̬
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getKnowledgeId() {
		return knowledgeId;
	}
	public void setKnowledgeId(String knowledgeId) {
		this.knowledgeId = knowledgeId;
	}

	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public int getAttention() {
		return attention;
	}
	public void setAttention(int attention) {
		this.attention = attention;
	}
	public String getPageName() {
		return pageName;
	}
	public void setPageName(String pageName) {
		this.pageName = pageName;
	}
	public String getAttachmentName() {
		return attachmentName;
	}
	public void setAttachmentName(String attachmentName) {
		this.attachmentName = attachmentName;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
}
