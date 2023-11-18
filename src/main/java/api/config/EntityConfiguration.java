package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    CLIENT {
        @Override
        public Class<?> getEntityService() {
            return ClienteService.class;
        }
    },

    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProyectoService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



