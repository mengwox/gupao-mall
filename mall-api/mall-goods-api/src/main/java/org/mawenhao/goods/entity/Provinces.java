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
 * 省份信息表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("provinces")
@ApiModel(value = "Provinces对象", description = "省份信息表")
public class Provinces implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "省份ID")
    @TableId("provinceid")
    private String provinceid;

    @ApiModelProperty(value = "省份名称")
    @TableField("province")
    private String province;


}
