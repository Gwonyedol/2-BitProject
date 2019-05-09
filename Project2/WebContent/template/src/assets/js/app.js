/*
Template Name: ADMETRO - Responsive Admin Template Built with Bootstrap 4
Version: 1.0.0
Author: Sean Ngu
Website: http://www.seantheme.com/admetro-v1.0/
	----------------------------
		APPS CONTENT TABLE
	----------------------------

	<!-- ======== GLOBAL SCRIPT SETTING ======== -->
	01. Global Variable
	02. Handle Scrollbar
	03. Handle Header Search Bar
	04. Handle Sidebar Menu
	05. Handle Sidebar Minify
	06. Handle Sidebar Minify Float Menu
	07. Handle Dropdown Close Option
	08. Handle App Notification
	09. Handle Theme Panel & Cookie
	10. Handle Panel - Remove / Reload / Collapse / Expand
	11. Handle Tooltip & Popover Activation
	12. Handle Scroll to Top Button Activation
	
	<!-- ======== APPLICATION SETTING ======== -->
	Application Controller
*/



/* 01. Global Variable
------------------------------------------------ */
var MUTED_COLOR   = '#8A8A8F';
var MUTED_TRANSPARENT_1_COLOR   = 'rgba(138, 138, 143, 0.1)';
var MUTED_TRANSPARENT_2_COLOR   = 'rgba(138, 138, 143, 0.2)';
var MUTED_TRANSPARENT_3_COLOR   = 'rgba(138, 138, 143, 0.3)';
var MUTED_TRANSPARENT_4_COLOR   = 'rgba(138, 138, 143, 0.4)';
var MUTED_TRANSPARENT_5_COLOR   = 'rgba(138, 138, 143, 0.5)';
var MUTED_TRANSPARENT_6_COLOR   = 'rgba(138, 138, 143, 0.6)';
var MUTED_TRANSPARENT_7_COLOR   = 'rgba(138, 138, 143, 0.7)';
var MUTED_TRANSPARENT_8_COLOR   = 'rgba(138, 138, 143, 0.8)';
var MUTED_TRANSPARENT_9_COLOR   = 'rgba(138, 138, 143, 0.9)';

var PRIMARY_COLOR = '#007AFF';
var PRIMARY_TRANSPARENT_1_COLOR = 'rgba(0, 122, 255, 0.1)';
var PRIMARY_TRANSPARENT_2_COLOR = 'rgba(0, 122, 255, 0.2)';
var PRIMARY_TRANSPARENT_3_COLOR = 'rgba(0, 122, 255, 0.3)';
var PRIMARY_TRANSPARENT_4_COLOR = 'rgba(0, 122, 255, 0.4)';
var PRIMARY_TRANSPARENT_5_COLOR = 'rgba(0, 122, 255, 0.5)';
var PRIMARY_TRANSPARENT_6_COLOR = 'rgba(0, 122, 255, 0.6)';
var PRIMARY_TRANSPARENT_7_COLOR = 'rgba(0, 122, 255, 0.7)';
var PRIMARY_TRANSPARENT_8_COLOR = 'rgba(0, 122, 255, 0.8)';
var PRIMARY_TRANSPARENT_9_COLOR = 'rgba(0, 122, 255, 0.9)';

var SUCCESS_COLOR = '#4CD964';
var SUCCESS_TRANSPARENT_1_COLOR = 'rgba(76, 217, 100, 0.1)';
var SUCCESS_TRANSPARENT_2_COLOR = 'rgba(76, 217, 100, 0.2)';
var SUCCESS_TRANSPARENT_3_COLOR = 'rgba(76, 217, 100, 0.3)';
var SUCCESS_TRANSPARENT_4_COLOR = 'rgba(76, 217, 100, 0.4)';
var SUCCESS_TRANSPARENT_5_COLOR = 'rgba(76, 217, 100, 0.5)';
var SUCCESS_TRANSPARENT_6_COLOR = 'rgba(76, 217, 100, 0.6)';
var SUCCESS_TRANSPARENT_7_COLOR = 'rgba(76, 217, 100, 0.7)';
var SUCCESS_TRANSPARENT_8_COLOR = 'rgba(76, 217, 100, 0.8)';
var SUCCESS_TRANSPARENT_9_COLOR = 'rgba(76, 217, 100, 0.9)';

