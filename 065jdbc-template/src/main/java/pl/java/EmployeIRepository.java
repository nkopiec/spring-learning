package pl.java;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeIRepository {
	private JdbcTemplate jdbcTemplate;
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	public EmployeI getEmployeIById(String id) {
		String sql = "SELECT * FROM employei WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, new EmployeIRowMapper(), id);
	}
	
	public List<EmployeI> getAllEmployeI() {
		String sql = "SELECT * FROM employei";
		return jdbcTemplate.query(sql, new EmployeIRowMapper());
	}
	
	private static class EmployeIRowMapper implements RowMapper<EmployeI> {
		public EmployeI mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeI employeI = new EmployeI();
				employeI.setId(rs.getString("id"));
				employeI.setFirstName(rs.getString("firstName"));
				employeI.setLastName(rs.getString("lastName"));
				employeI.setSalary(rs.getDouble("salary"));
				return employeI;
		}
	}
	
	public List<Map<String, Object>> getSalaryHight(double minSalary, double maxSalary) {
		String sql = "SELECT count(*) FROM employei WHERE salary >= :minSalary AND salary <= :maxSalary";
		MapSqlParameterSource parameters= new MapSqlParameterSource("minSalary", minSalary).addValue("maxSalary", maxSalary);
		return namedParameterJdbcTemplate.queryForList(sql, parameters);
	}
	
	public List<Map<String, Object>> getProfesion(List<String> profesion){
		String sql = "SELECT count(*) FROM employei WHERE profesion in (:profesion)";
		Map<String, List<String>> parameters = Collections.singletonMap("profesion", profesion);
		return namedParameterJdbcTemplate.queryForList(sql, parameters);
	}
}


