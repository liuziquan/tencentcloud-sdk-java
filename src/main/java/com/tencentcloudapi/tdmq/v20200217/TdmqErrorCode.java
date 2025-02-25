package com.tencentcloudapi.tdmq.v20200217;
public enum TdmqErrorCode {
    // CAM鉴权不通过。
     AUTHFAILURE_UNAUTHORIZEDOPERATION("AuthFailure.UnauthorizedOperation"),
     
    // 操作失败。
     FAILEDOPERATION("FailedOperation"),
     
    // 创建集群失败。
     FAILEDOPERATION_CREATECLUSTER("FailedOperation.CreateCluster"),
     
    // 环境创建失败。
     FAILEDOPERATION_CREATEENVIRONMENT("FailedOperation.CreateEnvironment"),
     
    // 创建命名空间失败。
     FAILEDOPERATION_CREATENAMESPACE("FailedOperation.CreateNamespace"),
     
    // 创建producer出错。
     FAILEDOPERATION_CREATEPRODUCERERROR("FailedOperation.CreateProducerError"),
     
    // 创建TDMQ client的出错。
     FAILEDOPERATION_CREATEPULSARCLIENTERROR("FailedOperation.CreatePulsarClientError"),
     
    // 创建订阅关系失败。
     FAILEDOPERATION_CREATESUBSCRIPTION("FailedOperation.CreateSubscription"),
     
    // 主题创建失败。
     FAILEDOPERATION_CREATETOPIC("FailedOperation.CreateTopic"),
     
    // 删除集群失败。
     FAILEDOPERATION_DELETECLUSTER("FailedOperation.DeleteCluster"),
     
    // 环境删除失败。
     FAILEDOPERATION_DELETEENVIRONMENTS("FailedOperation.DeleteEnvironments"),
     
    // 删除命名空间失败。
     FAILEDOPERATION_DELETENAMESPACE("FailedOperation.DeleteNamespace"),
     
    // 删除订阅关系失败。
     FAILEDOPERATION_DELETESUBSCRIPTIONS("FailedOperation.DeleteSubscriptions"),
     
    // 主题删除失败。
     FAILEDOPERATION_DELETETOPICS("FailedOperation.DeleteTopics"),
     
    // 查询生产者数据失败。
     FAILEDOPERATION_DESCRIBEPRODUCERS("FailedOperation.DescribeProducers"),
     
    // 查询订阅数据失败。
     FAILEDOPERATION_DESCRIBESUBSCRIPTION("FailedOperation.DescribeSubscription"),
     
    // 获取环境属性失败。
     FAILEDOPERATION_GETENVIRONMENTATTRIBUTESFAILED("FailedOperation.GetEnvironmentAttributesFailed"),
     
    // 获取主题分区数失败。
     FAILEDOPERATION_GETTOPICPARTITIONSFAILED("FailedOperation.GetTopicPartitionsFailed"),
     
    // 必须先清除关联命名空间才能继续操作。
     FAILEDOPERATION_NAMESPACEINUSE("FailedOperation.NamespaceInUse"),
     
    // 接收消息出错。
     FAILEDOPERATION_RECEIVEERROR("FailedOperation.ReceiveError"),
     
    // 接收消息超时，请重试。
     FAILEDOPERATION_RECEIVETIMEOUT("FailedOperation.ReceiveTimeout"),
     
    // 消息回溯设置失败。
     FAILEDOPERATION_RESETMSGSUBOFFSETBYTIMESTAMPFAILED("FailedOperation.ResetMsgSubOffsetByTimestampFailed"),
     
    // 必须先清除关联角色数据才能继续操作。
     FAILEDOPERATION_ROLEINUSE("FailedOperation.RoleInUse"),
     
    // 发送消息失败。
     FAILEDOPERATION_SENDMSGFAILED("FailedOperation.SendMsgFailed"),
     
    // 设置消息TTL失败。
     FAILEDOPERATION_SETTTL("FailedOperation.SetTTL"),
     
    // 必须先清除关联主题数据才能继续操作。
     FAILEDOPERATION_TOPICINUSE("FailedOperation.TopicInUse"),
     
    // 环境更新失败。
     FAILEDOPERATION_UPDATEENVIRONMENT("FailedOperation.UpdateEnvironment"),
     
    // 主题更新失败。
     FAILEDOPERATION_UPDATETOPIC("FailedOperation.UpdateTopic"),
     
    // 必须先清除关联VPC路由数据才能继续操作。
     FAILEDOPERATION_VPCINUSE("FailedOperation.VpcInUse"),
     
    // Broker服务异常。
     INTERNALERROR_BROKERSERVICE("InternalError.BrokerService"),
     
