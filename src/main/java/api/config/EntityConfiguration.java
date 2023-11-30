package api.config;

import services.*;

public enum EntityConfiguration {
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    HORA {
        @Override
        public Class<?> getEntityService() {
            return ConsultarEntradasService.class;
        }
    },
    NUEVA_ENTRADA{
        @Override
        public Class<?> getEntityService() {
            return NuevaEntradaService.class;
        }
    },
    EDITAR{
        @Override
        public Class<?> getEntityService() {
            return EntradaEditadaSevice.class;
        }
    },
    ELIMINAR {
        @Override
        public Class<?> getEntityService() {
            return EliminarService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



