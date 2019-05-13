$(function(){
	$("select").change(()=>{
		console.log($("#qa_board_select").val());
		$.ajax({
			url:"qaboard.qb",
			data:{
				select:$("#qa_board_select").val()
			},
			async:false,
			dataType:"html",
			type:"GET",
			success:function(data){
				console.log("success");			
			},
			error:function(){
				console.log("오류");
			}
			
		})//ajax 끝
	});

	
	
});
	
