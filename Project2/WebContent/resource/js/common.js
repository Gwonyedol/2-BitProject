$(function(){
	const floatPosition = parseInt($("#scroll_Banner").css("top"));
	
	$(window).scroll(()=>{
		const scrollTop = $(window).scrollTop();
		const newPosition = scrollTop + floatPosition+"px";
		
		$("#scroll_Banner").stop().animate({
			"top": newPosition
		},500);
	}).scroll();
})