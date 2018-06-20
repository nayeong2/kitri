package com.kitri.ajax.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kitri.ajax.model.BookDto;

/**
 * Servlet implementation class ToolTip
 */
@WebServlet("/tooltip")
public class ToolTip extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Map<String, BookDto> map;
	
	public void init() {
		map= new HashMap<String, BookDto>();
		
		BookDto book1= new BookDto("1", "ä�Ҹ� �⸣��", "Ŭ", 15000);
		BookDto book2= new BookDto("2", "������ ����", "������", 16000);
		BookDto book3= new BookDto("3", "���������� ����", "���е���", 13500);
		BookDto book4= new BookDto("4", "�ϸ��͸� ������ �� ���ߴ�", "���������Ͽ콺", 15000);
		
		map.put(book1.getIsbn(), book1);
		map.put(book2.getIsbn(), book2);
		map.put(book3.getIsbn(), book3);
		map.put(book4.getIsbn(), book4);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String isbn= request.getParameter("isbn");
		BookDto bookDto= map.get(isbn);
		// System.out.println(bookDto);
		request.setAttribute("bookInfo", bookDto);
		RequestDispatcher dispatcher= request.getRequestDispatcher("/book.jsp");
		dispatcher.forward(request, response);
	}
}
