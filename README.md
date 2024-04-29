# Aplicación de Gestión de Tareas
Este es un proyecto de una aplicación de gestión de tareas que utiliza Spring Boot, MySQL como base de datos y Angular en el frontend.


## Requesitos previos
Java Development Kit (JDK) - Versión 8 o superior
Maven
Node.js y npm
Angular CLI
MySQL Server

## Configuración

1. Clona este repositorio en tu máquina local.
```bash
git clone https://github.com/tu-usuario/tu-proyecto.git
```
2. Configura la base de datos MySQL:
- Crea una nueva base de datos llamada gestion_tareas.
- Ejecuta el script database.sql ubicado en backend/src/main/resources para crear las tablas necesarias.
3. Configura la conexión a la base de datos en el archivo application.properties ubicado en backend/src/main/resources.
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_tareas
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```
4. Construye y ejecuta el backend Spring Boot:

```bash
cd backend
mvn spring-boot:run
````
5. Instala las dependencias y ejecuta el frontend Angular:
```bash
cd frontend
npm install
ng serve
```
6. Abre tu navegador y visita http://localhost:4200 para acceder a la aplicación de gestión de tareas.


## Funcionalidades
- CRUD de Tareas: Permite crear, leer, actualizar y eliminar tareas.
- Interfaz de Usuario Intuitiva: El frontend está construido con Angular, lo que proporciona una experiencia de usuario fluida e interactiva.
- Seguridad: Aunque no se implementa en este proyecto de ejemplo, se puede añadir autenticación y autorización para proteger las rutas y datos sensibles.
# Contribuciones
Las contribuciones son bienvenidas. Siéntete libre de abrir un pull request para sugerir mejoras o corregir errores.
