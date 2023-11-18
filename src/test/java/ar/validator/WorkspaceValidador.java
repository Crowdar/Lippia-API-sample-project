package ar.validator;

import api.model.workspaces.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class WorkspaceValidador {
        public static void validate(){
            WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();
            Assert.assertNotNull(response[0].getId(),"El campo ID es nulo");
        }
}
