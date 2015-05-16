package cct.entity;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 访问历史记录表对应的对象类
 *
 */
public class accessrecord {
	private int id;//编号
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String visiter;//访问者
	private String startTime;//开始时间
	private String endTime;//结束时间
	private String lastTime;//持续时间
	private String IP;//访问者IP地址
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
