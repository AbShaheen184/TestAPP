package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends WebViewClient {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ v b;
    public final /* synthetic */ WebView c;
    public final /* synthetic */ CancellableContinuationImpl d;
    public final /* synthetic */ v e;

    public m(Handler handler, WebView webView, v vVar, v vVar2, CancellableContinuationImpl cancellableContinuationImpl) {
        this.a = handler;
        this.b = vVar;
        this.c = webView;
        this.d = cancellableContinuationImpl;
        this.e = vVar2;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "Hesgoales page finished: " + str);
        v vVar = this.b;
        WebView webView2 = this.c;
        CancellableContinuationImpl cancellableContinuationImpl = this.d;
        Handler handler = this.a;
        handler.postDelayed(new l(handler, webView2, vVar, this.e, cancellableContinuationImpl), 2000L);
    }
}
