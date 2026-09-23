package androidx.compose.runtime;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        switch (this.a) {
            case 0:
                ((s) this.b).A--;
                break;
            default:
                ((androidx.compose.runtime.snapshots.s) this.b).k--;
                break;
        }
    }

    public final void b() {
        switch (this.a) {
            case 0:
                ((s) this.b).A++;
                break;
            default:
                ((androidx.compose.runtime.snapshots.s) this.b).k++;
                break;
        }
    }
}
