package cct.service;

/**
 * @author 熊鑫	
 * @createDate 2015/5/4
 * @version 1.0
 * @description 修改用户权限的代理接口
 *
 */
public interface alterUserService {
	public String alterUserPrivilege(String userName,int privilege);//修改用户权限
}
