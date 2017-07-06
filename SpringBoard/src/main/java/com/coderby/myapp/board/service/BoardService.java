package com.coderby.myapp.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.coderby.myapp.board.dao.IBoardRepository;
import com.coderby.myapp.board.model.BoardVO;

@Service
public class BoardService implements IBoardService {

	@Inject
	IBoardRepository boardRepository;
	
	@Override
	public List<BoardVO> selectList(int page) {
		return boardRepository.selectList(page);
	}

	@Override
	public BoardVO selectBoardDetails(int seq) {
		return boardRepository.selectBoardDetails(seq);
	}

	@Override
	public int insertNewBoard(BoardVO board) {
		int seq = boardRepository.getMaxSeq() + 1;
		board.setSeq(seq);
		return boardRepository.insertNewBoard(board);
	}

	@Override
	public int updateBoard(BoardVO board) {
		return boardRepository.updateBoard(board);
	}

	@Override
	public int deleteBoard(int seq) {
		return boardRepository.deleteBoard(seq);
	}

}
