package cct.service.impl;

import cct.service.addExcelAddressService;
import cct.dao.baseDAO;
import cct.entity.cctuser;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ���excel����ַ�Ĵ�����
 * @see #addExcelAddress(String, String) Ĭ�Ϸ���
 *
 */
public class addExcelAddressServiceImpl implements addExcelAddressService{

	@SuppressWarnings("rawtypes")
	private baseDAO baseDAO;//���ݿ��������
	/* (non-Javadoc)
	 * @see cct.service.addExcelAddressService#addExcelAddress(java.lang.String, java.lang.String)
	 * @author ����
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @return turn ��ӳɹ� false���ʧ��
	 */
	@SuppressWarnings("unchecked")
	@Override
	public boolean addExcelAddress(String userName) {
		// TODO Auto-generated method stub
		try{
			  cctuser  newcctuser=null;
			  baseDAO.begin();
			  
			  newcctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class, userName);
			  if(newcctuser==null)
				  return false;
			  else
			  {
				
				  baseDAO.save(newcctuser);
				  baseDAO.finish();
				  return true;
			  }
			
		}
		catch(Exception e)
		{
			if(baseDAO.getTx()!=null)
			{
				baseDAO.getTx().rollback();
			}
			e.printStackTrace();
		}
		return false;
	}
	@SuppressWarnings("rawtypes")
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	@SuppressWarnings("rawtypes")
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}
	

}
