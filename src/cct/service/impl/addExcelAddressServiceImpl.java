package cct.service.impl;

import cct.service.addExcelAddressService;
import cct.dao.baseDAO;
import cct.entity.cctuser;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 添加excel表格地址的代理类
 * @see #addExcelAddress(String, String) 默认方法
 *
 */
public class addExcelAddressServiceImpl implements addExcelAddressService{

	@SuppressWarnings("rawtypes")
	private baseDAO baseDAO;//数据库操作对象
	/* (non-Javadoc)
	 * @see cct.service.addExcelAddressService#addExcelAddress(java.lang.String, java.lang.String)
	 * @author 李想
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @return turn 添加成功 false添加失败
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
