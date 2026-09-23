package androidx.compose.runtime.saveable;

import android.content.Context;
import androidx.appcompat.widget.c2;
import androidx.compose.runtime.a1;
import androidx.lifecycle.m0;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.ui.viewmodel.r;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements kotlin.jvm.functions.a {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ String y;
    public final /* synthetic */ Object z;

    public /* synthetic */ b(a1 a1Var, GameDetailResponse gameDetailResponse, String str, r rVar, a1 a1Var2, Context context) {
        this.z = a1Var;
        this.A = gameDetailResponse;
        this.y = str;
        this.B = rVar;
        this.C = a1Var2;
        this.D = context;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        boolean z;
        switch (this.e) {
            case 0:
                c cVar = (c) this.z;
                k kVar = (k) this.A;
                g gVar = (g) this.B;
                Object[] objArr = (Object[]) this.D;
                boolean z2 = true;
                if (cVar.y != gVar) {
                    cVar.y = gVar;
                    z = true;
                } else {
                    z = false;
                }
                String str = cVar.z;
                String str2 = this.y;
                if (kotlin.jvm.internal.l.a(str, str2)) {
                    z2 = z;
                } else {
                    cVar.z = str2;
                }
                cVar.e = kVar;
                cVar.A = this.C;
                cVar.B = objArr;
                f fVar = cVar.C;
                if (fVar != null && z2) {
                    ((c2) fVar).e0();
                    cVar.C = null;
                    cVar.d();
                }
                break;
            default:
                a1 a1Var = (a1) this.z;
                GameDetailResponse gameDetailResponse = (GameDetailResponse) this.A;
                r rVar = (r) this.B;
                a1 a1Var2 = (a1) this.C;
                Context context = (Context) this.D;
                if (!((Boolean) a1Var2.getValue()).booleanValue() && !((Boolean) a1Var.getValue()).booleanValue()) {
                    String strJ = gameDetailResponse.j();
                    if (strJ == null) {
                        strJ = this.y;
                    }
                    String str3 = strJ;
                    androidx.compose.animation.core.a aVar = new androidx.compose.animation.core.a(21, a1Var, gameDetailResponse, context);
                    if (!((Boolean) rVar.q.getValue()).booleanValue()) {
                        BuildersKt__Builders_commonKt.launch$default(m0.g(rVar), null, null, new androidx.compose.animation.core.f(rVar, (GamePlatform) rVar.u.getValue(), str3, aVar, null, 20), 3, null);
                    }
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ b(c cVar, k kVar, g gVar, String str, Object obj, Object[] objArr) {
        this.z = cVar;
        this.A = kVar;
        this.B = gVar;
        this.y = str;
        this.C = obj;
        this.D = objArr;
    }
}