var INFO_COLOR    = '#5AC8FA';
var INFO_TRANSPARENT_1_COLOR    = 'rgba(90, 200, 250, 0.1)';
var INFO_TRANSPARENT_2_COLOR    = 'rgba(90, 200, 250, 0.2)';
var INFO_TRANSPARENT_3_COLOR    = 'rgba(90, 200, 250, 0.3)';
var INFO_TRANSPARENT_4_COLOR    = 'rgba(90, 200, 250, 0.4)';
var INFO_TRANSPARENT_5_COLOR    = 'rgba(90, 200, 250, 0.5)';
var INFO_TRANSPARENT_6_COLOR    = 'rgba(90, 200, 250, 0.6)';
var INFO_TRANSPARENT_7_COLOR    = 'rgba(90, 200, 250, 0.7)';
var INFO_TRANSPARENT_8_COLOR    = 'rgba(90, 200, 250, 0.8)';
var INFO_TRANSPARENT_9_COLOR    = 'rgba(90, 200, 250, 0.9)';

var WARNING_COLOR = '#FF9500';
var WARNING_TRANSPARENT_1_COLOR = 'rgba(255, 149, 0, 0.1)';
var WARNING_TRANSPARENT_2_COLOR = 'rgba(255, 149, 0, 0.2)';
var WARNING_TRANSPARENT_3_COLOR = 'rgba(255, 149, 0, 0.3)';
var WARNING_TRANSPARENT_4_COLOR = 'rgba(255, 149, 0, 0.4)';
var WARNING_TRANSPARENT_5_COLOR = 'rgba(255, 149, 0, 0.5)';
var WARNING_TRANSPARENT_6_COLOR = 'rgba(255, 149, 0, 0.6)';
var WARNING_TRANSPARENT_7_COLOR = 'rgba(255, 149, 0, 0.7)';
var WARNING_TRANSPARENT_8_COLOR = 'rgba(255, 149, 0, 0.8)';
var WARNING_TRANSPARENT_9_COLOR = 'rgba(255, 149, 0, 0.9)';

var DANGER_COLOR  = '#FF3B30';
var DANGER_TRANSPARENT_1_COLOR  = 'rgba(255, 59, 48, 0.1)';
var DANGER_TRANSPARENT_2_COLOR  = 'rgba(255, 59, 48, 0.2)';
var DANGER_TRANSPARENT_3_COLOR  = 'rgba(255, 59, 48, 0.3)';
var DANGER_TRANSPARENT_4_COLOR  = 'rgba(255, 59, 48, 0.4)';
var DANGER_TRANSPARENT_5_COLOR  = 'rgba(255, 59, 48, 0.5)';
var DANGER_TRANSPARENT_6_COLOR  = 'rgba(255, 59, 48, 0.6)';
var DANGER_TRANSPARENT_7_COLOR  = 'rgba(255, 59, 48, 0.7)';
var DANGER_TRANSPARENT_8_COLOR  = 'rgba(255, 59, 48, 0.8)';
var DANGER_TRANSPARENT_9_COLOR  = 'rgba(255, 59, 48, 0.9)';

var PINK_COLOR    = '#FF2D55';
var PINK_TRANSPARENT_1_COLOR    = 'rgba(255, 45, 85, 0.1)';
var PINK_TRANSPARENT_2_COLOR    = 'rgba(255, 45, 85, 0.2)';
var PINK_TRANSPARENT_3_COLOR    = 'rgba(255, 45, 85, 0.3)';
var PINK_TRANSPARENT_4_COLOR    = 'rgba(255, 45, 85, 0.4)';
var PINK_TRANSPARENT_5_COLOR    = 'rgba(255, 45, 85, 0.5)';
var PINK_TRANSPARENT_6_COLOR    = 'rgba(255, 45, 85, 0.6)';
var PINK_TRANSPARENT_7_COLOR    = 'rgba(255, 45, 85, 0.7)';
var PINK_TRANSPARENT_8_COLOR    = 'rgba(255, 45, 85, 0.8)';
var PINK_TRANSPARENT_9_COLOR    = 'rgba(255, 45, 85, 0.9)';

var PURPLE_COLOR  = '#5856D6';
var PURPLE_TRANSPARENT_1_COLOR  = 'rgba(88, 86, 214, 0.1)';
var PURPLE_TRANSPARENT_2_COLOR  = 'rgba(88, 86, 214, 0.2)';
var PURPLE_TRANSPARENT_3_COLOR  = 'rgba(88, 86, 214, 0.3)';
var PURPLE_TRANSPARENT_4_COLOR  = 'rgba(88, 86, 214, 0.4)';
var PURPLE_TRANSPARENT_5_COLOR  = 'rgba(88, 86, 214, 0.5)';
var PURPLE_TRANSPARENT_6_COLOR  = 'rgba(88, 86, 214, 0.6)';
var PURPLE_TRANSPARENT_7_COLOR  = 'rgba(88, 86, 214, 0.7)';
var PURPLE_TRANSPARENT_8_COLOR  = 'rgba(88, 86, 214, 0.8)';
var PURPLE_TRANSPARENT_9_COLOR  = 'rgba(88, 86, 214, 0.9)';

