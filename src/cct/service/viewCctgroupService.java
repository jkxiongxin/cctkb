package cct.service;

import java.util.List;

import cct.entity.cctGroup;

public interface viewCctgroupService {
	/**
	 * @param pageNo ҳ��
	 * @param pagesize ÿҳ��¼��
	 * @param state ״̬
	 * @return List<cctGroup> ֪ʶ���б�
	 */
	public List<cctGroup> getCctGroups(int pageNo,int pagesize,int state);
}
