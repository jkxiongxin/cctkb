package cct.service;

import net.sf.json.JSONObject;
public interface viewUsersService {
	//public List<cctuser> viewUser();//查看所有成员
	public JSONObject getUserLimitNo(int pageNo,int pageSize);//得到特定范围成员
	
}
