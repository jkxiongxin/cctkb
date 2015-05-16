package cct.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

import cct.service.addExcelAddressService;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 李想
 * @CreateDate 2015/4/20
 * @version 1.0
 * @Description 上传周报的动作类
 * @see #execute()
 */
public class uploadWeeklyReportAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private addExcelAddressService addExcelAddressService;//上传excel表格的代理对象
	private String username;//用户名
    private File file;//文件
    private String fileFileName;//文件名
    private String fileContentType;//文件类型
	/* (non-Javadoc)
	 * @author 李想
	 * @CreateDate 2015/4/20
	 * @version 1.0
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 * @return success上传成功 fail上传失败
	 */
	public String execute() throws Exception
	{
		    String root = ServletActionContext.getServletContext().getRealPath("/upload");
	        InputStream is = new FileInputStream(file);
	        
	        OutputStream os = new FileOutputStream(new File(root, fileFileName)); 
	        byte[] buffer = new byte[500];
	        while(-1 != (is.read(buffer, 0, buffer.length)))
	        {
	            os.write(buffer);
	        }
	        
	        os.close();
	        is.close();    
	     return "success";
	}
	public addExcelAddressService getAddExcelAddressService() {
		return addExcelAddressService;
	}
	public void setAddExcelAddressService(
			addExcelAddressService addExcelAddressService) {
		this.addExcelAddressService = addExcelAddressService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public String getFileFileName() {
		return fileFileName;
	}
	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	public String getFileContentType() {
		return fileContentType;
	}
	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}
}
