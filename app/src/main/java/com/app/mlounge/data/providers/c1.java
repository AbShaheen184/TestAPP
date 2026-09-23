package com.app.mlounge.data.providers;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Iterator;
import java.util.regex.Pattern;
import kotlinx.coroutines.CompletableDeferred;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends WebViewClient {
    final /* synthetic */ CompletableDeferred<Boolean> $deferred;
    final /* synthetic */ f1 this$0;

    public c1(CompletableDeferred completableDeferred, f1 f1Var) {
        this.$deferred = completableDeferred;
        this.this$0 = f1Var;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        int iG;
        if (this.$deferred.isCompleted()) {
            return;
        }
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "NoodleMag", "warmupWithWebView: page loaded " + str);
        String cookie = CookieManager.getInstance().getCookie("https://noodlemagazine.com");
        if (cookie != null) {
            Iterator it = kotlin.text.k.U(cookie, new String[]{";"}, 6).iterator();
            while (it.hasNext()) {
                String string = kotlin.text.k.g0((String) it.next()).toString();
                if (string.length() != 0 && (iG = kotlin.text.k.G(string, '=', 0, 6)) >= 0) {
                    String strSubstring = string.substring(0, iG);
                    String strSubstring2 = string.substring(iG + 1);
                    com.google.android.material.shape.y yVar = new com.google.android.material.shape.y(1);
                    yVar.f(null, "https://noodlemagazine.com");
                    String str2 = strSubstring + "=" + strSubstring2 + "; path=/; domain=" + yVar.c().d;
                    Pattern pattern = okhttp3.m.k;
                    com.google.android.material.shape.y yVar2 = new com.google.android.material.shape.y(1);
                    yVar2.f(null, "https://noodlemagazine.com");
                    okhttp3.m mVarE = dagger.hilt.android.internal.b.e(yVar2.c(), str2);
                    if (mVarE != null) {
                        x0 x0Var = this.this$0.cookieJar;
                        com.google.android.material.shape.y yVar3 = new com.google.android.material.shape.y(1);
                        yVar3.f(null, "https://noodlemagazine.com");
                        x0Var.a(yVar3.c(), kotlin.collections.q.j(mVarE));
                    }
                }
            }
            Context context2 = com.app.mlounge.util.a.a;
            com.app.mlounge.util.a.a("D", "NoodleMag", "warmupWithWebView: synced cookies");
        }
        if (webView != null) {
            webView.destroy();
        }
        this.$deferred.complete(Boolean.TRUE);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.$deferred.isCompleted()) {
            return;
        }
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("W", "NoodleMag", "warmupWithWebView: error " + ((Object) (webResourceError != null ? webResourceError.getDescription() : null)));
        if (webView != null) {
            webView.destroy();
        }
        this.$deferred.complete(Boolean.FALSE);
    }
}
