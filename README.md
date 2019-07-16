# examen_ingreso_gradle

Examen para Especialista Java

Usted es un desarrollador experimentado en los negocios de Banca, y se le ha encargado la inspección y corrección de errores ocasionados debido al paso de un proyecto monolítico a uno basado en microservicios. Con este fin, el líder del proyecto le explica las funciones de pago de servicios.
Se necesita realizar el pago de servicios desde la Banca Web empresas, para ello, se necesita las siguientes funcionalidad:
-	Listar las empresas con las que se puede pagar un servicio.
-	Obtener los servicios a pagar de una empresa determinada.
-	Obtener el monto a pagar del servicio seleccionado anteriormente.
-	Realizar el pago con los datos seleccionados del servicio a pagar.
-	Listar los pagos registrados.

Por ejemplo, se quiere pagar el servicio de telefonía de la empresa Movistar, al consultar el monto a pagar, el sistema retorna S/. 100.00, se desea registrar el pago con este monto, y que se debite de la cuenta del cliente mediante una transferencia a la cuenta de la entidad prestadora del servicio.

Se evalúa: 
1.	Código fuente subido al repositorio Github 
2.	Patrones de diseño aplicados
3.	Los unit test de cada funcionalidad
4.	Refactoring al código
5.	Documentación de API Rest (Contratos). 

Tenga en cuenta enviarlo dentro del plazo acordado. Fecha Limite: 2 días después de haber recibido el examen.

    
Prerequisitos:
    Cualquier IDE
    GIT
    Java 8
    MySQL 5.6+

Entorno de desarrollo:
    
    Base de Datos:
	 La aplicación requiere una base de datos MySQL para almacenar sus datos. Asegúrese de actualizar application.properties con spring.datasource.URL (solo cambiar el nombre de host), spring.datasource.username y spring.datasource.password. Usted es libre de elegir el servicio MySQL en una nube o instalado en la máquina local o en el contenedor MySQL.
     La aplicación usa liquibase para cambios en la base de datos. En caso de que necesite actualizar la base de datos, cree un nuevo archivo de conjunto de cambios en la carpeta resources /db.changelog e incluya el archivo recién creado en db.changelog-master.xml
    
    Applicación:
     Para iniciar la aplicación, ejecute el método principal PagoServicioApplication.java desde su IDE.