    // 获取属性失败。
     INTERNALERROR_GETATTRIBUTESFAILED("InternalError.GetAttributesFailed"),
     
    // 重试可以成功。
     INTERNALERROR_RETRY("InternalError.Retry"),
     
    // 系统错误。
     INTERNALERROR_SYSTEMERROR("InternalError.SystemError"),
     
    // 参数错误。
     INVALIDPARAMETER("InvalidParameter"),
     
    // 上传的 tenant name 错误。
     INVALIDPARAMETER_TENANTNOTFOUND("InvalidParameter.TenantNotFound"),
     
    // 没有获取到正确的 token。
     INVALIDPARAMETER_TOKENNOTFOUND("InvalidParameter.TokenNotFound"),
     
    // 参数取值错误。
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // 与现有集群名称重复。
     INVALIDPARAMETERVALUE_CLUSTERNAMEDUPLICATION("InvalidParameterValue.ClusterNameDuplication"),
     
    // 参数值不在允许范围内。
     INVALIDPARAMETERVALUE_INVALIDPARAMS("InvalidParameterValue.InvalidParams"),
     
    // 必要参数没有传递。
     INVALIDPARAMETERVALUE_NEEDMOREPARAMS("InvalidParameterValue.NeedMoreParams"),
     
    // 无效的消息TTL值。
     INVALIDPARAMETERVALUE_TTL("InvalidParameterValue.TTL"),
     
    // 上传的topic name错误。
     INVALIDPARAMETERVALUE_TOPICNOTFOUND("InvalidParameterValue.TopicNotFound"),
     
    // 实例下集群数量超过限制。
     LIMITEXCEEDED_CLUSTERS("LimitExceeded.Clusters"),
     
    // 实例下环境数量超过限制。
     LIMITEXCEEDED_ENVIRONMENTS("LimitExceeded.Environments"),
     
    // 实例下命名空间数量超过限额。
     LIMITEXCEEDED_NAMESPACES("LimitExceeded.Namespaces"),
     
    // 实例下订阅者数量超过限制。
     LIMITEXCEEDED_SUBSCRIPTIONS("LimitExceeded.Subscriptions"),
     
    // 实例下主题数量超过限制。
     LIMITEXCEEDED_TOPICS("LimitExceeded.Topics"),
     
    // 缺少参数错误。
     MISSINGPARAMETER("MissingParameter"),
     
    // 必要参数没有传递。
     MISSINGPARAMETER_NEEDMOREPARAMS("MissingParameter.NeedMoreParams"),
     
    // 订阅仍在消费中。
     OPERATIONDENIED_CONSUMERRUNNING("OperationDenied.ConsumerRunning"),
     
    // 默认环境不允许操作。
     OPERATIONDENIED_DEFAULTENVIRONMENT("OperationDenied.DefaultEnvironment"),
     
    // 集群已存在。
     RESOURCEINUSE_CLUSTER("ResourceInUse.Cluster"),
     
    // 重名，命名空间已存在。
     RESOURCEINUSE_NAMESPACE("ResourceInUse.Namespace"),
     
    // 重名，订阅关系已存在。
     RESOURCEINUSE_SUBSCRIPTION("ResourceInUse.Subscription"),
     
    // 重名，主题已存在。
     RESOURCEINUSE_TOPIC("ResourceInUse.Topic"),
     
    // 服务的集群不存在。
     RESOURCENOTFOUND_BROKERCLUSTER("ResourceNotFound.BrokerCluster"),
     
    // 集群不存在。
     RESOURCENOTFOUND_CLUSTER("ResourceNotFound.Cluster"),
     
    // 环境不存在。
     RESOURCENOTFOUND_ENVIRONMENT("ResourceNotFound.Environment"),
     
    // 命名空间不存在。
     RESOURCENOTFOUND_NAMESPACE("ResourceNotFound.Namespace"),
     
    // 角色不存在。
     RESOURCENOTFOUND_ROLE("ResourceNotFound.Role"),
     
    // 订阅关系不存在。
     RESOURCENOTFOUND_SUBSCRIPTION("ResourceNotFound.Subscription"),
     
    // 主题不存在。
     RESOURCENOTFOUND_TOPIC("ResourceNotFound.Topic"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // 系统升级。
     RESOURCEUNAVAILABLE_SYSTEMUPGRADE("ResourceUnavailable.SystemUpgrade"),
     
    // 资源售罄。
     RESOURCESSOLDOUT("ResourcesSoldOut"),
     
    // 未授权操作。
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // 未知参数错误。
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // 操作不支持。
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private TdmqErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

