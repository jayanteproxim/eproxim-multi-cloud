package com.eproxim.multicloud;

import com.eproxim.multicloud.MultiCloudManagerApp;
import com.eproxim.multicloud.config.AsyncSyncConfiguration;
import com.eproxim.multicloud.config.EmbeddedElasticsearch;
import com.eproxim.multicloud.config.EmbeddedKafka;
import com.eproxim.multicloud.config.EmbeddedSQL;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { MultiCloudManagerApp.class, AsyncSyncConfiguration.class })
@EmbeddedElasticsearch
@EmbeddedKafka
@EmbeddedSQL
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
public @interface IntegrationTest {
}
