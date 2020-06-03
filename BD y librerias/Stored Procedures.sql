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
