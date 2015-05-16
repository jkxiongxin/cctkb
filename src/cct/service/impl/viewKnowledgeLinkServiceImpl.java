package cct.service.impl;

import java.util.ArrayList;
import java.util.List;
import cct.entity.knowledgebase;
import cct.service.viewKnowledgeLinkService;
import cct.dao.baseDAO;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �鿴֪ʶ��Ķ���������
 *
 */
public class viewKnowledgeLinkServiceImpl implements viewKnowledgeLinkService{

	private baseDAO baseDAO;//ͨ�����ݿ��������
	/* (non-Javadoc)
	 * @author ����
	 * @CreateDate 2015/4/20
	 * @Description ��ȡ֪ʶ���б�
	 * return List<knowledgebase> ֪ʶ�б�
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
