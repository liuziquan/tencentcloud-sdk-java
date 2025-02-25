/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.cii.v20210408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeStructureTaskResultTestRequest extends AbstractModel{

    /**
    * 结构化任务ID
    */
    @SerializedName("MainTaskId")
    @Expose
    private String MainTaskId;

    /**
     * Get 结构化任务ID 
     * @return MainTaskId 结构化任务ID
     */
    public String getMainTaskId() {
        return this.MainTaskId;
    }

    /**
     * Set 结构化任务ID
     * @param MainTaskId 结构化任务ID
     */
    public void setMainTaskId(String MainTaskId) {
        this.MainTaskId = MainTaskId;
    }

    public DescribeStructureTaskResultTestRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeStructureTaskResultTestRequest(DescribeStructureTaskResultTestRequest source) {
        if (source.MainTaskId != null) {
            this.MainTaskId = new String(source.MainTaskId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "MainTaskId", this.MainTaskId);

    }
}