var YELLOW_COLOR  = '#FFCC00';
var YELLOW_TRANSPARENT_1_COLOR  = 'rgba(255, 204, 0, 0.1)';
var YELLOW_TRANSPARENT_2_COLOR  = 'rgba(255, 204, 0, 0.2)';
var YELLOW_TRANSPARENT_3_COLOR  = 'rgba(255, 204, 0, 0.3)';
var YELLOW_TRANSPARENT_4_COLOR  = 'rgba(255, 204, 0, 0.4)';
var YELLOW_TRANSPARENT_5_COLOR  = 'rgba(255, 204, 0, 0.5)';
var YELLOW_TRANSPARENT_6_COLOR  = 'rgba(255, 204, 0, 0.6)';
var YELLOW_TRANSPARENT_7_COLOR  = 'rgba(255, 204, 0, 0.7)';
var YELLOW_TRANSPARENT_8_COLOR  = 'rgba(255, 204, 0, 0.8)';
var YELLOW_TRANSPARENT_9_COLOR  = 'rgba(255, 204, 0, 0.9)';

var INVERSE_COLOR = '#000000';
var INVERSE_TRANSPARENT_1_COLOR = 'rgba(0, 0, 0, 0.1)';
var INVERSE_TRANSPARENT_2_COLOR = 'rgba(0, 0, 0, 0.2)';
var INVERSE_TRANSPARENT_3_COLOR = 'rgba(0, 0, 0, 0.3)';
var INVERSE_TRANSPARENT_4_COLOR = 'rgba(0, 0, 0, 0.4)';
var INVERSE_TRANSPARENT_5_COLOR = 'rgba(0, 0, 0, 0.5)';
var INVERSE_TRANSPARENT_6_COLOR = 'rgba(0, 0, 0, 0.6)';
var INVERSE_TRANSPARENT_7_COLOR = 'rgba(0, 0, 0, 0.7)';
var INVERSE_TRANSPARENT_8_COLOR = 'rgba(0, 0, 0, 0.8)';
var INVERSE_TRANSPARENT_9_COLOR = 'rgba(0, 0, 0, 0.9)';

var WHITE_COLOR   = '#FFFFFF';
var WHITE_TRANSPARENT_1_COLOR   = 'rgba(255, 255, 255, 0.1)';
var WHITE_TRANSPARENT_2_COLOR   = 'rgba(255, 255, 255, 0.2)';
var WHITE_TRANSPARENT_3_COLOR   = 'rgba(255, 255, 255, 0.3)';
var WHITE_TRANSPARENT_4_COLOR   = 'rgba(255, 255, 255, 0.4)';
var WHITE_TRANSPARENT_5_COLOR   = 'rgba(255, 255, 255, 0.5)';
var WHITE_TRANSPARENT_6_COLOR   = 'rgba(255, 255, 255, 0.6)';
var WHITE_TRANSPARENT_7_COLOR   = 'rgba(255, 255, 255, 0.7)';
var WHITE_TRANSPARENT_8_COLOR   = 'rgba(255, 255, 255, 0.8)';
var WHITE_TRANSPARENT_9_COLOR   = 'rgba(255, 255, 255, 0.9)';


/* 02. Handle Scrollbar
------------------------------------------------ */
var handleSlimScroll = function() {
	"use strict";
	$('[data-scrollbar=true]').each( function() {
		generateSlimScroll($(this));
	});
};
var generateSlimScroll = function(element) {
	if ($(element).attr('data-init')) {
		return;
	}
	var dataHeight = $(element).attr('data-height');
		dataHeight = (!dataHeight) ? $(element).height() : dataHeight;

	var scrollBarOption = {
		height: dataHeight, 
		alwaysVisible: false
	};
	if(/Android|webOS|iPhone|iPad|iPod|BlackBerry|IEMobile|Opera Mini/i.test(navigator.userAgent)) {
		$(element).css('height', dataHeight);
		$(element).css('overflow-x','scroll');
	} else {
		$(element).slimScroll(scrollBarOption);
		$(element).closest('.slimScrollDiv').find('.slimScrollBar').hide();
	}
	$(element).attr('data-init', true);
};


