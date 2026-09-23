package androidx.compose.foundation.lazy;

import androidx.compose.runtime.a1;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ a1 y;

    public /* synthetic */ m(a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        switch (this.e) {
            case 0:
                return new j((kotlin.jvm.functions.l) this.y.getValue());
            case 1:
                return new androidx.compose.foundation.lazy.grid.h((kotlin.jvm.functions.l) this.y.getValue());
            case 2:
                return (androidx.compose.foundation.lazy.layout.y) ((kotlin.jvm.functions.a) this.y.getValue()).invoke();
            case 3:
                Boolean bool = (Boolean) this.y.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                androidx.compose.ui.layout.x xVar = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar != null) {
                    return xVar;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.firebase.platforminfo.b.b();
                return null;
            case 5:
                androidx.compose.ui.layout.x xVar2 = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar2 != null) {
                    return xVar2;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.firebase.platforminfo.b.b();
                return null;
            case 6:
                androidx.compose.ui.layout.x xVar3 = (androidx.compose.ui.layout.x) this.y.getValue();
                if (xVar3 != null) {
                    return xVar3;
                }
                androidx.compose.foundation.internal.b.d("Required value was null.");
                com.google.firebase.platforminfo.b.b();
                return null;
            case 7:
                return (androidx.compose.ui.layout.x) this.y.getValue();
            case 8:
                a1 a1Var = this.y;
                a1Var.setValue(Boolean.valueOf(!((Boolean) a1Var.getValue()).booleanValue()));
                return kotlin.y.a;
            case 9:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 10:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 11:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 12:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 13:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 14:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 15:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 16:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 17:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 18:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 19:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 20:
                this.y.setValue(null);
                return kotlin.y.a;
            case 21:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            case 22:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 23:
                a1 a1Var2 = this.y;
                a1Var2.setValue(Boolean.valueOf(!((Boolean) a1Var2.getValue()).booleanValue()));
                return kotlin.y.a;
            case 24:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 25:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 26:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
            case 27:
                this.y.setValue(null);
                return kotlin.y.a;
            case 28:
                this.y.setValue(Boolean.TRUE);
                return kotlin.y.a;
            default:
                this.y.setValue(Boolean.FALSE);
                return kotlin.y.a;
        }
    }
}
