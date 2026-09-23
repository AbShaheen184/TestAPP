package com.app.mlounge.data.remote.ntv;

import android.webkit.WebView;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ WebView y;

    public /* synthetic */ i(WebView webView, int i) {
        this.e = i;
        this.y = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                WebView webView = this.y;
                try {
                    webView.stopLoading();
                    webView.onPause();
                    webView.removeAllViews();
                    webView.loadUrl("about:blank");
                    webView.destroy();
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                WebView webView2 = this.y;
                try {
                    webView2.stopLoading();
                    webView2.onPause();
                    webView2.removeAllViews();
                    webView2.loadUrl("about:blank");
                    webView2.destroy();
                } catch (Exception unused2) {
                    return;
                }
                break;
        }
    }
}
