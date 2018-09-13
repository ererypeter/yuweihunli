package com.taizhouhunli.yuweihunli.model.vo;

import java.io.Serializable;

import com.taizhouhunli.yuweihunli.core.enums.Base;
import com.taizhouhunli.yuweihunli.core.enums.BaseView;

/**
 * 视图返回的基础类对象
 *
 * @author zhangpeijun
 * @version [v0.0.1, 2016年7月12日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class RespBaseVO<T> implements Serializable{

    /**
     * 注释内容
     */
    private static final long serialVersionUID = 1L;

    /**
     * 操作状态码
     */
    Integer code;

    /**
     * 描述
     */
    String msg;

    /**
     * 返回数据值：
     */
    T data;

    /**
     * 默认返回成功：0,success
     */
    public RespBaseVO() {
        this.code = Base.SUCCESS.getCode();
        this.msg = Base.SUCCESS.getMsg();
    }

    /**
     * 默认返回成功：0,success
     */
    public RespBaseVO(T val) {
        this.code = Base.SUCCESS.getCode();
        this.msg = Base.SUCCESS.getMsg();
        this.data = val;
    }

    /**
     * 默认返回成功：0,success
     */
    public RespBaseVO(BaseView enums) {
        this.code = enums.getCode();
        this.msg = enums.getMsg();
    }

    /**
     * 默认返回成功：0,success
     */
    public RespBaseVO(BaseView enums, T val) {
        this.code = enums.getCode();
        this.msg = enums.getMsg();
        this.data = val;
    }

    /**
     * 设置返回值
     * 
     * @param enums
     *            [参数说明]
     * 
     * @return void [返回类型说明]
     * @version [v0.0.1, 2018年8月23日]
     * @exception throws
     *                [违例类型] [违例说明]
     * @see [类、类#方法、类#成员]
     */
    public void setVal(BaseView enums) {
        setCode(enums.getCode());
        setMsg(enums.getMsg());
    }

    public void setVal(BaseView enums, T data) {
        setCode(enums.getCode());
        setMsg(enums.getMsg());
        setData(data);
    }

    public RespBaseVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RespBaseVO(Integer code, String msg, T val) {
        this.code = code;
        this.msg = msg;
        this.data = val;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RespBaseVO [code=");
        builder.append(code);
        builder.append(", message=");
        builder.append(msg);
        builder.append(", data=");
        builder.append(data);
        builder.append("]");
        return builder.toString();
    }
}
