package cct.service.impl;

import cct.service.downloadService;
import cct.dao.baseDAO;
import cct.entity.cctuser;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �����ļ��Ķ���������
 * @see #download(String) * Ĭ�Ϸ���
 */
public class downloadServiceImpl implements downloadService{

	private baseDAO baseDAO;//���ݿ��������
	/* (non-Javadoc)
	 * @Description�����ļ����÷���
	 * @see cct.service.downloadService#download(java.lang.String)
	 * @return null 
	 * ����
	 */
	@Override
	public String download(String userName) {
		// TODO Auto-generated method stub
		cctuser cctuser;
		String fileName;
		try{
			baseDAO.begin();		
			cctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class, userName);
			if(cctuser!=null)
			{
				fileName=null;
				return fileName;
			}
			baseDAO.finish();
		}
		catch(Exception e)
		{

			if(baseDAO.getTx()!=null)
			{
				baseDAO.getTx().rollback();
			}
			e.printStackTrace();
		}
		return null;
	}
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

}
