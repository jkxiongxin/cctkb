package cct.service.impl;

import cct.dao.baseDAO;
import cct.service.clickKnowledgeService;

/**
 * @author ����
 * @see #clickKnowledge()
 *@CreateDate 2015/4/19
 *@version 1.0
 *@Description 
 */
public class clickKnowledgeServiceImpl implements clickKnowledgeService {
	private baseDAO baseDAO;//���ݿ��������
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
