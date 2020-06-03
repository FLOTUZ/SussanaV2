create procedure SELECT_alumnos()
    -- ---------------------------------------------
-- Se recuperan los alumnos de la BD
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select a.idAlumno, a.semestre, g.letra, p.nombre, p.apellidos, p.NC, c.nombre
    from alumno a
             inner join persona p on a.Persona_idPersona = p.idPersona
             inner join carrera c on a.carrera_idcarrera = c.idcarrera
             inner join grupo g on a.Grupo_idGrupo = g.idGrupo;
end;

create procedure SELECT_alumnoByNC(NC int)
    -- ---------------------------------------------
-- Se recuperan los alumnos de la BD
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select a.idAlumno, a.semestre, g.letra, p.nombre, p.apellidos, p.NC, c.nombre
    from alumno a
             inner join persona p on a.Persona_idPersona = p.idPersona
             inner join carrera c on a.carrera_idcarrera = c.idcarrera
             inner join grupo g on a.Grupo_idGrupo = g.idGrupo
    where p.NC like NC;
end;

create procedure INSERT_grupo(_letra varchar(1))
    -- ---------------------------------------------
-- Se inserta un grupo
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    insert into grupo(letra) values (_letra);
end;

create procedure INSERT_PERSONA(_nombre VARCHAR(45),
                                _apellidos varchar(90), _NC int)
    -- ---------------------------------------------
-- Se inserta una persona
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    insert into persona (nombre, apellidos, NC) values (_nombre, _apellidos, _NC);
end;

create procedure INSERT_carrera(_nombre varchar(45))
    -- ---------------------------------------------
-- Se inserta una carrera
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    insert into carrera (nombre) VALUES (_nombre);
end;

create procedure INSERT_alumno(_semestre int(2), _idGrupo int, _idPersona int, _idCarrera int)
begin
    insert into alumno (semestre,
                        Grupo_idGrupo,
                        Persona_idPersona,
                        carrera_idcarrera)
    VALUES (_semestre,
            _idGrupo,
            _idPersona,
            _idCarrera);

end;

create procedure UPDATE_alumno(_semestre int(4),
                               _idGrupo int,
                               _idPersona int,
                               _idCarrera int,
                               _idAlumno int)
    -- ---------------------------------------------
-- Se actualiza datos de alumno
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

begin
    UPDATE alumno a
    SET a.semestre          = _semestre,
        a.Grupo_idGrupo     = _idGrupo,
        a.Persona_idPersona = _idPersona,
        a.carrera_idcarrera = _idCarrera
    WHERE a.idAlumno = _idAlumno;
end;

create procedure DELETE_alumno(_idAlumno int)
    -- ---------------------------------------------
-- Se elimina registro de un alumno
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    DELETE FROM alumno WHERE idAlumno = _idAlumno;
end;

create procedure SELECT_personas()
-- ---------------------------------------------
-- Se retorna todas las peronas de la tabla personas
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select idPersona, nombre, apellidos, NC from persona;
end;

create procedure SELECT_personasByNC(_NC int)
-- ---------------------------------------------
-- Se consulta persona por numero de control
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

begin
    select idPersona, nombre, apellidos, NC
    from persona
    where NC like _NC;
end;

create procedure UPDATE_persona(_idPersona int ,_nombre varchar(45), _apellidos varchar(90), _NC int)
begin
-- ---------------------------------------------
-- Se actualiza datos de una persona por numero de control
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

    UPDATE persona p
        set p.nombre = _nombre,
            p.apellidos = _apellidos,
            p.NC = _NC
    where p.idPersona = _idPersona;
end;

create procedure DELETE_persona(_NC int)
-- ---------------------------------------------
-- Se eliminan los datos de una persona por NC
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

begin
    DELETE from persona where NC = _NC;
end;