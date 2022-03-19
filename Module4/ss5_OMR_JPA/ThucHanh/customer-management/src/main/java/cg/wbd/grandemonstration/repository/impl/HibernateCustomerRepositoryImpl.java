package cg.wbd.grandemonstration.repository.impl;

import cg.wbd.grandemonstration.model.Customer;
import cg.wbd.grandemonstration.repository.CustomerRepository;
import cg.wbd.grandemonstration.service.CustomerService;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import java.util.List;

@Transactional
@Repository
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
    private static SessionFactory sessionFactory;
    private static EntityManager entityManager;
    static {
        try {
            sessionFactory = new Configuration()
                    .configure("hibernate.conf.xml")
                    .buildSessionFactory();
            entityManager = sessionFactory.createEntityManager();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Customer> findAll() {
        String queryStr = "select c from Customer as c";
        TypedQuery<Customer> query = entityManager.createQuery(queryStr,Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findOne(Long id) {
        String queryStr = "select c from Customer as c where c.id = :id";
        TypedQuery<Customer> query = entityManager.createQuery(queryStr,Customer.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public Customer save(Customer customer) {
        Session session = null;
        Transaction transaction = null;
        try{
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            Customer origin = findOne(customer.getId());
            origin.setName(customer.getName());
            origin.setEmail(customer.getEmail());
            origin.setAddress(customer.getAddress());
            session.saveOrUpdate(origin);
            transaction.commit();
            return origin;
        }catch (Exception e){
            e.printStackTrace();
            if (transaction != null){
                transaction.rollback();
            }
        }finally {
            if (session != null){
                session.close();
            }
        }
        return null;
    }
}
