package cct.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import cct.utils.ReflectUtil;

/**
 * @author ����
 * @CreateDate 2015/4/20
 * @version 1.1
 * @Description ���ݿ����ͨ��ʵ����
 * @param <T>
 * @param <PK>
 */
/*
 * @adder ����
 * 
 * @addDate 2015/4/20
 * 
 * @addContent public Object findById(@SuppressWarnings("rawtypes") Class c, int
 * ID) throws Exception { // TODO Auto-generated method stub return
 * session.get(c, ID); }
 * 
 * @SuppressWarnings("rawtypes")
 * 
 * @Override public Object findById(Class c, String ID) throws Exception { //
 * TODO Auto-generated method stub return session.get(c, ID); }
 * 
 * @adder ����
 * 
 * @addDate 2015/4/23
 * 
 * @addContent
 * 
 * @Override public SQLQuery query(String sql) { // TODO Auto-generated method
 * stub return session.createSQLQuery(sql); }
 */
@SuppressWarnings("unused")
public class baseDAOImpl<T, PK extends Serializable> extends
		HibernateDaoSupport implements baseDAO<T, PK> {
	private Class<?> entityClass;
	private Session session;

	public Class<?> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<?> entityClass) {
		this.entityClass = entityClass;
	}

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}

	public void setTx(Transaction tx) {
		this.tx = tx;
	}

	private Transaction tx;

	public baseDAOImpl() {
		// new��һ��������󣬸����е�this�������е�this
		entityClass = ReflectUtil.getSuperClassGenricType(this.getClass(), 0);
	}

	/*
	 * (non-Javadoc) �������
	 * 
	 * @see cct.dao.baseDAO#save(java.lang.Object)
	 */
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		getSession().save(t);
	}

	/*
	 * (non-Javadoc) ɾ������
	 * 
	 * @see cct.dao.baseDAO#delete(java.lang.Object)
	 */
	@Override
	public void delete(T t) {
		// TODO Auto-generated method stub
		getSession().delete(t);
	}

	/*
	 * (non-Javadoc) ���¶���
	 * 
	 * @see cct.dao.baseDAO#update(java.lang.Object)
	 */
	@Override
	public void update(T t) {

		// TODO Auto-generated method stub
		getSession().update(t);
	}

	/*
	 * (non-Javadoc) ͨ��sql����ѯ�����б�
	 * 
	 * @see cct.dao.baseDAO#findByQuery(java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByQuery(String hql) {
		// TODO Auto-generated method stub
		return (List<T>) getSession().createQuery(hql).list();
	}

	/*
	 * (non-Javadoc) ��ʼ����
	 * 
	 * @see cct.dao.baseDAO#begin()
	 */
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		session = getHibernateTemplate().getSessionFactory().openSession();
		tx = session.beginTransaction();
	}

	/*
	 * (non-Javadoc) ��������
	 * 
	 * @see cct.dao.baseDAO#finish()
	 */
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		tx.commit();
		session.flush();
	}

	/*
	 * (non-Javadoc) ����ع�
	 * 
	 * @see cct.dao.baseDAO#rollBack()
	 */
	@Override
	public void rollBack() {
		// TODO Auto-generated method stub
		tx.rollback();
	}

	/*
	 * (non-Javadoc) �õ�����������
	 * 
	 * @see cct.dao.baseDAO#getTx()
	 */
	@Override
	public Transaction getTx() {
		// TODO Auto-generated method stub
		return tx;
	}

	@Autowired
	public void setSessionFactoryOverride(SessionFactory sessionFactory) {

		super.setSessionFactory(sessionFactory);
	}

	/*
	 * (non-Javadoc) ͨ�������õ�����
	 * 
	 * @see cct.dao.baseDAO#findById(java.lang.Class, int)
	 */
	@Override
	public Object findById(@SuppressWarnings("rawtypes") Class c, int ID)
			throws Exception {
		// TODO Auto-generated method stub
		return session.get(c, ID);
	}

	/*
	 * (non-Javadoc) ͨ��������ö���
	 * 
	 * @see cct.dao.baseDAO#findById(java.lang.Class, java.lang.String)
	 */
	@SuppressWarnings("rawtypes")
	@Override
	public Object findById(Class c, String ID) throws Exception {
		// TODO Auto-generated method stub
		return session.get(c, ID);
	}

	/*
	 * (non-Javadoc) ͨ��������ö���
	 * 
	 * @see cct.dao.baseDAO#findById(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public T findById(PK id) {
		// TODO Auto-generated method stub

		return (T) getSession().get(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		// TODO Auto-generated method stub
		if (getSession().createCriteria(entityClass) != null) {
			return getSession().createCriteria(entityClass).list();
		} else {
			return null;
		}
	}

	/*
	 * (non-Javadoc) ִ��sql���
	 * 
	 * @see cct.dao.baseDAO#query(java.lang.String)
	 */
	@Override
	public SQLQuery query(String sql) {
		// TODO Auto-generated method stub
		return session.createSQLQuery(sql);
	}

	/*
	 * (non-Javadoc) ȡ���ض���Χ�Ķ���
	 * 
	 * @see cct.dao.baseDAO#findList(int, int)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findList(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return getSession().createCriteria(entityClass)
				.setFirstResult((pageNo - 1) * pageSize)
				.setMaxResults(pageSize).list();
	}

	/*
	 * (non-Javadoc) ȡ���ض���Χ�Ĳ�ѯ���
	 * 
	 * @see cct.dao.baseDAO#findListByQuery(int, int, java.lang.String)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findListByQuery(int pageNo, int pageSize, String hql) {
		// TODO Auto-generated method stub
		return (List<T>) getSession().createQuery(hql)
				.setFirstResult((pageNo - 1) * pageSize)
				.setMaxResults(pageSize).list();
	}
}
