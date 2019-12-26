package com.fyy.cloud.provider.core.t.service.impl;

import com.fyy.cloud.common.vo.R;
import com.fyy.cloud.provider.core.t.dao.TDao;
import com.fyy.cloud.provider.core.t.service.TService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:11
 */
@Service
public class TServiceImpl implements TService {

    @Autowired
    private TDao tDao;

    @Override
    public R T() {
        return R.ok();
    }
}
