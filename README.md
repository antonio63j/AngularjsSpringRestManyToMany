# Proyecto AngularjsSpringRestManyToMany
Proyecto con front-end basado en AngularJs y back-end con anotaciones de spring para hibernate y rest.
Este proyecto consiste en la implementacion de las siguientes adapataciones a partir de un proyecto con una relacion
entre las entidades empleado y telefono OneToMany ManyToMany:
1. Paso a realicion ManyToMany ManyToMany
2. Paso a gradle desde maven
3. Paso a git desde subversion

Herramientas / Frameworks y componentes empleados:
--------------------------------------------------
Angujar, Srping con anotaciones Rest, Hibernate
Componentes de Anguarjs:
'ngTouch', 'ui.grid', 'ui.grid.pagination','ui.grid.selection','ui.grid.resizeColumns', 'ngRoute','formly', 'formlyBootstrap', 'ui.bootstrap','ui.bootstrap.tpls'

Instrucciones para importar el proyecto en eclipse:
---------------------------------------------------
1. Importar Proyecto ->Git ->Projects from Git->Clone URI
2. URI:https://github.com/antonio63j/AngularjsSpringRestManyToMany
3. Seleccionar master y <Next>
4. Directory: D:\ProyectosJava\AngularSpringRest\AngularjsSpringRestManyToMany; por ejemplo
5. Seleccionar "Import as general project"
6. <Finish>

Adaptación del proyecto a nuestro entorno:
------------------------------------------
**Tomcat:**
En el fichero dradle.properties, asignar a la variable tomcatHome, la carpeta donde se pondr� el .war
  tomcatHome=C:\\AppPortables\\WebServers\\apache-tomcat-8.5.11\\webapps; por ejemplo

**MySql:**
En el arranque de la aplicación se creará la BD en el caso de que no exista. Tambien la configuracion de hibernate
permite crear las tablas si no existen. Tendremo únicamente que establecer usuario y password de la DB en el fichero properties:
jdbc.username = root
jdbc.password = root


Para probar:
------------
[http://localhost:8080/AngularjsSpringRestManyToMany](http://)


