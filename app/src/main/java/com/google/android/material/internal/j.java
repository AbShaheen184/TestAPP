package com.google.android.material.internal;

import android.view.View;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ j(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            default:
                return kotlin.comparisons.a.d(((okio.internal.j) obj).a, ((okio.internal.j) obj2).a);
        }
    }
}
