package cct.action;

import java.util.ArrayList;
import java.util.List;

import cct.entity.knowledgebase;
import cct.service.viewKnowledgeLinkService;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import net.sf.json.JSONObject;

/**
 * @author 李想
 * @version 1.0
 * @Description 查看知识点的动作类
 * @see #execute()
 * @CreateDate 2015/4/20
 *
 */
public class viewKnowledgeLinkAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private JSONObject jsonObj=new JSONObject();
	private viewKnowledgeLinkService viewKnowledgeLinkService;//查看知识点的代理对象
	/**
	 * @author 李想
	 * @version1.0
	 * @CreateDate 2015/4/20
	 * @return success 动作执行成功 
	 */
	public String execute()
	{
		List<String> title=new ArrayList<String>();
		List<String> time=new ArrayList<String>();
		List<String> writer=new ArrayList<String>();
		try{
		List<knowledgebase> list1=viewKnowledgeLinkService.viewknowledgeLink();
		if(list1==null)
		{
			jsonObj.put("size",0);
		}
		else
		{
			for(int i=0;i<list1.size();i++)
			{
				title.add(list1.get(i).getTitle());
				time.add(list1.get(i).getCreateTime());
				writer.add(list1.get(i).getUploader());
			}
			jsonObj.put("size", list1.size());
			jsonObj.put("writer", writer);
			jsonObj.put("title", title);
			jsonObj.put("time", time);

			}
			//多余的,actino里面要有get方法ajax才能得到
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return Action.SUCCESS;
	}
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	public viewKnowledgeLinkService getViewKnowledgeLinkService() {
		return viewKnowledgeLinkService;
	}
	public void setViewKnowledgeLinkService(
			viewKnowledgeLinkService viewKnowledgeLinkService) {
		this.viewKnowledgeLinkService = viewKnowledgeLinkService;
	}

}
