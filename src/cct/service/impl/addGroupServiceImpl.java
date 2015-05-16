package cct.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import cct.dao.baseDAO;
import cct.entity.cctGroup;
import cct.service.addGroupService;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 添加小组的动作代理实现类
 * @see #addGroup(String, String, String, String, String, String, String, String, String, int, String) 默认方法
 *
 */
public class addGroupServiceImpl implements addGroupService{

	private baseDAO baseDAO;//数据库操作对象
	/* (non-Javadoc)
	 * return turn 添加成功 false 添加失败
	 * @see cct.service.addGroupService#addGroup(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String)
	 */
	@Override
	public boolean addGroup(String groupId, String groupName,
			String groupBrief, String headmanA, String headmanB, String member,
			String category, String createTime, String endTime, int state,
			String remarks) throws Exception {
		// TODO Auto-generated method stub
		     cctGroup newgroup=null;
		     baseDAO.begin();
		     newgroup=(cctGroup)baseDAO.findById(cct.entity.cctGroup.class, groupId);
		     if(newgroup!=null)
			   return false;
		     List<cctGroup> list=(List<cctGroup>)baseDAO.findByQuery("from cctGroup");
		     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
		     String createTime2 = dateFormat.format( new Date() );
		     int index=0;
		     if(list.size()==0)
		     {
		    	 newgroup.setGroupId(createTime2+"_1");
		     }
		     else {
				for(int i=0;i<list.size();i++)
				{
					if(list.get(i).getGroupId().indexOf(createTime2)!=-1)
					{
						index++;
					}
				}
				if(index==0)
				{
					newgroup.setGroupId(createTime2+"_1");
				}
				else{
					index++;
					newgroup.setGroupId(createTime2+"_"+index);
				}
			}
		     newgroup.setCategory(category);
		     newgroup.setCreateTime(createTime);
		     newgroup.setEndTime(endTime);
		     newgroup.setGroupBrief(groupBrief);
		     newgroup.setGroupId(groupId);
		     newgroup.setGroupName(groupName);
		     newgroup.setHeadmanA(headmanA);
		     newgroup.setHeadmanB(headmanB);
		     newgroup.setMember(member);
		     newgroup.setRemarks(remarks);
		     newgroup.setState(state);
		     baseDAO.save(newgroup);
		     baseDAO.finish();
		   return true;
	}
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

}
