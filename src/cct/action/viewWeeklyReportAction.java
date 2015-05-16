package cct.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import cct.entity.post;
import cct.service.viewWeeklyReportService;
import net.sf.json.JSONObject;

public class viewWeeklyReportAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JSONObject jsonObj=new JSONObject();
	private viewWeeklyReportService viewWeeklyReportService;
	//private String userName;  要取出某一成员 的全部记录。
     public String execute()
     {
    	 List<post> weeklyreportlist =null;
    	  weeklyreportlist = viewWeeklyReportService.viewWeeklyReport();
    	List<String> performance=new ArrayList<String>();
 		List<String> tTime=new ArrayList<String>();
 		List<String> nickName=new ArrayList<String>();
 		List<String> grade=new ArrayList<String>();
 		List<String> weekNo=new ArrayList<String>();
 		List<String> semester=new ArrayList<String>();
 		List<String> plan=new ArrayList<String>();
 		for(int i=0;i<weeklyreportlist.size();i++)
 		{
 			performance.add(weeklyreportlist.get(i).getPerformance());
 			tTime.add(weeklyreportlist.get(i).gettTime());
 			nickName.add(weeklyreportlist.get(i).getNickName());
 			grade.add(weeklyreportlist.get(i).getGrade());
 			//weekNo.addAll(weeklyreportlist.get(i).getWeekNo());
 			semester.add(weeklyreportlist.get(i).getSemester());
 			plan.add(weeklyreportlist.get(i).getPlan());
 			jsonObj.put("performance", performance);
 			jsonObj.put("tTime", tTime);
 			jsonObj.put("nickName", nickName);
 			jsonObj.put("grade", grade);
 			jsonObj.put("weekNo", weekNo);
 			jsonObj.put("semester", semester);
 			jsonObj.put("plan", plan);
 		}
 		
    	 return Action.SUCCESS;
     }
	public JSONObject getJsonObj() {
		return jsonObj;
	}
	public void setJsonObj(JSONObject jsonObj) {
		this.jsonObj = jsonObj;
	}
	public viewWeeklyReportService getViewWeeklyReportService() {
		return viewWeeklyReportService;
	}
	public void setViewWeeklyReportService(
			viewWeeklyReportService viewWeeklyReportService) {
		this.viewWeeklyReportService = viewWeeklyReportService;
	}
}
