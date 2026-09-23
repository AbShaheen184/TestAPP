package com.app.mlounge.data.providers;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.WebView;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new e1(this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        int i = this.label;
        boolean zBooleanValue = false;
        WebView webView = null;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                CompletableDeferred completableDeferredCompletableDeferred$default = CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                WebView webView2 = new WebView(this.this$0.appContext);
                webView2.getSettings().setJavaScriptEnabled(true);
                webView2.getSettings().setDomStorageEnabled(true);
                webView2.getSettings().setAllowContentAccess(true);
                webView2.getSettings().setLoadWithOverviewMode(true);
                webView2.getSettings().setUseWideViewPort(true);
                webView2.setBackgroundColor(0);
                webView2.setVisibility(8);
                try {
                    CookieManager.getInstance().setAcceptCookie(true);
                    webView2.setWebViewClient(new c1(completableDeferredCompletableDeferred$default, this.this$0));
                    Context context = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.a("D", "NoodleMag", "warmupWithWebView: loading https://noodlemagazine.com");
                    webView2.loadUrl("https://noodlemagazine.com");
                    d1 d1Var = new d1(completableDeferredCompletableDeferred$default, null);
                    this.L$0 = null;
                    this.L$1 = webView2;
                    this.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(15000L, d1Var, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    webView = webView2;
                } catch (Exception e) {
                    e = e;
                    webView = webView2;
                    Context context2 = com.app.mlounge.util.a.a;
                    com.app.mlounge.util.a.d("NoodleMag", "warmupWithWebView failed", e);
                    if (webView != null) {
                        webView.destroy();
                    }
                }
            } else {
                if (i != 1) {
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                webView = (WebView) this.L$1;
                kotlin.a.e(obj);
            }
            Boolean bool = (Boolean) obj;
            if (bool == null && webView != null) {
                webView.destroy();
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        } catch (Exception e2) {
            e = e2;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
