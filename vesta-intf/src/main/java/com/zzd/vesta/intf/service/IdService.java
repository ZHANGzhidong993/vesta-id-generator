package com.zzd.vesta.intf.service;

import com.zzd.vesta.intf.bean.Id;

import java.util.Date;

/**
 * 发号器接口
 *
 * @author zhangzhidong
 * @create: 2019-03-03 00:14
 */
public interface IdService {

    /**
     * 生成唯一id
     *
     * @return
     */
    long genId();

    /**
     * 反向解析一个id的内容
     *
     * @param id
     * @return
     */
    Id expId(long id);

    /**
     * 生成id
     *
     * @param time
     * @param seq
     * @return
     */
    long makeId(long time, long seq);

    /**
     * 生成id
     *
     * @param time
     * @param seq
     * @param machine
     * @return
     */
    long makeId(long time, long seq, long machine);

    /**
     * 生成id
     *
     * @param genMethod
     * @param time
     * @param seq
     * @param machine
     * @return
     */
    long makeId(long genMethod, long time, long seq, long machine);

    /**
     * 生成id
     *
     * @param type
     * @param genMethod
     * @param time
     * @param seq
     * @param machine
     * @return
     */
    long makeId(long type, long genMethod, long time, long seq, long machine);

    /**
     * 生成id
     *
     * @param version
     * @param type
     * @param genMethod
     * @param time
     * @param seq
     * @param machine
     * @return
     */
    long makeId(long version, long type, long genMethod, long time, long seq, long machine);

    /**
     * 时间转换
     *
     * @param time
     * @return
     */
    Date transTime(long time);

}
