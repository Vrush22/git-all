<!doctype html>
<html lang="en">

<head>
  <!-- Required meta tags -->
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- Bootstrap CSS -->
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

  <title>Hello, world!</title>
</head>

<body>
  <h2>Form validation - first form!</h2>

  <div class="container">
    <div class="row">
      <div class="col-md-6 offset-md-3">
        <div class="card">
          <div class="card-body">


                <form onsubmit="return validate()" novalidate action="register.jsp" method="post">
               <h3>Register here !!</h3>
                <div class="form-group mt-3">
                  <input type="text" class="form-control name-field" placeholder="Enter your name here">
                  <small class="name-field-msg form-text text-danger m1-2"></small>
                </div>
                
                <div class="form-group">
                  <input type="text" class="form-control Email-field" placeholder="Enter your EMail here">
                  <small class="form-field-msg form-text text-danger m1-2"></small>

                </div>

                <div class="form-group">
                  <input type="text" class="form-control password-field" placeholder="Enter your password">
                  <small class="form-field-msg form-text text-danger m1-2"></small>
                </div>

                <div class="form-group">
                  <input type="text" class="form-control confirm password-field" placeholder="Enter confirm password here">
                  <small class=" form-field-msg form-text text-danger m1-2"></small>
                </div>

                <div class="form-group">
                  <input type="text" class="form-control phone-field" placeholder="Enter your phone here">
                  <small class="foem-field-msg   form-text text-danger m1-2"></small>
                </div>

                <div class="container text-center">
                  <button class="btn btn-outline-primary">Register here</button>
                </div>
                </form>
                
          </div>

        </div>



      </div>
    </div>



  </div>







  <!-- Optional JavaScript -->
  <!-- jQuery first, then Popper.js, then Bootstrap JS -->
  <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
    integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.14.7/dist/umd/popper.min.js"
    integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
    crossorigin="anonymous"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.3.1/dist/js/bootstrap.min.js"
    integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
    crossorigin="anonymous"></script>
    <script src="validate.js"></script>
</body>

</html>