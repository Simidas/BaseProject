package com.exchange_v1.app.config;


/**
 * 服务端配置类
 *
 */
public class ServerConfig {
    // *****************************网请求消息状态码 ******************************//
    /**
     * 请求接口数据成功状态码
     */
    public static final String RESPONSE_STATUS_SUCCESS = "200";

    // ***************************接口请求配置 ****************************//
    /**
     * 服务器连接方法key
     */
    public static final String SERVER_METHOD_KEY = "token";
    /**
     * 服务器超时时间
     */
    public static final int SERVER_CONNECT_TIMEOUT = 60000;

    /**
     * 版本更新服务器
     */
    public static final String SERVER_VERSION_URL = "http://buddy.t.com/Api/version/typeid/0";

    //接口请求URL
    public static String SERVER_URL = "http://api.6neqo.cn";

    //注册
    public static String REGISTER_API = SERVER_URL+"/agent/register";
    //发送短信
    public static String SEND_MSG_API = SERVER_URL+"/sms/send";
    //登录
    public static String LOGIN_API = SERVER_URL+"/auth/login";
    //银行卡四要素
    public static String BANKVALID_API = SERVER_URL+"/agent/bankValid";
    //用户激活/缴纳押金
    public static String ACTIVE_API = SERVER_URL+"/agent/active";
    //修改密码
    public static String RESET_PWD_API = SERVER_URL+"/agent/retrieve";
    //用户信息
    public static String USER_INFO_API = SERVER_URL+"/agent/info";
    //用户打开接单
    public static String ON_RECEPTIVE_API = SERVER_URL+"/agent/receptiveOn";
    //用户关闭接单
    public static String OFF_RECEPTIVE_API = SERVER_URL+"/agent/receptiveOff";
    //停用/移除银行卡
    public static String BANK_REMOVE_API = SERVER_URL+"/agent/bankRemove";

    //极光绑定
    public static String JPUSH_BIND_API = SERVER_URL+"/agentDevice/bind";
    //极光解绑
    public static String JPUSH_UNBIND_API = SERVER_URL+"/agentDevice/unbind";
}
