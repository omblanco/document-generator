package com.omblanco.document.generator.exporter.utils;

public class ExporterWebConstants {

    public final class Paths {
        private Paths() {
            // Empty
        }
        
        public static final String SYSTEM = "/api/exporter/system";
        
        public final class AppInfo {
            private AppInfo() {
                // Empty
            }
            
            public static final String GET = "/status";
        }
    }
}
