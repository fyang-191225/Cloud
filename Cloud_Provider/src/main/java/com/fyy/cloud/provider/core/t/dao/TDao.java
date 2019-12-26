package com.fyy.cloud.provider.core.t.dao;

import com.fyy.cloud.provider.config.T;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author fyy
 * @date 2019/12/26 0026 下午 15:11
 */
public interface TDao {

    @Select("")
    List<T> select();

    @Insert("")
    int insesrt();

    @Delete("")
    int delete();

    @Update("")
    int update();
}
