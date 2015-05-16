package cct.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

/**
 * @author 熊鑫
 * @version 1.1
 * @CreateDate 2015/4/20
 * @Description 数据库操作通用接口
 * @adder 李想
 * @addDate 2015/4/20
 * @addContent 
 * public Object findById(Class c,String ID) throws Exception;
 *	public Object findById(Class c,int ID) throws Exception; 
 * @param <T>
 * @param <PK>
 * @adder 熊鑫
 * @addDate 2015/4/23
 * @addContent public SQLQuery query(String sql);//执行sql语句
 * @adder 熊鑫
 * @addDate 2015/4/28
 * @addContent public List<T> findList(int pageNo, int pageSize);//限制取出数量
 * @adder 熊鑫
 * @addDate 2015/5/1
 * @addContent 增加方法findListByQuery();
 */
public interface baseDAO<T, PK extends Serializable> {
	public void save(T t);
	public void delete(T t);
	public void update(T t);
	@SuppressWarnings("rawtypes")
	public Object findById(Class c,String ID) throws Exception;
	@SuppressWarnings("rawtypes")
	public Object findById(Class c,int ID) throws Exception;
	public T findById(PK id);
	public List<T> findByQuery(String hql);
	public void begin();
	public List<T> findAll();
	public void finish();
	public void rollBack();
	public Transaction getTx();
	public SQLQuery query(String sql);//执行sql语句
	public List<T> findList(int pageNo, int pageSize);//限制取出数量
	public List<T> findListByQuery(int pageNo,int pageSize,String hql);//取出特定范围的查询结果
}
