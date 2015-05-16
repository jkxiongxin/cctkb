package cct.service.impl;

import cct.dao.baseDAO;
import cct.entity.cctuser;
import cct.service.addUserDetailService;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 添加用户信息的动作代理实现类
 * @see #addUserDetail(String, String, String, String, String, String, String, String, int, int, String, String, String, String)
 * 默认方法
 *
 */
public class addUserDetailServiceImpl implements addUserDetailService{
	 private baseDAO<cctuser, ?> baseDAO;//数据库操作对象
	/* (non-Javadoc)
	 * return true 添加成功 false 添加失败
	 * @see cct.service.addUserDetailService#addUserDetail(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public boolean addUserDetail(cctuser cctuser) {
		// TODO Auto-generated method stub
		cctuser newcctuser=null;
		try{
			 baseDAO.begin();
			 newcctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class, cctuser.getUserName());
			 if(newcctuser==null)
			 {
				 baseDAO.finish();
				 return false;
			 }
			 newcctuser.setContactInfo(cctuser.getContactInfo());//联系方式
			 newcctuser.setDomitory(cctuser.getDomitory());//宿舍楼
			 newcctuser.setEmail(cctuser.getEmail());//邮箱
			 newcctuser.setNativePlace(cctuser.getNativePlace());//籍贯
			 newcctuser.setNickName(cctuser.getNickName());//昵称
			 newcctuser.setQq(cctuser.getQq());//qq号
			 newcctuser.setRealName(cctuser.getRealName());//真实姓名
			 newcctuser.setRemarks(cctuser.getRemarks());//备注
			 newcctuser.setTechnologyIntro(cctuser.getTechnologyIntro());//技术简介
			 newcctuser.setTheClass(cctuser.getTheClass());//班级
			
			 baseDAO.update(newcctuser);
			 baseDAO.finish();
			 return true;
		}
		catch(Exception e)
		{
			if(baseDAO.getTx()!=null)
			{
				baseDAO.getTx().rollback();
			}
			e.printStackTrace();
			return false;
		}
		
	}
	public baseDAO getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

}
