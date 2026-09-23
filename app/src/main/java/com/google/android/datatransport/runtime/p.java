package com.google.android.datatransport.runtime;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static final j a;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        map.put(p.class, f.a);
        map2.remove(p.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.a.class, b.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.a.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.g.class, h.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.g.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.e.class, e.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.e.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.d.class, d.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.d.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.b.class, c.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.b.class);
        map.put(com.google.android.datatransport.runtime.firebase.transport.f.class, g.a);
        map2.remove(com.google.android.datatransport.runtime.firebase.transport.f.class);
        a = new j(19, new HashMap(map), new HashMap(map2), com.google.firebase.encoders.proto.g.a);
    }
}
