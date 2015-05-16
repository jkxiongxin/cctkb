package cct.service.impl;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.cctuser;
import cct.service.findMemberService;
import cct.dao.baseDAO;
public class findMemberServiceImpl implements findMemberService{

	private baseDAO<cctuser,?> baseDAO;
	@Override
	public cctuser findMemberByName(String userName) {
		// TODO Auto-generated method stub
		cctuser cctuser=null;
		try
		{
			baseDAO.begin();
			List<cctuser> list=baseDAO.findByQuery("from cctuser where realName='"+userName+"' and state<>2");
			
			if(list==null)
			{
				baseDAO.finish();
				return null;
			}
			else
				cctuser=(cctuser) list.get(0);
			
			baseDAO.finish();
		}
		catch(Exception e)
		{
			return null;
		}
		return cctuser;
	}
	public baseDAO<cctuser, ?> getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO<cctuser, ?> baseDAO) {
		this.baseDAO = baseDAO;
	}
	@Override
	public JSONObject findMemberBycategory(String type,int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		JSONObject jsonObject=new JSONObject();
		 String hql="from cctuser where privilege='"+type+"'";
		 System.out.println(hql);
		 List<cctuser> list;
		 try{
		 baseDAO.begin();
		 list=baseDAO.findByQuery(hql);
		 if(list!=null)
		 {
			 jsonObject.put("count", list.size());
		 }
		 list=baseDAO.findListByQuery(pageNo, pageSize, hql);
		 jsonObject.put("list", list);
			if(list!=null);
			
			else
			{
				return null;
			}
			baseDAO.finish();
		
	}
	catch(Exception e)
	{
		if(baseDAO.getTx()!=null)
		{
			baseDAO.rollBack();
		}
		e.printStackTrace();
		return jsonObject;
		
	}
		 return jsonObject;
	}

}
