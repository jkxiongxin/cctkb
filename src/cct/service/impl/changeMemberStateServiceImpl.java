package cct.service.impl;

import cct.dao.cctuserDAOImpl;
import cct.entity.cctuser;
import cct.service.changeMemberStateService;

/**
 * @author 李想
 * @createDate 2015/5/5
 * @version 1.0
 * @description 修改成员状态的实现类
 *
 */
public class changeMemberStateServiceImpl implements changeMemberStateService{
	private cctuserDAOImpl cctuserDAOImpl;//数据库操作对象
	@Override
	public boolean changeMemberState(String userName, int state) {
		// TODO Auto-generated method stub
		try {
			cctuserDAOImpl.begin();
			cctuser cctuser=cctuserDAOImpl.findById(userName);
			if(cctuser==null)
			{
				cctuserDAOImpl.finish();
				return false;
			}
			cctuser.setState(state);
			cctuserDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return true;
	}
	public cctuserDAOImpl getCctuserDAOImpl() {
		return cctuserDAOImpl;
	}
	public void setCctuserDAOImpl(cctuserDAOImpl cctuserDAOImpl) {
		this.cctuserDAOImpl = cctuserDAOImpl;
	}

}
