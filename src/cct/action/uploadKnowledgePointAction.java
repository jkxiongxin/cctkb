package cct.action;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import cct.service.uploadKnowledgeService;

/**
 * @author ����
 * @version 1.0
 * @CreateDate 2015/4/20
 * @see #execute()
 * @Description �ϴ�֪ʶ��Ķ�����
 */
public class uploadKnowledgePointAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private HttpServletRequest request;//�����������
	private String userName="lixiang";//�û���
	private String title;//������Ҫ���ڲ����ı�
	
	private uploadKnowledgeService  uploadKnowledgeService;//�����ļ��Ĵ�����
	/**
	 * @CreateDate 2015/4/20
	 * @author ����
	 * @version 1.0
	 * @return success�ϴ��ɹ� fail�ϴ�ʧ��
	 * @throws FileNotFoundException
	 */
	public String execute() throws FileNotFoundException
	{
		request = ServletActionContext.getRequest();
		String s=request.getParameter("aaa");
		String title1=request.getParameter("title");
		String category=request.getParameter("category");
		
        @SuppressWarnings("unused")
		int length = 0;      
         byte[] b=s.getBytes();
         FileOutputStream fos=new FileOutputStream("C:/Users/Administrator.USER-20140703FX/Desktop/cctkb/WebRoot/attached/"+title1+".txt");//�ټ�һ��ʱ���ļ���
     
         try{
        	 fos.write(b);
        	 fos.flush();
        	 fos.close();
        	 uploadKnowledgeService.uploadKnowledge(userName, title1, category, userName);
         }
         catch(Exception e)
         {
        	 System.err.print(e);
        	 e.printStackTrace();
        	 return "fail";
         }
		return "success";
	}
	public uploadKnowledgeService getUploadKnowledgeService() {
		return uploadKnowledgeService;
	}
	public void setUploadKnowledgeService(
			uploadKnowledgeService uploadKnowledgeService) {
		this.uploadKnowledgeService = uploadKnowledgeService;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

}
