package cct.service.impl;

import cct.dao.cctuserDAOImpl;
import cct.entity.cctuser;
import cct.service.alterUserService;

/**
 * @author 熊鑫
 * @createDate 2015/5/4
 * @version 1.0
 * @description 修改用户权限的代理实现类
 *
 */
public class alterUserServiceImpl implements alterUserService {
	private cctuserDAOImpl cctuserDAOImpl;
	@Override
	public String alterUserPrivilege(String userName, int privilege) {
		// TODO Auto-generated method stub
		String message=null;
		try {
			cctuserDAOImpl.begin();
			cctuser cctuser=cctuserDAOImpl.findById(userName);
			if(cctuser==null)
			{
				message="fail";//用户名不存在
			}
			else {
				cctuser.setPrivilege(privilege);
				cctuserDAOImpl.save(cctuser);
				message="success";//修改成功
			}
			cctuserDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return message;
	}
	public cctuserDAOImpl getCctuserDAOImpl() {
		return cctuserDAOImpl;
	}
	public void setCctuserDAOImpl(cctuserDAOImpl cctuserDAOImpl) {
		this.cctuserDAOImpl = cctuserDAOImpl;
	}

}
