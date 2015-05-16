package cct.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;

import cct.entity.knowledgebase;
import cct.service.uploadKnowledgeService;
import cct.dao.baseDAO;

public class uploadKnowledgeServiceImpl implements uploadKnowledgeService{
   
	private baseDAO<knowledgebase, ?> baseDAO;
	@Override
	public boolean uploadKnowledge(String userName,String title,String type,String fileName){
		// TODO Auto-generated method stub
		knowledgebase knowledgebase;
		Date date = new Date();
		String titleinsql="";
        String str = new SimpleDateFormat("yyyy-MM-dd").format(date);
        try{
        titleinsql=new String(title.getBytes("utf-8"),"utf-8");//¬“¬ÎŒ Ã‚
        }
        catch(Exception e)
        {
        	System.err.print(e);
        }
        System.out.println(title);
		try
		{
			baseDAO.begin();
			knowledgebase=new knowledgebase();
			knowledgebase.setCreateTime(str);
			knowledgebase.setUploader(userName);
			knowledgebase.setTitle(title);
			knowledgebase.setPageName(fileName);
			knowledgebase.setClassId("1");
			knowledgebase.setAttachmentName("123");
			knowledgebase.setAttention(0);
			knowledgebase.setKnowledgeId(str);
			knowledgebase.setState(0);
			
			/*cctuser=(cctuser)baseDAO.findById(cct.entity.cctuser.class, userName);
			if(cctuser==null)
				return false;
			cctuser.setWeeklyreportaddress(fileName);*/
			baseDAO.save(knowledgebase);
			baseDAO.finish();
		}
		catch(Exception e)
		{
			if(baseDAO.getTx()!=null)
			{
				baseDAO.rollBack();
			}
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public baseDAO<knowledgebase, ?> getBaseDAO() {
		return baseDAO;
	}
	public void setBaseDAO(baseDAO<knowledgebase, ?> baseDAO) {
		this.baseDAO = baseDAO;
	}

}
