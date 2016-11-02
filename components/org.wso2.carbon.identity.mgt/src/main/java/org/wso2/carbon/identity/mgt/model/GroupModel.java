/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.identity.mgt.model;

import org.wso2.carbon.identity.mgt.claim.Claim;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Model for the group
 */
public class GroupModel {

    private List<Claim> groupClaims = new ArrayList<>();

    public List<Claim> getGroupClaims() {
        if (groupClaims == null || groupClaims.isEmpty()) {
            return Collections.emptyList();
        }
        return groupClaims;
    }

    public void setGroupClaims(List<Claim> groupClaims) {
        this.groupClaims = groupClaims;
    }

}
