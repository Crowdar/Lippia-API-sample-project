package api.config;

import services.ResponseHeadersService;
import services.UserService;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