/* 03. Handle Header Search Bar
------------------------------------------------ */
var handleHeaderSearchBar = function() { 
	var searchClass = '.navbar-search';
	
	$(document).on('click', '[data-toggle="search-bar"]', function(e) {
		e.preventDefault();
		
		$(searchClass).addClass('active');
		$('body').append('<a href="javascript:;" data-dismiss="search-bar" id="search-bar-backdrop" class="search-bar-backdrop"></a>');
		$('#search-bar-backdrop').fadeIn(200);
		setTimeout(function() {
			$('#header-search').focus();
		}, 200);
	});
	$(document).on('click', '[data-dismiss="search-bar"]', function(e) {
		e.preventDefault();
		
		$(searchClass).addClass('inactive');
		setTimeout(function() {
			$(searchClass).removeClass('active inactive');
		}, 200);
		$('#search-bar-backdrop').fadeOut(function() {
			$(this).remove();
		});
	});
	var searchTags = ['Report', 'Analytic', 'Product', 'Project', 'Sales', 'Mobile App Development', 'Build Website', 'Helper', 'Profile', 'Setting'];
	$('#header-search').autocomplete({
		source: searchTags,
		minLength: 0
	}).on('focus', function(){ 
		$(this).autocomplete('search'); 
	});
	$('#header-search').autocomplete('widget').addClass('search-bar-autocomplete animated fadeIn');
};
var handleHeaderScrollShadow = function() {
	$(window).on('scroll', function() {
		if ($(window).scrollTop() >= 10) {
			$('#app').addClass('has-scroll');
		} else {
			$('#app').removeClass('has-scroll');
		}
	});
};


/* 04. Handle Sidebar Menu
------------------------------------------------ */
var handleSidebarMenu = function() {
	"use strict";
	$('.app-sidebar .nav > .has-sub > a').on('click', function(e) {
		e.preventDefault();
		
		var target = $(this).next('.nav-submenu');
		var otherMenu = '.app-sidebar .nav > li.has-sub > .nav-submenu';

		if ($('.app-sidebar-minified').length === 0) {
			$(otherMenu).not(target).slideUp(250, function() {
				$(this).closest('li').removeClass('expand');
			});
			$(target).slideToggle(250, function() {
				var targetLi = $(this).closest('li');
				if ($(targetLi).hasClass('expand')) {
					$(targetLi).removeClass('expand');
				} else {
					$(targetLi).addClass('expand');
				}
			});
		}
	});
	$('.app-sidebar .nav > .has-sub .nav-submenu li.has-sub > a').on('click', function() {
		if ($('.app-sidebar-minified').length === 0) {
			var target = $(this).next('.nav-submenu');
			$(target).slideToggle(250);
		}
	});
	
	var sidebarProgress = false;
	$('.app-sidebar').bind('click touchstart', function(e) {
		if ($(e.target).closest('.app-sidebar').length !== 0) {
			sidebarProgress = true;
		} else {
			sidebarProgress = false;
			e.stopPropagation();
		}
	});
	$(document).bind('click touchstart', function(e) {
		if ($(e.target).closest('.app-sidebar').length === 0 && $(e.target).closest('[data-click="sidebar-toggled"]').length === 0) {
			sidebarProgress = false;
		}
		if ($(e.target).closest('.app-float-submenu').length !== 0) {
			sidebarProgress = true;
		}

		if (!e.isPropagationStopped() && sidebarProgress !== true) {
			if ($('#app').hasClass('app-sidebar-toggled')) {
				sidebarProgress = true;
				$('#app').removeClass('app-sidebar-toggled');
				$('[data-click="sidebar-toggled"]').removeClass('active');
			}
			if ($(window).width() <= 767) {
				if ($('#app').hasClass('app-right-sidebar-toggled')) {
					sidebarProgress = true;
					$('#app').removeClass('app-right-sidebar-toggled');
					$('[data-click="sidebar-toggled"]').removeClass('active');
				}
			}
		}
	});
	$(document).on('click', '[data-click="sidebar-toggled"]', function(e) {
		e.stopPropagation();
		
		var targetContainer = '#app';
		var targetClass = 'app-sidebar-toggled';
		
		if ($(targetContainer).hasClass(targetClass)) {
			$(targetContainer).removeClass(targetClass);
			$(this).removeClass('active');
		} else if (sidebarProgress !== true) {
			$(targetContainer).addClass(targetClass);
			$(this).addClass('active');
		} else {
			sidebarProgress = false;
		}
	});
};


/* 05. Handle Sidebar Minify
------------------------------------------------ */
var handleSidebarMinify = function() {
	$('[data-click="sidebar-minify"]').on('click', function(e) {
		e.preventDefault();
		
		var targetElm = '#app';
		var targetClass = 'app-sidebar-minified';
		
		if ($(targetElm).hasClass(targetClass)) {
			$(targetElm).removeClass(targetClass);
		} else {
			$(targetElm).addClass(targetClass);
		}
	});
};


