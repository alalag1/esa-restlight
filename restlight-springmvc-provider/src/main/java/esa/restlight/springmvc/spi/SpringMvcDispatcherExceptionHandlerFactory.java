/*
 * Copyright 2021 OPPO ESA Stack Project
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
package esa.restlight.springmvc.spi;

import esa.commons.annotation.Internal;
import esa.commons.spi.Feature;
import esa.restlight.core.util.Constants;
import esa.restlight.server.ServerDeployContext;
import esa.restlight.server.bootstrap.DispatcherExceptionHandler;
import esa.restlight.server.config.ServerOptions;
import esa.restlight.server.spi.DispatcherExceptionHandlerFactory;
import esa.restlight.springmvc.bootstrap.SpringMvcDispatcherExceptionHandler;

import java.util.Optional;

@Feature(tags = Constants.INTERNAL)
@Internal
public class SpringMvcDispatcherExceptionHandlerFactory implements DispatcherExceptionHandlerFactory {

    @Override
    public Optional<DispatcherExceptionHandler> exceptionHandler(ServerDeployContext<? extends ServerOptions> ctx) {
        return Optional.of(new SpringMvcDispatcherExceptionHandler());
    }

}

