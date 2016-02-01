# Bienvenido al Wiki de VerifiqueseAlmacen!

Esta aplicación le permite a cualquier usuario de los servicios Premium de la App Verifíquese Cédula Almacenador los datos obtenidos del Documento de Identidad escaneado con la Aplicación.  Para ver cómo funciona la versión, ver este video en Youtube:  https://www.youtube.com/watch?v=h098tUeYXYo

El objetivo de este proyecto es que los usuarios puedan instalar en sus equipos o servidores en internet su propia aplicación para almacenar los datos de la Aplicación y poder tener el control de la base de datos generada al escanear el documento.

Actualmente aplica para la Cédula de Ciudadanía de Colombia y estamos trabajando para ampliarlo a otros países.

Baja el código e desplegarlo sobre un servidor Glassfish mínimo 4 y el esquema de datos para MySQL 5.5.

Debes configurar el DataSource del JDBC que apunta al Pool de Conexiones en el Glassfish llamándolo: "jdbc/premium_almacen" para que se conecte a la base de datos y configurar el Realm tipo JDBCRealm llamado: "premiumAlmacenRealm"

Los parámetros del Realm deben quedar como se ve a continuación:
![VerifiqueseAlmacen Realm](http://oi67.tinypic.com/3445to7.jpg)
