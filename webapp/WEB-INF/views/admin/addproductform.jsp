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

<form  method="post" action="/admin/addproduct" enctype="multipart/form-data">
	
	<table width="800" border="1" cellspacing="0" cellpadding="3" bordercolordark="white" bordercolorlight="black">
		<tr height="23"> 
			<td width="100" bgcolor="#CCCCCC" align="center">상품분류</td>
	    <td width="700" bgcolor="#F2F2F2">
				<select name="productTypeNo">
					<option value="0" selected>상품분류를 선택하세요</option>
					<option value="1">바지</option>
					<option value="2">코트</option>
					<option value="3">브라우스</option>
				</select>
			</td>
		</tr>
		<tr height="23"> 
			<td width="100" bgcolor="#CCCCCC" align="center">상품코드</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="text" name="productCode" value="" size="20" maxlength="20">
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">상품명</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="text" name="productName" value="" size="60" maxlength="60">
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">제조사</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="text" name="productCompany" value="" size="30" maxlength="30">
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">원산지</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="text" name="productNation" value="" size="30" maxlength="30">
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">판매가</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="text" name="productPrice" value="" size="12" maxlength="12"> 원
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">옵션</td>
	    <td width="700" bgcolor="#F2F2F2">
				<select name="productOptioin1No">
					<option value="0" selected>옵션선택</option>
					<option value="1">사이즈</option>
					<option value="2">색상</option>
					<option value="3">기타</option>
				</select> &nbsp; &nbsp; 
	
				<select name="productOption2No">
					<option value="0" selected>옵션선택</option>
					<option value="1">사이즈</option>
					<option value="2">색상_WB</option>
					<option value="3">색상_WR</option>
				</select> &nbsp; &nbsp; 
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">제품설명</td>
			<td width="700" bgcolor="#F2F2F2">
				<textarea name="productInfo" rows="10" cols="80"></textarea>
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">상품상태</td>
	    <td width="700" bgcolor="#F2F2F2">
				<input type="radio" name="productStatus" value="1" checked> 판매중
				<input type="radio" name="productStatus" value="2"> 판매중지
				<input type="radio" name="productStatus" value="3"> 품절
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">아이콘</td>
			<td width="700" bgcolor="#F2F2F2">
				<input type="checkbox" name="productIcon1" value="1"> New &nbsp;&nbsp	
				<input type="checkbox" name="productIcon2" value="1"> Hit &nbsp;&nbsp	
				<input type="checkbox" name="productIcon3" value="1" onclick="form1.discount.disabled=!form1.discount.disabled;"> Sale &nbsp;&nbsp
				할인율 : <input type="text" name="productSale" value="0" size="3" maxlength="3" disabled> %
			</td>
		</tr>
		<tr> 
			<td width="100" bgcolor="#CCCCCC" align="center">이미지</td>
			<td width="700" bgcolor="#F2F2F2">
				<b>이미지1</b>: <input type="file" name="productImage1" size="30" value=""><br>
				<b>이미지2</b>: <input type="file" name="productImage2" size="30" value=""><br>
				<b>이미지3</b>: <input type="file" name="productImage3" size="30" value=""><br>
			</td>
		</tr>
	</table>
	<br>
	<table width="800" border="0" cellspacing="0" cellpadding="7">
		<tr> 
			<td align="center">
				<input type="submit" value="등록하기"> &nbsp;&nbsp
			</td>
		</tr>
	</table>

</form>

</center>
</body>
</html>
