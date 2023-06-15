package org.mawenhao.goods.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.json.JSONUtil;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.mawenhao.common.Resp;
import org.mawenhao.goods.entity.BigRoom;
import org.mawenhao.goods.service.BigRoomService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * TODO
 *
 * @author mawenhao 2023/6/5
 */
@RestController
@RequestMapping("/big-room")
@AllArgsConstructor
@Slf4j
public class BigRoomController {
    private final BigRoomService bigRoomService;

    @GetMapping("/{channel}/{id}")
    public Resp<BigRoom> get(@PathVariable String id, @PathVariable String channel) {
        List<BigRoom> list = bigRoomService.lambdaQuery()
                .eq(BigRoom::getId, id)
                .eq(BigRoom::getChannel, channel)
                .list();
        if (CollUtil.isEmpty(list)) {
            return Resp.fail(String.format("查无channel:%s,id:%s的数据", channel, id));
        }
        return Resp.data(list.get(0));
    }

    @PostMapping("/add")
    public Resp<Integer> add(@RequestBody BigRoom bigRoom) {
        if (bigRoomService.save(bigRoom)) {
            return Resp.data(bigRoom.getId());
        }
        log.error("bigRoom表写入失败, entity:{}", JSONUtil.toJsonStr(bigRoom));
        return Resp.fail("bigRoom表写入失败");
    }

    @PutMapping("/update")
    public Resp<Integer> update(@RequestBody BigRoom bigRoom) {
        if (bigRoomService.updateById(bigRoom)) {
            return Resp.data(bigRoom.getId());
        }
        log.error("bigRoom表更新失败, entity:{}", JSONUtil.toJsonStr(bigRoom));
        return Resp.fail("bigRoom表更新失败");
    }

    @DeleteMapping("/delete/{id}")
    public Resp<String> delete(@PathVariable String id) {
        if (bigRoomService.removeById(id)) {
            return Resp.data(String.format("id:%s,删除成功", id));
        }
        log.error("bigRoom表删除失败, id:{}", id);
        return Resp.fail("bigRoom表删除失败");
    }
}
