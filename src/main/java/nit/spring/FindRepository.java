package nit.spring;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FindRepository extends JpaRepository<Employee, Integer> {

	//simple select
	List<Employee> findByname(String name);
    
	List<Employee> findBysalaryGreaterThan(Double salary);
	
	List<Employee> findBysalaryLessThanEqual(Double salary);
}
