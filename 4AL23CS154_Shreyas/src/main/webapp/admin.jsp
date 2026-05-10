<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<meta charset="UTF-8">

<title>Authority Panel</title>

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
Authority Panel
</span>

</div>
</nav>

<div class="container mt-5">

<div class="card shadow p-4">

<h2 class="mb-4">Add Employee</h2>

<form action="PayrollServlet" method="post">

<div class="row">

<div class="col-md-6 mb-3">
<label>ID</label>
<input type="text" name="id"
class="form-control">
</div>

<div class="col-md-6 mb-3">
<label>Name</label>
<input type="text" name="name"
class="form-control">
</div>

<div class="col-md-6 mb-3">
<label>Role</label>

<select name="role" class="form-select">
<option>Nurse</option>
<option>Physician</option>
<option>Pharmacist</option>
<option>Radiologist</option>
<option>Administrative Staff</option>


</select>

</div>

<div class="col-md-6 mb-3">
<label>Hours Worked</label>
<input type="number" name="hours" 
class="form-control" required>
</div>

<div class="col-md-6 mb-3">
<label>Rate Per Hour</label>
<input type="number" name="rate"
class="form-control" required>
</div>

<div class="col-md-6 mb-3">
<label>Allowance</label>
<input type="number" name="allowance"
class="form-control" required>
</div>

<div class="col-md-6 mb-3">
<label>Deduction</label>
<input type="number" name="deduction"
class="form-control" required>
</div>

</div>

<button class="btn btn-primary">
Add Employee
</button>

</form>

</div>

</div>

</body>
</html>