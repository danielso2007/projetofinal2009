package br.com.estudo.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import br.com.estudo.dao.DaoSupport;
import br.com.estudo.dao.GenericDao;

@Transactional(propagation = Propagation.REQUIRED)
public abstract class GenericDaoImpl<T, ID extends Serializable> extends DaoSupport implements GenericDao<T, ID> {

    private static final long serialVersionUID = 1L;

    private Class<T> $Class;
    
    @SuppressWarnings("unchecked")
    public GenericDaoImpl() {
        if (getClass().getGenericSuperclass() instanceof ParameterizedType) {
            this.$Class = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        } else {
            $Class = (Class<T>) getClass().getGenericSuperclass();
        }
    }

    @Override
    public void save(T obj) {
        getSession().save(obj);
    }

    @Override
    public void update(T obj) {
        getSession().update(obj);
    }

    @Override
    public void delete(T obj) {
        getSession().delete(obj);
    }

    @SuppressWarnings("unchecked")
    @Override
    public T findById(ID id) {
        return (T) getSession().get($Class, id);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll() {
        Query query = getSession().createQuery("FROM " + $Class.getName() + " ORDER BY id");
        return query.list();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findByNamedQuery(String namedQuery) {
        return getSession().getNamedQuery(namedQuery).list();
    }
    
    @Override
    public void flush() {
        getSession().flush();
    }
    
    
}