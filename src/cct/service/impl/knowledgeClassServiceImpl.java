package cct.service.impl;

import java.util.List;

import net.sf.json.JSONObject;
import cct.dao.knowledgeclassDAOImpl;
import cct.entity.knowledgeclass;
import cct.service.knowledgeClassService;

/**
 * @author ����
 * @createDate 2015/5/2
 * @version 1.0
 * @description ֪ʶ�����Ĵ���ʵ����
 *
 */
public class knowledgeClassServiceImpl implements knowledgeClassService {
	private knowledgeclassDAOImpl knowledgeclassDAOImpl;
	@Override
	public String addKnowledgeClass(knowledgeclass knowledgeclass) {
		// TODO Auto-generated method stub
		String result=null;
		try {
			knowledgeclassDAOImpl.begin();
			if(knowledgeclassDAOImpl.findByQuery("from knowledgeclass where className='"+knowledgeclass.getClassName()+"'")!=null&&knowledgeclassDAOImpl.findByQuery("from knowledgeclass where className='"+knowledgeclass.getClassName()+"'").size()>0)
			{
				result="fail";
				knowledgeclassDAOImpl.finish();
				return result;
			}
			List<knowledgeclass> list=knowledgeclassDAOImpl.findByQuery("from knowledgeclass where classId like 'KB_%'");
			if(list==null)
			{
				knowledgeclass.setClassId("KB_001");
			}
			else {
				int count=list.size();
				count++;
				if(count/100>0)
				{
					knowledgeclass.setClassId("KB_"+count);
				}
				else if(count/10>0)
				{
					knowledgeclass.setClassId("KB_0"+count);
				}
				else {
					knowledgeclass.setClassId("KB_00"+count);
				}
			}
			knowledgeclass.setKnowledgeNumber(0);
			knowledgeclass.setReplyVolume(0);
			knowledgeclass.setVisitorVolume(0);
			knowledgeclassDAOImpl.save(knowledgeclass);
			knowledgeclassDAOImpl.finish();
			result="success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			result="fail";
			return result;
		}
		return result;
	}

	@Override
	public String updateKnowledgeClass(knowledgeclass knowledgeclass) {
		// TODO Auto-generated method stub
		String result=null;
		try
		{
			knowledgeclassDAOImpl.begin();
			knowledgeclass knowledgeclass2=knowledgeclassDAOImpl.findById(knowledgeclass.getClassId());
			if(knowledgeclass2==null)
			{
				result = "wrong";
				knowledgeclassDAOImpl.finish();
				return result;
			}
			knowledgeclass2.setClassName(knowledgeclass.getClassName());
			knowledgeclass2.setClassBrief(knowledgeclass.getClassBrief());
			knowledgeclassDAOImpl.save(knowledgeclass2);
			knowledgeclassDAOImpl.finish();
			result = "success";
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public String deleteKnowledgeClass(String classId) {
		// TODO Auto-generated method stub
		String result=null;
		try {
			knowledgeclassDAOImpl.begin();
			knowledgeclass knowledgeclass=knowledgeclassDAOImpl.findById(classId);
			if(knowledgeclass==null)
			{
				result = "fail";
				knowledgeclassDAOImpl.finish();
				return result;
			}
			knowledgeclassDAOImpl.delete(knowledgeclass);
			knowledgeclassDAOImpl.finish();
			result = "success";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public JSONObject getKnowledgeclass(int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		List<knowledgeclass> list=null;
		JSONObject jsonObj=new JSONObject();
		try {
			knowledgeclassDAOImpl.begin();
			list=knowledgeclassDAOImpl.findAll();
			if(list==null)
			{
				knowledgeclassDAOImpl.finish();
				jsonObj.put("count", 0);
				return jsonObj;
			}
			int count=list.size();
			jsonObj.put("count", count);
			list=knowledgeclassDAOImpl.findList(pageNo, pageSize);
			jsonObj.put("list", list);
			knowledgeclassDAOImpl.finish();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return jsonObj;
	}

	public knowledgeclassDAOImpl getknowledgeclassDAOImpl() {
		return knowledgeclassDAOImpl;
	}

	public void setknowledgeclassDAOImpl(knowledgeclassDAOImpl knowledgeclassDAOImpl) {
		this.knowledgeclassDAOImpl = knowledgeclassDAOImpl;
	}

}
