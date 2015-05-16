package cct.service;

import java.util.List;

import cct.entity.cctGroup;

public interface viewCctgroupService {
	/**
	 * @param pageNo 页码
	 * @param pagesize 每页记录数
	 * @param state 状态
	 * @return List<cctGroup> 知识点列表
	 */
	public List<cctGroup> getCctGroups(int pageNo,int pagesize,int state);
}
