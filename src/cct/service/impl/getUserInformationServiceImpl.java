package cct.service.impl;
import cct.dao.cctuserDAOImpl;
import cct.entity.cctuser;
import cct.service.*;
public class getUserInformationServiceImpl implements getUserInformationService{
	private cctuserDAOImpl cctuserDAOImpl;//成员类数据库操作对象
	@Override
	public cctuser getCctuser(String userName) {
		// TODO Auto-generated method stub
		cctuser cctuser=null;
		try {
			cctuserDAOImpl.begin();
			cctuser=cctuserDAOImpl.findById(userName);
			cctuserDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return cctuser;
	}
	public cctuserDAOImpl getCctuserDAOImpl() {
		return cctuserDAOImpl;
	}
	public void setCctuserDAOImpl(cctuserDAOImpl cctuserDAOImpl) {
		this.cctuserDAOImpl = cctuserDAOImpl;
	}
	
}
