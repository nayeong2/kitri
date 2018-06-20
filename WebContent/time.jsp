<%@ page language="java" contentType="text/plain; charset=UTF-8"
    pageEncoding="UTF-8" import= "java.text.*, java.util.*"%>
<%
	DateFormat df= new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
	String currentTime= df.format(new Date());
%>
<%=currentTime%>