<?xml version="1.0" encoding="UTF-8"?>
<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8" import="com.kitri.ajax.model.BookDto"%>
<%
BookDto dto= (BookDto)request.getAttribute("bookInfo");
%>

<book>
	<isbn><%=dto.getIsbn()%></isbn>
	<title><%=dto.getTitle()%></title>
	<publisher><%=dto.getPublisher()%></publisher>
	<price><%=dto.getPrice()%></price>
</book>
