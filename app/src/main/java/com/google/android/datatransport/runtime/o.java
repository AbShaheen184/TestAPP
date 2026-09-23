package com.google.android.datatransport.runtime;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements com.google.android.datatransport.runtime.dagger.internal.b {
    public final /* synthetic */ int a;

    @Override // javax.inject.a
    public final Object get() {
        Set setUnmodifiableSet;
        switch (this.a) {
            case 0:
                return new androidx.work.impl.utils.taskexecutor.b(Executors.newSingleThreadExecutor(), 1);
            default:
                com.google.android.material.shape.f fVar = new com.google.android.material.shape.f(20);
                HashMap map = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    map.put(com.google.android.datatransport.d.e, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(30000L, 86400000L, set));
                    if (set != null) {
                        map.put(com.google.android.datatransport.d.z, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(1000L, 86400000L, set));
                        if (set == null || (setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(com.google.android.datatransport.runtime.scheduling.jobscheduling.c.y)))) == null) {
                            com.google.firebase.platforminfo.b.h("Null flags");
                        } else {
                            map.put(com.google.android.datatransport.d.y, new com.google.android.datatransport.runtime.scheduling.jobscheduling.b(86400000L, 86400000L, setUnmodifiableSet));
                            if (map.keySet().size() >= com.google.android.datatransport.d.values().length) {
                                new HashMap();
                                return new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(fVar, map);
                            }
                            kotlinx.coroutines.future.a.u("Not all priorities have been configured");
                        }
                    } else {
                        com.google.firebase.platforminfo.b.h("Null flags");
                    }
                } else {
                    com.google.firebase.platforminfo.b.h("Null flags");
                }
                return null;
        }
    }
}
