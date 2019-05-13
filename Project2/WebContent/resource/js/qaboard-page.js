//function changepagination(){
//		console.log(1);
//		var selected = document.getElementById("qa_board_select").value;
//		console.log(selected);
//	};

$(function(){
	$("select").change(()=>{
		console.log($("#qa_board_select").val());
		$.ajax({
			url:"qaboard.qb",
			data:{
				select:$("#qa_board_select").val()
			},
			dataType:"html",
			type:"POST",
			success:function(data){
				console.log(data);			
			},
			error:function(){
				console.log("오류");
			}
			
		})//ajax 끝
	});
	

//	console.log(3);
//	console.log($("#qa_board_select").val());
	
	
	
});
	
