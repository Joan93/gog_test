/*
 * Copyright 2010-2013 Hippo B.V. (http://www.onehippo.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *  http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.onehippo.gogreen.components.common;

import com.onehippo.gogreen.utils.Constants;

import org.hippoecm.hst.core.parameters.DropDownList;
import org.hippoecm.hst.core.parameters.JcrPath;
import org.hippoecm.hst.core.parameters.Parameter;

/**
 * HST Component Parameters Info class for LatestItems. Used PageComposer.
 */
public interface LatestItemsParamsInfo {

    String PARAM_SCOPE = "scope";
    String PARAM_NODE_TYPE = "nodetype";
    String PARAM_LIMIT = "limit";
    String PARAM_ORDER_BY = "orderBy";
    String PARAM_SORT_ORDER = "sortOrder";
    String PARAM_TAGS = "tags";
    String PARAM_CONSTRAINT = "constraint";

    @Parameter(name = PARAM_SCOPE, required = true, displayName = "Scope", defaultValue = "")
    @JcrPath(isRelative = true, pickerInitialPath = "", pickerSelectableNodeTypes = {"hippostd:folder"}, pickerConfiguration = "cms-pickers/folders")
    String getScope();

    @Parameter(name = PARAM_NODE_TYPE, required = true, defaultValue = "", hideInChannelManager = true)
    String getNodetype();

    @Parameter(name = PARAM_LIMIT, required = true, displayName = "Limit", defaultValue = "5")
    int getLimit();

    @Parameter(name = PARAM_ORDER_BY, required = true, displayName = "Order by", defaultValue = "hippogogreen:closingdate")
    String getOrderBy();

    @Parameter(name = PARAM_SORT_ORDER, required = true, defaultValue = "descending")
    @DropDownList(value= {"ascending", "descending"})
    String getSortOrder();

    @Parameter(name = PARAM_TAGS, displayName = "Tags", defaultValue = "")
    String getTags();

    @Parameter(name = PARAM_CONSTRAINT, displayName = "Constraint", defaultValue = "")
    String getConstraint();

}
