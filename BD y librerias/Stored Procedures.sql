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

create procedure INSERT_grupo(_letra varchar(1), _tutor_iddocente int)
    -- ---------------------------------------------
-- Se inserta un grupo
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    insert into grupo(letra, tutor_iddocente) values (_letra, _tutor_iddocente);
end;

create procedure INSERT_persona(_nombre VARCHAR(45),
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

create procedure UPDATE_persona(_idPersona int, _nombre varchar(45), _apellidos varchar(90), _NC int)
begin
    -- ---------------------------------------------
-- Se actualiza datos de una persona por numero de control
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

    UPDATE persona p
    set p.nombre    = _nombre,
        p.apellidos = _apellidos,
        p.NC        = _NC
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

create procedure INSERT_bajaAusentismo(_fecha DATE,
                                       _docenteReporta varchar(45),
                                       _asignatura varchar(45),
                                       _clave int,
                                       _fechasInasistenciasInjustificadas json,
                                       _posibleCausa varchar(50),
                                       _resultadoInvestigacion varchar(255),
                                       _idAlumno int)
begin
    insert into bajaausentismo(fecha,
                               docenteReporta,
                               asignatura,
                               clave,
                               fechasInasistenciasInjustificadas,
                               posibleCausa,
                               resultadoinvestigacion,
                               alumno_idAlumno)
    VALUES (_fecha,
            _docenteReporta,
            _asignatura,
            _clave,
            _fechasInasistenciasInjustificadas,
            _posibleCausa,
            _resultadoInvestigacion,
            _idAlumno);
end;

create procedure INSERT_canalizacion(_fecha Date,
                                     _idTutor int,
                                     _idAlumno int,
                                     _idCarrera int,
                                     _trizteza tinyint,
                                     _angustia tinyint,
                                     _ansiedad tinyint,
                                     _desesperacion tinyint,
                                     _llanto tinyint,
                                     _conducta tinyint,
                                     _animo tinyint,
                                     _exitacion tinyint,
                                     _irritabilidad tinyint,
                                     _drogas tinyint,
                                     _aprendizaje tinyint,
                                     _autoAgresiones tinyint,
                                     _otro VARCHAR(255),
                                     _Descripcion text(255))
begin
    -- ---------------------------------------------
-- Se inserta una nuevacanalización
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------

    insert into canalizacion
    (fecha,
     Tutor_idTutor,
     Alumno_idAlumno,
     carrera_idcarrera,
     tristeza,
     angustia,
     ansiedad,
     desesperacion,
     llanto,
     conducta,
     animo,
     exitacion,
     irritabilidad,
     drogas,
     aprendizaje,
     autoAgresiones,
     otro,
     Descripcion)
    VALUES ();
end;

create procedure SELECT_tutores()
    -- ---------------------------------------------
-- Se consultan tutores
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select iddocente,
           departamento,
           puesto,
           correo,
           telefono,
           extension,
           persona_idPersona
    from tutor;
end;

create procedure INSERT_tutor(_departamento varchar(45),
                              _puesto varchar(45),
                              _correo varchar(45),
                              _telefono int(20),
                              _extension int(4),
                              _persona_idPersona int)
    -- ---------------------------------------------
-- Se inserta un tutor
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    insert into tutor (departamento,
                       puesto,
                       correo,
                       telefono,
                       extension,
                       persona_idPersona)
    VALUES (_departamento,
            _puesto,
            _correo,
            _telefono,
            _extension,
            _persona_idPersona);
end;

create procedure SELECT_carreras()
    -- ---------------------------------------------
-- Se consultan las carreras
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select idcarrera, nombre from carrera;
end;

create procedure INSERT_credito(_idCredito int,
                                _folio int,
                                _status text,
                                _fecha date,
                                _tipo varchar(45),
                                _Alumno_idAlumno int)
begin
    -- ---------------------------------------------
-- Se inserta credito complementario
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
    insert into credito (idCredito,
                         folio,
                         status,
                         fecha,
                         tipo,
                         Alumno_idAlumno)
    values (_idCredito,
            _folio,
            _status,
            _fecha,
            _tipo,
            _Alumno_idAlumno);
end;

create procedure SELECT_grupos()
    -- ---------------------------------------------
-- Se consultan los grupos
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select idGrupo, letra, tutor_iddocente
    from grupo;
end;

create procedure UPDATE_grupo(_idGrupo int, _letra VARCHAR(1), _idTutor int)
    -- ---------------------------------------------
-- Se acuatliza un grupo
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    UPDATE grupo g
    set g.letra           = _letra,
        g.tutor_iddocente =_idTutor
    where g.idGrupo = _idgrupo;
end;

create procedure DELETE_grupo(_idGrupo int)
    -- ---------------------------------------------
-- Se elimina un grupo
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    DELETE from grupo where idGrupo = _idGrupo;
end;

create procedure SELECT_tutorByNC(_NC int)
    -- ---------------------------------------------
-- Se consulta grupo por NC
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    select p.NC, p.nombre, p.apellidos, puesto, correo, telefono, extension
    from tutor t
             inner join persona p on t.persona_idPersona = p.idPersona
    where p.NC like _NC;
end;

create procedure UPDATE_tutor(_idTutor int ,_nombre varchar(45),
                              _apellidos varchar(90),
                              _NC int)
-- ---------------------------------------------
-- Se actualiza por id
-- @Autor: Emmanuel Esquivel Pardo
-- ---------------------------------------------
begin
    UPDATE tutor t inner join persona p on t.persona_idPersona = p.idPersona
    set p.nombre = _nombre,
        p.apellidos = _apellidos
        where p.NC = _NC;
end;