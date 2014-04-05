package com.dodecaedro.transferservice.repository;

import com.dodecaedro.transferservice.data.pojo.Customer;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RepositoryDefinition(domainClass = Customer.class, idClass = Integer.class)
@Transactional
public interface CustomerRepository {
  Customer findByCustomerId(Integer customerId);
  Customer save(Customer customer);
  List<Customer> findAll();
}
