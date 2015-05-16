package cct.action;

/**
 * @author ¿ÓœÎ
 * @CreateDate 2015/4/20
 * @version 1.0
 *
 */
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cct.service.clickKnowledgeService;

public class clickKnowledgeAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String title;
	private clickKnowledgeService clickKnowledgeService;
	public String execute() throws UnsupportedEncodingException
      {
		HttpServletRequest request=ServletActionContext.getRequest();
		String html="";
		String str1 = new String(title.getBytes("iso-8859-1"),"utf-8");
		
		try {
			 Scanner in = new Scanner(new File("F:/javarun/cctkb/WebRoot/attached/"+str1+".txt"));
			 while (in.hasNextLine()) {
				 
	                String str = in.nextLine();
	                html=html+str;
			 }
			 request.setAttribute("html", html);
		      		} catch (Exception e) {
			
			e.printStackTrace();
			return "fail";
		}
    	  
    	  return "success";
      }
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public clickKnowledgeService getClickKnowledgeService() {
		return clickKnowledgeService;
	}
	public void setClickKnowledgeService(clickKnowledgeService clickKnowledgeService) {
		this.clickKnowledgeService = clickKnowledgeService;
	}
}
