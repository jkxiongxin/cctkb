package cct.service;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.cctGroup;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description cctС�����ݿ��������ӿ�
 * @adder ����	
 * @addDate 2015/5/1
 * @addContent ���getCctGroupFY�������ڷ�ҳ��ѯ
 */
public interface cctGroupService {
	public boolean addGroup(cctGroup cctGroup);//���С��
	public List<cctGroup> getAllCctGroups();//�õ�����С��
	public JSONObject getCctGroupFY(int pageNo,int pageSize);//��ҳ��ѯ
	/**
	 * @description ��ֹС��
	 * @param groupId С����
	 * @return boolean falseΪ�޸�ʧ�ܣ���С�鲻���ڣ�trueΪ�޸ĳɹ�
	 */
	public boolean banCctgroup(String groupId);
}
