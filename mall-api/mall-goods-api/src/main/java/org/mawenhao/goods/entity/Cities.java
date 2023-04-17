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
 * 行政区域地州市信息表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("cities")
@ApiModel(value = "Cities对象", description = "行政区域地州市信息表")
public class Cities implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "城市ID")
    @TableId("cityid")
    private String cityid;

    @ApiModelProperty(value = "城市名称")
    @TableField("city")
    private String city;

    @ApiModelProperty(value = "省份ID")
    @TableField("provinceid")
    private String provinceid;


}
