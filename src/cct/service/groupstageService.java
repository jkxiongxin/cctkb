package cct.service;

import java.util.List;

import cct.entity.groupstage;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description С��׶ε����ݿ�����Ĵ���ӿ�
 *
 */
public interface groupstageService {
	public boolean addGroupstage(groupstage groupstage);
	public boolean deleteGroupstage(String groupStageId);//����groupStageIdɾ��С��׶�
	public boolean alterGroupstage(groupstage groupstage);//�޸Ľ׶���Ϣ
	public List<groupstage> getAllGroupstage(String groupId);//����С���ŵõ�����С��׶�
}
