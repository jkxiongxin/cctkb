package cct.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cct.service.downloadService;

/**
 * @author 李想
 * @see #execute()
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 下载文件的动作类
 *
 */
public class fileDownloadAction extends ActionSupport{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName;//文件名
	private String userName;//用户名
	private downloadService downloadService;//下载文件的代理类
	/**
	 * @author 李想
	 * @version 1.0
	 * @Description 得到下载的文件
	 * @return 输入对象
	 * @CreateDate 2015/4/20
	 */
	public InputStream getDownloadFile()
	    {
		   System.out.print(fileName);
	        return ServletActionContext.getServletContext().getResourceAsStream("/upload/"+fileName);
	    }
	    
	    @Override
	    public String execute() throws Exception
	    {
	        return SUCCESS;
	    }

	    public String getFileName() throws UnsupportedEncodingException {
	        fileName=new String(fileName.getBytes(),"ISO-8859-1"); 
	        return fileName;
	    }
	    public void setFileName(String fileName) {
	        //得到请求下载的文件名 
	        this.fileName=fileName;
	    }

		public String getUserName() {
			return userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}

		public downloadService getDownloadService() {
			return downloadService;
		}

		public void setDownloadService(downloadService downloadService) {
			this.downloadService = downloadService;
		}

}
