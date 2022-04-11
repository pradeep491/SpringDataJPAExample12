package com.test.spring;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>{
	 List<Customer> findByCustname(String custName);
}
