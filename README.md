# **¡Bienvenido al Wiki de Verifíquese Almacén!**

## ***¿Qué es Verifíquese Almacén?***
**Verifíquese Almacén** es una aplicación que le permite a **cualquier usuario** de los **Servicios Prémium** de la Aplicación **Verifíquese Cédula**, almacenar los datos obtenidos del documento de identidad escaneado con la Aplicación.

> **Nota:** Para ver cómo funcionan los servicios Prémium, ver el video [***Aquí***](https://www.youtube.com/c/VerifiqueseCedula/videos)

### ***Objetivo del proyecto***
El objetivo de este proyecto es que los usuarios puedan **instalar** en sus **equipos o servidores** su propia
aplicación para **almacenar** los datos de la Aplicación y poder tener el control de la **base de datos** generada al momento de escanear el o los documentos.
> **Nota:**  Actualmente aplica para la ***Cédula de Ciudadanía*** de **Colombia** y estamos trabajando para ampliarlo a otros países.

## **Comenzando**
1. Descarga el ***.zip*** con el código.
2. Despliégalo sobre un servidor con [**Glassfish 4.0**](https://download.oracle.com/glassfish/4.0/release/index.html) y [**MySQL 5.5.0**](https://downloads.mysql.com/archives/community/?version=5.5.0).
3. Debes configurar el **DataSource** ***JDBC*** llamado **`jdbc/premium_almacen`** que apunte a un **pool de conexiones** en el **Glassfish**, para que se conecte a la base de datos 
4. Configurar el **Realm** tipo ***JDBCRealm*** llamado **`premiumAlmacenRealm`**.

### **Configuración Aplicativo Verifíquese Cédula**
Estos son los **códigos** para configurar la Aplicación de **Verifíquese Cédula** con **Verifíquese Almacén** [**Ver**](https://github.com/verifiquese/VerifiqueseAlmacen/blob/master/codigos.md)

### ***Obtener el Aplicativo Verifíquese Cédula***
[![Play Store](https://www.verifique.se/sites/default/files/images/badge-google_0.png)](https://play.google.com/store/apps/details?id=se.verifique.app.cedula)
[![App Gallery](https://www.verifique.se/sites/default/files/images/badge-huawei-appgallery_v2.png)](https://appgallery.huawei.com/#/app/C101280213)
[![App Store](https://www.verifique.se/sites/default/files/images/badge-appstore_0.png)](https://apps.apple.com/co/app/id964472455)

### Licencia
Ver la licencia [***Aquí***](https://github.com/verifiquese/VerifiqueseAlmacen/blob/master/LICENSE)

### Protección de datos personales
Por favor tener en cuenta estos [***Términos de Protección de Datos Personales***](https://github.com/verifiquese/VerifiqueseAlmacen/blob/master/ProteccionDatosPersonales.md)
