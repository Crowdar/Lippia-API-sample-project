package ar.steps;

import com.crowdar.driver.factory.SingleWebDriverPool;
import org.apache.log4j.Logger;

import java.util.HashMap;

public class PageSteps extends com.crowdar.core.PageSteps {

    private static HashMap<String, Object> contextValues = new HashMap<String, Object>();


    public PageSteps() {
        super();
    }


    public static void dismissAll() {
        SingleWebDriverPool.DEFAULT.dismissAll();
    }

    public <T> void addContextValue(String key, T value) {
        Logger.getRootLogger().info(key + ": " + value);
        contextValues.put(key, value);
    }

    public <T> T getContextValue(String key) {
        return (T) contextValues.get(key);
    }
}
