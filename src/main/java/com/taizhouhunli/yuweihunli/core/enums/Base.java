package com.taizhouhunli.yuweihunli.core.enums;

/**
 * 响应给前端界面的枚举值
 * 
 * 六位错误码：112233
 * [11]：代表服务系统
 * [22]: 代表功能模块
 * [33]：代表具体异常业务
 * 
 * 0：成功（通用）
 * -1：通用错误
 * [100000~109999]：权限服务使用
 * [120000~129999]：微信公众号对接服务使用
 * [200000~299999]：管理后台服务使用
 * 
 * @author Lost
 * @version [v0.0.1, 2018年7月18日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public enum Base implements BaseView {

    /** 成功 **/
    SUCCESS(0, "成功"),
    /** 通用从错误 **/
    COMMON_ERROR(-1, "通用错误");

    /*
     * 六位错误码：112233
     * [11]：代表服务系统
     * [22]: 代表功能模块
     * [33]：代表具体异常业务
     * 
     * 0：成功（通用）
     * -1：通用错误
     * [100000~109999]：权限服务使用
     * [120000~129999]：微信公众号对接服务使用
     * [200000~299999]：管理后台服务使用
     */

    /**
     * 消息命令码
     */
    private Integer code;

    /**
     * 消息显示内容
     */
    private String msg;

    private Base(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

}
