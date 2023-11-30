package services;

import com.crowdar.api.rest.MethodsService;


public class BaseService extends MethodsService{
    public static ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACE_ID = new ThreadLocal<>();
    public static ThreadLocal<String> ID = new ThreadLocal<>();
    public static ThreadLocal<String> PROYECTO_ID = new ThreadLocal<>();
    public static ThreadLocal<String> ENTRADA_HORARIA = new ThreadLocal<>();
    public static ThreadLocal<String> DESCRIPCION_EDITADA = new ThreadLocal<>();

}
