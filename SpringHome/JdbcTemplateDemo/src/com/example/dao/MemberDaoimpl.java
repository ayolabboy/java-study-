package com.example.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("MemberDao")
public class MemberDaoimpl implements MemberDao {

	//@Autowired
	//JdbcTemplate jdbcTemplate;
	private JdbcTemplate jdbcTemplate;
	
	private class MyRowMapper implements RowMapper<MemberVO>{
		@Override
		public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {			
			MemberVO member = new MemberVO(rs.getString("userid"),rs.getString("name"),rs.getInt("age"));
			return member;
		}		
	}
	
	@Override
	public int insert(MemberVO member) {
		String sql = "INSERT INTO Member VALUES(?,?,?)";
		return this.jdbcTemplate.update(sql,member.getUserid(),member.getName(),member.getAge());		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public MemberVO select(String userid) {		
		String sql = "SELECT userid,name,age FROM world.Member WHERE userid = ?";
		return this.jdbcTemplate.queryForObject(sql,new String[] {userid} ,new MyRowMapper());
	}

	@Override
	public List<MemberVO> selectAll() {		
		String sql = "SELECT userid,name,age FROM world.Member ORDER BY age DESC";
		return this.jdbcTemplate.query(sql, new MyRowMapper());
	}

	@Override
	public int update(MemberVO member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String userid) {
		// TODO Auto-generated method stub
		return 0;
	}

}
