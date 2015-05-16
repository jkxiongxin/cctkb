package cct.service;

import cct.entity.cctuser;

/**
 * @author 李想
 * @rewriter 熊鑫	
 * @rewriteDate 2015/4/30
 * @rewriteContent 重写login方法
 *
 */
public interface loginService {
	//public boolean login(String userName,String password);
	public cctuser login(String userName,String password);
}
