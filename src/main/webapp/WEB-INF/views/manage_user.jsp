<!--
    회원관리 페이지
-->

<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<script src="http://code.jquery.com/jquery-latest.js"></script>
<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.24.0/moment.min.js"></script>
<script type="text/javascript">
    // 셀렉트박스 비동기 검색
    function search_by_selectbox() {
        $.ajax({
            type: "POST",
            url: "<c:url value='/search_by_selectbox'/>",
            dataType:"json",
            data: {
                search_grade : $("#search_grade").val(),    // 학년 검색값
                search_stat : $("#search_stat").val(),      // 상태 검색값
                search_money : $("#search_money").val(),    // 회비 입금여부 검색값
                search_flag : $("#search_flag").val()       // 기수 검색값
            },
            success: function(result){
                $("#search_table > tbody").empty();         // 테이블 지우
                var user_mone = "";
                var pass_word = "";
                var date = new Date();
                for(var i = 0; i<result.length; i++){기
                    // 회비 입금 상태가 0이면 미입금
                    //              1이면 입금
                    if(result[i].user_mone == 0)
                        user_mone="X";
                    else
                        user_mone="O";

                    // 비밀번호가 존재하면 관리자
                    if(result[i].pass_word != null)
                        pass_word = "O";
                    else
                        pass_word = "X";

                    // 검색값 테이블에 추가 
                    $('#search_table > tbody:last').append('<tr ><td>'+ result[i].user_numb +'</td><' +
                        '<td>'+ result[i].user_name +'</td>' +
                        '<td>'+ result[i].user_grad +'</td>' +
                        '<td>'+ moment(result[i].user_birt).format('YYYY/MM/DD')+'</td>' +
                        '<td>'+ result[i].user_stat +'</td>' +
                        '<td>'+ user_mone +'</td>' +
                        '<td>'+ result[i].user_phon +'</td>' +
                        '<td>'+ result[i].user_flag +'</td>' +
                        '<td>'+ pass_word +'</td></tr>'
                    );
                }
            },
            error: function (jqXHR, textStatus, errorThrown) {
                alert("오류가 발생하였습니다.");
            }
        });
    }
</script>
<html lang="en" xmlns:th="http://www.w3.org/1999/xhtml">
<head>
    <meta charset="UTF-8">
    <title>회원관리 페이지</title>
</head>
<body>
<h1>회원관리 페이지</h1>

<div>
    <select id="search_grade" name="search_grade" onchange="search_by_selectbox()">
        <option value="">학년선택</option>
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
    </select>
    <select id="search_stat" name="search_stat" onchange="search_by_selectbox()">
        <option value="">상태</option>
        <c:forEach var="item" items="${user_stat_list}">
            <option value="${item.stat_numb}">${item.stat_name}</option>
        </c:forEach>
    </select>
    <select id="search_money" name="search_money" onchange="search_by_selectbox()">
        <option value="">회비</option>
        <option value="0">X</option>
        <option value="1">O</option>
    </select>
    <select id="search_flag" name="search_flag" onchange="search_by_selectbox()">
        <option value="">기수</option>
        <c:forEach var="item" items="${user_flag_list}">
            <option value="${item}">${item}</option>
        </c:forEach>
    </select>
</div>

<div>
    <table id="search_table">
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
