package com.app.mlounge.ui.screens.settings;

import androidx.compose.material3.d3;
import androidx.compose.runtime.a1;
import androidx.lifecycle.m0;
import com.app.mlounge.ui.viewmodel.j1;
import com.app.mlounge.ui.viewmodel.p1;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.l {
    public final /* synthetic */ int e;
    public final /* synthetic */ p1 y;
    public final /* synthetic */ a1 z;

    public /* synthetic */ d(p1 p1Var, a1 a1Var, int i) {
        this.e = i;
        this.y = p1Var;
        this.z = a1Var;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    this.y.f(true);
                    this.z.setValue(Boolean.FALSE);
                }
                return kotlin.y.a;
            case 1:
                String str = (String) obj;
                str.getClass();
                p1 p1Var = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var), null, null, new j1(p1Var, str, null, 3), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
            case 2:
                float fFloatValue = ((Float) obj).floatValue();
                p1 p1Var2 = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var2), null, null, new d3(p1Var2, fFloatValue, null, 2), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
            default:
                String str2 = (String) obj;
                str2.getClass();
                p1 p1Var3 = this.y;
                BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var3), null, null, new j1(p1Var3, str2, null, 2), 3, null);
                this.z.setValue(Boolean.FALSE);
                break;
        }
        return kotlin.y.a;
    }
}
