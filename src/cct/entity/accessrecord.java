package cct.entity;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ������ʷ��¼���Ӧ�Ķ�����
 *
 */
public class accessrecord {
	private int id;//���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String visiter;//������
	private String startTime;//��ʼʱ��
	private String endTime;//����ʱ��
	private String lastTime;//����ʱ��
	private String IP;//������IP��ַ
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getVisiter() {
		return visiter;
	}
	public void setVisiter(String visiter) {
		this.visiter = visiter;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getLastTime() {
		return lastTime;
	}
	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}
}
