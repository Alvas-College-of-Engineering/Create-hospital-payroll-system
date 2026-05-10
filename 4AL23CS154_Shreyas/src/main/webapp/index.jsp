<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Hospital Payroll System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
rel="stylesheet">

<style>

body{
    background:#f4f6f9;
}

.hero{
    height:80vh;
    display:flex;
    justify-content:center;
    align-items:center;
}

.card-box{
    width:300px;
    padding:40px;
    border-radius:20px;
    box-shadow:0 0 20px rgba(0,0,0,0.1);
    background:white;
}

</style>

</head>

<body>

<nav class="navbar navbar-dark bg-dark">
<div class="container-fluid">
<span class="navbar-brand mb-0 h1">
Hospital Payroll System
</span>
</div>
</nav>

<div class="hero">

<div class="card-box text-center">

<h2 class="mb-4">Dashboard</h2>

<
<a href="admin.jsp" class="btn btn-primary w-100 mb-3">
Authority Panel
</a>

<a href="user.jsp" class="btn btn-success w-100">
Employee Portal
</a>

</div>

</div>
<footer class="text-center mt-5 p-3 bg-dark text-light">

Hospital Payroll System © 2026 <br>
Developed by Shreyas

</footer>

</body>
</html>