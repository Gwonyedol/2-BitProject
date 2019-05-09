<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!-- BEGIN modal -->
<div class="modal modal-inverse fade" id="inverse-modal">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<h4 class="modal-title">Inverse Modal Title</h4>
				<button type="button" class="close" data-dismiss="modal">
					<span>&times;</span>
				</button>
			</div>

			<form action="login.reg" method="POST" name="login_form">
				<div class="login-group">
					<br> <label>Username <span class="text-danger">*</span></label>
					<input type="text" class="login-control" value="" id="email"
						name="email" />
				</div>
				<div class="login-group">
					<label>Password <span class="text-danger">*</span></label> <input
						type="password" class="login-control" value="" id="password"
						name="password" />
				</div>
				<div class="l-m-b-30">
					<div class="checkbox-inline">
						<input type="checkbox" id="login-remember-me" value="2"> <label
							for="login-remember-me">Remember me</label>
					</div>
				</div>
				<div class="margin-left d-flex align-items-center">
					<button type="submit" class="btn btn-primary width-150 btn-rounded">Sign
						In</button>
					<a href="#" class="m-l-10">Forgot password?</a>
				</div>
			</form>

			<br>
			<div class="modal-footer">
				<button type="button" class="btn btn-white" data-dismiss="modal">Close</button>
			</div>
		</div>
	</div>
</div>
<!-- END modal -->

</div>
<!-- 콘텐츠 컬럼 col-10 끝 -->


<div class="col-2">
	<!-- 콘텐츠 컬럼 col-2 시작 -->
	<div id="scroll_Banner">
		<h5>
			<b>둥둥이 배너 테스트</b>
		</h5>
		<hr>
		<ol>
			<li>HOME</li>
			<li>BOARD1</li>
			<li>BOARD2</li>
			<li>BOARD3</li>
			<li>BOARD4</li>
			<li>BOARD5</li>
			<li>BOARD6</li>
		</ol>
	</div>


</div>
<!-- 콘텐츠 컬럼 col-2 끝 -->

</div>
<!--콘텐츠 row 끝  -->

</div>


<div id="footer" class="app-footer">Copyright &copy;GROUP4 Corp.
	All Rights Reserved.</div>
<a href="#" data-click="scroll-top" class="btn-scroll-top fade"><i
	class="fa fa-arrow-up"></i></a>
<!-- 위로 가기 버튼 -->
</div>
<!-- Header_top.jsp에  맨위 app 사이드바 닫는용-->