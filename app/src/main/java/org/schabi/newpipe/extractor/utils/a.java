package org.schabi.newpipe.extractor.utils;

import com.google.android.gms.internal.measurement.e3;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.measurement.internal.f0;
import com.google.android.gms.measurement.internal.w;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements w {
    public static final /* synthetic */ a e = new a();

    @Override // com.google.android.gms.measurement.internal.w
    public Object a() {
        List list = f0.a;
        e3.y.get();
        return Integer.valueOf((int) ((Long) f3.a.g(46, 5L, "measurement.sgtm.upload.batches_retrieval_limit").get()).longValue());
    }
}
