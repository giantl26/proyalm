package com.pe.giancarlo.proyalm.Mapper;



import com.pe.giancarlo.proyalm.beans.Persona;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;

public interface IPersonaMapper {
String insert="INSERT INTO `bdimag`.`persona` (`DNI`, `NOM`, `APE_PAT`, `APE_MAT`, `FEC_NAC`, `DIR`) "
        +     "VALUES(#{dni},#{nom},#{ape_pat},#{ape_mat},#{fec_nac},#{dir})";

    
@Insert(insert)    
@Options(useGeneratedKeys = true,keyProperty = "id")  
void insertar(Persona persona);     
}
