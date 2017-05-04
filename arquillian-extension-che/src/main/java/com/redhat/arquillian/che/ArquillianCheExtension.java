package com.redhat.arquillian.che;

import org.jboss.arquillian.core.spi.LoadableExtension;
import org.jboss.arquillian.test.spi.enricher.resource.ResourceProvider;

public class ArquillianCheExtension implements LoadableExtension {

    @Override
    public void register(ExtensionBuilder extensionBuilder) {
        extensionBuilder.observer(CheLifecycleManager.class);
        extensionBuilder.service(ResourceProvider.class, CheWorkspaceProducer.class);
    }
}
