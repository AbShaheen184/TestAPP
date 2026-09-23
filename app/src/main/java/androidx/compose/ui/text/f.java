package androidx.compose.ui.text;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparator {
    public final /* synthetic */ int e;

    public /* synthetic */ f(int i) {
        this.e = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                break;
        }
        return kotlin.comparisons.a.d(Integer.valueOf(((e) obj).b), Integer.valueOf(((e) obj2).b));
    }
}
