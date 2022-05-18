package com.inhatc.persistence;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	private static final String namespace = "com.inhatc.mapper.BoardMapper";

	@Override
	public void insertBoard(BoardVO vo) {
		sqlSession.insert(namespace + ".create", vo);
	}

	@Override
	public BoardVO readBoard(int bno) throws Exception {
		return (BoardVO) sqlSession.selectOne(namespace + ".read", bno);
	}

	@Override
	public void updateBoard(BoardVO vo) throws Exception {
		sqlSession.update(namespace + ".update", vo);
	}

	@Override
	public void deleteBoard(int bno) throws Exception {
		sqlSession.update(namespace + ".delete", bno);
	}

	@Override
	public int listCount() throws Exception {
		return sqlSession.selectOne(namespace + ".listCount");
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return sqlSession.selectOne(namespace + ".listCount");
	}
}
