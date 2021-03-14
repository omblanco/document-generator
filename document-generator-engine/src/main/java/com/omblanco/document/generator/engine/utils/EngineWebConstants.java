package com.omblanco.document.generator.engine.utils;

public class EngineWebConstants {

    public final class Paths {
        private Paths() {
            // Empty
        }
        
        public static final String SYSTEM = "/api/engine/system";
        
        public final class AppInfo {
            private AppInfo() {
                // Empty
            }
            
            public static final String GET = "/status";
        }
    }
}
