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
package com.tencentcloudapi.ccc.v20200210.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PSTNSession extends AbstractModel{

    /**
    * 会话 ID
    */
    @SerializedName("SessionID")
    @Expose
    private String SessionID;

    /**
    * 会话临时房间 ID
    */
    @SerializedName("RoomID")
    @Expose
    private String RoomID;

    /**
    * 主叫
    */
    @SerializedName("Caller")
    @Expose
    private String Caller;

    /**
    * 被叫
    */
    @SerializedName("Callee")
    @Expose
    private String Callee;

    /**
    * 开始时间，Unix 时间戳
    */
    @SerializedName("StartTimestamp")
    @Expose
    private Long StartTimestamp;

    /**
    * 振铃时间，Unix 时间戳
    */
    @SerializedName("RingTimestamp")
    @Expose
    private Long RingTimestamp;

    /**
    * 接听时间，Unix 时间戳
    */
    @SerializedName("AcceptTimestamp")
    @Expose
    private Long AcceptTimestamp;

    /**
    * 坐席邮箱
    */
    @SerializedName("StaffEmail")
    @Expose
    private String StaffEmail;

    /**
    * 坐席工号
    */
    @SerializedName("StaffNumber")
    @Expose
    private String StaffNumber;

    /**
    * 会话状态
ringing 振铃中
seatJoining  等待坐席接听
inProgress 进行中
finished 已完成
    */
    @SerializedName("SessionStatus")
    @Expose
    private String SessionStatus;

    /**
    * 会话呼叫方向， 0 呼入 | 1 - 呼出
    */
    @SerializedName("Direction")
    @Expose
    private Long Direction;

    /**
    * 转外线使用的号码（转外线主叫）
    */
    @SerializedName("OutBoundCaller")
    @Expose
    private String OutBoundCaller;

    /**
    * 转外线被叫
    */
    @SerializedName("OutBoundCallee")
    @Expose
    private String OutBoundCallee;

    /**
     * Get 会话 ID 
     * @return SessionID 会话 ID
     */
    public String getSessionID() {
        return this.SessionID;
    }

    /**
     * Set 会话 ID
     * @param SessionID 会话 ID
     */
    public void setSessionID(String SessionID) {
        this.SessionID = SessionID;
    }

    /**
     * Get 会话临时房间 ID 
     * @return RoomID 会话临时房间 ID
     */
    public String getRoomID() {
        return this.RoomID;
    }

    /**
     * Set 会话临时房间 ID
     * @param RoomID 会话临时房间 ID
     */
    public void setRoomID(String RoomID) {
        this.RoomID = RoomID;
    }

    /**
     * Get 主叫 
     * @return Caller 主叫
     */
    public String getCaller() {
        return this.Caller;
    }

    /**
     * Set 主叫
     * @param Caller 主叫
     */
    public void setCaller(String Caller) {
        this.Caller = Caller;
    }

    /**
     * Get 被叫 
     * @return Callee 被叫
     */
    public String getCallee() {
        return this.Callee;
    }

    /**
     * Set 被叫
     * @param Callee 被叫
     */
    public void setCallee(String Callee) {
        this.Callee = Callee;
    }

    /**
     * Get 开始时间，Unix 时间戳 
     * @return StartTimestamp 开始时间，Unix 时间戳
     */
    public Long getStartTimestamp() {
        return this.StartTimestamp;
    }

    /**
     * Set 开始时间，Unix 时间戳
     * @param StartTimestamp 开始时间，Unix 时间戳
     */
    public void setStartTimestamp(Long StartTimestamp) {
        this.StartTimestamp = StartTimestamp;
    }

    /**
     * Get 振铃时间，Unix 时间戳 
     * @return RingTimestamp 振铃时间，Unix 时间戳
     */
    public Long getRingTimestamp() {
        return this.RingTimestamp;
    }

    /**
     * Set 振铃时间，Unix 时间戳
     * @param RingTimestamp 振铃时间，Unix 时间戳
     */
    public void setRingTimestamp(Long RingTimestamp) {
        this.RingTimestamp = RingTimestamp;
    }

    /**
     * Get 接听时间，Unix 时间戳 
     * @return AcceptTimestamp 接听时间，Unix 时间戳
     */
    public Long getAcceptTimestamp() {
        return this.AcceptTimestamp;
    }

    /**
     * Set 接听时间，Unix 时间戳
     * @param AcceptTimestamp 接听时间，Unix 时间戳
     */
    public void setAcceptTimestamp(Long AcceptTimestamp) {
        this.AcceptTimestamp = AcceptTimestamp;
    }

    /**
     * Get 坐席邮箱 
     * @return StaffEmail 坐席邮箱
     */
    public String getStaffEmail() {
        return this.StaffEmail;
    }

    /**
     * Set 坐席邮箱
     * @param StaffEmail 坐席邮箱
     */
    public void setStaffEmail(String StaffEmail) {
        this.StaffEmail = StaffEmail;
    }

    /**
     * Get 坐席工号 
     * @return StaffNumber 坐席工号
     */
    public String getStaffNumber() {
        return this.StaffNumber;
    }

    /**
     * Set 坐席工号
     * @param StaffNumber 坐席工号
     */
    public void setStaffNumber(String StaffNumber) {
        this.StaffNumber = StaffNumber;
    }

    /**
     * Get 会话状态
ringing 振铃中
seatJoining  等待坐席接听
inProgress 进行中
finished 已完成 
     * @return SessionStatus 会话状态
ringing 振铃中
seatJoining  等待坐席接听
inProgress 进行中
finished 已完成
     */
    public String getSessionStatus() {
        return this.SessionStatus;
    }

    /**
     * Set 会话状态
ringing 振铃中
seatJoining  等待坐席接听
inProgress 进行中
finished 已完成
     * @param SessionStatus 会话状态
ringing 振铃中
seatJoining  等待坐席接听
inProgress 进行中
finished 已完成
     */
    public void setSessionStatus(String SessionStatus) {
        this.SessionStatus = SessionStatus;
    }

    /**
     * Get 会话呼叫方向， 0 呼入 | 1 - 呼出 
     * @return Direction 会话呼叫方向， 0 呼入 | 1 - 呼出
     */
    public Long getDirection() {
        return this.Direction;
    }

    /**
     * Set 会话呼叫方向， 0 呼入 | 1 - 呼出
     * @param Direction 会话呼叫方向， 0 呼入 | 1 - 呼出
     */
    public void setDirection(Long Direction) {
        this.Direction = Direction;
    }

    /**
     * Get 转外线使用的号码（转外线主叫） 
     * @return OutBoundCaller 转外线使用的号码（转外线主叫）
     */
    public String getOutBoundCaller() {
        return this.OutBoundCaller;
    }

    /**
     * Set 转外线使用的号码（转外线主叫）
     * @param OutBoundCaller 转外线使用的号码（转外线主叫）
     */
    public void setOutBoundCaller(String OutBoundCaller) {
        this.OutBoundCaller = OutBoundCaller;
    }

    /**
     * Get 转外线被叫 
     * @return OutBoundCallee 转外线被叫
     */
    public String getOutBoundCallee() {
        return this.OutBoundCallee;
    }

    /**
     * Set 转外线被叫
     * @param OutBoundCallee 转外线被叫
     */
    public void setOutBoundCallee(String OutBoundCallee) {
        this.OutBoundCallee = OutBoundCallee;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SessionID", this.SessionID);
        this.setParamSimple(map, prefix + "RoomID", this.RoomID);
        this.setParamSimple(map, prefix + "Caller", this.Caller);
        this.setParamSimple(map, prefix + "Callee", this.Callee);
        this.setParamSimple(map, prefix + "StartTimestamp", this.StartTimestamp);
        this.setParamSimple(map, prefix + "RingTimestamp", this.RingTimestamp);
        this.setParamSimple(map, prefix + "AcceptTimestamp", this.AcceptTimestamp);
        this.setParamSimple(map, prefix + "StaffEmail", this.StaffEmail);
        this.setParamSimple(map, prefix + "StaffNumber", this.StaffNumber);
        this.setParamSimple(map, prefix + "SessionStatus", this.SessionStatus);
        this.setParamSimple(map, prefix + "Direction", this.Direction);
        this.setParamSimple(map, prefix + "OutBoundCaller", this.OutBoundCaller);
        this.setParamSimple(map, prefix + "OutBoundCallee", this.OutBoundCallee);

    }
}

