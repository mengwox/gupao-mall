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
import java.time.LocalDateTime;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author mawenhao
 * @since 2023-04-17
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_info")
@ApiModel(value = "UserInfo对象", description = "用户表")
public class UserInfo implements Serializable {


    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "用户名")
    @TableId("username")
    private String username;

    @ApiModelProperty(value = "密码，加密存储")
    @TableField("password")
    private String password;

    @ApiModelProperty(value = "注册手机号")
    @TableField("phone")
    private String phone;

    @ApiModelProperty(value = "注册邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty(value = "创建时间")
    @TableField("created")
    private LocalDateTime created;

    @ApiModelProperty(value = "修改时间")
    @TableField("updated")
    private LocalDateTime updated;

    @ApiModelProperty(value = "会员来源：1:PC，2：H5，3：Android，4：IOS")
    @TableField("source_type")
    private String sourceType;

    @ApiModelProperty(value = "昵称")
    @TableField("nick_name")
    private String nickName;

    @ApiModelProperty(value = "真实姓名")
    @TableField("name")
    private String name;

    @ApiModelProperty(value = "使用状态（1正常 0非正常）")
    @TableField("status")
    private String status;

    @ApiModelProperty(value = "头像地址")
    @TableField("head_pic")
    private String headPic;

    @ApiModelProperty(value = "QQ号码")
    @TableField("qq")
    private String qq;

    @ApiModelProperty(value = "手机是否验证 （0否  1是）")
    @TableField("is_mobile_check")
    private String isMobileCheck;

    @ApiModelProperty(value = "邮箱是否检测（0否  1是）")
    @TableField("is_email_check")
    private String isEmailCheck;

    @ApiModelProperty(value = "性别，1男，0女")
    @TableField("sex")
    private String sex;

    @ApiModelProperty(value = "会员等级")
    @TableField("user_level")
    private Integer userLevel;

    @ApiModelProperty(value = "积分")
    @TableField("points")
    private Integer points;

    @ApiModelProperty(value = "经验值")
    @TableField("experience_value")
    private Integer experienceValue;

    @ApiModelProperty(value = "出生年月日")
    @TableField("birthday")
    private LocalDateTime birthday;

    @ApiModelProperty(value = "最后登录时间")
    @TableField("last_login_time")
    private LocalDateTime lastLoginTime;

    @ApiModelProperty(value = "省份ID")
    @TableField("provinceid")
    private String provinceid;

    @ApiModelProperty(value = "城市ID")
    @TableField("cityid")
    private String cityid;

    @ApiModelProperty(value = "地区ID")
    @TableField("areaid")
    private String areaid;


}
