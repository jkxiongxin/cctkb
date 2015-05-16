package cct.service.impl;

import java.util.ArrayList;
import java.util.List;
import cct.entity.knowledgebase;
import cct.service.viewKnowledgeLinkService;
import cct.dao.baseDAO;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 查看知识点的动作代理类
 *
 */
public class viewKnowledgeLinkServiceImpl implements viewKnowledgeLinkService{

	private baseDAO baseDAO;//通用数据库操作对象
	/* (non-Javadoc)
	 * @author 李想
	 * @CreateDate 2015/4/20
	 * @Description 获取知识点列表
	 * return List<knowledgebase> 知识列表
	 * @see cct.service.viewKnowledgeLinkService#viewknowledgeLink()
	 */
	@Override
	public List<knowledgebase> viewknowledgeLink() {
		// TODO Auto-generated method stub
		knowledgebase knowledgebase;
		List<knowledgebase> list= new ArrayList<knowledgebase>();
		List<knowledgebase> list1=null;
		try{
			baseDAO.begin();
			String hql="from knowledgebase";
			list1=(List<knowledgebase>)baseDAO.findByQuery(hql);
		if(list1.size()!=-1)
		{
			for(int i=0;i<list1.size();i++)
			{
			     knowledgebase=list1.get(i);
			     list.add(knowledgebase);
			}
		}
		else
		return null;
		
		baseDAO.finish();
		}
		catch(Exception e)
		{
			if(baseDAO.getTx()!=null)
			{
				baseDAO.rollBack();
			}
			e.printStackTrace();
			return null;
			
		}
		return list;
	}
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

}
