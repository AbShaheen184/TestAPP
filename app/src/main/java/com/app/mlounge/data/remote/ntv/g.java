package com.app.mlounge.data.remote.ntv;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.room.b0;
import java.io.ByteArrayInputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.x;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends WebViewClient {
    public final /* synthetic */ v a;
    public final /* synthetic */ com.app.mlounge.data.local.dao.g b;
    public final /* synthetic */ CancellableContinuationImpl c;
    public final /* synthetic */ v d;
    public final /* synthetic */ Handler e;
    public final /* synthetic */ WebView f;

    public g(v vVar, com.app.mlounge.data.local.dao.g gVar, CancellableContinuationImpl cancellableContinuationImpl, v vVar2, Handler handler, WebView webView) {
        this.a = vVar;
        this.b = gVar;
        this.c = cancellableContinuationImpl;
        this.d = vVar2;
        this.e = handler;
        this.f = webView;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Context context = com.app.mlounge.util.a.a;
        b0.h("Page loaded: ", str, "D", "NtvStreamExtractor");
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Map] */
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url;
        String string;
        v vVar = this.a;
        if (webResourceRequest == null || (url = webResourceRequest.getUrl()) == null || (string = url.toString()) == null) {
            return null;
        }
        if (vVar.e && (kotlin.text.r.u(string, "http://", false) || kotlin.text.r.u(string, "https://", false))) {
            return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
        }
        if (!((Boolean) this.b.invoke(string)).booleanValue() || vVar.e) {
            return null;
        }
        vVar.e = true;
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders == null) {
            requestHeaders = x.e;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = requestHeaders.get("Origin");
        if (str != null) {
            linkedHashMap.put("Origin", str);
        } else {
            String str2 = (String) q.b.get("Origin");
            if (str2 != null) {
                linkedHashMap.put("Origin", str2);
            }
        }
        String str3 = requestHeaders.get("Referer");
        if (str3 != null) {
            linkedHashMap.put("Referer", str3);
        } else {
            String str4 = (String) q.b.get("Referer");
            if (str4 != null) {
                linkedHashMap.put("Referer", str4);
            }
        }
        String str5 = requestHeaders.get("User-Agent");
        if (str5 == null) {
            str5 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/153.0.0.0 Safari/537.36";
        }
        linkedHashMap.put("User-Agent", str5);
        Context context = com.app.mlounge.util.a.a;
        com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "Intercepted stream: ".concat(string));
        com.app.mlounge.util.a.a("D", "NtvStreamExtractor", "Captured headers: " + linkedHashMap);
        this.c.resumeWith(new r(string, linkedHashMap));
        v vVar2 = this.d;
        Handler handler = this.e;
        WebView webView2 = this.f;
        if (!vVar2.e) {
            vVar2.e = true;
            handler.post(new i(webView2, 0));
        }
        return new WebResourceResponse("text/plain", "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
