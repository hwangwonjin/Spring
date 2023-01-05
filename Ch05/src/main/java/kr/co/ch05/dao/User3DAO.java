package kr.co.ch05.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import kr.co.ch05.vo.User3VO;

@Repository
public class User3DAO {

	private SqlSessionTemplate mybatis;
	
	public void insertUser3(User3VO vo) {
		mybatis.insert("user3.insertUser3", vo);
	}
	
	public User3VO selectUser3() {
		return null;
	}
	
	public List<User3VO> selectUser3s() {
		return null;
	}
	
	public void updateUser3() {
		
	}
	
	public void deleteUser3() {
		
	}
	
}