/* 06. Handle Sidebar Minify Float Menu
------------------------------------------------ */
var floatSubMenuTimeout;
var targetFloatMenu;
var handleMouseoverFloatSubMenu = function(elm) {
	clearTimeout(floatSubMenuTimeout);
};
var handleMouseoutFloatSubMenu = function(elm) {
	floatSubMenuTimeout = setTimeout(function() {
		$('.app-float-submenu').remove();
	}, 250);
};
var handleSidebarMinifyFloatMenu = function() {
	$(document).on('click', '.app-float-submenu li.has-sub > a', function() {
		var target = $(this).next('.nav-submenu');
		$(target).slideToggle(250, function() {
			var targetMenu = $('.app-float-submenu');
			var targetHeight = $(targetMenu).height() + 20;
			var targetOffset = $(targetMenu).offset();
			var targetTop = $(targetMenu).attr('data-offset-top');
			var windowHeight = $(window).height();
			if ((windowHeight - targetTop) > targetHeight) {
				$('.app-float-submenu').css({
					'top': targetTop,
					'bottom': 'auto',
					'overflow': 'initial'
				});
			} else {
				$('.app-float-submenu').css({
					'bottom': 0,
					'overflow': 'scroll'
				});
			}
		});
	});
	$(document).on('mouseover', '.app-sidebar-minified .app-sidebar .nav > li.has-sub > a', function() {
		clearTimeout(floatSubMenuTimeout);
		
		var targetMenu = $(this).closest('li').find('.nav-submenu').first();
		if (targetFloatMenu == this) {
			return false;
		} else {
			targetFloatMenu = this;
		}
		var targetMenuHtml = $(targetMenu).html();
		
		if (targetMenuHtml) {
			var targetHeight = $(targetMenu).height() + 20;
			var targetOffset = $(this).offset();
			var targetTop = targetOffset.top - $(window).scrollTop();
			var targetLeft = (!$('#app').hasClass('app-sidebar-right')) ? $('#sidebar').width() + $('#sidebar').offset().left : 'auto';
			var targetRight = (!$('#app').hasClass('app-sidebar-right')) ? 'auto' : $('#sidebar').width();
			var windowHeight = $(window).height();
			var submenuHeight = 0;
			
			if ($('.app-float-submenu').length == 0) {
				targetMenuHtml = '<ul class="app-float-submenu" data-offset-top="'+ targetTop +'" onmouseover="handleMouseoverFloatSubMenu(this)" onmouseout="handleMouseoutFloatSubMenu(this)">' + targetMenuHtml + '</ul>';
				$('body').append(targetMenuHtml);
			} else {
				$('.app-float-submenu').html(targetMenuHtml);
			}
			submenuHeight = $('.app-float-submenu').height();
			if ((windowHeight - targetTop) > targetHeight && ((targetTop + submenuHeight) < windowHeight)) {
				$('.app-float-submenu').css({
					'top': targetTop,
					'left': targetLeft,
					'bottom': 'auto',
					'right': targetRight
				});
			} else {
				$('.app-float-submenu').css({
					'bottom': 0,
					'top': 'auto',
					'left': targetLeft,
					'right': targetRight
				});
			}
		} else {
			$('.app-float-submenu').remove();
			targetFloatMenu = '';
		}
	});
	$(document).on('mouseout', '.app-sidebar-minified .app-sidebar .nav > li.has-sub > a', function() {
		floatSubMenuTimeout = setTimeout(function() {
			$('.app-float-submenu').remove();
			targetFloatMenu = '';
		}, 250);
	});
}


/* 07. Handle Dropdown Close Option
------------------------------------------------ */
var handleDropdownClose = function() {
	$(document).on('click', '[data-dropdown-close="false"]', function(e) {
		e.stopPropagation();
	});
};


