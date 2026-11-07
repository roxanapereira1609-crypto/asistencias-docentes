# Apoyo Educativo

## Descripción del proyecto

Apoyo Educativo es un proyecto web desarrollado con el propósito de facilitar la organización de información administrativa dentro de un establecimiento educativo.

Durante su desarrollo, el proyecto fue evolucionando hasta incorporar dos aplicaciones independientes: **Planificación de Actividades** y **Asistencias de Docentes**.

Ambas buscan facilitar tareas que normalmente requieren llevar registros manuales, permitiendo consultar y administrar la información desde un navegador.

## Módulos del proyecto

### 1. Planificación de Actividades

Esta aplicación permite organizar las actividades programadas en un establecimiento educativo.

Entre sus principales funciones se encuentran:

- Registrar nuevas actividades.
- Consultar las actividades guardadas.
- Editar información y fechas.
- Eliminar actividades.
- Organizar los registros según su fecha.
- Controlar el acceso mediante usuarios con diferentes permisos.

**Aplicación publicada en Render:**

https://planificacion-actividades.onrender.com/login-actividades

### 2. Asistencias de Docentes

Esta aplicación permite registrar y administrar la asistencia del personal docente.

Sus principales funciones son:

- Registrar la asistencia de docentes.
- Consultar los registros almacenados.
- Editar y eliminar registros según los permisos del usuario.
- Identificar ingresos puntuales y tardíos.
- Aplicar validaciones en los formularios.
- Proteger las funciones administrativas mediante roles.

Para el control de puntualidad se utiliza como referencia el horario de ingreso establecido hasta las 13:10 horas.

**Aplicación publicada en Render:**

https://asistencias-docentes.onrender.com/login

## Tecnologías utilizadas

- Java 21
- Spring Boot
- Maven
- HTML5
- Thymeleaf
- Spring Security
- Spring Data JPA
- PostgreSQL
- Neon
- Git y GitHub
- Render
- Visual Studio Code

## Organización del proyecto

Las aplicaciones utilizan una estructura organizada por capas:

- **Controller:** recibe las solicitudes y dirige las operaciones del sistema.
- **Service:** contiene la lógica de funcionamiento y las reglas del proyecto.
- **Repository:** permite consultar y almacenar información mediante JPA.
- **Model / Entity:** representa los datos que se administran.
- **Templates:** contiene las vistas que utiliza el usuario.

Esta organización facilita comprender el funcionamiento del código y realizar modificaciones sin afectar innecesariamente otras partes del proyecto.

## Seguridad y validaciones

Se implementó un sistema de inicio de sesión con roles de administrador y docente.

Los permisos permiten limitar el acceso a determinadas operaciones según el usuario que haya iniciado sesión.

También se incorporaron validaciones para evitar el registro de información incompleta.

## Base de datos y despliegue

Las aplicaciones utilizan PostgreSQL alojado en Neon para almacenar sus registros.

Los sistemas se encuentran publicados en Render y pueden consultarse desde un navegador.

Durante las pruebas se comprobó que los registros permanecen disponibles después de volver a ingresar a las aplicaciones.

También se verificó el proceso de actualización del código mediante GitHub y el despliegue automático en Render.

## Repositorios de GitHub

**Asistencias de Docentes:**

https://github.com/roxanapereira1609-crypto/asistencias-docentes

**Planificación de Actividades:**

Pendiente de agregar el enlace del repositorio.

## Videos de presentación — Entrega Parcial 4

### Pitch ejecutivo (3 minutos)

En este video se presenta el problema que busca resolver Apoyo Educativo, sus principales características y los beneficios que puede aportar a un establecimiento educativo.

**Enlace:** Pendiente de grabación y publicación.

### Demostración técnica (5 minutos)

En este video se muestra el funcionamiento de las dos aplicaciones, incluyendo el inicio de sesión, las operaciones principales, las validaciones y la seguridad mediante roles.

**Enlace:** Pendiente de grabación y publicación.

## Estado actual del proyecto

Apoyo Educativo cuenta con dos aplicaciones web publicadas y funcionales, que permiten administrar actividades y asistencias de docentes.

Como parte de las siguientes mejoras, se contempla continuar fortaleciendo la experiencia del usuario, la organización de la información y las funcionalidades de ambos sistemas.

## Autora

Roxana Adelaida Pereira Delgado
