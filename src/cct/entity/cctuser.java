package cct.entity;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/20
 * @version 1.1
 * @Description cct成员表的对应的对象类
 *
 */

/**
 * @adder lx
 * @addDate 2015/4/20
 * @addContent 
			private String weeklyreportaddress;
 *
 */
public class cctuser {
	private String userName;//用户名
	public String getUserName() {
		return userName;
	}
	private String password;//密码
	private String realName;//真实姓名
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	private String nativePlace;//籍贯
	private String theClass;//班级
	private String domitory;//宿舍
	private String contactInfo;//联系方式
	private String email;//邮箱
	private String qq;//qq
	private int privilege;//权限
	private int state;//状态
	private String createTime;//创建时间
	private String nickName;//昵称
	private String technologyIntro;//技术简介
	private String remarks;//备注
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNativePlace() {
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getDomitory() {
		return domitory;
	}
	public void setDomitory(String domitory) {
		this.domitory = domitory;
	}
	public String getContactInfo() {
		return contactInfo;
	}
	public void setContactInfo(String contactInfo) {
		this.contactInfo = contactInfo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQq() {
		return qq;
	}
	public void setQq(String qq) {
		this.qq = qq;
	}
	public int getPrivilege() {
		return privilege;
	}
	public void setPrivilege(int privilege) {
		this.privilege = privilege;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getTechnologyIntro() {
		return technologyIntro;
	}
	public void setTechnologyIntro(String technologyIntro) {
		this.technologyIntro = technologyIntro;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getTheClass() {
		return theClass;
	}
	public void setTheClass(String theClass) {
		this.theClass = theClass;
	}

}
