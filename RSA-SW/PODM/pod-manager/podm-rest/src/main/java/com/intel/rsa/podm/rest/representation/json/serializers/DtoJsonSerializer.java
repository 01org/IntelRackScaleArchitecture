/*
 * Copyright (c) 2015 Intel Corporation
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

package com.intel.rsa.podm.rest.representation.json.serializers;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.intel.rsa.common.types.locations.Location;
import com.intel.rsa.podm.rest.representation.json.templates.BaseJson;
import com.intel.rsa.podm.rest.representation.json.templates.LocationJson;

import java.io.IOException;

public abstract class DtoJsonSerializer<T> extends JsonSerializer<T> implements ContextAwareSerializer {
    protected DtoSerializerContext context;
    private final Class<T> dtoType;

    protected DtoJsonSerializer(Class<T> dtoType) {
        this.dtoType = dtoType;
    }

    protected static LocationJson toJson(Location location) {
        return location != null
                ? new LocationJson(location.toMap())
                : null;
    }

    @Override
    public final void serialize(T value, JsonGenerator gen, SerializerProvider serializers) throws IOException, JsonProcessingException {
        // TODO handle exception and return error
        gen.writeObject(translate(value));
    }

    protected abstract BaseJson translate(T dto);

    @Override
    public void setContext(DtoSerializerContext context) {
        this.context = context;
    }

    @Override
    public final Class<T> handledType() {
        return dtoType;
    }
}
