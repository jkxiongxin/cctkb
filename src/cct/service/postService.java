package cct.service;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.post;

/**
 * @author ����
 * @CreateDate 2015/4/23
 * @version 1.0
 * @Description post����ҵ���߼��Ĵ���ӿ�
 * @adder ����	
 * @addDate 2015/5/1
 * @addContent ���getPostFY����ʵ�ַ�ҳ��ѯ
 */
public interface postService {
	public List<post> getPostsByNickName(String nickName);//�����ǳƻ�ȡ�ܱ�
	public JSONObject getPostFY(int pageNo,int pageSize,String nickName);//��ҳ��ѯ�ܱ�
}
