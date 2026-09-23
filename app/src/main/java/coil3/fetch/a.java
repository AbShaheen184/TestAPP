package coil3.fetch;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil3.p;
import coil3.request.n;
import coil3.util.m;
import coil3.v;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i) {
        this.a = i;
    }

    @Override // coil3.fetch.h
    public final i a(Object obj, n nVar, p pVar) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.a) {
            case 0:
                v vVar = (v) obj;
                Bitmap.Config[] configArr = m.a;
                if (l.a(vVar.c, "file") && l.a(kotlin.collections.p.D(coil3.l.g(vVar)), "android_asset")) {
                    return new b(vVar, nVar, i);
                }
                return null;
            case 1:
                return new c((Bitmap) obj);
            case 2:
                return new d((byte[]) obj, nVar, i);
            case 3:
                return new d((ByteBuffer) obj, nVar, i2);
            case 4:
                v vVar2 = (v) obj;
                if (l.a(vVar2.c, "content")) {
                    return new f(vVar2, nVar);
                }
                return null;
            case 5:
                v vVar3 = (v) obj;
                if (l.a(vVar3.c, "data")) {
                    return new b(vVar3, nVar, i2);
                }
                return null;
            case 6:
                return new d((Drawable) obj, nVar, i3);
            case 7:
                v vVar4 = (v) obj;
                String str = vVar4.c;
                if ((str != null && !str.equals("file")) || vVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = m.a;
                if (l.a(vVar4.c, "file") && l.a(kotlin.collections.p.D(coil3.l.g(vVar4)), "android_asset")) {
                    return null;
                }
                return new b(vVar4, nVar, i3);
            case 8:
                v vVar5 = (v) obj;
                if (l.a(vVar5.c, "jar:file")) {
                    return new b(vVar5, nVar, 3);
                }
                return null;
            default:
                v vVar6 = (v) obj;
                if (l.a(vVar6.c, "android.resource")) {
                    return new b(vVar6, nVar, 4);
                }
                return null;
        }
    }
}
