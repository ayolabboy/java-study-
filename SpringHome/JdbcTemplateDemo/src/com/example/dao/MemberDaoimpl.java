package com.example.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.vo.MemberVO;

@Repository("MemberDao")
public class MemberDaoimpl implements MemberDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberVO> selectAll() {
		// TODO Auto-generated method stub
		return null;
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
