package org.mawenhao.goods.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * TODO
 *
 * @author mawenhao 2023/6/5
 */
@Data
@TableName("big_room")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BigRoom implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 主键id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;
    /**
     * 来源渠道
     */
    private String channel;
    /**
     * 房源名称
     */
    private String roomName;
}
