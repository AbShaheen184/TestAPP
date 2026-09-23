package com.caverock.androidsvg;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements e {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.caverock.androidsvg.e
    public final boolean a(w0 w0Var) {
        switch (this.a) {
            case 0:
                return !(w0Var instanceof u0) || ((u0) w0Var).getChildren().size() == 0;
            case 1:
                return w0Var.b == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
