<!DOCTYPE html>
<html lang="es-419">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <title>Nomina</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf"
            crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
    <header>
        <h1>Formulario de la nomina del empleado</h1>
    </header>
    <div  class="container p-3 my-3 bg-danger text-white">
        <form action="LoginServlet" method="post">
            <label>Nombres:</label>
            <input type="text" name="nombres" size="40" required>
            <br/><br/>
            <label>Apellidos:</label>
            <input type="text" name="apellidos" pattern="{2,11}" required>
            <br/><br/>
            <label>Número de documento: </label>
            <input type="text" name="documento" pattern="{2,11}" required>
            <br/><br/>
            <label>Dias trabajados: </label>
            <input type="text" name="dias_trabajados" pattern="{1,31}" required>
            <br/><br/>
            <label>Salario mensual: </label>
            <input type="text" name="sueldo_mensual" pattern="{4,12}" required>
            <br/><br/>
            <input type="submit" value="Calcular" name="Calcular" required>
        </form>
        <footer>
            <p>Desarrollado en Java EE</p>
        </footer>


    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.1/dist/umd/popper.min.js"
            integrity="sha384-SR1sx49pcuLnqZUnnPwx6FCym0wLsk5JZuNx2bPPENzswTNFaQU1RDvt3wT4gWFG"
            crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.min.js"
            integrity="sha384-j0CNLUeiqtyaRmlzUHCPZ+Gy5fQu0dQ6eZ/xAww941Ai1SxSY+0EQqNXNE6DZiVc"
            crossorigin="anonymous"></script>
    </div>
</div>
</body>
</html>