package services;

import com.crowdar.api.rest.MethodsService;


public class BaseService extends MethodsService{
    public static ThreadLocal<String> API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACE_ID_0 = new ThreadLocal<>();
    public static ThreadLocal<String> Usuario_ID = new ThreadLocal<>();
    public static ThreadLocal<String> PROYECTO_ID = new ThreadLocal<>();
    public static ThreadLocal<String> DESCRIPCION = new ThreadLocal<>();
    public static ThreadLocal<String> INICIO = new ThreadLocal<>();
    public static ThreadLocal<String> FIN = new ThreadLocal<>();
    public static ThreadLocal<String> ENTRADA_HORARIA_ID = new ThreadLocal<>();

}
