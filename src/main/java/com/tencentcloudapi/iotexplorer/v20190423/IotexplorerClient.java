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
package com.tencentcloudapi.iotexplorer.v20190423;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.iotexplorer.v20190423.models.*;

public class IotexplorerClient extends AbstractClient{
    private static String endpoint = "iotexplorer.tencentcloudapi.com";
    private static String service = "iotexplorer";
    private static String version = "2019-04-23";

    public IotexplorerClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public IotexplorerClient(Credential credential, String region, ClientProfile profile) {
        super(IotexplorerClient.endpoint, IotexplorerClient.version, credential, region, profile);
    }

    /**
     *提供给用户异步调用设备行为的能力
     * @param req CallDeviceActionAsyncRequest
     * @return CallDeviceActionAsyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionAsyncResponse CallDeviceActionAsync(CallDeviceActionAsyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionAsyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionAsyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CallDeviceActionAsync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供同步调用设备行为的能力。
     * @param req CallDeviceActionSyncRequest
     * @return CallDeviceActionSyncResponse
     * @throws TencentCloudSDKException
     */
    public CallDeviceActionSyncResponse CallDeviceActionSync(CallDeviceActionSyncRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CallDeviceActionSyncResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CallDeviceActionSyncResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CallDeviceActionSync");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据设备产品ID、设备名称，设置控制设备的属性数据。
     * @param req ControlDeviceDataRequest
     * @return ControlDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public ControlDeviceDataResponse ControlDeviceData(ControlDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ControlDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ControlDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ControlDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建设备
     * @param req CreateDeviceRequest
     * @return CreateDeviceResponse
     * @throws TencentCloudSDKException
     */
    public CreateDeviceResponse CreateDevice(CreateDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建 LoRa 自定义频点
     * @param req CreateLoRaFrequencyRequest
     * @return CreateLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoRaFrequencyResponse CreateLoRaFrequency(CreateLoRaFrequencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoRaFrequencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoRaFrequencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLoRaFrequency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建新 LoRa 网关设备接口
     * @param req CreateLoRaGatewayRequest
     * @return CreateLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateLoRaGatewayResponse CreateLoRaGateway(CreateLoRaGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLoRaGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateLoRaGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateLoRaGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供新建项目的能力，用于集中管理产品和应用。
     * @param req CreateProjectRequest
     * @return CreateProjectResponse
     * @throws TencentCloudSDKException
     */
    public CreateProjectResponse CreateProject(CreateProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *为用户提供新建产品的能力，用于管理用户的设备
     * @param req CreateStudioProductRequest
     * @return CreateStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public CreateStudioProductResponse CreateStudioProduct(CreateStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *创建规则
     * @param req CreateTopicRuleRequest
     * @return CreateTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateTopicRuleResponse CreateTopicRule(CreateTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<CreateTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "CreateTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除设备
     * @param req DeleteDeviceRequest
     * @return DeleteDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDeviceResponse DeleteDevice(DeleteDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量删除设备
     * @param req DeleteDevicesRequest
     * @return DeleteDevicesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDevicesResponse DeleteDevices(DeleteDevicesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDevicesResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteDevicesResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteDevices");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供删除LoRa自定义频点的能力
     * @param req DeleteLoRaFrequencyRequest
     * @return DeleteLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoRaFrequencyResponse DeleteLoRaFrequency(DeleteLoRaFrequencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoRaFrequencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoRaFrequencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLoRaFrequency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除  LoRa 网关的接口
     * @param req DeleteLoRaGatewayRequest
     * @return DeleteLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLoRaGatewayResponse DeleteLoRaGateway(DeleteLoRaGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLoRaGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteLoRaGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteLoRaGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供删除某个项目的能力
     * @param req DeleteProjectRequest
     * @return DeleteProjectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteProjectResponse DeleteProject(DeleteProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供删除某个项目下产品的能力
     * @param req DeleteStudioProductRequest
     * @return DeleteStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DeleteStudioProductResponse DeleteStudioProduct(DeleteStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *删除规则
     * @param req DeleteTopicRuleRequest
     * @return DeleteTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTopicRuleResponse DeleteTopicRule(DeleteTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DeleteTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DeleteTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查看某个设备的详细信息
     * @param req DescribeDeviceRequest
     * @return DescribeDeviceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceResponse DescribeDevice(DescribeDeviceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDevice");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *根据设备产品ID、设备名称，获取设备上报的属性数据。
     * @param req DescribeDeviceDataRequest
     * @return DescribeDeviceDataResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataResponse DescribeDeviceData(DescribeDeviceDataRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceData");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备在指定时间范围内上报的历史数据。
     * @param req DescribeDeviceDataHistoryRequest
     * @return DescribeDeviceDataHistoryResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDeviceDataHistoryResponse DescribeDeviceDataHistory(DescribeDeviceDataHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDeviceDataHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeDeviceDataHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeDeviceDataHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询固件升级任务列表
     * @param req DescribeFirmwareTaskRequest
     * @return DescribeFirmwareTaskResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFirmwareTaskResponse DescribeFirmwareTask(DescribeFirmwareTaskRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFirmwareTaskResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeFirmwareTaskResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeFirmwareTask");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询LoRa自定义频点详情的能力
     * @param req DescribeLoRaFrequencyRequest
     * @return DescribeLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLoRaFrequencyResponse DescribeLoRaFrequency(DescribeLoRaFrequencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLoRaFrequencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeLoRaFrequencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeLoRaFrequency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询产品配置的数据模板信息
     * @param req DescribeModelDefinitionRequest
     * @return DescribeModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public DescribeModelDefinitionResponse DescribeModelDefinition(DescribeModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeModelDefinitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeModelDefinitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeModelDefinition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *查询项目详情
     * @param req DescribeProjectRequest
     * @return DescribeProjectResponse
     * @throws TencentCloudSDKException
     */
    public DescribeProjectResponse DescribeProject(DescribeProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查看产品详细信息的能力，包括产品的ID、数据协议、认证类型等重要参数
     * @param req DescribeStudioProductRequest
     * @return DescribeStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public DescribeStudioProductResponse DescribeStudioProduct(DescribeStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取规则信息
     * @param req DescribeTopicRuleRequest
     * @return DescribeTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTopicRuleResponse DescribeTopicRule(DescribeTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DescribeTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DescribeTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *直接绑定设备和家庭
     * @param req DirectBindDeviceInFamilyRequest
     * @return DirectBindDeviceInFamilyResponse
     * @throws TencentCloudSDKException
     */
    public DirectBindDeviceInFamilyResponse DirectBindDeviceInFamily(DirectBindDeviceInFamilyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DirectBindDeviceInFamilyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DirectBindDeviceInFamilyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DirectBindDeviceInFamily");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *禁用规则
     * @param req DisableTopicRuleRequest
     * @return DisableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public DisableTopicRuleResponse DisableTopicRule(DisableTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<DisableTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "DisableTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *启用规则
     * @param req EnableTopicRuleRequest
     * @return EnableTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public EnableTopicRuleResponse EnableTopicRule(EnableTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<EnableTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "EnableTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（GetCOSURL）用于获取固件存储在COS的URL 
     * @param req GetCOSURLRequest
     * @return GetCOSURLResponse
     * @throws TencentCloudSDKException
     */
    public GetCOSURLResponse GetCOSURL(GetCOSURLRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCOSURLResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetCOSURLResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetCOSURL");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *用于查询某个产品下的设备列表
     * @param req GetDeviceListRequest
     * @return GetDeviceListResponse
     * @throws TencentCloudSDKException
     */
    public GetDeviceListResponse GetDeviceList(GetDeviceListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetDeviceListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetDeviceListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetDeviceList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取 LoRa 网关列表接口
     * @param req GetLoRaGatewayListRequest
     * @return GetLoRaGatewayListResponse
     * @throws TencentCloudSDKException
     */
    public GetLoRaGatewayListResponse GetLoRaGatewayList(GetLoRaGatewayListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetLoRaGatewayListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetLoRaGatewayListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetLoRaGatewayList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询用户所创建的项目列表查询功能。
     * @param req GetProjectListRequest
     * @return GetProjectListResponse
     * @throws TencentCloudSDKException
     */
    public GetProjectListResponse GetProjectList(GetProjectListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetProjectListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetProjectListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetProjectList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供查询某个项目下所有产品信息的能力。
     * @param req GetStudioProductListRequest
     * @return GetStudioProductListResponse
     * @throws TencentCloudSDKException
     */
    public GetStudioProductListResponse GetStudioProductList(GetStudioProductListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetStudioProductListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetStudioProductListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetStudioProductList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取规则列表
     * @param req GetTopicRuleListRequest
     * @return GetTopicRuleListResponse
     * @throws TencentCloudSDKException
     */
    public GetTopicRuleListResponse GetTopicRuleList(GetTopicRuleListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetTopicRuleListResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<GetTopicRuleListResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "GetTopicRuleList");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *获取设备的历史事件
     * @param req ListEventHistoryRequest
     * @return ListEventHistoryResponse
     * @throws TencentCloudSDKException
     */
    public ListEventHistoryResponse ListEventHistory(ListEventHistoryRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListEventHistoryResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListEventHistoryResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListEventHistory");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（ListFirmwares）用于获取固件列表 
     * @param req ListFirmwaresRequest
     * @return ListFirmwaresResponse
     * @throws TencentCloudSDKException
     */
    public ListFirmwaresResponse ListFirmwares(ListFirmwaresRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ListFirmwaresResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ListFirmwaresResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ListFirmwares");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改LoRa自定义频点
     * @param req ModifyLoRaFrequencyRequest
     * @return ModifyLoRaFrequencyResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoRaFrequencyResponse ModifyLoRaFrequency(ModifyLoRaFrequencyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoRaFrequencyResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoRaFrequencyResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoRaFrequency");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改 LoRa 网关信息
     * @param req ModifyLoRaGatewayRequest
     * @return ModifyLoRaGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLoRaGatewayResponse ModifyLoRaGateway(ModifyLoRaGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLoRaGatewayResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyLoRaGatewayResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyLoRaGateway");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品的数据模板的能力
     * @param req ModifyModelDefinitionRequest
     * @return ModifyModelDefinitionResponse
     * @throws TencentCloudSDKException
     */
    public ModifyModelDefinitionResponse ModifyModelDefinition(ModifyModelDefinitionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyModelDefinitionResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyModelDefinitionResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyModelDefinition");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改项目
     * @param req ModifyProjectRequest
     * @return ModifyProjectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyProjectResponse ModifyProject(ModifyProjectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyProjectResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyProjectResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyProject");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供修改产品的名称和描述等信息的能力，对于已发布产品不允许进行修改。
     * @param req ModifyStudioProductRequest
     * @return ModifyStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ModifyStudioProductResponse ModifyStudioProduct(ModifyStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *修改规则
     * @param req ModifyTopicRuleRequest
     * @return ModifyTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyTopicRuleResponse ModifyTopicRule(ModifyTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ModifyTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ModifyTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（PublishMessage）用于使用自定义透传协议进行设备远控
     * @param req PublishMessageRequest
     * @return PublishMessageResponse
     * @throws TencentCloudSDKException
     */
    public PublishMessageResponse PublishMessage(PublishMessageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<PublishMessageResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<PublishMessageResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "PublishMessage");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *产品开发完成并测试通过后，通过发布产品将产品设置为发布状态
     * @param req ReleaseStudioProductRequest
     * @return ReleaseStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseStudioProductResponse ReleaseStudioProduct(ReleaseStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<ReleaseStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "ReleaseStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *提供根据产品名称查找产品的能力
     * @param req SearchStudioProductRequest
     * @return SearchStudioProductResponse
     * @throws TencentCloudSDKException
     */
    public SearchStudioProductResponse SearchStudioProduct(SearchStudioProductRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchStudioProductResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchStudioProductResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchStudioProduct");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *搜索规则
     * @param req SearchTopicRuleRequest
     * @return SearchTopicRuleResponse
     * @throws TencentCloudSDKException
     */
    public SearchTopicRuleResponse SearchTopicRule(SearchTopicRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SearchTopicRuleResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<SearchTopicRuleResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "SearchTopicRule");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *批量禁用启用设备
     * @param req UpdateDevicesEnableStateRequest
     * @return UpdateDevicesEnableStateResponse
     * @throws TencentCloudSDKException
     */
    public UpdateDevicesEnableStateResponse UpdateDevicesEnableState(UpdateDevicesEnableStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateDevicesEnableStateResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateDevicesEnableStateResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateDevicesEnableState");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UpdateFirmware）用于对指定设备发起固件升级请求 
     * @param req UpdateFirmwareRequest
     * @return UpdateFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UpdateFirmwareResponse UpdateFirmware(UpdateFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UpdateFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UpdateFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UpdateFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

    /**
     *本接口（UploadFirmware）用于上传设备固件至平台
     * @param req UploadFirmwareRequest
     * @return UploadFirmwareResponse
     * @throws TencentCloudSDKException
     */
    public UploadFirmwareResponse UploadFirmware(UploadFirmwareRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UploadFirmwareResponse> rsp = null;
        String rspStr = "";
        try {
                Type type = new TypeToken<JsonResponseModel<UploadFirmwareResponse>>() {
                }.getType();
                rspStr = this.internalRequest(req, "UploadFirmware");
                rsp  = gson.fromJson(rspStr, type);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
        return rsp.response;
    }

}
