/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    
    $('#forlogin').submit(function (e){
      var datos=$(this).serialize();
      var url=$(this).attr("action");
      
      $.ajax({
           url:url ,
            data: datos,
            dataType: "json",
            success: function( json, textStatus, jqXHR) { 
            console.log(json);           
}    
      });
      
    });
    
});