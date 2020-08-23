<!--
    회원관리 페이지
-->

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>회원관리 페이지</title>
</head>
<body>
<h1>회원관리 페이지</h1>

<div>
    <select name="search_grade">
        <option value="">학년선택</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
    </select>
    <select name="search_stat">
        <option value="">상태</option>
        <c:forEach var="item" items="${user_stat_list}">
            <option value="${item.stat_numb}">${item.stat_name}</option>
        </c:forEach>
    </select>
    <select name="search_money">
        <option value="">회비</option>
        <option value="0">X</option>
        <option value="1">O</option>
    </select>
</div>

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
            <th>관리자권한</th>
        </thead>
        <tbody>
            <c:forEach var="item" items="${user_list}">
                <tr>
                    <td>${item.user_numb}</td>
                    <td>${item.user_name}</td>
                    <td>${item.user_grad}</td>
                    <td><fmt:formatDate pattern="yyyy/MM/dd" value="${item.user_birt}" /></td>
                    <td>${item.user_stat}</td>
                    <td>
                        <c:if test="${item.user_mone eq 0}">
                            X
                        </c:if>
                        <c:if test="${item.user_mone eq 1}">
                            O
                        </c:if>
                    </td>
                    <td>${item.user_phon}</td>
                    <td>${item.user_flag}</td>
                    <td><c:if test="${item.pass_word ne null}">O</c:if>
                        <c:if test="${item.pass_word eq null}">X</c:if></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
