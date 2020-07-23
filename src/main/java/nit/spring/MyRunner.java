package nit.spring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

	@Autowired
	private FindRepository repo;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//repo.saveAll(Arrays.asList(new Employee(1,"aditya",45875.55,"dev"),new Employee(2,"aajinkya",35476.2,"test"),new Employee(3,"shivam",867158.544,"QA"),new Employee(4,"onkar",68176.55,"Anylist")));

		repo.findByname("aditya").forEach(System.out::println);
		repo.findBysalaryGreaterThan(1200.9).forEach(System.out::println);
		repo.findBysalaryLessThanEqual(999909.9).forEach(System.out::println);
	}

}
