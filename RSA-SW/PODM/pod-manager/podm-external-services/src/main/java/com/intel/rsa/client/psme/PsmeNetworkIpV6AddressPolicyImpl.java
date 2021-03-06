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

package com.intel.rsa.client.psme;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.intel.rsa.client.api.reader.psme.PsmeNetworkIpV6AddressPolicy;

public class PsmeNetworkIpV6AddressPolicyImpl implements PsmeNetworkIpV6AddressPolicy {

    @JsonProperty("Prefix")
    private String prefix;
    @JsonProperty("Precedence")
    private Integer precedence;
    @JsonProperty("Label")
    private Integer label;

    @Override
    public String getPrefix() {
        return prefix;
    }

    @Override
    public Integer getPrecedence() {
        return precedence;
    }

    @Override
    public Integer getLabel() {
        return label;
    }
}
