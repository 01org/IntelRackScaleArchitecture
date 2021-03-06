/*!
 * @section LICENSE
 *
 * @copyright
 * Copyright (c) 2015 Intel Corporation
 *
 * @copyright
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * @copyright
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * @copyright
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @section DESCRIPTION
 *
 * @file max.hpp
 *
 * @brief Max validator interface
 * */

#ifndef CONFIGURATION_MAX_VALIDATOR_HPP
#define CONFIGURATION_MAX_VALIDATOR_HPP

#include "validator.hpp"

namespace json { class Value; }

namespace configuration {

/*! Json max validator class */
class MaxValidator final : public Validator<json::Value> {
public:
    /*!
     * @brief Construct MaxValidator for given value
     * @param value maximum accepted value
     */
    explicit MaxValidator(const int value) : m_max_value{value} {}
    ~MaxValidator() = default;

    /*!
     * @brief Validate value for given JSON object
     * @param value JSON object
     * @return On success true is returned, otherwise false
     */
    bool is_valid(const json::Value& value) override final;

    /*!
     * @brief Get max error message
     * @return error message
     */
    std::string get_error() const override final;

private:
    /*! maximum valid value */
    int m_max_value;
};

}

#endif /* CONFIGURATION_MAX_VALIDATOR_HPP */
