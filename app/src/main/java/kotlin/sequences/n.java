package kotlin.sequences;

import androidx.core.view.d0;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements h {
    public final /* synthetic */ int a;
    public final h b;
    public final kotlin.jvm.functions.l c;

    public /* synthetic */ n(h hVar, kotlin.jvm.functions.l lVar, int i) {
        this.a = i;
        this.b = hVar;
        this.c = lVar;
    }

    @Override // kotlin.sequences.h
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new f(this);
            default:
                return new d0(this);
        }
    }
}
