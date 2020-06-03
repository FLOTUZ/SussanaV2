-- Tabla Alumno
call SELECT_alumnoByNC(?);
call SELECT_alumnos();
call INSERT_alumno(?,?,?,?);
call UPDATE_alumno(?,?,?,?,?);
call DELETE_alumno(?);

-- Tabla persona
call SELECT_personas();
call SELECT_personasByNC();
call INSERT_PERSONA(?,?,?);
call UPDATE_persona(?,?,?,?);
call DELETE_persona(?);

-- Tabla docente
call SELECT_docente();
call SELECT_docenteByNC();
call INSERT_docente();
call DELETE_docente();


call INSERT_carrera(?);
call INSERT_grupo(?);


