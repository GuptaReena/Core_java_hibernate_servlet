<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<title>Login Failed</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
<script>
	$(document).ready(function(){
		$("#myModal").modal('show');
	});
</script>
</head>
<body>
<div id="myModal" class="modal fade">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header bg-danger text-light">
                <h5 class="modal-title">Login Failed</h5>
                   </div>
            <div class="modal-body">
				<div class="alert alert-danger" role="alert">
  You have entered Wrong Username or Password. Enter Correct Username and Password. To enter again Username and Password please login again by clicking below <strong class="text-info">Login Again</strong></div>
            </div>
            
            <div class="modal-footer">
        <Button type="button" style="border-radius: 30px;" class="btn btn-outline-info btn-lg" data-dismiss="modal" onclick="window.location.href='login.jsp'; return false;">Login Again</button>
        
      </div>
        </div>
    </div>
</div>
</body>
</html>