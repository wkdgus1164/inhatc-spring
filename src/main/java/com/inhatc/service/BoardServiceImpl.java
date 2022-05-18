package com.inhatc.service;

import java.util.List;
import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.inhatc.domain.BoardVO;
import com.inhatc.persistence.BoardDAO;

@Repository
public class BoardServiceImpl implements BoardService {
	@Inject BoardDAO dao;

	@Override
	public void regist(BoardVO vo) throws Exception {
		dao.insertBoard(vo);
	}

	@Override
	public BoardVO read(Integer bno) throws Exception {
		return dao.readBoard(bno);
	}

	@Override
	public void modify(BoardVO vo) throws Exception {
		dao.updateBoard(vo);
		
	}

	@Override
	public void delete(Integer bno) throws Exception {
		dao.deleteBoard(bno);
		
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return dao.listAll();
	}
	
}
