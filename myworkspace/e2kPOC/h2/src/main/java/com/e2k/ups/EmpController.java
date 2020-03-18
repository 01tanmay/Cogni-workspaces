package com.e2k.ups;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class EmpController {

	@Autowired(required = true)
	EmpService empService;

	/*
	 * Employee config = (Employee.builder()) //.host("api.server.com")
	 * .port(443).useHttps(true).connectTimeout(15_000L)
	 * .readTimeout(5_000L).username("myusername").password("secret").build();
	 */

	@GetMapping("/employes")
	private List<Employee> getAllEmployes() {
		return empService.getAllEmployees();
	}

	@GetMapping("/employes/{id}")
	private Employee getPerson(@PathVariable("id") int id) {
		return empService.getEmployeeById(id);
	}

	@DeleteMapping("/employes/{id}")
	private void deletePerson(@PathVariable("id") int id) {
		empService.delete(id);
	}

	@PostMapping("/employes")
	private String savePerson(@RequestBody Employee employee) {
		empService.saveOrUpdate(employee);
		return "New record created: " + employee.getId();
	}
}
