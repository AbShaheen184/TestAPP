package com.app.mlounge.ui;

import android.content.Context;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.w2;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements kotlin.jvm.functions.s {
    public final /* synthetic */ w2 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ i(Context context, androidx.navigation.y yVar, a1 a1Var, a1 a1Var2) {
        this.B = context;
        this.y = yVar;
        this.z = a1Var;
        this.A = a1Var2;
    }

    @Override // kotlin.jvm.functions.s
    public final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        switch (this.e) {
            case 0:
                kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.B;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                Integer num = (Integer) obj4;
                int iIntValue = num.intValue();
                Integer num2 = (Integer) obj5;
                int iIntValue2 = num2.intValue();
                str.getClass();
                str2.getClass();
                str3.getClass();
                if (((Boolean) this.A.getValue()).booleanValue()) {
                    Integer numW = kotlin.text.r.w(str2);
                    wVar.c("", str3, null, "tv", null, Integer.valueOf(numW != null ? numW.intValue() : 0), num, num2, "");
                } else {
                    a1 a1Var = this.z;
                    if (!f0.b(a1Var)) {
                        a1Var.setValue(Boolean.TRUE);
                        androidx.navigation.y.b(this.y, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, iIntValue, iIntValue2, 32));
                    }
                }
                break;
            default:
                Context context = (Context) this.B;
                androidx.navigation.y yVar = this.y;
                w2 w2Var = this.A;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                Map map = (Map) obj3;
                String str6 = (String) obj4;
                String str7 = (String) obj5;
                str4.getClass();
                str5.getClass();
                a1 a1Var2 = this.z;
                if (!f0.b(a1Var2)) {
                    a1Var2.setValue(Boolean.TRUE);
                    try {
                        String str8 = (String) w2Var.getValue();
                        if (str8 == null || kotlin.text.k.J(str8)) {
                            String str9 = str7;
                            if (str9 == null) {
                                str9 = "";
                            }
                            f0.g(yVar, str4, str5, map, "live", str6, 0, 0, 0, null, str9, 512);
                        } else {
                            f0.e(context, str4, str5, map, str8, 0L);
                            a1Var2.setValue(Boolean.FALSE);
                        }
                    } catch (Exception unused) {
                        a1Var2.setValue(Boolean.FALSE);
                    }
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ i(kotlin.jvm.functions.w wVar, androidx.navigation.y yVar, w2 w2Var, a1 a1Var) {
        this.B = wVar;
        this.y = yVar;
        this.A = w2Var;
        this.z = a1Var;
    }
}
