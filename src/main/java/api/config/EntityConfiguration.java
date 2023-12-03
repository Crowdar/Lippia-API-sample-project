package api.config;

import services.*;

public enum EntityConfiguration {
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    USUARIO {
        @Override
        public Class<?> getEntityService() {
            return UsuarioService.class;
        }
    },
    PROYECTO {
        @Override
        public Class<?> getEntityService() {
            return ProyectoService.class;
        }
    },
    HORA {
        @Override
        public Class<?> getEntityService() {
            return TraerEntradaHorariaService.class;
        }
    },
    NUEVA_ENTRADA {
        @Override
        public Class<?> getEntityService() {
            return NuevaEntradaHorariaService.class;
        }
    };
    public abstract Class<?> getEntityService();
}



