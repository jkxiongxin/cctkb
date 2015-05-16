package cct.service.impl;

import cct.dao.baseDAO;
import cct.entity.cctuser;
import cct.service.addUserDetailService;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description ����û���Ϣ�Ķ�������ʵ����
 * @see #addUserDetail(String, String, String, String, String, String, String, String, int, int, String, String, String, String)
 * Ĭ�Ϸ���
 *
 */
public class addUserDetailServiceImpl implements addUserDetailService{
	 private baseDAO<cctuser, ?> baseDAO;//���ݿ��������
	/* (non-Javadoc)
	 * return true ��ӳɹ� false ���ʧ��
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
			 newcctuser.setContactInfo(cctuser.getContactInfo());//��ϵ��ʽ
			 newcctuser.setDomitory(cctuser.getDomitory());//����¥
			 newcctuser.setEmail(cctuser.getEmail());//����
			 newcctuser.setNativePlace(cctuser.getNativePlace());//����
			 newcctuser.setNickName(cctuser.getNickName());//�ǳ�
			 newcctuser.setQq(cctuser.getQq());//qq��
			 newcctuser.setRealName(cctuser.getRealName());//��ʵ����
			 newcctuser.setRemarks(cctuser.getRemarks());//��ע
			 newcctuser.setTechnologyIntro(cctuser.getTechnologyIntro());//�������
			 newcctuser.setTheClass(cctuser.getTheClass());//�༶
			
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
