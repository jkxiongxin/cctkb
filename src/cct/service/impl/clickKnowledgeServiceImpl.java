package cct.service.impl;

import cct.dao.baseDAO;
import cct.service.clickKnowledgeService;

/**
 * @author 李想
 * @see #clickKnowledge()
 *@CreateDate 2015/4/19
 *@version 1.0
 *@Description 
 */
public class clickKnowledgeServiceImpl implements clickKnowledgeService {
	private baseDAO baseDAO;//数据库操作对象
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}
	@Override
	public String clickKnowledge() {
		// TODO Auto-generated method stub
		return null;
	}

}
