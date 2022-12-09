<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcular el area de un Pentagono</title>
    <link rel="stylesheet" href="../ASSETS/css/stylos.css">
    <link rel="icon" type="image/x-icon" href="../ASSETS/img/icono/pentagon256_25206.ico">
</head>
<body style="background-color: black">

    <header>
        <section class ="titulos">
            <h1>Calcular el area de un Pentagono</h1>
            
        </section>
        <a href="../index.jsp" ><img src="../ASSETS/img/back_arrow_14447.png" width="50px" alt="volver"> </a>
    </header>
       <center><p>El área del pentágono es igual al perímetro por apotema divido entre dos. Es decir:</p></center>
       <center><img src="../ASSETS/img/formulaPentagono.png" alt="Formula_pentagono"></center>
       <div class="form_labelbox" style="font-weight:normal;">
        <label class="labelformcalculo" for="diagonalMenor" style="width:110px; padding-left:10px; padding-top:2px; font-weight:normal;color: azure;">Lado:</label>
        &nbsp;
        <input type="text" alt="" style=" margin-left:10px;width:70px; text-align:right;" tabindex="1" maxlength="9" size="9" value="" id="diagonalMenor" name="diagonalMenor"/>centimetros.
    </div>
    <div class="form_labelbox" style="font-weight:normal;">
        <label class="labelformcalculo" for="diagonalMayor" style="width:110px; padding-left:10px; padding-top:2px; font-weight:normal;color:azure;">Apotema:</label>
        &nbsp;
        <input type="text" alt="" style=" margin-left:10px;width:70px; text-align:right;" tabindex="2" maxlength="9" size="9" value="" id="diagonalMayor" name="diagonalMayor"/> centimetros.
    </div>
    <center><img src="../ASSETS/img/figPentagono.png" alt="pentagono"></center>
    <div class="boton calcular">
        <input type="button" value="Calcular Area pentagono"

    <div class="form_labelbox">
        <label class="labelformresultado" for="area" style="padding-top:5px; width:160px; margin-left:70px; font-weight:normal;color: azure;">Area del pentagono:</label>
        <input type="text"  readonly="readonly" alt="" style="width: 100px;margin-top:3px; text-align:right;" tabindex="11" maxlength="9" size="9" class="textInput" value="" id="area" name="area"/> centimetros.
    </div> 
    
    
</body>
</html>