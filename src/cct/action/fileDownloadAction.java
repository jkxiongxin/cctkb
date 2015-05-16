package cct.action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import cct.service.downloadService;

/**
 * @author ����
 * @see #execute()
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description �����ļ��Ķ�����
 *
 */
public class fileDownloadAction extends ActionSupport{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fileName;//�ļ���
	private String userName;//�û���
	private downloadService downloadService;//�����ļ��Ĵ�����
	/**
	 * @author ����
	 * @version 1.0
	 * @Description �õ����ص��ļ�
	 * @return �������
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
	        //�õ��������ص��ļ��� 
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
