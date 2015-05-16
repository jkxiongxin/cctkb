package cct.action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author 熊鑫
 * @createDate 2015/5/5
 * @version 1.0
 * @description 上传图片的动作类
 *
 */
@SuppressWarnings("serial")
public class imageUploadAction extends ActionSupport{
    
    private File image; //上传的文件
    private String imageFileName; //文件名称
    private String imageContentType; //文件类型
    private JSONObject jsonObject=new JSONObject();//路径
    
    public String execute() throws Exception {
    	try{
	    	String realpath = ServletActionContext.getServletContext().getRealPath("/upload");
	        HttpServletResponse response = ServletActionContext.getResponse();  
	        response.setCharacterEncoding("utf-8");
	        //D:\apache-tomcat-6.0.18\webapps\struts2_upload\images
	        System.out.println("realpath: "+realpath);
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");//设置日期格式
	        imageFileName=df.format(new Date())+imageFileName;
	            File savefile = new File(realpath+"/"+imageFileName);
	            if (!savefile.getParentFile().exists())
	                savefile.getParentFile().mkdirs();
	            FileUtils.copyFile(image, savefile);
	            jsonObject.put("message", "success");
	            jsonObject.put("url", "./upload/"+imageFileName);
	            ServletActionContext.getResponse().setContentType("text/html");
	            ActionContext.getContext().put("message", "./upload/"+imageFileName);
    	}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
        
        return SUCCESS;
    }

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}


	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getImageContentType() {
		return imageContentType;
	}

	public void setImageContentType(String imageContentType) {
		this.imageContentType = imageContentType;
	}

	public JSONObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}




}