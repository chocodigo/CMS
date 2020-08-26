<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>아이템 페이지</title>
</head>
<body>
        <table border="1">
            <caption>카테고리 추가</caption>
            <tr>
                <form method="POST" action="/categoryInsertProc" method="post">
                    <td><input type="text" name="CATE_NAME" style="width:60px"></td>
                    <td><button type="submit" class="btn btn-default">추가</button></td>
                </form>
            </tr>
        </table>
        <table border="1">
            <caption>자재 리스트</caption>
            <tr>
                <th>카테고리</th>
                <th>모델명</th>
                <th>갯수</th>
                <th>상태</th>
                <th> </th>
            </tr>
            <c:forEach var="item" items="${item_list}">
            <tr>
                <td>${item.CATE_NAME}</td>
                <td>${item.ITEM_MODE}</td>
                <td>${item.ITEM_AMNT}</td>
                <td>${item.ITEM_STAT}</td>
                <td><button type="submit" class="btn btn-default" onclick="location.href='/itemDeleteProc/${item.ITEM_NUMB}'">삭제</button></td>
            </tr>
            </c:forEach>
            <tr>
                <form method="POST" action="/itemInsertProc" method="post">
                <td>
                    <select name="CATE_NUMB">
                        <c:forEach var="item_category" items="${item_category_list}">
                            <option value=${item_category.CATE_NUMB}>${item_category.CATE_NAME}</option>
                        </c:forEach>
                    </select>
                </td>
                <td><input type="text" name="ITEM_MODE" style="width:60px"></td>
                <td><input type="text" name="ITEM_AMNT" style="width:60px"></td>
                <td><input type="text" name="ITEM_STAT" style="width:60px"></td>
                <td><button type="submit" class="btn btn-default">추가</button></td>
                </form>
            </tr>
        </table>
</body>
</html>