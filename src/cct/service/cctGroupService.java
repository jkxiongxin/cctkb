package cct.service;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.cctGroup;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description cct小组数据库操作代理接口
 * @adder 熊鑫	
 * @addDate 2015/5/1
 * @addContent 添加getCctGroupFY方法用于分页查询
 */
public interface cctGroupService {
	public boolean addGroup(cctGroup cctGroup);//添加小组
	public List<cctGroup> getAllCctGroups();//得到所有小组
	public JSONObject getCctGroupFY(int pageNo,int pageSize);//分页查询
	/**
	 * @description 终止小组
	 * @param groupId 小组编号
	 * @return boolean false为修改失败，该小组不存在，true为修改成功
	 */
	public boolean banCctgroup(String groupId);
}
