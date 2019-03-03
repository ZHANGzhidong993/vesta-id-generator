package com.zzd.vesta.converter;


import com.zzd.vesta.bean.IdMeta;
import com.zzd.vesta.intf.bean.Id;

public interface IdConverter {

    long convert(Id id, IdMeta idMeta);

    Id convert(long id, IdMeta idMeta);

}
