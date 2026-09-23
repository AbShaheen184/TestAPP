package androidx.work.impl.model;

import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ int z;

    public /* synthetic */ h(int i, String str) {
        this.e = 2;
        this.z = i;
        this.y = str;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) throws Exception {
        g gVar;
        switch (this.e) {
            case 0:
                String str = this.y;
                int i = this.z;
                androidx.sqlite.a aVar = (androidx.sqlite.a) obj;
                aVar.getClass();
                androidx.sqlite.c cVarU = aVar.U("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?");
                try {
                    cVarU.s(1, str);
                    cVarU.f(2, i);
                    int iU = _COROUTINE.b.u(cVarU, "work_spec_id");
                    int iU2 = _COROUTINE.b.u(cVarU, "generation");
                    int iU3 = _COROUTINE.b.u(cVarU, "system_id");
                    if (cVarU.Q()) {
                        gVar = new g(cVarU.F(iU), (int) cVarU.getLong(iU2), (int) cVarU.getLong(iU3));
                        break;
                    } else {
                        gVar = null;
                    }
                    return gVar;
                } finally {
                    cVarU.close();
                }
            case 1:
                String str2 = this.y;
                int i2 = this.z;
                androidx.sqlite.a aVar2 = (androidx.sqlite.a) obj;
                aVar2.getClass();
                androidx.sqlite.c cVarU2 = aVar2.U("UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)");
                try {
                    cVarU2.s(1, str2);
                    cVarU2.f(2, i2);
                    cVarU2.Q();
                } finally {
                    cVarU2.close();
                }
                break;
            default:
                int i3 = this.z;
                String str3 = this.y;
                androidx.sqlite.a aVar3 = (androidx.sqlite.a) obj;
                aVar3.getClass();
                androidx.sqlite.c cVarU3 = aVar3.U("UPDATE workspec SET stop_reason=? WHERE id=?");
                try {
                    cVarU3.f(1, i3);
                    cVarU3.s(2, str3);
                    cVarU3.Q();
                } finally {
                    cVarU3.close();
                }
                break;
        }
        return y.a;
    }

    public /* synthetic */ h(String str, int i, int i2) {
        this.e = i2;
        this.y = str;
        this.z = i;
    }
}
