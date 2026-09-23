package androidx.compose.ui.graphics.vector;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    public kotlin.jvm.functions.l a;

    public abstract void a(androidx.compose.ui.graphics.drawscope.d dVar);

    public kotlin.jvm.functions.l b() {
        return this.a;
    }

    public final void c() {
        kotlin.jvm.functions.l lVarB = b();
        if (lVarB != null) {
            lVarB.invoke(this);
        }
    }

    public void d(androidx.compose.animation.e eVar) {
        this.a = eVar;
    }
}
