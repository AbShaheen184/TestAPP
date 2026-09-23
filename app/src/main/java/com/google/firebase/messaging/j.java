package com.google.firebase.messaging;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static final com.google.android.datatransport.runtime.j a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(j.class, c.a);
        map2.remove(j.class);
        map.put(com.google.firebase.messaging.reporting.e.class, b.a);
        map2.remove(com.google.firebase.messaging.reporting.e.class);
        map.put(com.google.firebase.messaging.reporting.d.class, a.a);
        map2.remove(com.google.firebase.messaging.reporting.d.class);
        a = new com.google.android.datatransport.runtime.j(19, new HashMap(map), new HashMap(map2), com.google.firebase.encoders.proto.g.a);
    }
}
