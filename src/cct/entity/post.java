package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �ܱ����Ӧ�Ķ�����
 * @rewriter ����
 * @RewriteDate 2015/4/21
 * @RewriteSource
 * 	private int postId;//�ϴ����
	private String title;//����
	private String uploader;//�ϴ���
	private String grade;//���
	private String evaluate;//����
	private String uploadTime;//�ϴ�ʱ��
	
	public String getUploadTime() {
		return uploadTime;
	}
	public void setUploadTime(String uploadTime) {
		this.uploadTime = uploadTime;
	}
	private int state;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUploader() {
		return uploader;
	}
	public void setUploader(String uploader) {
		this.uploader = uploader;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
 */
public class post {
	private int postId;//���
	private String tTime;//����
	private String  nickName;//�ǳ�
	private String grade;//���
	private int weekNo;//����
	private String semester;//ѧ��
	private String plan;//���ܼƻ�
	private String performance;//������
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String gettTime() {
		return tTime;
	}
	public void settTime(String tTime) {
		this.tTime = tTime;
	}

	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getWeekNo() {
		return weekNo;
	}
	public void setWeekNo(int weekNo) {
		this.weekNo = weekNo;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getPerformance() {
		return performance;
	}
	public void setPerformance(String performance) {
		this.performance = performance;
	}
}
