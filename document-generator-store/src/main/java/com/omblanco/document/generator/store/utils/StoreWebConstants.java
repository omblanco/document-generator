package com.omblanco.document.generator.store.utils;

public class StoreWebConstants {

    public final class Paths {
        private Paths() {
            // Empty
        }
        
        public final class System {
            private System() {
                // Empty
            }
            
            public static final String SYSTEM = "/system";
            
            public final class AppInfo {
                private AppInfo() {
                    // Empty
                }
                
                public static final String GET = "/status";
            }
        }
    }
}
