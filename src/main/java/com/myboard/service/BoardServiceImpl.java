package com.myboard.service;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.myboard.domain.BoardVO;

// 나중에 BoardService에서 주석처리한 것도 추가하기
@Service("boardService")
public class BoardServiceImpl implements BoardService {

	@Override
	public int insertBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public List<BoardVO> selectAll(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BoardVO selectBoardByIdx(int num) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateReadnum(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteBoard(int num) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateBoard(BoardVO board) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		return 0;
	}

}
