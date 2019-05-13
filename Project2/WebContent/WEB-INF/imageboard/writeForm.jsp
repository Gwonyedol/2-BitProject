<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/WEB-INF/common/Head_top.jsp"></jsp:include>

<meta charset="utf-8" />
<title>Admetro | Form jQuery File Upload</title>
<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"
	  name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />

<!-- ================== BEGIN BASE CSS STYLE ================== -->
<link href="./template/dist/assets/css/app.min.css" rel="stylesheet" />
<!-- ================== END BASE CSS STYLE ================== -->

<!-- ================== BEGIN PAGE CSS STYLE ================== -->
<link href="./template/dist/assets/plugins/blueimp-file-upload/css/jquery.fileupload.css"
	  rel="stylesheet" />
<!-- ================== END PAGE CSS STYLE ================== -->

<jsp:include page="/WEB-INF/common/Header_top.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Sidebar_Left.jsp"></jsp:include>

<!-- 콘텐츠 영역 시작-->

<!-- BEGIN #app -->
	<div id="app" class="app app-header-fixed app-sidebar-fixed">
		
		<!-- BEGIN #content -->
		<div id="content" class="app-content">
			<!-- BEGIN breadcrumb -->
			<ul class="breadcrumb">
				<li class="breadcrumb-item"><a href="#">FORMS</a></li>
				<li class="breadcrumb-item active">JQUERY FILE UPLOAD</li>
			</ul>
			<!-- END breadcrumb -->
			<!-- BEGIN page-header -->
			<h1 class="page-header">
				jQuery File Upload <small>page header description goes
					here...</small>
			</h1>
			<!-- END page-header -->

			<!-- BEGIN file-upload-form -->
			<form id="fileupload" action="//jquery-file-upload.appspot.com/"
				name="file_upload_form" method="POST" enctype="multipart/form-data">
				<!-- BEGIN card -->
				<div class="card">
					<!-- BEGIN card-header -->
					<div class="card-header card-header-inverse">
						<h4 class="card-header-title">사진 올리기</h4>
						<div class="card-header-btn">
								<a href="#" data-toggle="card-refresh"
								class="btn btn-warning"><i class="fa fa-redo"></i></a> 
						</div>
					</div>
					<!-- END card-header -->
					<!-- BEGIN card-body -->
					<div class="card-body">
						<p class="f-s-12 text-muted m-b-15">
						부가내용을 입력하세요
						</p>
						<!-- BEGIN row -->
						<div class="row fileupload-buttonbar">
							<!-- BEGIN col-8 -->
							<div class="col-md-8">
								<span
									class="btn btn-primary fileinput-button btn-sm m-r-3 m-b-3">
									<i class="fa fa-fw fa-plus"></i> <span>Add files...</span> <input
									type="file" name="files[]" multiple>
								</span>
								<button type="submit"
									class="btn btn-default btn-sm m-r-3 m-b-3 start">
									<i class="fa fa-fw fa-upload"></i> <span>Start upload</span>
								</button>
								<button type="reset"
									class="btn btn-default btn-sm m-r-3 m-b-3 cancel">
									<i class="fa fa-fw fa-ban"></i> <span>Cancel upload</span>
								</button>
								<button type="button"
									class="btn btn-default btn-sm m-r-3 m-b-3 delete">
									<i class="fa fa-fw fa-trash"></i> <span>Delete</span>
								</button>
								<div class="checkbox-inline m-t-3 m-l-10">
									<input type="checkbox" id="toggle-delete" class="toggle" /> <label
										for="toggle-delete">Select Files</label>
								</div>
								<span class="fileupload-process"></span>
							</div>
							<!-- END col-8 -->
							<!-- BEGIN col-4 -->
							<div class="col-md-4 fileupload-progress fade">
								<div class="f-s-10 text-muted m-b-5">
									<b>PROGRESS:</b>
								</div>
								<div
									class="progress progress-striped progress-sm m-b-0 m-t-0 active"
									role="progressbar" aria-valuemin="0" aria-valuemax="100">
									<div class="progress-bar progress-bar-primary"
										style="width: 0%; min-width: 2em;"></div>
								</div>
							</div>
							<!-- END col-4 -->
						</div>
						<!-- END row -->
						<div id="error-msg"></div>
					</div>
					<!-- END panel-body -->
					<!-- BEGIN table -->
					<table role="presentation" class="table m-b-0">
						<thead>
							<tr>
								<th style="width: 160px">PREVIEW</th>
								<th>FILENAME</th>
								<th style="width: 250px">SIZE</th>
								<th style="width: 1%">ACTION</th>
							</tr>
						</thead>
						<tbody class="files">
							<tr class="empty-row">
								<td colspan="4" class="text-center p-20">
									<div class="text-muted" style="font-size: 36px;">
										<i class="fa fa-file-archive"></i>
									</div> No file uploaded
								</td>
							</tr>
						</tbody>
					</table>
					<!-- END table -->
					<!-- BEGIN card-footer -->
					<div class="card-footer">
						<div>
							<div class="m-b-5">
								<b class="f-s-12">주의사항</b>
							</div>
							<ul class="desc f-s-12 p-l-25 m-b-5">
								<li>The maximum file size for uploads in this demo is <strong>999
										KB</strong> (default file size is unlimited).
								</li>
								<li>Only image files (<strong>JPG, GIF, PNG</strong>) are
									allowed in this demo (by default there is no file type
									restriction).
								</li>
								<li>Uploaded files will be deleted automatically after <strong>5
										minutes or less</strong> (demo files are stored in memory).
								</li>
								<li>You can <strong>drag &amp; drop</strong> files from
									your desktop on this webpage (see <a
									href="https://github.com/blueimp/jQuery-File-Upload/wiki/Browser-support">Browser
										support</a>).
								</li>
								<li>Please refer to the <a
									href="https://github.com/blueimp/jQuery-File-Upload">project
										website</a> and <a
									href="https://github.com/blueimp/jQuery-File-Upload/wiki">documentation</a>
									for more information.
								</li>
								<li>Built with the <a href="http://getbootstrap.com/">Bootstrap</a>
									CSS framework and Icons from <a href="http://glyphicons.com/">Glyphicons</a>.
								</li>
							</ul>
						</div>
					</div>
					<!-- END card-footer -->
				</div>
				<!-- END card -->
			</form>
			<!-- END file-upload-form -->
		</div>
		<!-- END #content -->

		<!-- BEGIN btn-scroll-top -->
		<a href="#" data-click="scroll-top" class="btn-scroll-top fade"><i
			class="fa fa-arrow-up"></i></a>
		<!-- END btn-scroll-top -->
	</div>
	<!-- END #app -->

	

	<!-- BEGIN template-upload -->
	<script id="template-upload" type="text/x-tmpl">
	{% for (var i=0, file; file=o.files[i]; i++) { %}
		<tr class="template-upload">
			<td>
				<span class="preview"></span>
			</td>
			<td>
				<p class="name">{%=file.name%}</p>
				<strong class="error text-danger"></strong>
			</td>
			<td>
				<p class="size m-b-5">Processing...</p>
				<div class="progress progress-sm m-b-0 progress-striped active"><div class="progress-bar progress-bar-primary" style="min-width: 2em; width:0%;"></div></div>
			</td>
			<td nowrap>
				{% if (!i && !o.options.autoUpload) { %}
					<button class="btn btn-primary btn-sm start" disabled>
						<i class="glyphicon glyphicon-upload"></i>
						<span>Start</span>
					</button>
				{% } %}
				{% if (!i) { %}
					<button class="btn btn-default btn-sm cancel m-l-3">
						<i class="glyphicon glyphicon-ban-circle"></i>
						<span>Cancel</span>
					</button>
				{% } %}
			</td>
		</tr>
	{% } %}
	</script>
	<!-- END template-upload -->

	<!-- BEGIN template-download -->
	<script id="template-download" type="text/x-tmpl">
	{% for (var i=0, file; file=o.files[i]; i++) { %}
		<tr class="template-download">
			<td>
				<span class="preview">
					{% if (file.thumbnailUrl) { %}
						<a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" data-gallery><img src="{%=file.thumbnailUrl%}"></a>
					{% } %}
				</span>
			</td>
			<td>
				<p class="name">
					{% if (file.url) { %}
						<a href="{%=file.url%}" title="{%=file.name%}" download="{%=file.name%}" {%=file.thumbnailUrl?'data-gallery':''%}>{%=file.name%}</a>
					{% } else { %}
						<span>{%=file.name%}</span>
					{% } %}
				</p>
				{% if (file.error) { %}
					<div><span class="label label-danger">Error</span> {%=file.error%}</div>
				{% } %}
			</td>
			<td>
				<span class="size">{%=o.formatFileSize(file.size)%}</span>
			</td>
			<td nowrap>
				{% if (file.deleteUrl) { %}
					<button class="btn btn-danger btn-sm delete m-l-3" data-type="{%=file.deleteType%}" data-url="{%=file.deleteUrl%}"{% if (file.deleteWithCredentials) { %} data-xhr-fields='{"withCredentials":true}'{% } %}>
						<i class="glyphicon glyphicon-trash"></i>
						<span>Delete</span>
					</button>
					<div class="checkbox-inline checkbox-danger m-t-5">
						<input type="checkbox" id="{%=file.deleteUrl%}" name="delete" value="1" class="toggle" />
						<label for="{%=file.deleteUrl%}"></label>
					</div>
				{% } else { %}
					<button class="btn btn-default btn-sm cancel">
						<i class="glyphicon glyphicon-ban-circle"></i>
						<span>Cancel</span>
					</button>
				{% } %}
			</td>
		</tr>
	{% } %}
	</script>
	<!-- END template-download -->

	<!-- ================== BEGIN BASE JS ================== -->
	<script src="./template/dist/assets/js/app.min.js"></script>
	<!-- ================== END BASE JS ================== -->

	<!-- ================== BEGIN PAGE LEVEL JS ================== -->
	<script src="./template/dist/assets/plugins/blueimp-file-upload/js/vendor/jquery.ui.widget.js"></script>
	<script src="./template/dist/assets/plugins/blueimp-tmpl/js/tmpl.min.js"></script>
	<script src="./template/dist/assets/plugins/blueimp-load-image/js/load-image.all.min.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-canvas-to-blob/js/canvas-to-blob.min.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-gallery/js/jquery.blueimp-gallery.min.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.iframe-transport.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-process.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-image.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-audio.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-video.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-validate.js"></script>
	<script	src="./template/dist/assets/plugins/blueimp-file-upload/js/jquery.fileupload-ui.js"></script>
	<script src="./template/dist/assets/js/demo/form-jquery-file-upload.demo.js"></script>
	<!-- ================== END PAGE LEVEL JS ================== -->


<!-- 콘텐츠영역 끝 -->
<jsp:include page="/WEB-INF/common/Sidebar_Right.jsp"></jsp:include>
<jsp:include page="/WEB-INF/common/Footer_bottom.jsp"></jsp:include>