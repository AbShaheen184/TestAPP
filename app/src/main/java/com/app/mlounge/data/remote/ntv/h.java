package com.app.mlounge.data.remote.ntv;

import android.os.Handler;
import android.view.KeyEvent;
import android.webkit.WebView;
import androidx.compose.runtime.a1;
import androidx.lifecycle.m0;
import com.app.mlounge.ui.viewmodel.j1;
import com.app.mlounge.ui.viewmodel.p1;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.c0;
import kotlin.jvm.internal.v;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        boolean z;
        switch (this.e) {
            case 0:
                v vVar = (v) this.y;
                Handler handler = (Handler) this.z;
                WebView webView = (WebView) this.A;
                if (!vVar.e) {
                    vVar.e = true;
                    handler.post(new i(webView, 0));
                }
                return y.a;
            case 1:
                v vVar2 = (v) this.y;
                Handler handler2 = (Handler) this.z;
                WebView webView2 = (WebView) this.A;
                if (!vVar2.e) {
                    vVar2.e = true;
                    handler2.post(new i(webView2, 1));
                }
                return y.a;
            default:
                KeyEvent keyEvent = ((androidx.compose.ui.input.key.b) obj).a;
                keyEvent.getClass();
                a1 a1Var = (a1) this.A;
                if (((String) a1Var.getValue()) == null || keyEvent.getAction() != 0) {
                    z = false;
                } else {
                    int keyCode = keyEvent.getKeyCode();
                    z = true;
                    kotlin.coroutines.d dVar = null;
                    if (keyCode == 4) {
                        a1Var.setValue(null);
                    } else {
                        LinkedHashMap linkedHashMapP = c0.p((Map) this.y);
                        String str = (String) a1Var.getValue();
                        str.getClass();
                        linkedHashMapP.put(str, Integer.valueOf(keyCode));
                        String string = new JSONObject(c0.o(linkedHashMapP)).toString();
                        string.getClass();
                        p1 p1Var = (p1) this.z;
                        BuildersKt__Builders_commonKt.launch$default(m0.g(p1Var), null, null, new j1(p1Var, string, dVar, 4), 3, null);
                        a1Var.setValue(null);
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
