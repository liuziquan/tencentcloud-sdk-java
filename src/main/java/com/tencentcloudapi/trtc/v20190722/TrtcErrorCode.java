package com.tencentcloudapi.trtc.v20190722;
public enum TrtcErrorCode {
    // 未完成实名认证，不允许此操作。
     AUTHFAILURE_UNREALNAMEAUTHENTICATED("AuthFailure.UnRealNameAuthenticated"),
     
    // 房间中没有设置混流模板。
     FAILEDOPERATION_MIXSESSIONNOTEXIST("FailedOperation.MixSessionNotExist"),
     
    // 云API混流模板和SDK混流冲突。
     FAILEDOPERATION_REQUESTREJECTION("FailedOperation.RequestRejection"),
     
    // 房间不存在。
     FAILEDOPERATION_ROOMNOTEXIST("FailedOperation.RoomNotExist"),
     
    // 应用ID不存在。
     FAILEDOPERATION_SDKAPPIDNOTEXIST("FailedOperation.SdkAppIdNotExist"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 访问后端服务失败。
     INTERNALERROR_BACKENDFAIL("InternalError.BackendFail"),
     
    // 访问后端服务超时。
     INTERNALERROR_BACKENDTIMEOUT("InternalError.BackendTimeOut"),
     
    // 数据库查询异常。
     INTERNALERROR_DBERROR("InternalError.DBError"),
     
    // ES查询异常。
     INTERNALERROR_ESQUERYERROR("InternalError.EsQueryError"),
     
    // 查询房间失败。
     INTERNALERROR_GETROOMCACHEIPERROR("InternalError.GetRoomCacheIpError"),
     
    // 获取房间信息失败。
     INTERNALERROR_GETROOMFROMCACHEERROR("InternalError.GetRoomFromCacheError"),
     
    // http请求解析失败。
     INTERNALERROR_HTTPPARASEFALIED("InternalError.HttpParaseFalied"),
     
    // 接口错误。
     INTERNALERROR_INTERFACEERR("InternalError.InterfaceErr"),
     
    // 不支持的方法。
     INTERNALERROR_METHODERR("InternalError.MethodErr"),
     
    // 查询秒级监控失败。
     INTERNALERROR_MONITORQUERYERR("InternalError.MonitorQueryErr"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // AppId校验失败。
     INVALIDPARAMETER_APPID("InvalidParameter.AppId"),
     
    // 音频编码参数错误。
     INVALIDPARAMETER_AUDIOENCODEPARAMS("InvalidParameter.AudioEncodeParams"),
     
    // body 解析参数失败。
     INVALIDPARAMETER_BODYPARAMSERROR("InvalidParameter.BodyParamsError"),
     
    // 图片过大。
     INVALIDPARAMETER_CHECKCONTENTFAILED("InvalidParameter.CheckContentFailed"),
     
    // 后缀名校验失败。
     INVALIDPARAMETER_CHECKSUFFIXFAILED("InvalidParameter.CheckSuffixFailed"),
     
    // EncodeParams参数错误。
     INVALIDPARAMETER_ENCODEPARAMS("InvalidParameter.EncodeParams"),
     
    // EndTs参数错误。
     INVALIDPARAMETER_ENDTS("InvalidParameter.EndTs"),
     
    // 大画面居右显示参数错误。
     INVALIDPARAMETER_MAINVIDEORIGHTALIGN("InvalidParameter.MainVideoRightAlign"),
     
    // 大画面流类型错误。
     INVALIDPARAMETER_MAINVIDEOSTREAMTYPE("InvalidParameter.MainVideoStreamType"),
     
    // OutputParams参数错误。
     INVALIDPARAMETER_OUTPUTPARAMS("InvalidParameter.OutputParams"),
     
    // PageNumber 参数错误。
     INVALIDPARAMETER_PAGENUMBER("InvalidParameter.PageNumber"),
     
    // PageSize参数错误。
     INVALIDPARAMETER_PAGESIZE("InvalidParameter.PageSize"),
     
    // PageSize超过100。
     INVALIDPARAMETER_PAGESIZEOVERSIZE("InvalidParameter.PageSizeOversize"),
     
    // 自定义布局参数错误。
     INVALIDPARAMETER_PRESETLAYOUTCONFIG("InvalidParameter.PresetLayoutConfig"),
     
    // 纯音频推流参数错误。
     INVALIDPARAMETER_PUREAUDIOSTREAM("InvalidParameter.PureAudioStream"),
     
    // 查询范围超过文档限制。
     INVALIDPARAMETER_QUERYSCALEOVERSIZE("InvalidParameter.QueryScaleOversize"),
     
    // 纯音频录制参数错误。
     INVALIDPARAMETER_RECORDAUDIOONLY("InvalidParameter.RecordAudioOnly"),
     
    // RecordId参数错误。
     INVALIDPARAMETER_RECORDID("InvalidParameter.RecordId"),
     
    // RoomId参数错误。
     INVALIDPARAMETER_ROOMID("InvalidParameter.RoomId"),
     
    // SdkAppId参数错误。
     INVALIDPARAMETER_SDKAPPID("InvalidParameter.SdkAppId"),
     
    // 小画面布局参数错误。
     INVALIDPARAMETER_SMALLVIDEOLAYOUTPARAMS("InvalidParameter.SmallVideoLayoutParams"),
     
    // 小画面布局中流类型参数错误。
     INVALIDPARAMETER_SMALLVIDEOSTREAMTYPE("InvalidParameter.SmallVideoStreamType"),
     
    // 查询开始时间超过文档限制。
     INVALIDPARAMETER_STARTTIMEEXPIRE("InvalidParameter.StartTimeExpire"),
     
    // StartTs参数错误。
     INVALIDPARAMETER_STARTTS("InvalidParameter.StartTs"),
     
    // 查询开始时间超过文档限制。
     INVALIDPARAMETER_STARTTSOVERSIZE("InvalidParameter.StartTsOversize"),
     
    // StreamId参数错误。
     INVALIDPARAMETER_STREAMID("InvalidParameter.StreamId"),
     
    // Url解析参数失败。
     INVALIDPARAMETER_URLPARAMSERROR("InvalidParameter.UrlParamsError"),
     
    // UserId参数错误。
     INVALIDPARAMETER_USERID("InvalidParameter.UserId"),
     
    // UserIds参数错误。
     INVALIDPARAMETER_USERIDS("InvalidParameter.UserIds"),
     
    // 用户数超过6个。
     INVALIDPARAMETER_USERIDSMORETHANSIX("InvalidParameter.UserIdsMorethanSix"),
     
    // 视频分辨率参数错误。
     INVALIDPARAMETER_VIDEORESOLUTION("InvalidParameter.VideoResolution"),
     
    // RoomId值错误。
     INVALIDPARAMETERVALUE_ROOMID("InvalidParameterValue.RoomId"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 缺少AppId参数。
     MISSINGPARAMETER_APPID("MissingParameter.AppId"),
     
    // EncodeParams中缺少音频输出参数。
     MISSINGPARAMETER_AUDIOENCODEPARAMS("MissingParameter.AudioEncodeParams"),
     
    // 转推参数中缺少BizId。
     MISSINGPARAMETER_BIZID("MissingParameter.BizId"),
     
    // 缺少CommId参数。
     MISSINGPARAMETER_COMMID("MissingParameter.CommId"),
     
    // 缺少SdkAppId参数或CommID参数。
     MISSINGPARAMETER_COMMIDORSDKAPPID("MissingParameter.CommIdOrSdkAppId"),
     
    // 缺少EncodeParams参数。
     MISSINGPARAMETER_ENCODEPARAMS("MissingParameter.EncodeParams"),
     
    // 缺少endTS_s参数。
     MISSINGPARAMETER_ENDTS("MissingParameter.EndTs"),
     
    // 缺少OutputParams参数。
     MISSINGPARAMETER_OUTPUTPARAMS("MissingParameter.OutputParams"),
     
    // 缺少自定义布局参数。
     MISSINGPARAMETER_PRESETLAYOUTCONFIG("MissingParameter.PresetLayoutConfig"),
     
    // 缺少转推参数。
     MISSINGPARAMETER_PUBLISHCDNPARAMS("MissingParameter.PublishCdnParams"),
     
    // 转推参数中缺少转推目的地址。
     MISSINGPARAMETER_PUBLISHCDNURLS("MissingParameter.PublishCdnUrls"),
     
    // 缺少RoomId参数。
     MISSINGPARAMETER_ROOMID("MissingParameter.RoomId"),
     
    // 缺少RoomNum参数。
     MISSINGPARAMETER_ROOMNUM("MissingParameter.RoomNum"),
     
    // 缺少SdkAppId参数。
     MISSINGPARAMETER_SDKAPPID("MissingParameter.SdkAppId"),
     
    // 缺少startTS_s参数。
     MISSINGPARAMETER_STARTTS("MissingParameter.StartTs"),
     
    // OutputParams中缺少StreamId参数。
     MISSINGPARAMETER_STREAMID("MissingParameter.StreamId"),
     
    // 缺少UserId参数。
     MISSINGPARAMETER_USERID("MissingParameter.UserId"),
     
    // 缺少UserIds参数。
     MISSINGPARAMETER_USERIDS("MissingParameter.UserIds"),
     
    // EncodeParams中缺少视频输出参数。
     MISSINGPARAMETER_VIDEOENCODEPARAMS("MissingParameter.VideoEncodeParams"),
     
    // 没有操作SdkAppId的权限。
     UNAUTHORIZEDOPERATION_SDKAPPID("UnauthorizedOperation.SdkAppId"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter");
     
    private String value;
    private TrtcErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

