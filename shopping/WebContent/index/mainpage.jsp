<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
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
.main {
   width: 100%;
   height: 2000px;
   background-color: aqua;
}
</style>
<body>
   <div id="top">
      <div id="header">
         <jsp:include page="../section/header.jsp" />
      </div>
      <div class="main">
         
      </div>
      <div id="bott">
         <jsp:include page="../section/footer.jsp" />
      </div>
   </div>
</body>
</html>