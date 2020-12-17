/*
 * Copyright 2020 OPPO ESA Stack Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package esa.restlight.jaxrs.spi;

import esa.restlight.core.DeployContext;
import esa.restlight.core.config.RestlightOptions;
import esa.restlight.core.config.RestlightOptionsConfigure;
import esa.restlight.core.resolver.ArgumentResolverFactory;
import esa.restlight.jaxrs.resolver.arg.RequestBodyArgumentResolver;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class RequestBodyArgumentResolverProviderTest {

    @Test
    void testFactoryBean() {
        final RequestBodyArgumentResolverProvider provider = new RequestBodyArgumentResolverProvider();
        final DeployContext<RestlightOptions> ctx = mock(DeployContext.class);
        when(ctx.options()).thenReturn(RestlightOptionsConfigure.defaultOpts());
        final Optional<ArgumentResolverFactory> ret = provider.factoryBean(ctx);
        assertTrue(ret.isPresent());
        assertEquals(RequestBodyArgumentResolver.class, ret.get().getClass());
    }

}
