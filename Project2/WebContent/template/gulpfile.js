var gulp = require('gulp');
var sass = require('gulp-sass');
var minifyCSS = require('gulp-csso');
var concat = require('gulp-concat');
var sourcemaps = require('gulp-sourcemaps');
var livereload = require('gulp-livereload');
var webserver = require('gulp-webserver');

gulp.task('html', function(){
  return gulp.src('src/html/*.html')
    .pipe(gulp.dest('dist/'))
    .pipe(livereload());
});

gulp.task('css', function(){
  return gulp.src([
  	'src/assets/scss/font.scss',
  	'node_modules/@fortawesome/fontawesome-free/css/all.min.css',
  	'node_modules/jquery-ui-dist/jquery-ui.min.css',
  	'node_modules/animate.css/animate.min.css',
  	'node_modules/pace-js/themes/black/pace-theme-flash.css',
  	'src/assets/scss/styles.scss'
  	])
    .pipe(sass())
    .pipe(concat('app.min.css'))
    .pipe(minifyCSS())
    .pipe(gulp.dest('dist/assets/css/'))
    .pipe(livereload());
});

gulp.task('fonts', function() {
  return gulp.src(['node_modules/@fortawesome/fontawesome-free/webfonts/*'])
    .pipe(gulp.dest('dist/assets/webfonts/'));
});

gulp.task('img', function() {
  gulp.src('src/assets/scss/img/**')
    .pipe(gulp.dest('dist/assets/css/img/'))
    .pipe(livereload());
  return gulp.src(['src/assets/img/**'])
    .pipe(gulp.dest('dist/assets/img/'))
    .pipe(livereload());
});

gulp.task('plugins', function() {
	var pluginFiles = [
  	'node_modules/chart.js/**',
  	'node_modules/jvectormap/**',
  	'node_modules/bootstrap-colorpicker/**',
  	'node_modules/bootstrap-datepicker/**',
  	'node_modules/bootstrap-select/**',
  	'node_modules/bootstrap-slider/**',
  	'node_modules/bootstrap-tagsinput/**',
  	'node_modules/bootstrap-timepicker/**',
  	'node_modules/bootstrap-3-typeahead/**',
  	'node_modules/jquery.maskedinput/**',
  	'node_modules/pwstrength-bootstrap/**',
  	'node_modules/summernote/**',
  	'node_modules/fullcalendar/**',
  	'node_modules/twitter-bootstrap-wizard/**',
  	'node_modules/blueimp-file-upload/**',
  	'node_modules/blueimp-tmpl/**',
  	'node_modules/blueimp-gallery/**',
  	'node_modules/blueimp-canvas-to-blob/**',
  	'node_modules/blueimp-load-image/**',
  	'node_modules/datatables.net/**',
  	'node_modules/datatables.net-bs4/**',
  	'node_modules/datatables.net-autofill/**',
  	'node_modules/datatables.net-autofill-bs4/**',
  	'node_modules/datatables.net-buttons/**',
  	'node_modules/datatables.net-buttons-bs4/**',
  	'node_modules/datatables.net-colreorder/**',
  	'node_modules/datatables.net-colreorder-bs4/**',
  	'node_modules/datatables.net-fixedcolumns/**',
  	'node_modules/datatables.net-fixedcolumns-bs4/**',
  	'node_modules/datatables.net-fixedheader/**',
  	'node_modules/datatables.net-fixedheader-bs4/**',
  	'node_modules/datatables.net-keytable/**',
  	'node_modules/datatables.net-keytable-bs4/**',
  	'node_modules/datatables.net-responsive/**',
  	'node_modules/datatables.net-responsive-bs4/**',
  	'node_modules/datatables.net-rowgroup/**',
  	'node_modules/datatables.net-rowgroup-bs4/**',
  	'node_modules/datatables.net-rowreorder-bs4/**',
  	'node_modules/datatables.net-scroller/**',
  	'node_modules/datatables.net-scroller-bs4/**',
  	'node_modules/datatables.net-select/**',
  	'node_modules/datatables.net-select-bs4/**',
  	'node_modules/photoswipe/**',
  	'node_modules/kbw-countdown/**',
  	'node_modules/moment/**'
	];
	gulp.src(pluginFiles, { base: './node_modules/' }).pipe(gulp.dest('dist/assets/plugins'));
});

gulp.task('js', function(){
  gulp.src('src/assets/js/demo/**')
    .pipe(gulp.dest('dist/assets/js/demo/'))
    .pipe(livereload());
  return gulp.src([
  	'node_modules/pace-js/pace.min.js',
  	'node_modules/jquery/dist/jquery.min.js',
  	'node_modules/jquery-ui-dist/jquery-ui.min.js',
  	'node_modules/bootstrap/dist/js/bootstrap.bundle.min.js',
  	'node_modules/jquery-slimscroll/jquery.slimscroll.min.js',
  	'node_modules/js-cookie/src/js.cookie.js',
  	'src/assets/js/app.js',
  	])
    .pipe(sourcemaps.init())
    .pipe(concat('app.min.js'))
    .pipe(sourcemaps.write())
    .pipe(gulp.dest('dist/assets/js'))
    .pipe(livereload())
});

gulp.task('watch', function () {
	livereload.listen();
  gulp.watch('src/html/**/*.html', gulp.series(gulp.parallel(['html'])));
  gulp.watch('src/assets/scss/**/*.*', gulp.series(gulp.parallel(['css'])));
  gulp.watch('src/assets/js/**/*.js', gulp.series(gulp.parallel(['js'])));
  gulp.watch('src/assets/img/**', gulp.series(gulp.parallel(['img'])));
});

gulp.task('webserver', function() {
  gulp.src('dist')
    .pipe(webserver({
    	host: 'localhost',
      livereload: true,
      directoryListing: false,
      open: true,
      fallback: 'index.html'
    }));
});

gulp.task('default', gulp.series(gulp.parallel([ 'html', 'css', 'js', 'fonts', 'img', 'plugins', 'watch', 'webserver' ])));