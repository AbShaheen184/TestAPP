package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.webkit.CookieManager;
import android.webkit.WebView;
import androidx.room.b0;
import kotlin.jvm.internal.v;
import kotlin.y;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ String A;
    public final /* synthetic */ com.app.mlounge.data.local.dao.g B;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ Context z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Context context, String str, com.app.mlounge.data.local.dao.g gVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = context;
        this.A = str;
        this.B = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new j(this.z, this.A, this.B, dVar, 0);
            default:
                return new j(this.z, this.A, this.B, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((j) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                int i = this.y;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                Context context = this.z;
                String str = this.A;
                com.app.mlounge.data.local.dao.g gVar = this.B;
                this.y = 1;
                CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(kotlin.coroutines.intrinsics.h.f(this), 1);
                cancellableContinuationImpl.initCancellability();
                v vVar = new v();
                v vVar2 = new v();
                Handler handler = new Handler(Looper.getMainLooper());
                WebView webView = new WebView(context);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.getSettings().setDomStorageEnabled(true);
                webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
                webView.getSettings().setMixedContentMode(0);
                webView.getSettings().setUserAgentString("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36");
                CookieManager.getInstance().setAcceptThirdPartyCookies(webView, true);
                webView.setWebChromeClient(new f());
                webView.setWebViewClient(new g(vVar, gVar, cancellableContinuationImpl, vVar2, handler, webView));
                cancellableContinuationImpl.invokeOnCancellation(new h(0, vVar2, handler, webView));
                Context context2 = com.app.mlounge.util.a.a;
                b0.h("Loading embed URL: ", str, "D", "NtvStreamExtractor");
                webView.loadUrl(str);
                Object result = cancellableContinuationImpl.getResult();
                return result == aVar ? aVar : result;
            default:
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                int i2 = this.y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    kotlinx.coroutines.future.a.u("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                MainCoroutineDispatcher main = Dispatchers.getMain();
                j jVar = new j(this.z, this.A, this.B, null, 0);
                this.y = 1;
                Object objWithContext = BuildersKt.withContext(main, jVar, this);
                return objWithContext == aVar2 ? aVar2 : objWithContext;
        }
    }
}
