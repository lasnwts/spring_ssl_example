#I was able to set the keystore file programmatically using the WebServerFactoryCustomizer as follows
 @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> tomcatSslStoreCustomizer() {
        // Supply key store password
        String keyStorePassword;
        // Supply key store file as a stream
        InputStream keyStoreFile;
        KeyStore keyStore;

        try (InputStream is = keyStoreFile) {
            keyStore = KeyStore.getInstance(KEY_STORE_TYPE);
            keyStore.load(is, keyStorePassword.toCharArray());
        }
        catch (Exception e) {
            throw new RuntimeException("Cannot load keystore file; cause: " + e.getMessage(), e);
        }

        return tomcat -> tomcat.setSslStoreProvider(new SslStoreProvider() {
            @Override
            public KeyStore getKeyStore() {
                return keyStore;
            }

            @Override
            public KeyStore getTrustStore() {
                return null;
            }
        });
    }