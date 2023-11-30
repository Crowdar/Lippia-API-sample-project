package services;

import com.crowdar.api.rest.MethodsService;


public class BaseService extends MethodsService{
    public static ThreadLocal<String> X_API_KEY = new ThreadLocal<>();
    public static ThreadLocal<String> WORKSPACE_ID_0 = new ThreadLocal<>();
    public static ThreadLocal<String> NAME_PROYECTO = new ThreadLocal<>();

    public static ThreadLocal<String> NAME_CLIENT = new ThreadLocal<>();
}