/* 08. Handle App Notification
------------------------------------------------ */
var handleAppNotification = function() {
	$.extend({
		notification: function(data) {
			var title = (data.title) ? data.title : '';
			var content = (data.content) ? data.content : '';
			var icon = (data.icon) ? data.icon : '';
			var iconClass = (data.iconClass) ? data.iconClass : '';
			var img = (data.img) ? data.img : '';
			var imgClass = (data.imgClass) ? data.imgClass : '';
			var closeBtn = (data.closeBtn) ? data.closeBtn : '';
			var closeBtnText = (data.closeBtnText) ? data.closeBtnText : '';
			var btn = (data.btn) ? data.btn : '';
			var btnText = (data.btnText) ? data.btnText : '';
			var btnAttr = (data.btnAttr) ? data.btnAttr : '';
			var btnUrl = (data.btnUrl) ? data.btnUrl : '#';
			var autoclose = (data.autoclose) ? data.autoclose : '';
			var autocloseTime = (data.autocloseTime) ? data.autocloseTime : 5000;
			var customClass = (data.class) ? data.class : '';
			var inverseMode = (data.inverseMode) ? 'app-notification-inverse' : '';
	
			var titleHtml = (title) ? '<h4 class="notification-title">'+ title +'</h4>' : '';
			var contentHtml = (content) ? '<p class="notification-desc">'+ content +'</p>' : '';
			var mediaHtml = (icon) ? '<div class="notification-media"><i class="'+ icon +' '+ iconClass +'"></i></div>' : '';
				mediaHtml = (img) ? '<div class="notification-media"><img src="'+ img +'" class="'+ imgClass +'"></i></div>' : mediaHtml;
			var customBtnHtml = (btn && btnText) ? '<a href="'+ btnUrl +'" '+ btnAttr +'>'+ btnText +'</a>' : '';
			var closeBtnHtml = (closeBtn && closeBtn == 'disabled') ? '' : '<a href="#" data-dismiss="notification">Close</a>';
			var infoHtml = (!titleHtml && !contentHtml) ? '' : '<div class="notification-info">'+ titleHtml + contentHtml +'</div>';
			var btnHtmlClass = (!customBtnHtml && closeBtnHtml || customBtnHtml && !closeBtnHtml) ? 'single-btn' : '';
			var btnHtml = '<div class="notification-btn '+ btnHtmlClass +'">'+ customBtnHtml + closeBtnHtml + '</div>';
			var finalHtml = '<div class="app-notification '+ customClass +' bounceInRight animated '+ inverseMode +'">'+ mediaHtml + infoHtml + btnHtml + '</div>';
	
			if ($('#app-notification-container').length === 0) {
				$('body').append('<div id="app-notification-container" class="app-notification-container"></div>');
			}
			$('#app-notification-container').append(finalHtml);
			if (autoclose) {
				var targetElm = $('#app-notification-container').find('.app-notification').last();
				setTimeout(function() {
					$(targetElm).fadeOut(function() {
						$(this).remove();
					});
				}, autocloseTime);
			}
		}
	});
	
	$(document).on('click', '[data-toggle="notification"]', function(e) {
		e.preventDefault();
		var data = {
			title: ($(this).attr('data-title')) ? $(this).attr('data-title') : '',
			content: ($(this).attr('data-content')) ? $(this).attr('data-content') : '',
			icon: ($(this).attr('data-icon')) ? $(this).attr('data-icon') : '',
			iconClass: ($(this).attr('data-icon-class')) ? $(this).attr('data-icon-class') : '',
			img: ($(this).attr('data-img')) ? $(this).attr('data-img') : '',
			imgClass: ($(this).attr('data-img-class')) ? $(this).attr('data-img-class') : '',
			btn: ($(this).attr('data-btn')) ? $(this).attr('data-btn') : '',
			btnText: ($(this).attr('data-btn-text')) ? $(this).attr('data-btn-text') : '',
			btnAttr: ($(this).attr('data-btn-attr')) ? $(this).attr('data-btn-attr') : '',
			btnUrl: ($(this).attr('data-btn-url')) ? $(this).attr('data-btn-url') : '',
			autoclose: ($(this).attr('data-autoclose')) ? $(this).attr('data-autoclose') : '',
			autocloseTime: ($(this).attr('data-autoclose-time')) ? $(this).attr('data-autoclose-time') : '',
			customClass: ($(this).attr('data-class')) ? $(this).attr('data-class') : '',
			inverseMode: ($(this).attr('data-inverse-mode')) ? $(this).attr('data-inverse-mode') : '',
		};
		$.notification(data);
	});
	$(document).on('click', '[data-dismiss="notification"]', function(e) {
		e.preventDefault();
		$(this).closest('.app-notification').fadeOut(function() {
			$(this).remove();
		});
	});
};


