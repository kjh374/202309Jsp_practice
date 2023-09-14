package com.jsp.board.service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class SearchService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		List<BoardVO> list = BoardRepository.getInstance().getList();
		List<BoardVO> searchList =  BoardRepository.getInstance().search(request.getParameter("keyword"));
//		List<BoardVO> searchList = new ArrayList<>();
//		for(BoardVO vo : list) {
//			if(vo.getWriter().contains(request.getParameter("keyword"))) {
//				searchList.add(vo);
//			}
//		}
		request.setAttribute("boardList", searchList);
	}

}
