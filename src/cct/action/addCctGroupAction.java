package cct.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import cct.entity.cctGroup;
import cct.service.cctGroupService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 李想
 * @createDate 2015/4/23
 * @version 1.0
 * @description 添加cct小组的动作类
 * @sourseName
 * addGroupAction.java
 * @reName addCctGroupAction.java
 * @rewriter 熊鑫
 * @rewriteContent all
 * package cct.action;
//2015-4-19查看----熊鑫
//2015/4/23重写,更名为addCctGroupAction
public class addGroupAction {
	
     private String groupName;//组名
     private String headmanA;//组长A
     private String category;//小组种类
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public String getHeadmanA() {
		return headmanA;
	}
	public void setHeadmanA(String headmanA) {
		this.headmanA = headmanA;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
     public String execute()
     {
    	 return "success";
     }
}
 *
 */
public class addCctGroupAction extends ActionSupport{
	private cctGroup cctGroup;//欲添加的小组
	private String message;//状态信息
	private cctGroupService cctGroupService;//小组数据库操作的代理
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public cctGroup getCctGroup() {
		return cctGroup;
	}
                                     
	public cctGroupService getCctGroupService() {
		return cctGroupService;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		try {
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//可以方便地修改日期格式
			String createTime = dateFormat.format( now ); 
			cctGroup.setCreateTime(createTime);
			cctGroup.setEndTime("");
			cctGroup.setGroupBrief("");
			cctGroup.setHeadmanB("");
			cctGroup.setRemarks("");
			cctGroup.setState(0);
			cctGroup.setMember("");
			if(cctGroupService.addGroup(cctGroup)){
				message="success";
			}
			else {
				message="fail";
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return SUCCESS;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	//setter和getter方法
	public void setCctGroup(cctGroup cctGroup) {
		this.cctGroup = cctGroup;
	}
	public void setCctGroupService(cctGroupService cctGroupService) {
		this.cctGroupService = cctGroupService;
	}

	public String getMessage() {
		return message;
	}
	
}
