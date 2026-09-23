package androidx.compose.runtime.internal;

import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.app.mlounge.ui.screens.settings.e0;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d(f fVar, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.e = 1;
        this.y = fVar;
        this.z = obj;
        this.E = bool;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.D = i;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                ((Integer) obj2).getClass();
                ((f) this.y).k(this.z, this.A, this.B, this.C, this.E, (s) obj, t.A(this.D) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((f) this.y).g(this.z, (Boolean) this.E, this.A, this.B, this.C, (s) obj, t.A(this.D) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                e0.n((String) this.y, (String) this.z, (androidx.compose.ui.graphics.vector.f) this.A, (List) this.B, (String) this.C, (kotlin.jvm.functions.l) this.E, (s) obj, t.A(this.D | 1));
                break;
        }
        return y.a;
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.E = obj6;
        this.D = i;
    }
}
