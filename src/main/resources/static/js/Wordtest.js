function addtrue(){
	$("#trueword").on("click",function(){
				$("#trueword").attr("id","truewordres");
				$.ajax({
			 		url:"ajax/Testword.action",
			 		type:"post",
			 		async:false,
			 		dataType:"json",
			 		data:{
			 			uname:"<%=username%>",
			 			start:"1",
			 			answer:"1"
			 		},
			 		success: function(data){			
			 			var wordid = data.wordid;
			 			var tword = data.tword;
			 			var number = data.number;
			 			var trueexplain = data.trueexplain;
			 			var falseexplain1 = data.falseexplain1;
						var falseexplain2 = data.falseexplain2;
						var falseexplain3 = data.falseexplain3;
						var questionno = Number(number);
						alert(questionno);
			 			if(questionno>20){
			 				$("#wordtest2").hide();
							$("#wordtest4").show();
			 			}
			 			if(0<questionno&&questionno<21){
			  				$("#wordno2").text(number);
			 				$("#wordno3").text(number);	
			 				$("#quewordtitle").text(tword);	
			 				$("button").remove(".tword1");
			 				$("button").remove(".tword2");
			 				$("button").remove(".tword3");
			 				$("button").remove(".tword4");
			 				$("#fromhere").append('<button type="button" class="tword1" id=""></button><button type="button" class="tword2" id=""></button><button type="button" class="tword3" id=""></button><button type="button" class="tword4" id=""></button>');
			 				var random = 10*Math.random();
			 				if(random>=7){
			 					$(".tword1").text(trueexplain);
			 					$(".tword1").attr("id","trueword");
			 					$(".tword2").text(falseexplain1);
			 					$(".tword2").attr("id","falseword1");
			 					$(".tword3").text(falseexplain2);
			 					$(".tword3").attr("id","falseword2");
			 					$(".tword4").text(falseexplain3);
			 					$(".tword4").attr("id","falseword3");
			 				};
			 				if(random<=2){
			 					$(".tword1").text(falseexplain1);
			 					$(".tword1").attr("id","falseword1");
			 					$(".tword2").text(trueexplain);
			 					$(".tword2").attr("id","trueword");
			 					$(".tword3").text(falseexplain2);
			 					$(".tword3").attr("id","falseword2");
			 					$(".tword4").text(falseexplain3);
			 					$(".tword4").attr("id","falseword3");			
			 				};
				 			if(random>2&&random<5){
			 					$(".tword1").text(falseexplain1);
			 					$(".tword1").attr("id","falseword1");
			 					$(".tword2").text(falseexplain2);
			 					$(".tword2").attr("id","falseword2");
			 					$(".tword3").text(trueexplain);
			 					$(".tword3").attr("id","trueword");
			 					$(".tword4").text(falseexplain3);
			 					$(".tword4").attr("id","falseword3");		 			
				 			};
				 			if(random>=5&&random<7){
			 					$(".tword1").text(falseexplain1);
			 					$(".tword1").attr("id","falseword1");
			 					$(".tword2").text(falseexplain2);
			 					$(".tword2").attr("id","falseword2");
			 					$(".tword3").text(falseexplain3);
			 					$(".tword3").attr("id","falseword3");
			 					$(".tword4").text(trueexplain);
			 					$(".tword4").attr("id","trueword");  				
				 			};
		 	 			addtrue();
		 				addfalse();					 					
			 			};
			
			 		},
			 		error: function(){
			            alert("Error!");
			        },
				});
			});		
};
function addfalse(){
	$("#falseword1").on("click",function(){
		$("#falseword1").attr("id","falsewordres");
		$.ajax({
	 		url:"ajax/Testword.action",
	 		type:"post",
	 		async:false,
	 		dataType:"json",
	 		data:{
	 			uname:"<%=username%>",
	 			start:"1",
	 			answer:"0"
	 		},
	 		success: function(data){			
	 			var wordid = data.wordid;
	 			var tword = data.tword;
	 			var number = data.number;
	 			var trueexplain = data.trueexplain;
	 			var falseexplain1 = data.falseexplain1;
				var falseexplain2 = data.falseexplain2;
				var falseexplain3 = data.falseexplain3;
				var questionno = Number(number);
				alert(questionno);
	 			if(questionno>20){
	 				$("#wordtest2").hide();
					$("#wordtest4").show();
	 			}
	 			if(0<questionno&questionno<21){
	  				$("#wordno2").text(number);
	 				$("#wordno3").text(number);	
	 				$("#quewordtitle").text(tword);	
	 				$("button").remove(".tword1");
			 		$("button").remove(".tword2");
			 		$("button").remove(".tword3");
			 		$("button").remove(".tword4");
			 		$("#fromhere").append('<button type="button" class="tword1" id=""></button><button type="button" class="tword2" id=""></button><button type="button" class="tword3" id=""></button><button type="button" class="tword4" id=""></button>');
			 					
	 				var random = 10*Math.random();
	 				if(random>=7){
	 					$(".tword1").text(trueexplain);
	 					$(".tword1").attr("id","trueword");
	 					$(".tword2").text(falseexplain1);
	 					$(".tword2").attr("id","falseword1");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");
	 				};
	 				if(random<=2){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(trueexplain);
	 					$(".tword2").attr("id","trueword");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");			
	 				};
		 			if(random>2&&random<5){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(trueexplain);
	 					$(".tword3").attr("id","trueword");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");		 			
		 			};
		 			if(random>=5&&random<7){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(falseexplain3);
	 					$(".tword3").attr("id","falseword3");
	 					$(".tword4").text(trueexplain);
	 					$(".tword4").attr("id","trueword");  				
		 			};
		 	 		addtrue();
		 			addfalse();			 					
	 			};
	
	 		},
	 		error: function(){
	            alert("Error!");
	        },
		});
	});
	/* 错误效果*/
	$("#falseword2").on("click",function(){
		$("#falseword2").attr("id","falsewordres");
		$.ajax({
	 		url:"ajax/Testword.action",
	 		type:"post",
	 		async:false,
	 		dataType:"json",
	 		data:{
	 			uname:"<%=username%>",
	 			start:"1",
	 			answer:"0"
	 		},
	 		success: function(data){			
	 			var wordid = data.wordid;
	 			var tword = data.tword;
	 			var number = data.number;
	 			var trueexplain = data.trueexplain;
	 			var falseexplain1 = data.falseexplain1;
				var falseexplain2 = data.falseexplain2;
				var falseexplain3 = data.falseexplain3;
				var questionno = Number(number);
				alert(questionno);
	 			if(questionno>20){
	 				$("#wordtest2").hide();
					$("#wordtest4").show();
	 			}
	 			if(0<questionno&&questionno<21){
	  				$("#wordno2").text(number);
	 				$("#wordno3").text(number);	
	 				$("#quewordtitle").text(tword);	
	 				$("button").remove(".tword1");
			 		$("button").remove(".tword2");
			 		$("button").remove(".tword3");
			 		$("button").remove(".tword4");
			 		$("#fromhere").append('<button type="button" class="tword1" id=""></button><button type="button" class="tword2" id=""></button><button type="button" class="tword3" id=""></button><button type="button" class="tword4" id=""></button>');
			 	
	 				var random = 10*Math.random();
	 				if(random>=7){
	 					$(".tword1").text(trueexplain);
	 					$(".tword1").attr("id","trueword");
	 					$(".tword2").text(falseexplain1);
	 					$(".tword2").attr("id","falseword1");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");
	 				};
	 				if(random<=2){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(trueexplain);
	 					$(".tword2").attr("id","trueword");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");			
	 				};
		 			if(random>2&&random<5){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(trueexplain);
	 					$(".tword3").attr("id","trueword");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");		 			
		 			};
		 			if(random>=5&&random<7){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(falseexplain3);
	 					$(".tword3").attr("id","falseword3");
	 					$(".tword4").text(trueexplain);
	 					$(".tword4").attr("id","trueword");  				
		 			};	
		 	 		addtrue();
		 			addfalse();			 				
	 			};
	
	 		},
	 		error: function(){
	            alert("Error!");
	        },
		});
	});
	$("#falseword3").on("click",function(){
		$("#falseword3").attr("id","falsewordres");
		$.ajax({
	 		url:"ajax/Testword.action",
	 		type:"post",
	 		async:false,
	 		dataType:"json",
	 		data:{
	 			uname:"<%=username%>",
	 			start:"1",
	 			answer:"0"
	 		},
	 		success: function(data){			
	 			var wordid = data.wordid;
	 			var tword = data.tword;
	 			var number = data.number;
	 			var trueexplain = data.trueexplain;
	 			var falseexplain1 = data.falseexplain1;
				var falseexplain2 = data.falseexplain2;
				var falseexplain3 = data.falseexplain3;
				var questionno = Number(number);
				alert(questionno);
	 			if(questionno>20){
	 				$("#wordtest2").hide();
					$("#wordtest4").show();
	 			}
	 			if(0<questionno&&questionno<21){
	  				$("#wordno2").text(number);
	 				$("#wordno3").text(number);	
	 				$("#quewordtitle").text(tword);	
	 				$("button").remove(".tword1");
			 		$("button").remove(".tword2");
			 		$("button").remove(".tword3");
			 		$("button").remove(".tword4");
			 		$("#fromhere").append('<button type="button" class="tword1" id=""></button><button type="button" class="tword2" id=""></button><button type="button" class="tword3" id=""></button><button type="button" class="tword4" id=""></button>');
			 				
	 				var random = 10*Math.random();
	 				if(random>=7){
	 					$(".tword1").text(trueexplain);
	 					$(".tword1").attr("id","trueword");
	 					$(".tword2").text(falseexplain1);
	 					$(".tword2").attr("id","falseword1");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");
	 				};
	 				if(random<=2){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(trueexplain);
	 					$(".tword2").attr("id","trueword");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");			
	 				};
		 			if(random>2&&random<5){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(trueexplain);
	 					$(".tword3").attr("id","trueword");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");		 			
		 			};
		 			if(random>=5&&random<7){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(falseexplain3);
	 					$(".tword3").attr("id","falseword3");
	 					$(".tword4").text(trueexplain);
	 					$(".tword4").attr("id","trueword");  				
		 			};	
		 	 		addtrue();
		 			addfalse();	
	 			};
	
	 		},
	 		error: function(){
	            alert("Error!");
	        },
		});
	});
};
$(document).ready(function(){
	$.ajax({
 		url:"ajax/Testword.action",
 		type:"post",
 		async:false,
 		dataType:"json",
 		data:{
 			uname:"<%=username%>",
 			start:"0"
 			
 		},
 		success: function(data){			
 			var wordid = data.wordid;
 			var tword = data.tword;
 			var number = data.number;
 			var trueexplain = data.trueexplain;
 			var falseexplain1 = data.falseexplain1;
			var falseexplain2 = data.falseexplain2;
			var falseexplain3 = data.falseexplain3;
			var questionno = Number(number);
 			if(questionno>20){
	 			$("#wordtest1").hide();
				$("#wordtest4").show();
 			}
  				if(0<questionno&&questionno<21){
  				$("#wordno2").text(number);
 				$("#wordno3").text(number);	
 				$("#quewordtitle").text(tword);	
 				
 				var random = 10*Math.random();
	 			if(random>=7){
	 				$(".tword1").text(trueexplain);
	 				$(".tword1").attr("id","trueword");
	 				$(".tword2").text(falseexplain1);
	 				$(".tword2").attr("id","falseword1");
	 				$(".tword3").text(falseexplain2);
	 				$(".tword3").attr("id","falseword2");
	 				$(".tword4").text(falseexplain3);
	 				$(".tword4").attr("id","falseword3");
	 			};
	 			if(random<=2){
					$(".tword1").text(falseexplain1);
	 				$(".tword1").attr("id","falseword1");
	 				$(".tword2").text(trueexplain);
	 				$(".tword2").attr("id","trueword");
	 				$(".tword3").text(falseexplain2);
	 				$(".tword3").attr("id","falseword2");
					$(".tword4").text(falseexplain3);
	 				$(".tword4").attr("id","falseword3");			
	 			};
		 		if(random>2&&random<5){
	 				$(".tword1").text(falseexplain1);
					$(".tword1").attr("id","falseword1");
	 				$(".tword2").text(falseexplain2);
	 				$(".tword2").attr("id","falseword2");
	 				$(".tword3").text(trueexplain);
	 				$(".tword3").attr("id","trueword");
	 				$(".tword4").text(falseexplain3);
	 				$(".tword4").attr("id","falseword3");		 			
		 		};
		 		if(random>=5&&random<7){
	 				$(".tword1").text(falseexplain1);
	 				$(".tword1").attr("id","falseword1");
	 				$(".tword2").text(falseexplain2);
	 				$(".tword2").attr("id","falseword2");
	 				$(".tword3").text(falseexplain3);
	 				$(".tword3").attr("id","falseword3");
					$(".tword4").text(trueexplain);
	 				$(".tword4").attr("id","trueword");  				
		 		};	
		 		addtrue();
		 		addfalse();
		 		$("#wordtest1").hide();
				$("#wordtest2").show();	
 			};

 		},
 		error: function(){
            alert("Error!");
        },
	});	
});
$(function(){
	$("#readytest").click(function(){
		$.ajax({
	 		url:"ajax/Testword.action",
	 		type:"post",
	 		async:false,
	 		dataType:"json",
	 		data:{
	 			uname:"<%=username%>",
	 			start:"1",
	 			answer:"-1"
	 		},
	 		success: function(data){			
	 			var wordid = data.wordid;
	 			var tword = data.tword;
	 			var number = data.number;
	 			var trueexplain = data.trueexplain;
	 			var falseexplain1 = data.falseexplain1;
				var falseexplain2 = data.falseexplain2;
				var falseexplain3 = data.falseexplain3;
				var questionno = Number(number);
				
	 			if(questionno>20){
	 				$("#wordtest1").hide();
					$("#wordtest4").show();
	 			}
	 			if(0<questionno&&questionno<21){
	  				$("#wordno2").text(number);
	 				$("#wordno3").text(number);	
	 				$("#quewordtitle").text(tword);	

	 				$("button").remove(".tword1");
			 		$("button").remove(".tword2");
			 		$("button").remove(".tword3");
			 		$("button").remove(".tword4");
			 		$("#fromhere").append('<button type="button" class="tword1" id=""></button><button type="button" class="tword2" id=""></button><button type="button" class="tword3" id=""></button><button type="button" class="tword4" id=""></button>');
			 			
	 				var random = 10*Math.random();
	 				if(random>=7){
	 					$(".tword1").text(trueexplain);
	 					$(".tword1").attr("id","trueword");
	 					$(".tword2").text(falseexplain1);
	 					$(".tword2").attr("id","falseword1");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");
	 				};
	 				if(random<=2){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(trueexplain);
	 					$(".tword2").attr("id","trueword");
	 					$(".tword3").text(falseexplain2);
	 					$(".tword3").attr("id","falseword2");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");			
	 				};
		 			if(random>2&&random<5){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(trueexplain);
	 					$(".tword3").attr("id","trueword");
	 					$(".tword4").text(falseexplain3);
	 					$(".tword4").attr("id","falseword3");		 			
		 			};
		 			if(random>=5&&random<7){
	 					$(".tword1").text(falseexplain1);
	 					$(".tword1").attr("id","falseword1");
	 					$(".tword2").text(falseexplain2);
	 					$(".tword2").attr("id","falseword2");
	 					$(".tword3").text(falseexplain3);
	 					$(".tword3").attr("id","falseword3");
	 					$(".tword4").text(trueexplain);
	 					$(".tword4").attr("id","trueword");  				
		 			};	
		 			addtrue();
		 			addfalse();
		 			$("#wordtest1").hide();
					$("#wordtest2").show();	
	 			};
	
	 		},
	 		error: function(){
	            alert("Error!");
	        },
		});
	});
	
});