package androidx.media3.exoplayer.dash.manifest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public a(long j, int i, ArrayList arrayList, List list, List list2, List list3) {
        this.a = j;
        this.b = i;
        this.c = Collections.unmodifiableList(arrayList);
        this.d = Collections.unmodifiableList(list);
        this.e = Collections.unmodifiableList(list2);
        this.f = Collections.unmodifiableList(list3);
    }
}
