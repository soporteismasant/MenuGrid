package com.example.menugrid.BaseDeDatos;

public class incidencia {
    public static final String TABLA_CICLO="ciclo";
    public static final String CAMPO_ID_CICLO="idCiclo";
    public static final String CAMPO_NOMBRE_CICLO="nombre_ciclo";
    public static final String CREAR_TABLA_CICLO= "CREATE TABLE " +
            ""+TABLA_CICLO+"("+CAMPO_ID_CICLO+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_NOMBRE_CICLO+" TEXT)";

    public static final String TABLA_GRUPO="grupo";
    public static final String CAMPO_ID_GRUPO="idGrupo";
    public static final String CAMPO_NOMBRE_GRUPO="nombre_grupo";
    public static final String CREAR_TABLA_GRUPO= "CREATE TABLE " +
            ""+TABLA_GRUPO+"("+CAMPO_ID_GRUPO+" INTEGER PRIMARY KEY AUTOINCREMENT, "+CAMPO_NOMBRE_GRUPO+" TEXT)";


    public static final String TABLA_INCIDENCIA="incidencia";
    public static final String CAMPO_ID_INCIDENCIA="idIncidencia";
    public static final String CAMPO_DESCRIPCION_INCIDENCIA="descripcion";
    public static final String CAMPO_FECHAHORA_INCIDENCIA="fechahora";
    public static final String CAMPO_IDCICLO_INCIDENCIA="idCiclo";
    public static final String CAMPO_IDGRUPO_INCIDENCIA="idGrupo";
    public static final String CAMPO_NOMBRE_ALUMNO_INCIDENCIA="nombreAlumnoIncidencia";
    public static final String CREAR_TABLA_INCIDENCIA= "CREATE TABLE " +
            ""+TABLA_INCIDENCIA+"("+
            CAMPO_ID_INCIDENCIA+"INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPO_DESCRIPCION_INCIDENCIA+"TEXT"+
            CAMPO_FECHAHORA_INCIDENCIA+"TEXT"+
            CAMPO_IDCICLO_INCIDENCIA+"INTEGER"+
            CAMPO_IDGRUPO_INCIDENCIA+"INTEGER"+
            CAMPO_NOMBRE_ALUMNO_INCIDENCIA+"TEXT)";
}
