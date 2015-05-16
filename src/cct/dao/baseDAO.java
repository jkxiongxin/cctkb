package cct.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Transaction;

/**
 * @author ����
 * @version 1.1
 * @CreateDate 2015/4/20
 * @Description ���ݿ����ͨ�ýӿ�
 * @adder ����
 * @addDate 2015/4/20
 * @addContent 
 * public Object findById(Class c,String ID) throws Exception;
 *	public Object findById(Class c,int ID) throws Exception; 
 * @param <T>
 * @param <PK>
 * @adder ����
 * @addDate 2015/4/23
 * @addContent public SQLQuery query(String sql);//ִ��sql���
 * @adder ����
 * @addDate 2015/4/28
 * @addContent public List<T> findList(int pageNo, int pageSize);//����ȡ������
 * @adder ����
 * @addDate 2015/5/1
 * @addContent ���ӷ���findListByQuery();
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
	public SQLQuery query(String sql);//ִ��sql���
	public List<T> findList(int pageNo, int pageSize);//����ȡ������
	public List<T> findListByQuery(int pageNo,int pageSize,String hql);//ȡ���ض���Χ�Ĳ�ѯ���
}
