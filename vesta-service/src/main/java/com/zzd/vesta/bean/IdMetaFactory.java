package com.zzd.vesta.bean;

public class IdMetaFactory {
    /**
     * 最大峰值型
     * 机器码：0-9
     * 序列号：10-29
     * 时间（秒级）：30-59
     * 生成方式:60
     * 类型：61
     * 版本号：62
     */
    private static IdMeta maxPeak = new IdMeta((byte) 10, (byte) 20, (byte) 30, (byte) 1, (byte) 1, (byte) 1);
    /**
     * 最小粒度型
     * 机器码：0-9
     * 序列号：10-19
     * 时间（毫秒级）：20-59
     * 生成方式：60
     * 类型：61
     * 版本号：62
     */
    private static IdMeta minGranularity = new IdMeta((byte) 10, (byte) 10, (byte) 40, (byte) 1, (byte) 1, (byte) 1);

    private static IdMeta shortId = new IdMeta((byte) 10, (byte) 10, (byte) 30, (byte) 1, (byte) 1, (byte) 1);

    public static IdMeta getIdMeta(IdType type) {
        if (IdType.SECONDS.equals(type)) {
            return maxPeak;
        } else if (IdType.MILLISECONDS.equals(type)) {
            return minGranularity;
        } else if (IdType.SHORTID.equals(type)) {
            return shortId;
        }
        return null;
    }
}
