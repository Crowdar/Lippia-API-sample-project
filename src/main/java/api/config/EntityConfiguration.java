package api.config;

import services.UserService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }
    };

    public abstract Class<?> getEntityService();
}



