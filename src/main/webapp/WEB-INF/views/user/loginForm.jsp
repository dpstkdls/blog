<%@ include file="../layout/header.jsp"%>
<div class="container">

<form action="/action_page.php">
  <div class="form-group">
    <label for="username">User Name:</label>
    <input type="username" class="form-control" placeholder="Enter Username" id="username">
  </div>
  <div class="form-group">
    <label for="password">Password:</label>
    <input type="password" class="form-control" placeholder="Enter password" id="password">
  </div>

  <div class="form-group form-check">
    <label class="form-check-label">
      <input class="form-check-input" type="checkbox"> Remember me
    </label>
  </div>
  <button type="submit" class="btn btn-primary">Log In</button>
</form>

</div>
<%@ include file="../layout/footer.jsp"%>