/* 09. Handle Theme Panel & Cookie
------------------------------------------------ */
var handleThemePanelExpand = function() {
	$('[data-click="theme-panel-expand"]').on('click', function(e) {
		e.preventDefault();
		
		var targetElm = '.theme-panel';
		var targetClass = 'active';
		
		if ($(targetElm).hasClass(targetClass)) {
			$(targetElm).removeClass(targetClass);
		} else {
			$(targetElm).addClass(targetClass);
		}
	});
};
var handleThemePanelReset = function() {
	$('[data-click="reset-theme-setting"]').on('click', function(e) {
		e.preventDefault();
		Cookies.remove('theme');
		window.location.href = document.URL;
	});
};
var handleSetThemeCookie = function(field, value) {
	var cookie = (Cookies.getJSON('theme')) ? Cookies.getJSON('theme') : {};
	cookie[field] = value;
	Cookies.set('theme', cookie);
};
var handelThemePanelColorSelector = function() {
	$('[data-toggle="theme-selector"]').on('click', function(e) {
		e.preventDefault();
		var targetTheme = ($(this).attr('data-theme')) ? $(this).attr('data-theme') : 'default';
		
		if ($('#app').attr('data-theme')) {
			$('#app').removeClass($('#app').attr('data-theme'));
		}
		if (targetTheme) {
			$('#app').addClass(targetTheme);
			$('#app').attr('data-theme', targetTheme);
			handleSetThemeCookie('color', targetTheme);
		}
		$('[data-toggle="theme-selector"]').not(this).closest('.theme-list-item').removeClass('active');
		$(this).closest('.theme-list-item').addClass('active');
	});
};
var handleThemePanelOption = function() {
	
	// SIDEBAR FIXED
	$('.theme-panel #sidebar_fixed').change(function(e) {
		var cookieValue = ($(this).is(':checked')) ? 'fixed' : '';
		if (cookieValue) {
			$('#app').addClass('app-sidebar-fixed');
			if (!$('.theme-panel #header_fixed').is(':checked')) {
				$('.theme-panel #header_fixed').prop('checked', true);
				$('.theme-panel #header_fixed').trigger('change');
			}
		} else {
			$('#app').removeClass('app-sidebar-fixed');
		}
	});
	
	
	// SIDEBAR LIGHT
	$('.theme-panel #sidebar_light').change(function(e) {
		var cookieValue = ($(this).is(':checked')) ? 'light' : '';
		if (cookieValue) {
			$('#app').addClass('app-sidebar-light');
		} else {
			$('#app').removeClass('app-sidebar-light');
		}
	});
	
	
	// HEADER FIXED
	$('.theme-panel #header_fixed').change(function(e) {
		var cookieValue = ($(this).is(':checked')) ? 'fixed' : '';
		if (cookieValue) {
			$('#app').addClass('app-header-fixed');
		} else {
			$('#app').removeClass('app-header-fixed');
			if ($('.theme-panel #sidebar_fixed').is(':checked')) {
				$('.theme-panel #sidebar_fixed').prop('checked', false);
				$('.theme-panel #sidebar_fixed').trigger('change');
			}
		}
	});
	
	
	// HEADER DARK
	$('.theme-panel #header_dark').change(function(e) {
		var cookieValue = ($(this).is(':checked')) ? 'dark' : '';
		if (cookieValue) {
			$('#app').addClass('app-header-inverse');
		} else {
			$('#app').removeClass('app-header-inverse');
		}
		handleSetThemeCookie('headerColor', cookieValue);
	});
	
	
	// PAGE LOAD COOKIE
	if (Cookies.getJSON('theme')) {
		cookie = Cookies.getJSON('theme');
		
		if (cookie.color) {
			$('[data-theme="'+ cookie.color +'"]').trigger('click');
		}
		if (cookie.headerColor && cookie.headerColor == 'dark') {
			$('.theme-panel #header_dark').prop('checked', true).trigger('change');
		}
		if (cookie.headerFixed && cookie.headerFixed == 'fixed') {
			$('.theme-panel #header_fixed').prop('checked', true).trigger('change');
		}
		if (cookie.sidebarColor && cookie.sidebarColor == 'light') {
			$('.theme-panel #sidebar_light').prop('checked', true).trigger('change');
		}
		if (cookie.sidebarFixed && cookie.sidebarFixed == 'fixed') {
			$('.theme-panel #sidebar_fixed').prop('checked', true).trigger('change');
		}
	}
};


