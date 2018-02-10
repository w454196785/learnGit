/*
 * Copyright (c) 2013, 2017 Cisco Systems, Inc. and others.  All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 */
package org.opendaylight.controller.config.api.jmx.constants;

import javax.management.MalformedObjectNameException;
import javax.management.ObjectName;

public final class ConfigRegistryConstants {

    private ConfigRegistryConstants() {
    }

    public static final String TYPE_CONFIG_REGISTRY = "ConfigRegistry";

    public static final String TYPE_CONFIG_REGISTRY_NO_NOTIFICATIONS = "ConfigRegistryNoNotifications";

    public static final String ON_DOMAIN = "org.opendaylight.controller";

    public static final String TYPE_KEY = "type";

    public static final ObjectName OBJECT_NAME = createONWithDomainAndType(TYPE_CONFIG_REGISTRY);

    public static final ObjectName OBJECT_NAME_NO_NOTIFICATIONS = createONWithDomainAndType(
            TYPE_CONFIG_REGISTRY_NO_NOTIFICATIONS);

    public static final String GET_AVAILABLE_MODULE_NAMES_ATTRIBUT_NAME = "AvailableModuleNames";

    public static ObjectName createONWithDomainAndType(final String type) {
        return createON(ON_DOMAIN, TYPE_KEY, type);
    }

    public static ObjectName createON(final String name, final String key, final String value) {
        try {
            return new ObjectName(name, key, value);
        } catch (final MalformedObjectNameException e) {
            throw new IllegalArgumentException(e);
        }

    }
}
