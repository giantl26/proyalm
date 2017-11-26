<%@taglib prefix="s" uri="/struts-tags"%>
<div style="background: #253e4a; height: 60px">
<header  class="main-header">   
    <a href="login.jsp" class="logonav">      
      <span class="logo-lg">Almacen</b>LTE</span>
    </a>
    <nav >
      
        <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
             <li>
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <span class="label label-success"><s:property value="getText('idioma')"/> </span> 
              <label style="color: #ccccff"> <s:property value="getText('sim')"/> </label>
            </a>   
            <s:url var="ingles" includeParams="all" value="">
                <s:param name="request_locale">en</s:param>
             </s:url>	
        <s:url var="espanol" includeParams="all" value="">
                <s:param name="request_locale">es</s:param>
        </s:url>
                <s:url var="frances" includeParams="all" value="">
                <s:param name="request_locale">fr</s:param>
        </s:url>

                 <ul class="dropdown-menu" style="background: #00a65a">
                        <li>SELECIONE IDIOMA</li>
                        <div class=" menu list-group" >
                            <s:a href="%{ingles}" cssClass="list-group-item list-group-item-action btn btn-warning"><label style="color: #ffffff"> ENGLISH - ENG </label></s:a>
                            <s:a href="%{espanol}" cssClass="list-group-item list-group-item-action btn btn-warning"><label style="color: #ffffff"> ESPANOL - ESP</label></s:a>
                            <s:a href="%{frances}" cssClass="list-group-item list-group-item-action btn btn-warning"><label style="color: #ffffff"> FRANCES - FRA</label></s:a>
                        </div>                        
                        </ul>
                </li>

            </ul>
     </div>
    </nav>
  </header>
  </div>