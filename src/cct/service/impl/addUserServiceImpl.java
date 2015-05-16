package cct.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import cct.dao.baseDAO;
import cct.entity.cctuser;
import cct.service.addUserService;
import cct.utils.Md5PwdEncoder;
/**
 * @author ����
 *@version 1.0
 *@see #addUser(cctuser, String)
 *@CreateDate 2015/4/19
 *@Description ����³�Ա��ҵ���߼���
 */
public class addUserServiceImpl implements addUserService{
    private baseDAO<cctuser, ?> baseDAO;//���ݿ�����ӿ�
	/**
	 * @CreateDate 2015/4/19
	 * @param cctuser �³�Ա����
	 * @param userName ��ӳ�Ա�Ĺ���Ա���û���
	 * @return true Ϊ��ӳɹ� false Ϊ���ʧ��
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
				 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");//���Է�����޸����ڸ�ʽ
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
