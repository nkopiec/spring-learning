package pl.java;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeIRepository {
	
	private JdbcTemplate jdbcTemplate;
	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);

	}

	public EmployeI getEmployeIById(String id) {
		RowMapper<EmployeI> rowMapper = new RowMapper<EmployeI>() {
			public EmployeI mapRow(ResultSet rs, int rowNum) throws SQLException {
				EmployeI employeI = new EmployeI();
				employeI.setId(rs.getString("id"));
				employeI.setFirstName(rs.getString("firstName"));
				employeI.setLastName(rs.getString("lastName"));
				employeI.setSalary(rs.getDouble("salary"));
				return employeI;
			}
		};
		String sql = "SELECT * FROM employei WHERE id = ?";
		return jdbcTemplate.queryForObject(sql, rowMapper, id);
	}
}


