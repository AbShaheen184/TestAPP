package androidx.compose.runtime.tooling;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final List a;

    public a(List list) {
        this.a = list;
    }

    public final boolean a() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((b) list.get(i)).getClass();
        }
        return false;
    }
}
