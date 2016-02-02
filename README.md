# Bienvenido al Wiki de VerifiqueseAlmacen!

Verifíquese Almacén es una aplicación que le permite a cualquier usuario 
de los servicios Premium de la App Verifíquese Cédula, almacenar los datos 
obtenidos del documento de Identidad escaneado con la Aplicación.  
Para ver cómo funcionan los servicios Premium, ver este video en Youtube:

https://www.youtube.com/watch?v=h098tUeYXYo

La App se encuentra en: 
https://play.google.com/store/apps/details?id=se.verifique.app.cedula

El objetivo de este proyecto es que los usuarios puedan instalar en sus 
equipos o servidores en internet su propia aplicación para almacenar los 
datos de la Aplicación y poder tener el control de la base de datos 
generada al escanear el documento.

Actualmente aplica para la Cédula de Ciudadanía de Colombia y estamos 
trabajando para ampliarlo a otros países.

Baja el código y despliégalo sobre un servidor Glassfish 4 y 
el esquema de datos para base de datos MySQL 5.5.

Debes configurar el DataSource JDBC llamado "jdbc/premium_almacen" que apunte 
a un oool de conexiones en el Glassfish, ara que se conecte a 
la base de datos y configurar el Realm tipo JDBCRealm llamado: 
"premiumAlmacenRealm"

Los parámetros del Realm deben quedar como se ve a continuación:
![VerifiqueseAlmacen Realm](http://oi67.tinypic.com/3445to7.jpg)

#LICENCIA
Ten en cuenta los términos de la licencia sobre Proteccción de Datos Personales.
Ver Licencia https://github.com/verifiquese/VerifiqueseAlmacen/blob/master/LICENSE
