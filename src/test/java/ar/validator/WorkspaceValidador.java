package ar.validator;

import api.model.workspaces.WorkspaceResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class WorkspaceValidador {
    public static void validador() {
        WorkspaceResponse[] response = (WorkspaceResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertNotNull(response[0].getId(), "El campo ID es nulo");
    }
}
