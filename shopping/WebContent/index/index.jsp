<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/header.css">
<link rel="stylesheet" href="../css/middle.css">
<link rel="stylesheet" href="../css/footer.css">
</head>
<style>
.dressImg img {
   width: 280px;
}

ul li {
   list-style: none;
}

.main {
   font-family: Go, Arial, malgun gothic,        , NanumGothic, dotum,     ,
      sans-serif;
   font-weight: bold;
   padding-right: 30px;
   text-align: center;
   display: flex;
   flex-flow: wrap;
}

</style>
<body>
   <div id="top">
      <div id="header">
         <jsp:include page="../section/header.jsp" />
      </div>
      <div class="main">
         <ul class=dressImg>
            <c:forEach items="${dtost}" var="dto">
					<li><a
						href="../dressDetails/dressDetails_view.do?dressid=${dto.dressId }">${dto.dressimg }</a>
					</li>
					<li>${dto.dressName }</li>
					<li>${dto.price }원</li>
				</c:forEach>
         </ul>
      </div>
      <div id="bott">
         <jsp:include page="../section/footer.jsp" />
      </div>
   </div>
</body>
</html>