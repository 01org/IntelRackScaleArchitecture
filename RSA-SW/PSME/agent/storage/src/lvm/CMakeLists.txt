# <license_header>
#
# Copyright (c) 2015 Intel Corporation
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
# </license_header>

set(SOURCES
    lvm_api.cpp
    lvm_clone_task.cpp
    lvm_create_data.cpp
)

set_source_files_properties(
    lvm_api.cpp
    # liblvm2app contains old style casting.
    COMPILE_FLAGS "-Wno-old-style-cast")

add_library(lvm-api OBJECT ${SOURCES})
