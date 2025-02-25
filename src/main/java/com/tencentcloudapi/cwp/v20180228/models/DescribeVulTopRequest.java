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
package com.tencentcloudapi.cwp.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeVulTopRequest extends AbstractModel{

    /**
    * 漏洞风险服务器top，1-100
    */
    @SerializedName("Top")
    @Expose
    private Long Top;

    /**
    * 1: web应用漏洞 2=系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁，传0的时候表示查应急漏洞
    */
    @SerializedName("VulCategory")
    @Expose
    private Long VulCategory;

    /**
     * Get 漏洞风险服务器top，1-100 
     * @return Top 漏洞风险服务器top，1-100
     */
    public Long getTop() {
        return this.Top;
    }

    /**
     * Set 漏洞风险服务器top，1-100
     * @param Top 漏洞风险服务器top，1-100
     */
    public void setTop(Long Top) {
        this.Top = Top;
    }

    /**
     * Get 1: web应用漏洞 2=系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁，传0的时候表示查应急漏洞 
     * @return VulCategory 1: web应用漏洞 2=系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁，传0的时候表示查应急漏洞
     */
    public Long getVulCategory() {
        return this.VulCategory;
    }

    /**
     * Set 1: web应用漏洞 2=系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁，传0的时候表示查应急漏洞
     * @param VulCategory 1: web应用漏洞 2=系统组件漏洞3:安全基线 4: Linux系统漏洞 5: windows补丁，传0的时候表示查应急漏洞
     */
    public void setVulCategory(Long VulCategory) {
        this.VulCategory = VulCategory;
    }

    public DescribeVulTopRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeVulTopRequest(DescribeVulTopRequest source) {
        if (source.Top != null) {
            this.Top = new Long(source.Top);
        }
        if (source.VulCategory != null) {
            this.VulCategory = new Long(source.VulCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Top", this.Top);
        this.setParamSimple(map, prefix + "VulCategory", this.VulCategory);

    }
}

