/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {
    $('#agregar').click(function () {
        $('#formpers')[0].reset();
        $('#formpers').attr("action","ipersona");
        $("#magregar").modal("show");
        
    });
});