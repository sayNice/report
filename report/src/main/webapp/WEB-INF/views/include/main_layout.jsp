<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if IE 8]> <html class="ie8"> <![endif]-->
<!--[if IE 9]> <html class="ie9"> <![endif]-->
<!--[if !IE]><!--> <html> <!--<![endif]-->
	<head>
		<title>奖助系统</title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=IE9;IE=IE8"> -->
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
                
        <!-- // base css -->
        <link href="../static/stylelib/base.css" rel="stylesheet" type="text/css" />
        <link href="../static/stylelib/responsive.css" rel="stylesheet" type="text/css" />
                        
        <!-- // plugins css -->
        <link href="../static/stylelib/plugins/font-awesome/font-awesome.css" rel="stylesheet" type="text/css" />
        <link href="../static/stylelib/plugins/iealert/style.css" rel="stylesheet" type="text/css" />
        
        <!-- // theme css -->
        <link href="../static/stylelib/theme_wblue/screen.css" rel="stylesheet" type="text/css" />
        <link href="../static/stylelib/theme_wblue/my_responsive.css" rel="stylesheet" type="text/css" />
        
        <!-- // 全局 css -->
		<!-- <link href="../static/css/global.css" rel="stylesheet" type="text/css" /> -->
		
		<!-- // 上传样式  -->
		<link href="../static/stylelib/plugins/bootstrap-fileupload/bootstrap-fileupload.css" rel="stylesheet" type="text/css" />
        <!-- // 时间控件样式 -->
        <link href="../static/stylelib/plugins/datepicker/datepicker.css" rel="stylesheet" type="text/css" />
        
     	<!-- 全局css样式 -->
		<%-- <link href="../static/stylelib/theme_default/button.css" rel="stylesheet" type="text/css" /> --%>
		<%-- <link href="../static/stylelib/plugins/wysihtml5/style.css" rel="stylesheet" type="text/css" /> --%>
	    <%--<!-- 此样式删除  -->
        <link href="../static/stylelib/plugins/wysihtml5/style.css" rel="stylesheet" type="text/css" /> --%>
	    <%--<link href="stylelib/plugins/uniform/themes/default/css/uniform.default.css" rel="stylesheet" type="text/css" /> --%>
	    <script src="../static/stylelib/jquery-1.7.2.min.js"></script>
	    <script src="../static/stylelib/jquery.form.min.js"></script>
        <script src="../static/stylelib/base.js"></script>
        <script src="../static/stylelib/plugins/iealert/iealert.js"></script>
        <script src="../static/stylelib/plugins/jquery.nicescroll.min.js"></script>
        <script src="../static/My97DatePicker/WdatePicker.js" type="text/javascript"></script>
	    
	</head>
	<body>
		
		<!--// Loading JS -->
		<%-- 更新为1.7.2 --%>
		
        
        <%-- <script src="../static/stylelib/plugins/jquery.slimscroll.min.js"></script> --%>
		<%-- <script src="../static/stylelib/jquery-ui-1.10.2.min.js"></script> --%>
        <%-- <script src="../static/stylelib/jquery-1.10.2.min.js"></script> --%>
        
        <!--common script for all pages-->        
        <!-- <script src="../static/stylelib/theme_default/global.js"></script> -->
        
        
        <!--function specific scripts-->
        
        <!--ajax file upload  -->
        <script src="../static/js/3rd/ajaxfileupload-2.1.js"></script>   
         
        <!--set context -->
        <script type="text/javascript">
			var SITE={}; SITE.context="${SITE['context']}"; SITE.images_context="${SITE['images_context']}";  SITE.static_context="${SITE['static_context']}";
			var module={param:{}};
		</script>
		
		<%--<!--全局 js -->--%>
		<!-- //public js  -->
		<script src="../static/js/main.js"></script>
		<script src="../static/js/jquerysession.js"></script>
		<%-- <!-- 增强型模态对话框 --> --%> 
		<!-- // modal  -->
        <script src="../static/stylelib/plugins/sco.modal.js"></script>
        <%-- <!-- 确认框 -->  --%> 
        <!-- confirm js -->
        <script src="../static/stylelib/plugins/sco.confirm.js"></script>
		<link href="../static/validation/validationEngine.jquery.css" rel="stylesheet" type="text/css" />
		<script type="text/javascript" src="../static/validation/jquery.validationEngine-zh-CN.js"></script>
		<script type="text/javascript" src="../static/validation/jquery.validationEngine.min.js"></script>
		
		
	</body>
</html>