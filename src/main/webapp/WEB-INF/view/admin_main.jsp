<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.5/jquery.min.js">
	
</script>
<meta http-equiv="Content-Type"
	content="text/html; charset=charset=UTF-8">
<title>Admin main page</title>

</head>
<body>
	<script type="text/javascript">
		function doAjax() {
			$.ajax({
				url : 'json',
				dataType : 'json',
				data : ({
					pass : $('#pass').val()
				}),
				success : function(data) {
					$('#resultValue').html(data.name);
				}
			});
		}
		function doAjax2() {
			var jsonObj = {
				login : $('#login').val()
			};
			var jsonString=JSON.stringify(jsonObj);
			$.ajax({
				url : 'json2',
				data : ({
					login : jsonString
				}),
				dataType : 'json',
				success : function(data) {
					$('#resultValue').html(data.key);
				}
			})
		}
	</script>
	Hello Admin!

	<div id="resultValue"></div>
	<form>
		<input type="text" onkeyup="doAjax2()" id="login"> <input
			type="text" onkeyup="doAjax()" id="pass">
	</form>
</body>
</html>