package cct.service;

public interface addGroupService {
   public boolean addGroup(String groupId,String groupName,String groupBrief,String headmanA,String headmanB,String member,String category,String createTime,String endTime,int state,String remarks)throws Exception;
}
