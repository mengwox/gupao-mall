package org.mawenhao.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回消息
 *
 * @author mawenhao 2023/4/18
 */
@Data
@ApiModel(value = "返回消息对象", description = "返回消息对象")
public class Resp<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 响应码
     */
    @ApiModelProperty("响应码")
    private Integer code;
    /**
     * 异常信息
     */
    @ApiModelProperty("异常信息")
    private String msg;
    /**
     * 业务承载数据
     */
    @ApiModelProperty("业务承载数据")
    private T data;

    /**
     * 请求流水号,唯一标识
     */
    @ApiModelProperty("请求流水号")
    private String businessSerialNum;

    public static <T> Resp<T> data(T data) {
        return new Resp<>(data);
    }

    public static <T> Resp<T> fail(String msg) {
        return new Resp<>(400, msg, null);
    }

    private Resp(Integer code) {
        this(code, null, null, null);
    }

    private Resp(T data) {
        this(null, null, data, null);
    }

    private Resp(Integer code, String msg, T data) {
        this(code, msg, data, null);
    }

    private Resp(Integer code, String msg, T data, String businessSerialNum) {
        this.code = code;
        this.msg = msg;
        this.data = data;
        this.businessSerialNum = businessSerialNum;
    }
}
