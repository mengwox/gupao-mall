package org.mawenhao.goods.entity;

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
 * 行政区域县区信息表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("areas")
@ApiModel(value = "Areas对象", description = "行政区域县区信息表")
public class Areas implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "区域ID")
    @TableId("areaid")
    private String areaid;

    @ApiModelProperty(value = "区域名称")
    @TableField("area")
    private String area;

    @ApiModelProperty(value = "城市ID")
    @TableField("cityid")
    private String cityid;


}
