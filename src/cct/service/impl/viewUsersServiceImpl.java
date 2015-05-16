package cct.service.impl;

import java.util.List;

import net.sf.json.JSONObject;

import cct.dao.cctuserDAOImpl;
import cct.entity.cctuser;
import cct.service.viewUsersService;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �鿴�û��б�Ķ���������
 * @adder ����
 * @addDate 2015/4/28
 * @addContent getUserLimitNo(int pageNo, int pageSize)
 */
public class viewUsersServiceImpl implements viewUsersService{
	 public void setCctuserDAOImpl(cctuserDAOImpl cctuserDAOImpl) {
		this.cctuserDAOImpl = cctuserDAOImpl;
	}
	//private baseDAO<cctuser, ?> baseDAO;//cctuser��Ĳ�������
	 private cctuserDAOImpl cctuserDAOImpl;//cct��Ա�����ݿ������
	/* (non-Javadoc)
	 * @author ����
	 * @CreateDate 2015/4/20
	 * @Description ��ȡ�û��б�
	 * @return List<cctuser> ����cct��Ա�б�
	 * @see cct.service.viewUsersService#viewUser()
	 */
	/*@Override
	public List<cctuser> viewUser() {
		// TODO Auto-generated method stub
		List<cctuser> list1=new ArrayList<cctuser>();
		try
		{
			 String hql="from cctuser";
			 baseDAO.begin();
			 cctuser cctuser=null;
			 List<cctuser> list=baseDAO.findByQuery(hql);
				if(list.size()!=-1)//��������б�Ϊ��
				{
					for(int i=0;i<list.size();i++)
					{
						cctuser=(cctuser)list.get(i);
						list1.add(cctuser);
					}
				}
				else
				{
					return null;
				}
				baseDAO.finish();
			
		}
		catch(Exception e)
		{
			if(baseDAO.getTx()!=null)
			{
				baseDAO.rollBack();
			}
			e.printStackTrace();
			return null;
		}
		return list1;
	}
	public baseDAO<cctuser, ?> getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO<cctuser, ?> baseDAO) {
		this.baseDAO = baseDAO;
	}*/
	/* (non-Javadoc)
	 * ��ҳ��ѯ
	 * @see cct.service.viewUsersService#getUserLimitNo(int, int)
	 */
	@Override
	public JSONObject getUserLimitNo(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		JSONObject jsonObj=new JSONObject();
		List<cctuser> list=null;
		try {
			cctuserDAOImpl.begin();
			list=cctuserDAOImpl.findListByQuery(pageNo, pageSize, "from cctuser where state<>2");
			jsonObj.put("list", list);
			int count=cctuserDAOImpl.findAll().size();
			jsonObj.put("count", count);
			cctuserDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return jsonObj;
	}

}
