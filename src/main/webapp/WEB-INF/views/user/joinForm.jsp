<%@ include file="../layout/header.jsp"%>
<div class="container">

    <form>
      <div class="form-group">
        <label for="username">User Name:</label>
        <input type="username" class="form-control" placeholder="Enter Username" id="username">
      </div>
      <div class="form-group">
        <label for="email">Email address:</label>
        <input type="email" class="form-control" placeholder="Enter email" id="email">
      </div>
      <div class="form-group">
        <label for="password">Password:</label>
        <input type="password" class="form-control" placeholder="Enter password" id="password">
      </div>


    </form>
    <button id="btn-save" class="btn btn-primary">Join</button>

</div>
<script src="/blog/js/user.js"></script>
<%@ include file="../layout/footer.jsp"%>



