package androidx.compose.ui.text.platform;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.p;
import androidx.compose.runtime.n;
import androidx.compose.ui.text.font.t;
import java.util.Map;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.w;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements r {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ c(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.e) {
            case 0:
                d dVar = (d) this.y;
                t tVarB = ((androidx.compose.ui.text.font.e) dVar.B).b((androidx.compose.ui.text.font.r) obj, (androidx.compose.ui.text.font.k) obj2, ((androidx.compose.ui.text.font.i) obj3).a, ((androidx.compose.ui.text.font.j) obj4).a);
                if (tVarB instanceof t) {
                    Object obj5 = tVarB.e;
                    obj5.getClass();
                    return (Typeface) obj5;
                }
                c2 c2Var = new c2(tVarB, dVar.G);
                dVar.G = c2Var;
                Object obj6 = c2Var.A;
                obj6.getClass();
                return (Typeface) obj6;
            case 1:
                androidx.sqlite.db.d dVar2 = (androidx.sqlite.db.d) this.y;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                dVar2.G(new androidx.sqlite.db.framework.h(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 2:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((r) this.y).invoke(str, str2, (Map) obj3, (String) obj4);
                return y.a;
            case 3:
                final s sVar = (s) this.y;
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zF = sVar2.f(sVar);
                Object objQ = sVar2.Q();
                if (zF || objQ == n.a) {
                    final int i = 1;
                    objQ = new s() { // from class: com.app.mlounge.ui.x
                        @Override // kotlin.jvm.functions.s
                        public final Object d(Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                            switch (i) {
                                case 0:
                                    kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) sVar;
                                    String str3 = (String) obj7;
                                    String str4 = (String) obj8;
                                    Integer num = (Integer) obj9;
                                    num.getClass();
                                    Integer num2 = (Integer) obj10;
                                    int iIntValue = num2.intValue();
                                    Integer num3 = (Integer) obj11;
                                    num3.getClass();
                                    str3.getClass();
                                    str4.getClass();
                                    wVar.c(str3, str4, null, iIntValue > 0 ? "tv" : "movie", "mp4", num, num2, num3, "");
                                    break;
                                default:
                                    String str5 = (String) obj7;
                                    String str6 = (String) obj8;
                                    str5.getClass();
                                    str6.getClass();
                                    ((kotlin.jvm.functions.s) sVar).d(str5, str6, (Map) obj9, (String) obj10, (String) obj11);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar2.l0(objQ);
                }
                com.app.mlounge.ui.screens.livetv.a.c((s) objQ, null, sVar2, 0);
                return y.a;
            default:
                final w wVar = (w) this.y;
                androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                ((Integer) obj4).getClass();
                ((p) obj).getClass();
                ((androidx.navigation.i) obj2).getClass();
                boolean zF2 = sVar3.f(wVar);
                Object objQ2 = sVar3.Q();
                if (zF2 || objQ2 == n.a) {
                    final int i2 = 0;
                    objQ2 = new s() { // from class: com.app.mlounge.ui.x
                        @Override // kotlin.jvm.functions.s
                        public final Object d(Object obj7, Object obj8, Object obj9, Object obj10, Object obj11) {
                            switch (i2) {
                                case 0:
                                    kotlin.jvm.functions.w wVar2 = (kotlin.jvm.functions.w) wVar;
                                    String str3 = (String) obj7;
                                    String str4 = (String) obj8;
                                    Integer num = (Integer) obj9;
                                    num.getClass();
                                    Integer num2 = (Integer) obj10;
                                    int iIntValue = num2.intValue();
                                    Integer num3 = (Integer) obj11;
                                    num3.getClass();
                                    str3.getClass();
                                    str4.getClass();
                                    wVar2.c(str3, str4, null, iIntValue > 0 ? "tv" : "movie", "mp4", num, num2, num3, "");
                                    break;
                                default:
                                    String str5 = (String) obj7;
                                    String str6 = (String) obj8;
                                    str5.getClass();
                                    str6.getClass();
                                    ((kotlin.jvm.functions.s) wVar).d(str5, str6, (Map) obj9, (String) obj10, (String) obj11);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    sVar3.l0(objQ2);
                }
                com.app.mlounge.ui.screens.downloads.a.b((s) objQ2, null, sVar3, 0);
                return y.a;
        }
    }
}
