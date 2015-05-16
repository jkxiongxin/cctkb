package cct.entity;


/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 知识点表对应的对象类
 * @rewriter 熊鑫
 * @rewriteDate 2015/4/21
 * @RewriteSource
 * 	private String title;//标题
	private String knowledgeId;//知识点编号
	@SuppressWarnings("rawtypes")
	private java.util.Set replyrecords;//回复数
	private String uploader;//上传者
	private String content;//内容
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
	private String title;//标题
	private String knowledgeId;//知识编号
	private String uploader;//上传者
	private String classId;//类别
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
	private String createTime;//上传时间
	private int attention;//关注度
	private String pageName;//生成的静态文件名
	private String attachmentName;//附件名
	private int state;//状态
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
