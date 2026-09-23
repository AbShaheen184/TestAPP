package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.os.Handler;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements ValueCallback {
    public final /* synthetic */ v a;
    public final /* synthetic */ CancellableContinuationImpl b;
    public final /* synthetic */ Handler c;
    public final /* synthetic */ l d;
    public final /* synthetic */ v e;
    public final /* synthetic */ WebView f;

    public k(v vVar, CancellableContinuationImpl cancellableContinuationImpl, Handler handler, l lVar, v vVar2, WebView webView) {
        this.a = vVar;
        this.b = cancellableContinuationImpl;
        this.c = handler;
        this.d = lVar;
        this.e = vVar2;
        this.f = webView;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        String string;
        String str = (String) obj;
        Handler handler = this.c;
        String strR = (str == null || (string = kotlin.text.k.g0(str).toString()) == null) ? null : kotlin.text.k.R(string);
        if (strR == null || kotlin.text.k.J(strR) || strR.equals("null") || !kotlin.text.r.u(strR, "http", false)) {
            handler.postDelayed(this.d, 1000L);
            return;
        }
        v vVar = this.a;
        if (vVar.e) {
            return;
        }
        vVar.e = true;
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "Hesgoales source found: ".concat(strR));
        this.b.resumeWith(new r(strR, q.b));
        v vVar2 = this.e;
        WebView webView = this.f;
        if (vVar2.e) {
            return;
        }
        vVar2.e = true;
        handler.post(new i(webView, 1));
    }
}
