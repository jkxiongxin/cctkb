package cct.service;

import net.sf.json.JSONObject;

import cct.entity.cctuser;

public interface findMemberService {
   public cctuser findMemberByName(String userName);
   public JSONObject findMemberBycategory(String type,int pageNo,int pageSize);
}
