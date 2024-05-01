## Índice

1. [Entidad Clan](#Entidad-Clan)
2. [Entidad Role](#Entidad-Role)
3. [Entidad Score](#Entidad-Score)
4. [Entidad User](#Entidad-User)



##  Entidad Clan

### Descripción
La clase `Clan` representa un grupo o comunidad dentro del sistema. Cada clan tiene un nombre, una cohorte asociada, una puntuación y una lista de usuarios asignados a él.

### Atributos

1. **idClan (int)**:
   - Descripción: Identificador único del clan.
   - Restricciones: Generado automáticamente con la estrategia `GenerationType.IDENTITY`.
   
2. **nameClan (String)**:
   - Descripción: Nombre del clan.
   - Restricciones: Obligatorio, longitud máxima de 100 caracteres.

3. **cohort (String)**:
   - Descripción: Cohorte asociada al clan.
   - Restricciones: Opcional.

4. **points (int)**:
   - Descripción: Puntuación del clan.
   - Restricciones: Entero, representa la puntuación del clan en el sistema.

5. **asignedUsers (List<User>)**:
   - Descripción: Lista de usuarios asignados a este clan.
   - Restricciones: Lazy fetch, se carga solo cuando se accede a la lista.

### Relaciones

- **Relación con la clase User**:
  - Tipo: Muchos a muchos (Many-to-Many)
  - Descripción: Los clanes pueden tener múltiples usuarios, y los usuarios pueden pertenecer a múltiples clanes.
  - Configuración:
    - Lazy fetch: Los usuarios asignados


## Entidad Role

### Descripción
La clase `Role` representa un rol o permiso dentro del sistema. Cada rol tiene un identificador único y un nombre asociado.

### Atributos

1. **id (int)**:
   - Descripción: Identificador único del rol.
   - Restricciones: Generado automáticamente con la estrategia `GenerationType.IDENTITY`.

2. **name (String)**:
   - Descripción: Nombre del rol.
   - Restricciones: Obligatorio.


## Entidad Score

### Descripción
La clase `Score` representa un puntaje o calificación dentro del sistema. Cada puntuación tiene un identificador único, una cantidad de puntos asociados, una descripción opcional, una fecha de creación y está relacionada con usuarios asignados y asignados.

### Atributos

1. **scoreId (long)**:
   - Descripción: Identificador único de la puntuación.
   - Restricciones: Generado automáticamente con la estrategia `GenerationType.UUID`.

2. **points (int)**:
   - Descripción: Cantidad de puntos asociados a la puntuación.
   - Restricciones: Obligatorio.

3. **description (String)**:
   - Descripción: Descripción opcional de la puntuación.
   - Restricciones: Longitud máxima de 255 caracteres, puede ser nulo.

4. **creationDate (LocalDateTime)**:
   - Descripción: Fecha y hora de creación de la puntuación.
   - Restricciones: Fecha y hora de creación de la puntuación.

5. **assignedUser (User)**:
   - Descripción: Usuario al que se asigna esta puntuación.
   - Restricciones: Lazy fetch, se carga solo cuando se accede al usuario.

6. **assigneeUser (User)**:
   - Descripción: Usuario que asigna esta puntuación.
   - Restricciones: Lazy fetch, se carga solo cuando se accede al usuario.

   ### Relaciones

- **Relación con la clase User**:
  - Tipo: Muchos a uno (Many-to-One)
  - Descripción: Cada puntuación está asociada a un usuario asignado y a un usuario aque asigna.
  - Configuración:
    - Lazy fetch: Los usuarios se cargan solo cuando se accede a ellos.


## Entidad User

### Atributos

1. **id (long)**:
   - Descripción: Identificador único del usuario.
   - Restricciones: Generado automáticamente con la estrategia `GenerationType.UUID`.

2. **totalPoints (int)**:
   - Descripción: Total de puntos acumulados por el usuario.
   - Restricciones: Obligatorio.

3. **userPassword (String)**:
   - Descripción: Contraseña del usuario.
   - Restricciones: Obligatorio, longitud máxima de 45 caracteres.

4. **userName (String)**:
   - Descripción: Nombre de usuario.
   - Restricciones: Obligatorio, longitud máxima de 45 caracteres.

5. **email (String)**:
   - Descripción: Correo electrónico del usuario.
   - Restricciones: Obligatorio, longitud máxima de 45 caracteres.

6. **phoneNumber (String)**:
   - Descripción: Número de teléfono del usuario.
   - Restricciones: Obligatorio, longitud máxima de 45 caracteres.

7. **state (String)**:
   - Descripción: Estado del usuario (por ejemplo, activo, inactivo, etc.).
   - Restricciones: Longitud máxima de 45 caracteres.

### Relaciones

 **userRole (Role)**:
   - Descripción: Rol asignado al usuario.
   - Tipo: Muchos a uno (Many-to-One).
   - Configuración: Lazy fetch, se carga solo cuando se accede al rol.

 **asignedClans (List<Clan>)**:
   - Descripción: Lista de clanes asignados al usuario.
   - Tipo: Muchos a muchos (Many-to-Many).
   - Configuración: Lazy fetch, se carga solo cuando se accede a la lista de clanes.

 **recivedScore (List<Score>)**:
    - Descripción: Lista de puntuaciones recibidas por el usuario.
    - Tipo: Uno a muchos (One-to-Many).
    - Configuración: Lazy fetch, se carga solo cuando se accede a la lista de puntuaciones.

11. **asignedScore (List<Score>)**:
    - Descripción: Lista de puntuaciones asignadas por el usuario.
    - Tipo: Uno a muchos (One-to-Many).
    - Configuración: Lazy fetch, se carga solo cuando se accede a la lista de puntuaciones.
