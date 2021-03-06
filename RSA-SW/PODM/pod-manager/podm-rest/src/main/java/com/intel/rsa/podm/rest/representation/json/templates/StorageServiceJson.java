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

package com.intel.rsa.podm.rest.representation.json.templates;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.intel.rsa.common.types.EnumStatus;
import com.intel.rsa.common.types.Id;
import com.intel.rsa.podm.rest.odataid.ODataId;
import com.intel.rsa.podm.rest.representation.json.templates.attributes.StatusJson;

import java.util.ArrayList;
import java.util.Collection;

@JsonPropertyOrder({
        "@odata.context", "@odata.id", "@odata.type", "id", "name", "modified",
        "status", "enumStatus", "location", "links"
})
public final class StorageServiceJson extends BaseJson {
    public Id id;
    public String name;
    public final StatusJson status = new StatusJson();
    public EnumStatus enumStatus;
    public LocationJson location;
    public final Object oem = new Object();
    public Links links = new Links();

    public StorageServiceJson() {
        super("#RSAStorageService.1.0.0.RSAStorageService");
    }

    @JsonPropertyOrder({"remoteTargets", "logicalDrives", "drives", "managedBy"})
    public static final class Links extends BaseLinksJson {
        public ODataId remoteTargets;
        public ODataId logicalDrives;
        public ODataId drives;
        public Collection<ODataId> managedBy = new ArrayList<>();
    }
}
