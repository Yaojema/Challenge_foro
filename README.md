# Challenge Foro con Spring Boot

En este desafío de Spring, he creado mi propio catálogo API REST foro. Aprendí a realizar solicitudes a mi API usando INSOMIA, a manipular datos JSON, a guardar en una base de datos usando Hibernate y validaciones así como DTO.

![Estatus](https://img.shields.io/badge/STATUS-TERMINADO-green)

## :hammer: Se creó estas funcionalidades:

1. Registrar topico con los datos:
   2. Titulo, mensaje, estado, curso y autor
   3. La fecha y el id se genera automaticamente
2. Listar todos los topicos, por defecto solo mostrando 3 topicos con Pageable
3. Retornar un tópico por su id con sus 7 datos usando DTO de respuesta
4. Eliminar tópico por su id desde el path
5. Actualizar tópico por su id en la base de datos
6. Autenticación tipo Stateless
7. Usar JWT para la API y autorización con token bearer

## Se utilizó estas tecnologías

* Spring Boot 3.3.1
* Java 17
* Maven 4.0
* PosgreSQL
* Lombok
* Spring Web
* Spring Security
* JWT Auth0 4.2.0
* Flyway
* Spring JPA

## API

La aplicación de Foro utilizó Insomnia para hacer HttpRequest de POST, GET, DELETE y PUT 

## Contribución

Si tienes ideas adicionales o mejoras, no dudes en contactarme. La creatividad es esencial para el desarrollo de software 😊.
