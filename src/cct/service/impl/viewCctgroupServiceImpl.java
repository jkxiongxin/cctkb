package cct.service.impl;

import java.util.List;

import cct.dao.cctGroupDAOImpl;
import cct.dao.cctuserDAOImpl;
import cct.entity.cctGroup;
import cct.service.viewCctgroupService;

/**
 * @author ����
 * @createDate 2015/5/16
 * @version 1.0
 * @description ��ҳ�鿴С���ʵ����
 *
 */
public class viewCctgroupServiceImpl implements viewCctgroupService {
	private cctGroupDAOImpl cctGroupDAOImpl;//С�����ݿ�����������
	@Override
	public List<cctGroup> getCctGroups(int pageNo, int pagesize, int state) {
		// TODO Auto-generated method stub
		List<cctGroup> list=null;//����һ��С���б������������ݿ��ѯ���
		try {
			cctGroupDAOImpl.begin();//��ʼ����
			String hql="from cctGroup where state='"+state+"'";
			list=cctGroupDAOImpl.findListByQuery(pageNo, pagesize, hql);
			cctGroupDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			if(cctGroupDAOImpl.getTx()!=null)
			{
				cctGroupDAOImpl.rollBack();
			}
			e.printStackTrace();
		}
		return list;
	}
	public cctGroupDAOImpl getCctGroupDAOImpl() {
		return cctGroupDAOImpl;
	}
	public void setCctGroupDAOImpl(cctGroupDAOImpl cctGroupDAOImpl) {
		this.cctGroupDAOImpl = cctGroupDAOImpl;
	}

}
