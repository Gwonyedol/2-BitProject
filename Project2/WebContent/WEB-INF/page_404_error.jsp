<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
<meta charset="utf-8" />
<title>Error Page</title>
<meta
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no"
	name="viewport" />
<meta content="" name="description" />
<meta content="" name="author" />

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resource/css/app.min.css"/>

</head>
<body>
	<!-- BEGIN #app -->
	<div id="app" class="app app-full-height app-without-header">
		<!-- BEGIN error -->
		<div class="error-page">
			<div class="error-page-content">
				<div class="error-page-icon">
					<i class="fa fa-exclamation-circle"></i>
				</div>
				<h1>Oops!</h1>
				<h3>We can't seem to find the page you're looking for</h3>
				<p class="m-b-40">
					Error code: <b>404</b>
				</p>
				<p class="text-muted m-b-10">Here are some helpful links
					instead:</p>
				<p>
					<a href="index.html">Home</a> <span class="link-divider"></span> <a
						href="page_search_results.html">Search</a> <span
						class="link-divider"></span> <a href="email_inbox.html">Email</a>
					<span class="link-divider"></span> <a href="calendar.html">Calendar</a>
					<span class="link-divider"></span> <a href="settings.html">Settings</a>
					<span class="link-divider"></span> <a href="helper.html">Helper</a>
				</p>
			</div>
		</div>
		<!-- END error -->

		<!-- BEGIN btn-scroll-top -->
		<a href="#" data-click="scroll-top" class="btn-scroll-top fade"><i
			class="fa fa-arrow-up"></i></a>
		<!-- END btn-scroll-top -->
	</div>
	<!-- END #app -->

	<!-- BEGIN theme-panel -->
	<div class="theme-panel">
		<a href="#" data-click="theme-panel-expand" class="theme-collapse-btn"><i
			class="fa fa-cog"></i></a>
		<div class="theme-panel-content">
			<div class="widget-list mb-0">
				<div class="widget-list-item">
					<div class="widget-list-content">
						<div>Color Theme</div>
						<div class="theme-list row">
							<div class="theme-list-item active">
								<a href="#" class="bg-silver" data-theme=""
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Default (Silver)"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-red" data-theme="app-theme-red"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Red"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-pink" data-theme="app-theme-pink"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Pink"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-orange" data-theme="app-theme-orange"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Orange"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-yellow" data-theme="app-theme-yellow"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Yellow"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-green" data-theme="app-theme-green"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Green"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-cyan" data-theme="app-theme-cyan"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Aqua"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-blue" data-theme="app-theme-blue"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Blue"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-purple" data-theme="app-theme-purple"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Purple"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-indigo" data-theme="app-theme-indigo"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Indigo"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-black" data-theme="app-theme-black"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body" data-title="Black"></a>
							</div>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">
						<div>Gradient Theme</div>
						<div class="theme-list row">
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-silver"
									data-theme="app-theme-gradient-silver"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Default (Gradient Silver)"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-red"
									data-theme="app-theme-gradient-red"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Red"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-pink"
									data-theme="app-theme-gradient-pink"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Pink"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-orange"
									data-theme="app-theme-gradient-orange"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Orange"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-yellow"
									data-theme="app-theme-gradient-yellow"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Yellow"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-green"
									data-theme="app-theme-gradient-green"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Green"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-cyan"
									data-theme="app-theme-gradient-cyan"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Aqua"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-blue"
									data-theme="app-theme-gradient-blue"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Blue"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-purple"
									data-theme="app-theme-gradient-purple"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Purple"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-indigo"
									data-theme="app-theme-gradient-indigo"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Indigo"></a>
							</div>
							<div class="theme-list-item">
								<a href="#" class="bg-gradient-black"
									data-theme="app-theme-gradient-black"
									data-toggle="theme-selector" data-toggle="tooltip"
									data-trigger="hover" data-container="body"
									data-title="Gradient Black"></a>
							</div>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">Fixed Sidebar</div>
					<div class="widget-list-action">
						<div class="switcher switcher-success pull-left">
							<input type="checkbox" name="sidebar_fixed" id="sidebar_fixed"
								value="1" checked /> <label for="sidebar_fixed"></label>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">Light Sidebar</div>
					<div class="widget-list-action">
						<div class="switcher switcher-success pull-left">
							<input type="checkbox" name="sidebar_light" id="sidebar_light"
								value="1" /> <label for="sidebar_light"></label>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">Fixed Header</div>
					<div class="widget-list-action">
						<div class="switcher switcher-success pull-left">
							<input type="checkbox" name="header_fixed" id="header_fixed"
								value="1" checked /> <label for="header_fixed"></label>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">Dark Header</div>
					<div class="widget-list-action">
						<div class="switcher switcher-success pull-left">
							<input type="checkbox" name="header_dark" id="header_dark"
								value="1" /> <label for="header_dark"></label>
						</div>
					</div>
				</div>
				<div class="widget-list-item">
					<div class="widget-list-content">
						<a href="#" class="btn btn-silver btn-block btn-rounded btn-sm"
							data-click="reset-theme-setting">Reset Setting</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- END theme-panel -->

	<!-- ================== BEGIN BASE JS ================== -->
	<script src="${pageContext.request.contextPath}/resource/js/app.min.js" type="text/javascript"></script>
	<!-- ================== END BASE JS ================== -->
</body>
</html>
