<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
	<title>JTen E-Bike Shop</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8">
	<link href="/assets/css/font.css" rel="stylesheet" type="text/css">
</head>
<body style="margin:0">
<center>
<c:import url="/WEB-INF/views/include/head.jsp"/>
<c:import url="/WEB-INF/views/include/search.jsp"/>
<table width="959" border="0" cellspacing="0" cellpadding="0" align="center">
	<tr><td height="10" colspan="2"></td></tr>
	<tr>
		<td height="100%" valign="top">
			<c:import url="/WEB-INF/views/include/navigation.jsp"/>
		</td>
		<td width="10"></td>
		<td valign="top">

		<!-------------------------------------------------------------------------------------------->	
		<!-- 시작 : 다른 웹페이지 삽입할 부분                                                                                                                                                            -->
		<!-------------------------------------------------------------------------------------------->	

			<!---- 화면 우측(신상품) 시작 -------------------------------------------------->	
			<table width="767" border="0" cellspacing="0" cellpadding="0">
				<tr>
					<td height="60">
						<img src="/assets/images/main_newproduct.jpg" width="767" height="40">
					</td>
				</tr>
			</table>

			<table border="0" cellpadding="0" cellspacing="0">
				<!---1번째 줄-->
				<tr>
					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=1"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hit.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_new.gif" align="absmiddle" vspace="1"> 
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>
					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hot.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_sale.gif" align="absmiddle" vspace="1"> <font color="red">20%</font>
								</td>
							</tr>
							<tr><td height="20" align="center"><strike>89,000 원</strike><br><b>70,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 												
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 												
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 												
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

				</tr>
				<tr><td height="10"></td></tr>
				<!---2번째 줄-->
				<tr>
					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hit.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_new.gif" align="absmiddle" >
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hot.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_sale.gif" align="absmiddle" >
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>
				</tr>
				<tr><td height="10"></td></tr>
				<!---3번째 줄-->
				<tr>
					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hit.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_new.gif" align="absmiddle"> 
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 
									<img src="/assets/images/i_hot.gif" align="absmiddle" vspace="1"> <img src="/assets/images/i_sale.gif" align="absmiddle" >
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>

					<td width="150" height="205" align="center" valign="top">
						<table border="0" cellpadding="0" cellspacing="0" width="100" class="cmfont">
							<tr> 
								<td align="center"> 
									<a href="product_detail.jsp?no=109469"><img src="/assets/images/product/0000_s.jpg" width="120" height="140" border="0"></a>
								</td>
							</tr>
							<tr><td height="5"></td></tr>
							<tr> 
								<td height="20" align="center">
									<a href="product_detail.jsp?no=109469"><font color="444444">상품명1</font></a>&nbsp; 									
								</td>
							</tr>
							<tr><td height="20" align="center"><b>89,000 원</b></td></tr>
						</table>
					</td>
				</tr>
				<tr><td height="10"></td></tr>
			</table>

			<!---- 화면 우측(신상품) 끝 -------------------------------------------------->	

		<!-------------------------------------------------------------------------------------------->	
		<!-- 끝 : 다른 웹페이지 삽입할 부분                                                                                                                                                              -->
		<!-------------------------------------------------------------------------------------------->

		</td>
	</tr>
</table>
<br><br>
<c:import url="/WEB-INF/views/include/footer.jsp"/>
&nbsp
</center>
</body>
</html>