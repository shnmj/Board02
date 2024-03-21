package com.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.board.domain.BoardVo;
import com.board.mapper.BoardMapper;

@SpringBootTest
class Board2ApplicationTests {
	
	// DataSource ds = new DataSource(); // spring 자동 실행
	@Autowired  // Spring이 자동으로 생성한 ds를 연결 
	private DataSource ds;
	
	@Autowired
	private BoardMapper boardMapper;
	
	// junit test (단위 테스트) - 함수 1개 test
	@Test
	void contextLoads() {
	}
	
	@Test
	void test1( ) {
		double n1 = 10;
		double n2 = 3;
		double n  = n1 / n2;
		System.out.println(n);
		// assertEquals(n, 3.5);
		assertEquals(n, 3.5, 0.5); // 오차 범위 : +- 0.5
	}
	
	// db 연동 tests - ojdbc가 사용하는 
	// class(component) interface(DataSource. SqlSessionTemplate, SqlSession) 들을 불러서 test
	// DataSource          : db 연결 담당 ; 연결 문자열 담당
	// SqlSessionTemplate  : boardmapper.xml 경로 지정
	// SqlSession          : 실제 db 조작
	
	// db 연결 확인
	@Test
	void testConnection() throws SQLException {
		System.out.println(ds); // HIkariDataSource (null)
		Connection conn = ds.getConnection();
		System.out.println(conn);
		conn.close();
	}
	
	// db 저장 확인 - sql문 test : Insert
	@Test
	void testInsert() {
		BoardVo vo = new BoardVo();
		vo.setTitle("Springboot 글쓰기");
		vo.setContent("글 내용입니다");
		vo.setWriter("Sys");
		boardMapper.boardInsert(vo);
		
		
	}

}
