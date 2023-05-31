package com.myboard.service;

import java.util.List;
import java.util.Map;

// import com.myboard.domain.PagingVO;
import com.myboard.domain.BoardVO;

public interface BoardService {

	int insertBoard(BoardVO board);
	
	List<BoardVO> selectAll(Map<String, Integer> map);
	// List<BoardVO> selectBoardAllPaging(PagingVO paging);

	// 글번호에 해당하는 글 가져오기
	BoardVO selectBoardByIdx(int num);

	// 조회수 증가하기
	int updateReadnum(int num);

	int deleteBoard(int num);

	int updateBoard(BoardVO board);
	
	//총 게시글 수 가져오기
	int getTotalCount();
	
	//검색한 총 게시글 수 가져오기
	//int getTotalCount(PagingVO paging);		
}
