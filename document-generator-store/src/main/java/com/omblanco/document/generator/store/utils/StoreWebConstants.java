package com.omblanco.document.generator.store.utils;

public class StoreWebConstants {

    public final class Paths {
        private Paths() {
            // Empty
        }
        
        public static final String SYSTEM = "/api/store/system";
        
        public final class AppInfo {
            private AppInfo() {
                // Empty
            }
            
            public static final String GET = "/status";
        }
    }
}
