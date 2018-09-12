package pl.java;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	//public void setDataSource(DataSource dataSource) { 
		//jdbcTemplate = new JdbcTemplate(dataSource); 
		
	//}
	
	public int getNumberOfEmployee() {
		return jdbcTemplate.queryForObject("select count(*) from employei", Integer.class);
	}
	
	public Double getNumberOfSalary(double salaryLimit) {
		String sql = "select count(*) from employei where salary > ?";
		return jdbcTemplate.queryForObject(sql, Double.class, salaryLimit);
			
	}
	
	public Map<String, Object> getSumOfSalary(String firstName) {
		String sql = "select * from employei where firstName = ?";
		return jdbcTemplate.queryForMap(sql, firstName);
	}

	public List<Map<String, Object>> getEmployeeWithSalaryThan(double salary) {
		String sql = "select * from employei WHERE salary > ?";
		return jdbcTemplate.queryForList(sql, salary);
	}
	
	public List<Double> getEmployeeSalary() {
		String sql = "SELECT salary FROM employei";
		return jdbcTemplate.queryForList(sql, Double.class);
	}
}
