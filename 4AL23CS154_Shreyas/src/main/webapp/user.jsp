<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Employee Portal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body class="bg-light">

<nav class="navbar navbar-dark bg-dark">

<div class="container-fluid">

<a href="index.jsp" class="btn btn-light">
Home
</a>

<span class="navbar-brand">
Employee Portal
</span>

</div>

</nav>

<div class="container mt-5">

<div class="card shadow p-4">

<h2 class="mb-4">
Search Salary Report
</h2>

<form action="PayrollServlet" method="get">

<label>Employee ID OR Name</label>

<input type="text"
name="search"
class="form-control mb-4">

<button class="btn btn-success">
Search
</button>

</form>

</div>

</div>

</body>
</html>