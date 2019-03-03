package com.zzd.vesta.populator;

import com.zzd.vesta.bean.IdMeta;
import com.zzd.vesta.intf.bean.Id;
import com.zzd.vesta.timer.Timer;

/**
 * @author zhangzhidong
 * @create: 2019-03-03 12:06
 */
public interface IdPopulator {

    void populateId(Timer timer, Id id, IdMeta idMeta);
}
