package com.taizhouhunli.yuweihunli.core.enums;

/**
 * 基础视图接口类，供接口返回枚举使用。
 * 
 * @author zhangpeijun
 * @version [v0.0.1, 2018年8月4日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public interface BaseView{

    /**
     * 视图返回错误码
     * 
     * @return [参数说明]
     * 
     * @return Integer [返回类型说明]
     * @exception throws
     *                [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    Integer getCode();

    /**
     * 视图返回描述
     * 
     * @return [参数说明]
     * 
     * @return String [返回类型说明]
     * @exception throws
     *                [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    String getMsg();
}
