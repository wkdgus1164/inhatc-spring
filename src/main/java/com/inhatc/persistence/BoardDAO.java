package com.inhatc.persistence;

import java.util.List;

import com.inhatc.domain.BoardVO;

public interface BoardDAO {
	public void insertBoard(BoardVO vo);

	public BoardVO readBoard(int bno) throws Exception;

	public void updateBoard(BoardVO vo) throws Exception;

	public void deleteBoard(int bno) throws Exception;

	public int listCount() throws Exception;

	public List<BoardVO> listAll() throws Exception;
}
