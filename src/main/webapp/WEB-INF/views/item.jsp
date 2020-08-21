<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>아이템 페이지</title>
</head>
<body>
    <table>
        <tr>
            <th>번호</th>
            <th>카테고리</th>
            <th>모델명</th>
            <th>갯수</th>
            <th>상태</th>
        </tr>
        <c:forEach var="item" items="${list}">
        <tr>
            <td>${item.ITEM_NUMB}</td>
            <td>${item.CATE_NUMB}</td>
            <td>${item.ITEM_MODE}</td>
            <td>${item.ITEM_AMNT}</td>
            <td>${item.ITEM_STAT}</td>
        </tr>
    </table>
</body>
</html>