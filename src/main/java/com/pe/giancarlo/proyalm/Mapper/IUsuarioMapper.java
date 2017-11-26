
package com.pe.giancarlo.proyalm.Mapper;

import com.pe.giancarlo.proyalm.beans.Rol;
import com.pe.giancarlo.proyalm.beans.Usuario;
import java.util.ArrayList;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;

public interface IUsuarioMapper {


String insert="Insert Into usuario (usu,pas,est_act,intento,rol_id,persona_id) values (#{usu},#{pas},'A',0,#{rol_id.id},#{persona_id.id})";
String select_all="select * from usuario";
String consultar_rol="select * from rol";
String consultar_activos="select id,usu,pas,est_act from usuario where est_act='A'";
String estado_usuario="update usuario  set est_act=#{est_act} where id=#{id}" ;
String consultar_persona="select u.id, u.usu,u.est_act, u.persona_id,p.dni,p.nom,p.ape_pat,p.ape_mat,p.fec_nac,p.dir, u.rol_id,r.car,r.des " +
                         " from usuario u , persona p,rol r where u.persona_id=p.id and r.id=u.rol_id " ;

String IniciarSeccion="{ call bdimag.Iniciar_Seccion(#{usu,mode=IN,jdbcType=VARCHAR}"
                        + ",#{pas,mode=IN,jdbcType=VARCHAR}"
                        + ",#{id,mode=OUT,jdbcType=INTEGER}"
                        + ",#{est_act,mode=OUT,jdbcType=CHAR}"
                        + ",#{persona_id.id,mode=OUT,jdbcType=INTEGER})}";
                        

// QUERYS UTILIZADOS

@Select(select_all)
ArrayList<Usuario> consultar_todos();  

@Select(consultar_activos)
ArrayList<Usuario> consultar_Activos();  

@Select(consultar_rol)
ArrayList<Rol> consultar_rol();  

@Update(estado_usuario)
void Estado_usuario(Usuario usuario);  

@Select(consultar_persona)
@ResultMap("usuariomap")
ArrayList<Usuario> consultar_persona();  

 @Options(statementType= StatementType.CALLABLE)
@Select(IniciarSeccion)
void IniciarSeccion(Usuario usu);


// QUERYS DE PRACTICA
@Insert(insert)    
@Options(useGeneratedKeys = true,keyProperty = "id")  
 void insertar(Usuario usuario);    

// 
//@Delete("")
//void eliminar(Usuario usuario);  
//
//@Update("")
//void editar(Usuario usuario);  
//
//@Select("")
//void consultar_codigo(Usuario usuario);  
//
//@Select("")
//void consultar_usuario(Usuario usuario);  
}
