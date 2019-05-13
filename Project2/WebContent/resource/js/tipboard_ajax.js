let isEmpty = function(value){
	if( value == "" || value == null || value == undefined || ( value != null && typeof value == "object" && !Object.keys(value).length ) ){
		return true
	}else{
		return false
	}
};


$(function(){
	$(".reply-btn").click(function(){
//		let content = CKEDITOR.instances.editor1.getData();
//		let reply_id = $("#reply_id").html().replace("#","");
//		console.log("reply_id : " + reply_id)
//		console.log(content);
		if(content==""){
			alert("댓글을 입력해 주세요");
			console.log("IF들어옴");
		}else{
			console.log("ELSE실행");
			$.ajax({
				url:"tipreply.tipajax",
				data:{
					editor1:content,
					reply_id:reply_id
				},
				//contentType: "application/x-www-form-urlencoded; charset=UTF-8",
				dataType:"html",
				type:"POST",
				success:function(data){
					console.log(data);
					console.log("append들어옴");
//					$('#reply_index').remove();
					$("#reply_paste").append(data);
				},
				error:function(){
					console.log("오류");
				}
				
			})//ajax 끝
		} //else 끝
	}); // #newMember 
	
});//	function() 끝

//$(function(){
//	$.urlParam = function(name){
//	    var results = new RegExp('[\?&]' + name + '=([^&#]*)').exec(window.location.href);
//	    if (results==null){
//	       return null;
//	    }
//	    else{
//	       return results[1] || 0;
//	    }
//	}
//
//	console.log('확인');
//	$(".reply-create").click(function(){
//		$(".empty").empty();
//		console.log("확인2");
//		let content = $('.content').val();
//		var id = $('.nick_name').text();
//		console.log(">>>>>>>>>>>>>>>"+content)
//		if(content==""){
//			alert("댓글을 입력해 주세요");
//		}else{
//			$.ajax({
//				url:"tipreply.ajax",
//				data:{content:content, id:id, board_id:$.urlParam('id')},
//				dataType:"html",
//				type:"post",
//				success:function(data){
//					$('#reply').append(data);
//				},
//				error:function(){
//					console.log("오류");
//				}
//			});
//		}
//	});
//});




