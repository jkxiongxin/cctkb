package cct.service;

import java.util.List;

import cct.entity.groupstage;

/**
 * @author 熊鑫
 * @createDate 2015/4/23
 * @version 1.0
 * @description 小组阶段的数据库操作的代理接口
 *
 */
public interface groupstageService {
	public boolean addGroupstage(groupstage groupstage);
	public boolean deleteGroupstage(String groupStageId);//根据groupStageId删除小组阶段
	public boolean alterGroupstage(groupstage groupstage);//修改阶段信息
	public List<groupstage> getAllGroupstage(String groupId);//根据小组编号得到所有小组阶段
}
