package cct.action;

import cct.service.addWeeklyReportService;

public class addWeeklyReportAction {
   private String weekplan;
   private String weekplancometrue;
   private String grades;
   private addWeeklyReportService  addWeeklyReportService;
   public String execute()
   {
	   addWeeklyReportService.addWeeklyReport(weekplan, weekplancometrue, grades);
	   return "success";
   }
public String getWeekplan() {
	return weekplan;
}
public void setWeekplan(String weekplan) {
	this.weekplan = weekplan;
}
public String getWeekplancometrue() {
	return weekplancometrue;
}
public void setWeekplancometrue(String weekplancometrue) {
	this.weekplancometrue = weekplancometrue;
}
public String getGrades() {
	return grades;
}
public void setGrades(String grades) {
	this.grades = grades;
}
public addWeeklyReportService getAddWeeklyReportService() {
	return addWeeklyReportService;
}
public void setAddWeeklyReportService(
		addWeeklyReportService addWeeklyReportService) {
	this.addWeeklyReportService = addWeeklyReportService;
}
}
