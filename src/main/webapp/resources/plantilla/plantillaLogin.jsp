<%-- 
    Document   : plantilla01
    Created on : 2/05/2012, 10:11:27 PM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>   
<%@taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<!DOCTYPE html>
<html>
    <head>
        <title>JSP Page</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">          
          <link rel="icon" type="image/png" href="../resources/imag/login.login.png">
          <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
        <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/bootstrap.css">
          <link rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/cssalmacen.css">
          <script src="<%=request.getContextPath()%>/resources/js/jquery.min.js"></script>
          <script src="<%=request.getContextPath()%>/resources/js/bootstrap.min.js"></script>
    
    </head>
    <body style="background: #5e5f5f" class="hold-transition skin-blue sidebar-mini">        
       <div class="wrapper">
        <div  class="col-lg-1"></div>
        <div class="col-lg-10">
            <div class="col-md-12">
        <tiles:insertAttribute name="cabecera"/>
        </div>         
        <div class="col-md-12">
        <tiles:insertAttribute name="cuerpo"/>
        </div>     
        <div class="col-md-12">
        <tiles:insertAttribute name="pie"/>
        </div>
        </div>
    
<div  class="col-lg-1"></div>
    </div>
       </body>
</html>
