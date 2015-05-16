package cct.service.impl;

import java.util.List;

import cct.dao.cctGroupDAOImpl;
import cct.dao.cctuserDAOImpl;
import cct.entity.cctGroup;
import cct.service.viewCctgroupService;

/**
 * @author 熊鑫
 * @createDate 2015/5/16
 * @version 1.0
 * @description 分页查看小组的实现类
 *
 */
public class viewCctgroupServiceImpl implements viewCctgroupService {
	private cctGroupDAOImpl cctGroupDAOImpl;//小组数据库操作代理对象
	@Override
	public List<cctGroup> getCctGroups(int pageNo, int pagesize, int state) {
		// TODO Auto-generated method stub
		List<cctGroup> list=null;//声明一个小组列表，用来保存数据库查询结果
		try {
			cctGroupDAOImpl.begin();//开始事务
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
