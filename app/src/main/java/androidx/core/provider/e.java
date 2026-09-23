package androidx.core.provider;

import android.content.Context;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e(String str, Context context, Object obj, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = context;
        this.e = obj;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                Object[] objArr = {(d) this.e};
                ArrayList arrayList = new ArrayList(1);
                Object obj = objArr[0];
                return h.b(this.b, this.c, androidx.compose.runtime.j.r(obj, arrayList, obj, arrayList), this.d);
            default:
                try {
                    return h.b(this.b, this.c, (ArrayList) this.e, this.d);
                } catch (Throwable unused) {
                    return new g(-3);
                }
        }
    }
}
