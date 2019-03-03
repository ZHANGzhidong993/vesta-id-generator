package com.zzd.vesta.bean;

/**
 * ID类型
 *
 * 最大峰值型
 * 秒级有序
 *
 * 最小粒度型
 * 毫秒级有序
 */
public enum IdType {

    SECONDS("seconds"), MILLISECONDS("milliseconds"), SHORTID("short_id");

    private String name;

    IdType(String name) {
        this.name = name;
    }

    public long value() {
        switch (this) {
            case SECONDS:
                return 0;
            case MILLISECONDS:
                return 1;
            case SHORTID:
                return 2;
            default:
                return 0;
        }
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static IdType parse(String name) {
        if ("seconds".equals(name)) {
            return SECONDS;
        } else if ("milliseconds".equals(name)) {
            return MILLISECONDS;
        } else if ("short_id".equals(name)) {
            return SHORTID;
        }
        throw new IllegalArgumentException("Illegal IdType name <[" + name
                + "]>, use 'seconds' or 'milliseconds' or 'short_id'");
    }

    public static IdType parse(long type) {
        if (type == 1) {
            return MILLISECONDS;
        } else if (type == 0) {
            return SECONDS;
        } else if (type == 2) {
            return SHORTID;
        }

        throw new IllegalArgumentException("Illegal IdType value <[" + type
                + "]>, use 0 (for seconds) or 1 (for milliseconds) or 2 (for short_id)");
    }
}
