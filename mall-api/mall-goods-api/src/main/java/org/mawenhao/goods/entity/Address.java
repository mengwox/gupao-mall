package org.mawenhao.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("address")
@ApiModel(value = "Address对象", description = "")
public class Address implements Serializable {


    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty(value = "省")
    @TableField("provinceid")
    private String provinceid;

    @ApiModelProperty(value = "市")
    @TableField("cityid")
    private String cityid;

    @ApiModelProperty(value = "县/区")
    @TableField("areaid")
    private String areaid;

    @ApiModelProperty(value = "电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "详细地址")
    @TableField("address")
    private String address;

    @ApiModelProperty(value = "联系人")
    @TableField("contact")
    private String contact;

    @ApiModelProperty(value = "是否是默认 1默认 0否")
    @TableField("is_default")
    private Integer isDefault;


}
