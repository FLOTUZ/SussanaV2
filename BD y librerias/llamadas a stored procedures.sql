-- Tabla Alumno
call SELECT_alumnoByNC(?);
call SELECT_alumnos();
call INSERT_alumno(?,?,?,?,?,?);
call UPDATE_alumno(?,?,?,?,?);
call DELETE_alumno(?);
-- Tabla persona
call SELECT_personas();
call SELECT_personasByNC();
call INSERT_persona(?,?,?);
call UPDATE_persona(?,?,?,?);
call DELETE_persona(?);

-- Tabla docente
call SELECT_docente();
call SELECT_docenteByNC();
call INSERT_docente();
call DELETE_docente();

-- Tabla tutor
call SELECT_tutores();
call SELECT_tutorByNC();
call INSERT_tutor();
call UPDATE_tutor();
call DELETE_tutor();

-- Tabla Grupo
call SELECT_grupos();
call SELECT_grupoById();
call INSERT_grupo(?, ?);
call UPDATE_grupo();
call DELETE_grupo();

-- Tabala credito
call SELECT_creditos();
call SELECT_creditoByFolio();
call INSERT_credito();
call DELETE_credito();
call UPDATE_credito();

-- Tabla carrera
call SELECT_carreras();
call SELECT_creditoById();
call INSERT_carrera();
call DELETE_credito();
call UPDATE_credito();

-- Tabla Baja Ausentismo
call SELECT_bajasAusentismo();
call SELECT_bajaAusentismoById();
call INSERT_bajaAusentismo();
call DELETE_bajaAusentismo();
call UPDATE_bajaAusentismo();

-- Tabla canalización
call SELECT_canalizaciones();
call SELECT_canalizacionByNC();
call INSERT_canalizacion();
call DELETE_canalizacion();
call UPDATE_canalizacion();