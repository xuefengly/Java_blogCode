<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.4.1.js"></script>
</head>
<body>
	<button id="btn">点我发送ajax请求</button>
	<!-- 用来接收返回数据的容器 -->
	<div id="txt"></div>
	<script>
		$("#btn").click(function(){
			$.ajax({
				type:"get",
				url:"ajaxJson",
				success:function(data){
					//清空ul容器
					$("#txt").html("");
					console.log(isJSON(data));
					//显示返回的数据
					$("#txt").append(data);
					
					
				}
			});
			//判断是否是JSON对象
			function isJSON(str) {
			    if (typeof str == 'string') {
			        try {
			            var obj=JSON.parse(str);
			            if(typeof obj == 'object' && obj ){
			                return true;
			            }else{
			                return false;
			            }

			        } catch(e) {
			            console.log('error：'+str+'!!!'+e);
			            return false;
			        }
			    }
			    console.log('It is not a string!')
			}
		});
	</script>
</body>
</html>