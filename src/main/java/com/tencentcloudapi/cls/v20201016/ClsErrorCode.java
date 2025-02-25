package com.tencentcloudapi.cls.v20201016;
public enum ClsErrorCode {
    // CAM签名/鉴权错误。
     AUTHFAILURE("AuthFailure"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 异步检索任务还未完成，请稍后。
     FAILEDOPERATION_ASYNCSEARCHNOTCOMPLETED("FailedOperation.AsyncSearchNotCompleted"),
     
    // 异步任务未完成。
     FAILEDOPERATION_ASYNCTASKNOTCOMPLETED("FailedOperation.AsyncTaskNotCompleted"),
     
    // 告警策略通知模板已经绑定到了某个告警策略上。
     FAILEDOPERATION_BINDEDALARM("FailedOperation.BindedAlarm"),
     
    // 检索日志触发最大条数限制。
     FAILEDOPERATION_GETLOGREACHLIMIT("FailedOperation.GetlogReachLimit"),
     
    // 该告警策略状态异常，请检查下日志主题ID是否都存在。
     FAILEDOPERATION_INVALIDALARM("FailedOperation.InvalidAlarm"),
     
    // 检索游标已失效或不存在。
     FAILEDOPERATION_INVALIDCONTEXT("FailedOperation.InvalidContext"),
     
    // 离线存储保存时间不得少于7天。
     FAILEDOPERATION_INVALIDPERIOD("FailedOperation.InvalidPeriod"),
     
    // 相同的日志集已存在。
     FAILEDOPERATION_LOGSETCONFLICT("FailedOperation.LogsetConflict"),
     
    // 日志集下存在日志主题。
     FAILEDOPERATION_LOGSETNOTEMPTY("FailedOperation.LogsetNotEmpty"),
     
    // 无效的Content。
     FAILEDOPERATION_MISSINGCONTENT("FailedOperation.MissingContent"),
     
    // 修改的生命周期被禁止。
     FAILEDOPERATION_PERIODMODIFYFORBIDDEN("FailedOperation.PeriodModifyForbidden"),
     
    // 查询语句运行失败。
     FAILEDOPERATION_QUERYERROR("FailedOperation.QueryError"),
     
    // 读qps超过限制。
     FAILEDOPERATION_READQPSLIMIT("FailedOperation.ReadQpsLimit"),
     
    // 查询超时。
     FAILEDOPERATION_SEARCHTIMEOUT("FailedOperation.SearchTimeout"),
     
    // 投递任务不允许重试。
     FAILEDOPERATION_SHIPPERTASKNOTTORETRY("FailedOperation.ShipperTaskNotToRetry"),
     
    // 查询语句解析错误。
     FAILEDOPERATION_SYNTAXERROR("FailedOperation.SyntaxError"),
     
    // 日志主题已关闭。
     FAILEDOPERATION_TOPICCLOSED("FailedOperation.TopicClosed"),
     
    // 日志主题已隔离。
     FAILEDOPERATION_TOPICISOLATED("FailedOperation.TopicIsolated"),
     
    // 日志主题不支持该操作。
     FAILEDOPERATION_TOPICNOTSUPPORT("FailedOperation.TopicNotSupport"),
     
    // 写qps超过限制。
     FAILEDOPERATION_WRITEQPSLIMIT("FailedOperation.WriteQpsLimit"),
     
    // 写流量超过限制。
     FAILEDOPERATION_WRITETRAFFICLIMIT("FailedOperation.WriteTrafficLimit"),
     
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 告警策略已经存在。
     INVALIDPARAMETER_ALARMCONFLICT("InvalidParameter.AlarmConflict"),
     
    // 告警策略通知模板已经存在。
     INVALIDPARAMETER_ALARMNOTICECONFLICT("InvalidParameter.AlarmNoticeConflict"),
     
    // 相同的采集配置规则已经存在。
     INVALIDPARAMETER_CONFIGCONFLICT("InvalidParameter.ConfigConflict"),
     
    // 无效的Content。
     INVALIDPARAMETER_CONTENT("InvalidParameter.Content"),
     
    // 指定日志主题已经存在索引规则。
     INVALIDPARAMETER_INDEXCONFLICT("InvalidParameter.IndexConflict"),
     
    // 相同的日志集已存在。
     INVALIDPARAMETER_LOGSETCONFLICT("InvalidParameter.LogsetConflict"),
     
    // 同名机器组已经存在。
     INVALIDPARAMETER_MACHINEGROUPCONFLICT("InvalidParameter.MachineGroupConflict"),
     
    // 投递规则命名冲突。
     INVALIDPARAMETER_SHIPPERCONFLICT("InvalidParameter.ShipperConflict"),
     
    // 指定日志集下已经有同名的日志主题。
     INVALIDPARAMETER_TOPICCONFLICT("InvalidParameter.TopicConflict"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 超过配额限制。
     LIMITEXCEEDED("LimitExceeded"),
     
    // 运行中的异步检索任务数目超限。
     LIMITEXCEEDED_ASYNCSEARCHTASK("LimitExceeded.AsyncSearchTask"),
     
    // 异步任务数目超过限制。
     LIMITEXCEEDED_ASYNCTASK("LimitExceeded.AsyncTask"),
     
    // 采集规则配置超过最大值限制。
     LIMITEXCEEDED_CONFIG("LimitExceeded.Config"),
     
    // 日志导出数量超出限制。
     LIMITEXCEEDED_EXPORT("LimitExceeded.Export"),
     
    // 并发查询超过限制，单topic并发最大值15。
     LIMITEXCEEDED_LOGSEARCH("LimitExceeded.LogSearch"),
     
    // 日志大小超过限制。
     LIMITEXCEEDED_LOGSIZE("LimitExceeded.LogSize"),
     
    // 日志集数量超出限制。
     LIMITEXCEEDED_LOGSET("LimitExceeded.Logset"),
     
    // 机器组超过限制。
     LIMITEXCEEDED_MACHINEGROUP("LimitExceeded.MachineGroup"),
     
    // 机器组IP超过限制。
     LIMITEXCEEDED_MACHINEGROUPIP("LimitExceeded.MachineGroupIp"),
     
    // 机器组Label超过限制。
     LIMITEXCEEDED_MACHINEGROUPLABELS("LimitExceeded.MachineGroupLabels"),
     
    // 分区超过限制。
     LIMITEXCEEDED_PARTITION("LimitExceeded.Partition"),
     
    // 投递规则超出限制。
     LIMITEXCEEDED_SHIPPER("LimitExceeded.Shipper"),
     
    // tag超过限制。
     LIMITEXCEEDED_TAG("LimitExceeded.Tag"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 操作被拒绝。
     OPERATIONDENIED("OperationDenied"),
     
    // ACL校验失败。
     OPERATIONDENIED_ACLFAILED("OperationDenied.ACLFailed"),
     
    // 账户已销毁。
     OPERATIONDENIED_ACCOUNTDESTROY("OperationDenied.AccountDestroy"),
     
    // 账户欠费。
     OPERATIONDENIED_ACCOUNTISOLATE("OperationDenied.AccountIsolate"),
     
    // 账户不存在。
     OPERATIONDENIED_ACCOUNTNOTEXISTS("OperationDenied.AccountNotExists"),
     
    // 字段没有开启分析功能。
     OPERATIONDENIED_ANALYSISSWITCHCLOSE("OperationDenied.AnalysisSwitchClose"),
     
    // 通知模版已绑定告警，无法删除。
     OPERATIONDENIED_NOTICEHASALARM("OperationDenied.NoticeHasAlarm"),
     
    // topic绑定了函数投递。
     OPERATIONDENIED_TOPICHASDELIVERFUNCTION("OperationDenied.TopicHasDeliverFunction"),
     
    // 资源不存在。
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // agent version不存在。
     RESOURCENOTFOUND_AGENTVERSIONNOTEXIST("ResourceNotFound.AgentVersionNotExist"),
     
    // 告警策略不存在。
     RESOURCENOTFOUND_ALARMNOTEXIST("ResourceNotFound.AlarmNotExist"),
     
    // 告警策略通知模板不存在。
     RESOURCENOTFOUND_ALARMNOTICENOTEXIST("ResourceNotFound.AlarmNoticeNotExist"),
     
    // 异步检索任务不存在。
     RESOURCENOTFOUND_ASYNCSEARCHTASKNOTEXIST("ResourceNotFound.AsyncSearchTaskNotExist"),
     
    // 异步任务不存在。
     RESOURCENOTFOUND_ASYNCTASKNOTEXIST("ResourceNotFound.AsyncTaskNotExist"),
     
    // 指定的采集规则配置不存在。
     RESOURCENOTFOUND_CONFIGNOTEXIST("ResourceNotFound.ConfigNotExist"),
     
    // 日志导出不存在。
     RESOURCENOTFOUND_EXPORTNOTEXIST("ResourceNotFound.ExportNotExist"),
     
    // 索引不存在。
     RESOURCENOTFOUND_INDEXNOTEXIST("ResourceNotFound.IndexNotExist"),
     
    // 指定的日志集不存在。
     RESOURCENOTFOUND_LOGSETNOTEXIST("ResourceNotFound.LogsetNotExist"),
     
    // 机器组不存在。
     RESOURCENOTFOUND_MACHINEGROUPNOTEXIST("ResourceNotFound.MachineGroupNotExist"),
     
    // 分区不存在。
     RESOURCENOTFOUND_PARTITIONNOTEXIST("ResourceNotFound.PartitionNotExist"),
     
    // 投递规则不存在。
     RESOURCENOTFOUND_SHIPPERNOTEXIST("ResourceNotFound.ShipperNotExist"),
     
    // 投递任务不存在。
     RESOURCENOTFOUND_SHIPPERTASKNOTEXIST("ResourceNotFound.ShipperTaskNotExist"),
     
    // 日志主题不存在。
     RESOURCENOTFOUND_TOPICNOTEXIST("ResourceNotFound.TopicNotExist"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private ClsErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

