package androidx.datastore.core;

import com.google.firebase.crashlytics.internal.model.t1;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Serializable e;
    public Iterator y;
    public /* synthetic */ Object z;

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.A |= Integer.MIN_VALUE;
        return t1.f(null, null, this);
    }
}
