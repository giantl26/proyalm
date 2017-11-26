<%-- 
    Document   : gestionarcliente
    Created on : Nov 9, 2017, 4:04:55 PM
    Author     : giancarlo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
    </head>
    <body>
        <div class="content-wrapper">
       <section class="content-header">      
      <h1>
          Gestionar Cliente
      </h1>
    </section>
    
            <table class="table table-bordered">
                <thead>
                    <th>#</th>
                    <th>Persona</th>
                    <th>DNI</th>
                    <th>Fecha-Nacimiento</th>
                    <th>Usuario</th>
                    <th>Rol</th>
                    <th>Estado</th>
                    <th>Editar</th>
                    <th>Eliminar</th>
                </thead>
                <tbody>
                    <s:iterator value="listusu" status="usu">
                        <tr>
                            <td><s:property value="#usu.count"/></td>
                            <td><s:property value="persona_id.nom"/>  <s:property value="persona_id.ape_pat"/> <s:property value="persona_id.ape_mat"/></td>
                            <td><s:property value="persona_id.dni"/></td>
                            <td><s:property value="persona_id.fec_nac"/></td>
                            <td><s:property value="usu"/></td>
                            <td><s:property value="rol_id.car"/></td>
                            <td>
                                <s:if test="est_act.equalsIgnoreCase('A')"><label>Activo</label> </s:if>
                                <s:if test="est_act.equalsIgnoreCase('B')"><label>Bloqueado</label> </s:if>
                            </td>
                            <td>
                                <s:url var="editar" action="upersona">
		       		<s:param name="usuario.id" value="id"/>
		       		</s:url> <s:a href="%{editar}">Edit</s:a>                            
                            </td>
                            <td>
                            <s:if test="est_act.equalsIgnoreCase('A')">
                                <s:url var="bloquear"  action="upersona">
		       		<s:param name="usuario.id" value="id"/>
		       		<s:param name="usuario.est_act">B</s:param>
		       		</s:url> <s:a href="%{bloquear}">Bloquear</s:a>                            
                            </s:if>
                                <s:if test="est_act.equalsIgnoreCase('B')">
                                <s:url var="bloquear" action="espersona">
		       		<s:param name="usuario.id" value="id"/>
                                <s:param name="usuario.est_act">A</s:param>
		       		</s:url> <s:a href="%{bloquear}">Activar</s:a>
                                </s:if>
                            </td>
                        </tr>
                    </s:iterator>
                </tbody>
            </table>

            <button id="agregar" class="btn btn-block btn-primary" style="width: 15%">AGREGAR</button>
        </div>

        <!--model-->
        <div class="modal modal-pers fade"  id="magregar">
        <div class="modal-dialog">
            <div class="modal-content">
              <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                  <span aria-hidden="true" style="color: #ffffff" >&times;</span></button>
                  <h4 class="modal-title" style="color: #ffffff">AGREGAR USUARIO</h4>
              </div>
          <form id='formpers' >
              <div class="box-body">                
          
          <div class="form-group col-md-12">
           <label for="first_name">DNI</label>
            <input type="text" id='dni' class="form-control"  name="persona.dni"  placeholder="DNI" maxlength="8" minlength="8" onkeypress="return soloNumeros(event)" required>           
             </div>
          
          
          <div class="form-group col-md-12">
		    <label for="first_name">NOMBRE</label>
		    <input id='nombre' type="text" class="form-control"  name="persona.nom" placeholder="Nombre" onkeypress="return soloLetras(event)" required >
                         </div>

          <div class="form-group col-md-6">
		    <label for="first_name">APELLIDO PATERNO</label>
		    <input id='apepat' type="text" class="form-control"  name="persona.ape_pat" placeholder="Apellido Paterno" onkeypress="return soloLetras(event)" required>            
          </div>
          
                    <div class="form-group col-md-6">
	<label for="first_name">APELLIDO MATERNO</label>
        	<input id='apemat' type="text" class="form-control" name="persona.ape_mat"    placeholder="Apellido Materno" onkeypress="return soloLetras(event)" required>            
             </div>

          <div class="form-group col-md-6">
          <label for="first_name">FECHA NACIMIENTO</label>
		    <input id='fnac' type="DATE" class="form-control" name="persona.fec_nac" required>            
           </div>
                    <div class="form-group col-md-12">

          <label for="first_name">DIR</label>
		    <input id='dir' type="text" class="form-control" name="persona.dir"  placeholder="Dirrecion" required>            
           </div>
          <div class="form-group col-md-12">
             <label for="first_name">ROL</label><br>
           <select id='rol' name='usuario.rol_id.id' class="form-control" >
			<option value='o'>Seleccionar ROL</option>
                               <s:iterator value="listrol" status="rol">
                               <option value='<s:property value="id"/>'><s:property value="car"/> </option>    
                               </s:iterator>
           </select>

          </div>
                </div>
        

              <div class="modal-footer">
                <button type="button" class="btn btn-outline pull-left" data-dismiss="modal">Close</button>
                <input type="submit" class="btn btn-outline" value="Agregar"/>
              </div>
            </div>
          </form>
            <!-- /.modal-content -->
          </div>
              
            
        </div>        
        
                
    </body>
        <script src="<%=request.getContextPath()%>/resources/func/jgestperson.js"></script>
</html>
