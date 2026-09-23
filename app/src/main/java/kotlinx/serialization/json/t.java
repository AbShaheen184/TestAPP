package kotlinx.serialization.json;

import java.util.List;
import kotlin.collections.i0;
import kotlinx.serialization.internal.c0;
import kotlinx.serialization.internal.y0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements kotlinx.serialization.descriptors.e {
    public static final t b = new t();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ c0 a;

    public t() {
        y0 y0Var = y0.a;
        k kVar = k.a;
        y0 y0Var2 = y0.a;
        this.a = new c0(y0.b, kVar.d());
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String a() {
        return c;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean c() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final i0 e() {
        this.a.getClass();
        return kotlinx.serialization.descriptors.i.d;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final int f() {
        this.a.getClass();
        return 2;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final String g(int i) {
        this.a.getClass();
        return String.valueOf(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List getAnnotations() {
        this.a.getClass();
        return kotlin.collections.w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final List h(int i) {
        this.a.h(i);
        return kotlin.collections.w.e;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final kotlinx.serialization.descriptors.e i(int i) {
        return this.a.i(i);
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean isInline() {
        this.a.getClass();
        return false;
    }

    @Override // kotlinx.serialization.descriptors.e
    public final boolean j(int i) {
        this.a.j(i);
        return false;
    }
}
