package com.zzd.vesta.populator;


import com.zzd.vesta.bean.IdMeta;
import com.zzd.vesta.intf.bean.Id;
import com.zzd.vesta.timer.Timer;

public class SyncIdPopulator extends BasePopulator {

    public SyncIdPopulator() {
        super();
    }

    public synchronized void populateId(Timer timer, Id id, IdMeta idMeta) {
        super.populateId(timer, id, idMeta);
    }

}
