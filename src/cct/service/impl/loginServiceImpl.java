package cct.service.impl;

import cct.dao.cctuserDAOImpl;
import cct.entity.cctuser;
import cct.service.loginService;
import cct.utils.Md5PwdEncoder;

/**
 * @author 李想
 * @CreateDate 2015/4/19
 * @version 1.0
 * @see #login(String, String)
 *@description 登陆功能的逻辑处理
 * @rewriter 熊鑫	
 * @rewriteDate 2015/4/30
 * @rewriteContent 重写login方法
 */
public class loginServiceImpl implements loginService{
	private cctuserDAOImpl cctuserDAO;//cct成员的数据库操作对象
	
	@Override
	public cctuser login(String userName, String password) {
		// TODO Auto-generated method stub
		cctuser cctuser=null;
		Md5PwdEncoder md5PwdEncoder=new Md5PwdEncoder(); 
		try {
			cctuserDAO.begin();
			cctuser=cctuserDAO.findById(userName);
			String relPassword=md5PwdEncoder.encodePassword(password);
			if(cctuser!=null)
			{
				if(!cctuser.getPassword().equals(relPassword))//密码不正确
				{
					return null;
				}
			}
			else{//用户名不存在
				return null;
			}
			cctuserDAO.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return cctuser;
	}

	public cctuserDAOImpl getCctuserDAO() {
		return cctuserDAO;
	}

	public void setCctuserDAO(cctuserDAOImpl cctuserDAO) {
		this.cctuserDAO = cctuserDAO;
	}
	
	//private baseDAO baseDAO;//数据库操作接口

	/* (non-Javadoc)
	 * @see cct.service.loginService#login(java.lang.String, java.lang.String)
	 * @version 1.0
	 * @CreateDate 2015/4/19
	 * @return boolean
	 */
	/*@Override
	public boolean login(String userName, String password) {
		// TODO Auto-generated method stub
		cctuser cctuser=null; 
		try
		{
			baseDAO.begin();
			cctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class,userName);
			if(cctuser==null)
			{
				return false;
			}
			else if(!cctuser.getPassword().equals(password))
			{
				return false;
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
			return false;
		}
		return true;
	}

	public baseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}*/


}
