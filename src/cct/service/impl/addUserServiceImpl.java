package cct.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import cct.dao.baseDAO;
import cct.entity.cctuser;
import cct.service.addUserService;
import cct.utils.Md5PwdEncoder;
/**
 * @author 李想
 *@version 1.0
 *@see #addUser(cctuser, String)
 *@CreateDate 2015/4/19
 *@Description 添加新成员的业务逻辑类
 */
public class addUserServiceImpl implements addUserService{
    private baseDAO<cctuser, ?> baseDAO;//数据库操作接口
	/**
	 * @CreateDate 2015/4/19
	 * @param cctuser 新成员对象
	 * @param userName 添加成员的管理员的用户名
	 * @return true 为添加成功 false 为添加失败
	 */
	@Override
	public boolean addUser(String userName) {
		// TODO Auto-generated method stub
		 cctuser newcctuser=null;
		try{
			   baseDAO.begin();
			  newcctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class, userName);
			  Md5PwdEncoder md5PwdEncoder=new Md5PwdEncoder(); 
			  if(newcctuser==null)
			  {	
				 newcctuser=new cctuser();
				 newcctuser.setUserName(userName);
				 newcctuser.setContactInfo("");
				 Date now = new Date(); 
				 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//可以方便地修改日期格式
				 String createTime = dateFormat.format( now ); 
				 newcctuser.setCreateTime(createTime);
				 newcctuser.setDomitory("");
				 newcctuser.setEmail("");
				 newcctuser.setNativePlace("");
				 newcctuser.setNickName("");
				 String password=md5PwdEncoder.encodePassword("123456789");
				 newcctuser.setPassword(password);
				 newcctuser.setPrivilege(2);
				 newcctuser.setQq("");
				 newcctuser.setRealName("");
				 newcctuser.setRemarks("");
				 newcctuser.setState(0);
				 newcctuser.setTechnologyIntro("");
				 newcctuser.setTheClass("");
				 baseDAO.save(newcctuser);
				 baseDAO.finish();
				 return true;
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
		return false;
	}
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	
	}
}
