package nit.spring;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

	@Id
	private Integer id;
	private String name;
	private Double salary;
	private String domain;
}
