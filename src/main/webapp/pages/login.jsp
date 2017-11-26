<%-- 
    Document   : login
    Created on : Nov 7, 2017, 4:00:46 PM
    Author     : giancarlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
     <script src="<%=request.getContextPath()%>/resources/func/jlogin.js"></script>   
    <title>Login</title>  
    </head>
    <body>        
        
        <div class="hold-transition login-page" >
        <div class="login-box">       
  <div class="login-logo">
       <p style="color: #3e3d3d"><b>Almacen</b>LTE</p>
  </div>
        <div class="login-box-body" style="opacity: 0.9;" >
        <div  align="center">
        <!--<h1 class="login-box-msg">Login</h1>-->
        <img class="login-box-msg"     src="../resources/imag/login.login.png"/>
        <%--<s:if test="hasActionErrors()">--%>
        <%--<s:fielderror name="login.mensaje" cssStyle="color: #b15959 list-style-type: none;"/>--%>
        <%--</s:if>--%>
        
        </div>
<s:if test="hasActionErrors()">
    <img  style="height: 20px; width: 20px" src="../resources/imag/error.jpg"/> 
    <div class="col-md-10 errors">        
        <s:actionerror theme="jquery"/>
   </div>
</s:if>
        <input id="login.mensaje    " type="text"  name="username" class="form-control flogin" placeholder='<s:text name="login.username"/>' required>

        <form id="forlogin" action="login" method="post">
      <div class="form-group has-feedback">
          <input id="login.email" type="text"  name="username" class="form-control flogin" placeholder='<s:text name="login.username"/>' required>
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
          <input id="login.password" type="password" name="password" class="form-control flogin" placeholder='<s:property value="getText('login.password')"/>' required>
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        
        <div  align="center" class="col-xs-12">
            <button id="login.ingresar" type="submit" name="ingresar" class="btn btn-danger btn-block btn-flat"><s:property value="getText('login.ingreso')"/></button>        
        <br/>
          <b><a id="login.cambiar" href="#"><s:property value="getText('login.cambiarclave')"/></a> </b>
        <br/>
        </div>        
      </div>         
        </form>        
        </div>            
        </div> 
            <br/>
            </div>

        
        
    </body>
</html>