/* 10. Handle Card - Remove / Reload / Collapse / Expand
------------------------------------------------ */
var cardActionRunning = false;
var handleCardAction = function() {
	"use strict";

	if (cardActionRunning) {
		return false;
	}
	cardActionRunning = true;

	// remove
	$(document).on('mouseover', '[data-toggle=card-remove]', function(e) {
		if (!$(this).attr('data-init')) {
			$(this).tooltip({
				title: 'Remove',
				placement: 'bottom',
				trigger: 'hover',
				container: 'body'
			});
			$(this).tooltip('show');
			$(this).attr('data-init', true);
		}
	});
	$(document).on('click', '[data-toggle=card-remove]', function(e) {
		e.preventDefault();
		$(this).tooltip('dispose');
		$(this).closest('.card').remove();
	});
    
	// collapse
	$(document).on('mouseover', '[data-toggle=card-collapse]', function(e) {
		if (!$(this).attr('data-init')) {
			$(this).tooltip({
				title: 'Collapse / Expand',
				placement: 'bottom',
				trigger: 'hover',
				container: 'body'
			});
			$(this).tooltip('show');
			$(this).attr('data-init', true);
		}
	});
	$(document).on('click', '[data-toggle=card-collapse]', function(e) {
		e.preventDefault();
		$(this).closest('.card').find('.card-body').slideToggle();
	});

	// reload
	$(document).on('mouseover', '[data-toggle=card-refresh]', function(e) {
		if (!$(this).attr('data-init')) {
			$(this).tooltip({
				title: 'Reload',
				placement: 'bottom',
				trigger: 'hover',
				container: 'body'
			});
			$(this).tooltip('show');
		}
	});
	$(document).on('click', '[data-toggle=card-refresh]', function(e) {
		e.preventDefault();
		var target = $(this).closest('.card');
		if (!$(target).hasClass('card-loading')) {
			var targetBody = $(target).find('.card-body');
			var spinnerClass = ($(this).attr('data-spinner-class')) ? $(this).attr('data-spinner-class') : 'text-primary';
			var spinnerHtml = '<div class="card-loader"><div class="spinner-border '+ spinnerClass +'"></div></div>';
			$(target).addClass('card-loading');
			if ($(targetBody).length !== 0) {
				$(targetBody).append(spinnerHtml);
			} else {
				$(target).append(spinnerHtml);
			}
			setTimeout(function() {
				$(target).removeClass('card-loading');
				$(target).find('.card-loader').remove();
			}, 2000);
		}
	});
    
	// expand
	$(document).on('mouseover', '[data-toggle=card-expand]', function(e) {
		if (!$(this).attr('data-init')) {
			$(this).tooltip({
				title: 'Expand / Compress',
				placement: 'bottom',
				trigger: 'hover',
				container: 'body'
			});
			$(this).tooltip('show');
			$(this).attr('data-init', true);
		}
	});
	$(document).on('click', '[data-toggle=card-expand]', function(e) {
		e.preventDefault();
		var target = $(this).closest('.card');
		var targetBody = $(target).find('.card-body');
		var targetClass = 'card-expand';
		var targetTop = 40;
		if ($(targetBody).length !== 0) {
			var targetOffsetTop = $(target).offset().top;
			var targetBodyOffsetTop = $(targetBody).offset().top;
			targetTop = targetBodyOffsetTop - targetOffsetTop;
		}

		if ($('body').hasClass(targetClass) && $(target).hasClass(targetClass)) {
			$('body, .card').removeClass(targetClass);
			$('.card').removeAttr('style');
			$(targetBody).removeAttr('style');
		} else {
			$('body').addClass(targetClass);
			$(this).closest('.card').addClass(targetClass);
		}
		$(window).trigger('resize');
	});
};


/* 11. Handle Tooltip & Popover Activation
------------------------------------------------ */
var handelTooltipPopoverActivation = function() {
	"use strict";
	if ($('[data-toggle="tooltip"]').length !== 0) {
		$('[data-toggle=tooltip]').tooltip();
	}
	if ($('[data-toggle="popover"]').length !== 0) {
		$('[data-toggle=popover]').popover();
	}
};


/* 12. Handle Scroll to Top Button Activation
------------------------------------------------ */
var handleScrollToTopButton = function() {
	"use strict";
	$(document).scroll( function() {
		var totalScroll = $(document).scrollTop();

		if (totalScroll >= 200) {
			$('[data-click=scroll-top]').addClass('show');
		} else {
			$('[data-click=scroll-top]').removeClass('show');
		}
	});
	$('.content').scroll( function() {
		var totalScroll = $('.content').scrollTop();

		if (totalScroll >= 200) {
			$('[data-click=scroll-top]').addClass('show');
		} else {
			$('[data-click=scroll-top]').removeClass('show');
		}
	});
	$('[data-click=scroll-top]').on('click', function(e) {
		e.preventDefault();
		$('html, body, .content').animate({
			scrollTop: $("body").offset().top
		}, 500);
	});
};


/* Application Controller
------------------------------------------------ */
var App = function () {
	"use strict";
	
	return {
		//main function
		init: function () {
			this.initSidebar();
			this.initHeader();
			this.initComponent();
			this.initThemePanel();
		},
		initSidebar: function() {
			handleSidebarMinifyFloatMenu();
			handleSidebarMenu();
			handleSidebarMinify();
		},
		initHeader: function() {
			handleHeaderSearchBar();
			handleHeaderScrollShadow();
		},
		initComponent: function() {
			handleSlimScroll();
			handleCardAction();
			handelTooltipPopoverActivation();
			handleScrollToTopButton();
			handleDropdownClose();
			handleAppNotification();
		},
		initThemePanel: function() {
			handleThemePanelExpand();
			handleThemePanelReset();
			handelThemePanelColorSelector();
			handleThemePanelOption();
		},
		scrollTop: function() {
			$('html, body, .content').animate({
				scrollTop: $('body').offset().top
			}, 0);
		}
	};
}();

$(document).ready(function() {
	App.init();
});