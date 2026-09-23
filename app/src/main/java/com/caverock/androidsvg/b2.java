package com.caverock.androidsvg;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b2 {
    public static final HashMap a;

    static {
        HashMap map = new HashMap(9);
        a = map;
        map.put("xx-small", new c0(7, 0.694f));
        map.put("x-small", new c0(7, 0.833f));
        map.put("small", new c0(7, 10.0f));
        map.put("medium", new c0(7, 12.0f));
        map.put("large", new c0(7, 14.4f));
        map.put("x-large", new c0(7, 17.3f));
        map.put("xx-large", new c0(7, 20.7f));
        map.put("smaller", new c0(9, 83.33f));
        map.put("larger", new c0(9, 120.0f));
    }
}
