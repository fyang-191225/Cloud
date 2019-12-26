package com.fyy.cloud.provider.web;

import com.fyy.cloud.common.vo.R;
import com.fyy.cloud.provider.core.t.service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:22
 */
@RestController
public class TController {
    @Autowired
    private TService tService;

    @GetMapping("")
    public R T(){
        return null;
    }

}
