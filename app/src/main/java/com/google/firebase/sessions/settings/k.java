package com.google.firebase.sessions.settings;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements FlowCollector, kotlin.jvm.internal.g {
    public final /* synthetic */ AtomicReference e;

    public k(AtomicReference atomicReference) {
        this.e = atomicReference;
    }

    @Override // kotlin.jvm.internal.g
    public final kotlin.d b() {
        return new kotlin.jvm.internal.a(2, 4, AtomicReference.class, this.e, "set", "set(Ljava/lang/Object;)V");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, kotlin.coroutines.d dVar) {
        this.e.set((g) obj);
        return y.a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof FlowCollector) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
