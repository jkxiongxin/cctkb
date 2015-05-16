package cct.service.impl;

import cct.service.deleteMemeberService;
import cct.dao.baseDAO;
import cct.entity.cctuser;
public class deleteMemberServiceImpl implements deleteMemeberService{

	private baseDAO<cctuser, ?> baseDAO;
	@Override
	public boolean deleteMember(String userName) {
		// TODO Auto-generated method stub
		cctuser cctuser;
		try
		{
			baseDAO.begin();
			cctuser= (cctuser)baseDAO.findById(cct.entity.cctuser.class, userName);
			if(cctuser==null)
			{
				baseDAO.finish();
				return false;
			}
			baseDAO.delete(cctuser);
			baseDAO.finish();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return true;
	}
	public baseDAO<cctuser, ?> getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO<cctuser, ?> baseDAO) {
		this.baseDAO = baseDAO;
	}

}
