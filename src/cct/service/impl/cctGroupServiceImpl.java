package cct.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.sf.json.JSONObject;

import cct.dao.cctGroupDAOImpl;
import cct.dao.cctuserDAOImpl;
import cct.entity.cctGroup;
import cct.service.cctGroupService;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description cct小组数据库操作的代理实现类
 *
 */
public class cctGroupServiceImpl implements cctGroupService{
	private cctuserDAOImpl cctuserDAOImpl;//cct成员的数据库操作对象
	public cctuserDAOImpl getCctuserDAOImpl() {
		return cctuserDAOImpl;
	}
	public void setCctuserDAOImpl(cctuserDAOImpl cctuserDAOImpl) {
		this.cctuserDAOImpl = cctuserDAOImpl;
	}
	public cctGroupDAOImpl getCctGroupDAOImpl() {
		return cctGroupDAOImpl;
	}
	public void setCctGroupDAOImpl(cctGroupDAOImpl cctGroupDAOImpl) {
		this.cctGroupDAOImpl = cctGroupDAOImpl;
	}
	private cctGroupDAOImpl cctGroupDAOImpl;//cct小组的数据库操作实现类
	/* (non-Javadoc)
	 * 添加小组
	 * @author 熊鑫
	 * @createDate 2015/4/23
	 * @see cct.service.cctGroupService#addGroup(cct.entity.cctGroup)
	 */
	@Override
	public boolean addGroup(cctGroup cctGroup) {
		// TODO Auto-generated method stub
		try {
			cctGroupDAOImpl.begin();
			int index=0;
			Date now = new Date(); 
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");//可以方便地修改日期格式
			String createTime = dateFormat.format( now );
			if(cctGroupDAOImpl.findByQuery("from cctGroup where groupName='"+cctGroup.getGroupName()+"'").size()>0)
			{
				cctGroupDAOImpl.finish();
				return false;
			}
			index=cctGroupDAOImpl.findByQuery("from cctGroup where groupId like '"+createTime+"_%'").size();
			String groupId="";
			if(index>0)
			{
				index++;
				groupId=createTime+"_"+index;
			}
			else{
				groupId=createTime+"_"+1;
			}
			if(cctGroupDAOImpl.findByQuery("from cctuser where realName='"+cctGroup.getHeadmanA()+"'")!=null)
			{}
			else{
				return false;
			}
			if(cctGroup.getHeadmanB()!="")
			{
				if(cctGroupDAOImpl.findByQuery("from cctuser where realName='"+cctGroup.getHeadmanB()+"'")!=null)
				{}
				else{
					return false;
				}
			}
			cctGroup.setGroupId(groupId);
			cctGroupDAOImpl.save(cctGroup);
			cctGroupDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			if(cctGroupDAOImpl.getTx()!=null)
			{
				cctGroupDAOImpl.rollBack();
			}
			return false;
		}
		
		return true;
	}
	/* (non-Javadoc)
	 * 得到所有小组
	 * @author 熊鑫
	 * @createDate 2015/4/23
	 * @see cct.service.cctGroupService#getAllCctGroups()
	 */
	@Override
	public List<cctGroup> getAllCctGroups() {
		// TODO Auto-generated method stub
		List<cctGroup> list=null;
		try {
			cctGroupDAOImpl.begin();
			list=cctGroupDAOImpl.findAll();
			cctGroupDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return list;
	}
	/* (non-Javadoc)
	 * 分页查询
	 * @see cct.service.cctGroupService#getCctGroupFY(int, int)
	 */
	@Override
	public JSONObject getCctGroupFY(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		List<cctGroup> list=new ArrayList<cctGroup>();
		JSONObject jsonObject=new JSONObject();
		try {
			cctGroupDAOImpl.begin();
			int count=cctGroupDAOImpl.findAll().size();
			list=cctGroupDAOImpl.findList(pageNo, pageSize);
			jsonObject.put("count", count);
			jsonObject.put("list",list);
			cctGroupDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return jsonObject;
	}
	@Override
	public boolean banCctgroup(String groupId) {
		// TODO Auto-generated method stub
		try {
			cctGroupDAOImpl.begin();
			cctGroup cctGroup=cctGroupDAOImpl.findById(groupId);
			if(cctGroup==null){
				cctGroupDAOImpl.finish();
				return false;//失败，小组不存在
			}
			else {
				cctGroup.setState(1);//终止小组
			}
			cctGroupDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;//修改成功
	}

}
