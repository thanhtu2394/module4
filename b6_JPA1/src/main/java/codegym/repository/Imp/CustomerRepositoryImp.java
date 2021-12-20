package codegym.repository.Imp;

import codegym.model.Customer;
import codegym.repository.CustomerRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
@Transactional
public class CustomerRepositoryImp implements CustomerRepository {
    @PersistenceContext
    private EntityManager em;


    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query=em.createQuery("select c from Customer c",Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(Long id) {
        return em.find(Customer.class,id);
    }


    @Override
    public void save(Customer customer) {
        em.persist(customer);
    }

    @Override
    public void update(Customer customer) {
        em.merge(customer);
    }

    @Override
    public void remove(Long id) {
        Customer customer=em.find(Customer.class,id);
        em.remove(customer);

    }
}
