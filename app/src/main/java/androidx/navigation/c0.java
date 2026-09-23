package androidx.navigation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public final a0 a;
    public boolean b;
    public boolean c;
    public int d;
    public String e;
    public boolean f;
    public boolean g;

    public c0() {
        a0 a0Var = new a0();
        a0Var.a = -1;
        a0Var.e = -1;
        a0Var.f = -1;
        this.a = a0Var;
        this.d = -1;
    }

    public final void a(String str) {
        if (str != null) {
            if (kotlin.text.k.J(str)) {
                kotlinx.coroutines.future.a.q("Cannot pop up to an empty route");
            } else {
                this.e = str;
                this.f = false;
            }
        }
    }
}
