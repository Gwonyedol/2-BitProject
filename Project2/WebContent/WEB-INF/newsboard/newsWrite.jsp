<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>
<script>
	$(function() {
		$("#upload").change(function(e) {
			event.preventDefault();

			var file = e.target.files[0];
			var url = URL.createObjectURL(file);
			$("#previewImage").attr("src", url);
		});
	});
</script>
<script type="text/javascript" src="ckeditor/ckeditor.js"></script>
<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>
<div class="container">
	<form action="writeOk.nb" enctype="multipart/form-data" method="post">
	<div class="content">
		<div class="row justify-content-md-left">
			<div class="col-sm-9">
				<div class="input-group-prepend">
					<label class="input-group-text" >제목</label>
					<input type="text"class="form-control" name="title" id = "title" >
				</div>
			</div>
		</div>
		<div class="row justify-content-md-left">
					&nbsp;&nbsp;<label class="input-group-text" >기자</label>
					<input type="text"class="form-control" style="width:68.5%" readonly>
		</div>
		<div class="row justify-content-md-center">
			<div class="input-group mb-3">
				<div class="input-group-prepend">
					&nbsp;&nbsp;<span class="input-group-text"
						id="inputGroupFileAddon01">메인</span> <br>
				</div>
				<div class="custom-file">
					&nbsp;<input type="file" class="form-control-file" id="upload" name="upload">
				</div>
			</div>
		</div>
		<div>

			<img src = "uploads/default-img.gif"style="width: 500px; height: 261px"
				id="previewImage" name="image" />


		</div>

	</div>
	<br>
	<div class="row justify-content-md-center">
		<div class="col_c" style="margin-bottom: 30px">
			<div class="input-group">
				<textarea class="form-control"  name="content"></textarea>
				<script type="text/javascript">
					CKEDITOR
							.replace(
									'bo_content',
									{
										width : 1000,
										height : 300,
										filebrowserUploadUrl : '${pageContext.request.contextPath }/adm/fileupload.do'
									});
				</script>
			</div>
		</div>
	</div>

	<div class="row justify-content-md-center">
		<div class="input-group mb-3">
			<div class="input-group-prepend">
				<span class="input-group-text">GitHub</span>
			</div>
			<input type="text" class="form-control">
		</div>
	</div>


	<div class="row justify-content-md-center">
		<button type="submit" class="btn btn-outline-secondary"
			style="width: 20%; font-weight: bold">등록</button>
	</div>
	</form>
</div>

<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>
