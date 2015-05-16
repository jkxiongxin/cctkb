package cct.service.impl;

import cct.service.downloadService;
import cct.dao.baseDAO;
import cct.entity.cctuser;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 下载文件的动作代理类
 * @see #download(String) * 默认方法
 */
public class downloadServiceImpl implements downloadService{

	private baseDAO baseDAO;//数据库操作对象
	/* (non-Javadoc)
	 * @Description下载文件调用方法
	 * @see cct.service.downloadService#download(java.lang.String)
	 * @return null 
	 * ？？
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
