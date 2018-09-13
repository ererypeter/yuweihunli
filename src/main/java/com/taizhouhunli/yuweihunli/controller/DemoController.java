package com.taizhouhunli.yuweihunli.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taizhouhunli.yuweihunli.model.vo.RespBaseVO;

/**
 * @author wangxiaoyang
 * @Title: ${file_name}
 * @Package ${package_name}
 * @Description: ${todo}
 * @date 2018/9/13 17:34
 */
@RestController
@RequestMapping("/demo")
public class DemoController{

    @GetMapping("/{id}")
    public RespBaseVO<Map> getById(@PathVariable Long id) {
        Map map = new HashMap(1);
        map.put("id", id);
        return new RespBaseVO<>(map);
    }
}
