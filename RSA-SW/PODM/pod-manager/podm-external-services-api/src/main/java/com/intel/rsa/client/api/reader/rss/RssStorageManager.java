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

package com.intel.rsa.client.api.reader.rss;

import com.intel.rsa.client.api.reader.ResourceSupplier;
import com.intel.rsa.client.api.reader.RsaApiReaderException;
import com.intel.rsa.client.api.reader.RsaNetworkInterface;
import com.intel.rsa.client.api.reader.RsaNetworkService;
import com.intel.rsa.client.api.reader.psme.PsmeConsole;
import com.intel.rsa.common.types.Health;
import com.intel.rsa.common.types.ManagerType;
import com.intel.rsa.common.types.State;

public interface RssStorageManager extends RssResource {
    ManagerType getType();
    State getState();
    Health getHealth();
    Health getHealthRollup();
    PsmeConsole getGraphicalConsole();
    PsmeConsole getSerialConsole();
    PsmeConsole getCommandShell();
    String getFirmwareVersion();
    ResourceSupplier<RsaNetworkService> getNetworkService();
    Iterable<ResourceSupplier<RsaNetworkInterface>> getNetworkInterfaces() throws RsaApiReaderException;
}
