<!--
    회원관리 페이지
-->

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>회원관리 페이지</title>
</head>
<body>
<h1>회원관리 페이지</h1>

<div>
    <table>
        <thead>
            <th>ID</th>
            <th>이름</th>
            <th>학년</th>
            <th>생일</th>
            <th>상태</th>
            <th>회비</th>
            <th>핸드폰번호</th>
            <th>기수</th>
            <th>관리자</th>
        </thead>
        <tbody>
            <c:forEach var="item" items="${user_list}">
                <tr>
                    <td>${item.user_numb}</td>
                    <td>${item.user_name}</td>
                    <td>${item.user_grad}</td>
                    <td>${item.user_birt}</td>
                    <td>${item.user_stat}</td>
                    <td>${item.user_mone}</td>
                    <td>${item.user_phon}</td>
                    <td>${item.user_flag}</td>
                    <td>${item.pass_word}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
