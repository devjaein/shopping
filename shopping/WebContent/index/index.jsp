<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>서하</title>
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
      
      <div class="topslide">
         <ul>
            <c:forEach items="${topDress}" var="dto">
               <li><a
                  href="../dressDetails/dressDetails_view.do?dressid=${dto.dressId }"
                  style="width: 500px;">${dto.dressimg}</a></li>
            </c:forEach>
         </ul>
      </div>
      <div class="middWeekly">
         <ul class="middList">
            <c:forEach items="${midDress}" var="dto">
               <li><a
                  href="../dressDetails/dressDetails_view.do?dressid=${dto.dressId }">${dto.dressimg }</a></li>
            </c:forEach>
         </ul>

      </div>

      <div class="listbox">
         <c:forEach items="${bottomDress}" var="dto">
            <ul class="dressimg">
               <li><a
                  href="../dressDetails/dressDetails_view.do?dressid=${dto.dressId }">${dto.dressimg }</a>
               </li>
               <li>${dto.dressName }</li>
               <li>${dto.price }원</li>
            </ul>
         </c:forEach>
      </div>
   </div>
      <div id="bott">
         <jsp:include page="../section/footer.jsp" />
      </div>
   </div>
</body>
</html>