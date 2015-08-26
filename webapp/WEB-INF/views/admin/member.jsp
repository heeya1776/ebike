<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<html>
<head>
	<title>쇼핑몰 관리자 홈페이지</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="/assets/css/font.css" rel="stylesheet" type="text/css">
</head>
<body bgcolor="white" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<center>
<br>
<c:import url="/WEB-INF/views/include/admin-menu.jsp"/>
<hr width='900' size='3'>
<table width="800" border="0" cellspacing="0" cellpadding="0">
	<form name="form1" method="get" action="/admin/search">
	<tr height="40">
		<td width="200" valign="bottom">&nbsp 회원수 : <font color="#FF0000">${total }</font></td>
		<td width="200">&nbsp</td>
		<td width="350" align="right" valign="bottom">
			<select name="option" class="combo1">
				<option value="1" >이름</option>
				<option value="2" >아이디</option>
			</select>
			<input type="text" name="nameorid" size="15" value="">&nbsp
		</td>
		<td width="50" valign="bottom">
			<input type="submit" value="검색">&nbsp
		</td>
	</tr>
	<tr><td height="5" colspan="4"></td></tr>
	</form>
</table>
<table width="800" border="1" cellspacing="0" bordercolordark="white" bordercolorlight="black">
	<tr bgcolor="#CCCCCC" height="23"> 
		<td width="100" align="center">ID</td>
		<td width="100" align="center">이름</td>
		<td width="100" align="center">전화</td>
		<td width="100" align="center">핸드폰</td>
		<td width="200" align="center">E-Mail</td>
		<td width="100" align="center">회원구분</td>
		<td width="100" align="center">수정/삭제</td>
	</tr>
	<c:forEach var="vo" items="${list }" varStatus="status">
		<tr bgcolor="#F2F2F2" height="23">	
			<td width="100">${vo.userId }</td>	
			<td width="100">${vo.userName }</td>	
			<td width="100">${vo.phone }</td>	
			<td width="100">${vo.cellPhone }</td>	
			<td width="200">${vo.email }</td>	
			<td width="100" align="center">${vo.userType }</td>	
			<td width="100" align="center">
				<a href="#">수정</a>/
				<a href="#">삭제</a>
			</td>
		</tr>
	</c:forEach>
</table>
<br>
<table width="800" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="30" class="cmfont" align="center">
			<a href="/admin/memberform/1"> << </a>
			<a href="/admin/memberform/${page-1 }"> < </a> 
			<c:forEach var="i" begin="${beginNo }" end="${endNo }">
				<a href="/admin/memberform/${i }">[${i }]</a>
			</c:forEach>
			<a href="/admin/memberform/${page+1 }"> > </a>
			<a href="/admin/memberform/${(total+1)/2 }"> >> </a>
		</td>
	</tr>
</table>
</center>
</body>
</html>