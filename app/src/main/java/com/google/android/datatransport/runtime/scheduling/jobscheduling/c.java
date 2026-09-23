package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public static final /* synthetic */ c[] A;
    public static final c e;
    public static final c y;
    public static final c z;

    static {
        c cVar = new c("NETWORK_UNMETERED", 0);
        e = cVar;
        c cVar2 = new c("DEVICE_IDLE", 1);
        y = cVar2;
        c cVar3 = new c("DEVICE_CHARGING", 2);
        z = cVar3;
        A = new c[]{cVar, cVar2, cVar3};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) A.clone();
    }
}
