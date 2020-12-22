<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Product</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">

</head>
<body>
<h1>New Product!</h1>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Name</span>
  <input type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>

<div class="input-group">
  <span class="input-group-text">Description</span>
  <textarea class="form-control" aria-label="With textarea"></textarea>
</div>

<div class="input-group mb-3">
  <span class="input-group-text" id="basic-addon1">Price</span>
  <input type="text" class="form-control" placeholder="" aria-label="Username" aria-describedby="basic-addon1">
</div>
<button type="button" class="btn btn-outline-success">Success</button>

</body>
</html>