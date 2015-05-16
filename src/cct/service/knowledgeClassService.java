package cct.service;

import net.sf.json.JSONObject;
import cct.entity.knowledgeclass;

/**
 * @author ����
 * @createDate 2015/5/2
 * @version 1.0
 * @description ֪ʶ�����Ĵ���ӿ�
 *
 */
public interface knowledgeClassService {
	public String addKnowledgeClass(knowledgeclass knowledgeclass);//���֪ʶ�����
	public String updateKnowledgeClass(knowledgeclass knowledgeclass);//�޸ķ���
	public String deleteKnowledgeClass(String classId);//ɾ��֪ʶ��
	public JSONObject getKnowledgeclass(int pageNo,int pageSize);//ͨ��ȼ�����ò�ͬ�����
}
