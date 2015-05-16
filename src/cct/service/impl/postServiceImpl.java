package cct.service.impl;

import java.util.List;

import net.sf.json.JSONObject;

import cct.dao.postDAOImpl;
import cct.entity.post;
import cct.service.postService;

/**
 * @author ����
 * @createDate 2015/4/23
 * @version 1.0
 * @description �ܱ���������ʵ����
 * @adder ����
 * @addDate 2015/5/1
 * @addContent getPostFY����
 */
public class postServiceImpl implements postService{
	public postDAOImpl getPostDAOImpl() {
		return postDAOImpl;
	}
	public void setPostDAOImpl(postDAOImpl postDAOImpl) {
		this.postDAOImpl = postDAOImpl;
	}
	private postDAOImpl postDAOImpl;//�ܱ������ݿ������
	/* (non-Javadoc)
	 * ����postDAOImpl��findByQuery��������ȡ��Ա��Ӧ���ܱ�
	 * @see cct.service.postService#getPostsByNickName(java.lang.String)
	 */
	@Override
	public List<post> getPostsByNickName(String nickName) {
		// TODO Auto-generated method stub
		List<post> list=null;//�������ݿ��ѯ���
		try {
			postDAOImpl.begin();
			list=postDAOImpl.findByQuery("from post where nickName='"+nickName+"'");
			postDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			if(postDAOImpl.getTx()!=null)
			{
				postDAOImpl.rollBack();
			}
			e.printStackTrace();
		}
		return list;
	}
	/* (non-Javadoc)
	 * ʵ�ַ�ҳ��ѯ
	 * @see cct.service.postService#getPostFY(int, int, java.lang.String)
	 */
	@Override
	public JSONObject getPostFY(int pageNo, int pageSize, String nickName) {
		// TODO Auto-generated method stub
		List<post> list=null;
		JSONObject jsonObject=new JSONObject();
		try {
			postDAOImpl.begin();
			int count=postDAOImpl.findByQuery("from post where nickName='"+nickName+"'").size();
			list=postDAOImpl.findListByQuery(pageNo, pageSize, "from post where nickName='"+nickName+"'");
			jsonObject.put("count", count);
			jsonObject.put("list", list);
			postDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return jsonObject;
	}
}
