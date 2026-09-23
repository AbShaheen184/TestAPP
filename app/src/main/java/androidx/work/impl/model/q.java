package androidx.work.impl.model;

import androidx.compose.runtime.w2;
import kotlin.collections.i0;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ Object z;

    public /* synthetic */ q(String str, long j) {
        this.e = 2;
        this.z = str;
        this.y = j;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        switch (this.e) {
            case 0:
                long j = this.y;
                String str = (String) this.z;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    cVarU.f(1, j);
                    cVarU.s(2, str);
                    cVarU.Q();
                    return Integer.valueOf(_COROUTINE.a.S(aVar));
                } finally {
                    cVarU.close();
                }
            case 1:
                long j2 = this.y;
                String str2 = (String) this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    cVarU2.f(1, j2);
                    cVarU2.s(2, str2);
                    cVarU2.Q();
                    return y.a;
                } finally {
                    cVarU2.close();
                }
            case 2:
                String str3 = (String) this.z;
                long j3 = this.y;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("UPDATE downloads SET status = 'failed', failureReason = ? WHERE id = ?");
                try {
                    cVarU3.s(1, str3);
                    cVarU3.f(2, j3);
                    cVarU3.Q();
                    return y.a;
                } finally {
                    cVarU3.close();
                }
            default:
                androidx.compose.ui.graphics.drawscope.d.G((androidx.compose.ui.graphics.drawscope.d) obj, this.y, 0L, 0L, i0.c(((Number) ((w2) this.z).getValue()).floatValue(), 0.0f, 1.0f), Token.AND);
                return y.a;
        }
    }

    public /* synthetic */ q(long j, Object obj, int i) {
        this.e = i;
        this.y = j;
        this.z = obj;
    }
}
