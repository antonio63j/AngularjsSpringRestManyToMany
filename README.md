# Proyecto AngularjsSpringRestManyToMany
Proyecto con front-end basado en AngularJs y back-end con anotaciones de spring para hibernate y rest.
Este proyecto consiste en la implementacion de las siguientes adapataciones a partir de un proyecto eclipse con una relación entre las entidades empleado y telefono OneToMany ManyToMany:
1. Paso a realicion ManyToMany ManyToMany
2. Paso a gradle desde maven
3. Paso a git desde subversion

Herramientas / Frameworks y componentes empleados:
--------------------------------------------------
- Angujar y los siguientes componentes de angular:
'ngTouch', 'ui.grid', 'ui.grid.pagination','ui.grid.selection','ui.grid.resizeColumns', 'ngRoute','formly', 'formlyBootstrap', 'ui.bootstrap','ui.bootstrap.tpls'
- Spring con anotaciones para Rest e Hibernate.
- Git
- Gradlew
- Gestor de bd MySql

Instrucciones para importar el proyecto en eclipse:
---------------------------------------------------
- Importar Proyecto ->Git ->Projects from Git->Clone URI
URI:https://github.com/antonio63j/AngularjsSpringRestManyToMany
- Seleccionar master:
- Directory: D:\ProyectosJava\; aquí eclipse creará la carpeta AngularjsSpringRestManyToMany
- Seleccionar "Import as general project"

Visi�n del proyecto desde el explorador de eclipse
![Vision proyecto ](/doc/exploradorProyectosEclipse.jpg "Tarea para compilar y desplegar")
- Para disponer de la funcionalidades de eclipse como debug o ejecución de tareas gradle, ha sido necesario convertir este proyecto en un proyecto gradle.
El proyecto contiene una tarea gradle para compilar y desplegar el war.
- Para disponer de la funcionalidades de eclipse como debug o ejecución de tareas gradle, ha sido necesario convertir este proyecto en un proyecto gradle.

El proyecto contiene una tarea gradle para compilar y desplegar el war.
![Desde Run configuration ](/doc/gradleCompilarDesplegar.jpg "Tarea para compilar y desplegar")

Adaptación del proyecto a nuestro entorno:
------------------------------------------
**Tomcat:**
En el fichero dradle.properties, asignar a la variable tomcatHome, la carpeta donde se pondrá el .war
  tomcatHome=C:\\AppPortables\\WebServers\\apache-tomcat-8.5.11\\webapps; por ejemplo

**MySql:**
En el arranque de la aplicación se creará la BD en el caso de que no exista. También la configuracion de hibernate
permite crear las tablas si no existen. Tendremo únicamente que establecer usuario y password de la DB en el fichero properties:

jdbc.username = root
jdbc.password = root

Para probar:
------------
[http://localhost:8080/AngularjsSpringRestManyToMany](http://)


