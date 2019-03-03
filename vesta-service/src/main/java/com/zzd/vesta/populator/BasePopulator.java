package com.zzd.vesta.populator;


import com.zzd.vesta.bean.IdMeta;
import com.zzd.vesta.intf.bean.Id;
import com.zzd.vesta.timer.Timer;

public abstract class BasePopulator implements IdPopulator, ResetPopulator {

    protected long sequence = 0L;

    protected long lastTimestamp = -1L;

    public BasePopulator() {

    }

    public void populateId(Timer timer, Id id, IdMeta idMeta) {
        long timestamp = timer.genTime();
        timer.validateTimestamp(lastTimestamp, timestamp);

        if (timestamp == lastTimestamp) {
            sequence++;
            sequence &= idMeta.getSeqBitsMask();
            if (sequence == 0) {
                timestamp = timer.tillNextTimeUnit(lastTimestamp);
            }
        } else {
            lastTimestamp = timestamp;
            sequence = 0;
        }

        id.setSeq(sequence);
        id.setTime(timestamp);
    }

    public void reset() {
        this.sequence = 0;
        this.lastTimestamp = -1;
    }
}
