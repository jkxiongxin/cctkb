package cct.service;

import cct.entity.cctuser;

/**
 * @author ����
 * @rewriter ����	
 * @rewriteDate 2015/4/30
 * @rewriteContent ��дlogin����
 *
 */
public interface loginService {
	//public boolean login(String userName,String password);
	public cctuser login(String userName,String password);
}
