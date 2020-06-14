var http_request;
function createRequest(url) {
    if (window.XMLHttpRequest) {                                   // 非IE浏览器
        http_request = new XMLHttpRequest();                          //创建XMLHttpRequest对象
    } else if (window.ActiveXObject) {                             // IE浏览器
        try {
            http_request = new ActiveXObject("Msxml2.XMLHTTP");    //创建XMLHttpRequest对象
        } catch (e) {
            try {
                http_request = new ActiveXObject("Microsoft.XMLHTTP");  //创建XMLHttpRequest对象
           } catch (e) {}
        }
    }
    if (!http_request) {
        alert("不能创建XMLHttpRequest对象实例！");
        return false;
    }
    http_request.open('GET', url, true);                               //创建与服务器的连接
    http_request.onreadystatechange = getResult;                       //调用返回结果处理函数
    http_request.send(null);                                       //向服务器发送请求
}
function getResult() {
    if (http_request.readyState == 4) {             // 判断请求状态
        if (http_request.status == 200) {           // 请求成功，开始处理返回结果
            if (http_request.responseText=="fail"){
                document.getElementById("toolTip").style.color="red";
                document.getElementById("toolTip").innerHTML="账号或者密码错误";    //设置提示内容
                document.getElementById("toolTip").style.display="block";   //显示提示框
                //location.href="success.jsp?name="+form2.name.value;
            }
            else {
                document.getElementById("form2").submit();
            }
        } else {                            // 请求页面有错误
    }
}
            alert("您所请求的页面有错误！");
            return;
        }
function checkform(){
	var username=logform.username.value;
	var password=logform.password.value;
	alert("!!!!!!");
	document.getElementById("checkcode1").innerHTML="请拖动滑块";	
	if($("div").hasClass("handler_bg")){
		document.getElementById("checkcode1").innerHTML="请拖动滑块";
	}
	return false;
}