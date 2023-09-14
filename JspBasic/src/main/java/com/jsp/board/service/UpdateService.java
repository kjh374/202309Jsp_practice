package com.jsp.board.service;

import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jsp.board.model.BoardRepository;
import com.jsp.board.model.BoardVO;

public class UpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

//		String writer = request.getParameter("writer");
//		String title = request.getParameter("title");
//		String content = request.getParameter("content");
//		BoardVO vo = new BoardVO(writer, title, content, LocalDateTime.now());

		BoardVO vo = new BoardVO(
				request.getParameter("writer"),
				request.getParameter("title"),
				request.getParameter("content"),
				LocalDateTime.now()
				);
		int bId = Integer.parseInt(request.getParameter("boardNo"));
		BoardRepository.getInstance().update(bId, vo);
	}

}
