package com.fyy.cloud.costomer.service;

import com.fyy.cloud.common.vo.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 16:00
 */
@FeignClient("provider")
public interface TService {

    @GetMapping("")
    public R T();

}
