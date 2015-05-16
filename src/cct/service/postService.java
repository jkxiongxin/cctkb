package cct.service;

import java.util.List;

import net.sf.json.JSONObject;

import cct.entity.post;

/**
 * @author 熊鑫
 * @CreateDate 2015/4/23
 * @version 1.0
 * @Description post对象业务逻辑的代理接口
 * @adder 熊鑫	
 * @addDate 2015/5/1
 * @addContent 添加getPostFY方法实现分页查询
 */
public interface postService {
	public List<post> getPostsByNickName(String nickName);//根据昵称获取周报
	public JSONObject getPostFY(int pageNo,int pageSize,String nickName);//分页查询周报
}
