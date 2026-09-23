package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class c2 extends org.jsoup.helper.n {
    public final WindowInsetsController l;
    public final Window m;

    public c2(Window window, com.google.firebase.platforminfo.d dVar) {
        this.l = window.getInsetsController();
        this.m = window;
    }

    @Override // org.jsoup.helper.n
    public void K(boolean z) {
        Window window = this.m;
        if (window != null) {
            if (!z) {
                S(16);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.l;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(16, 16);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // org.jsoup.helper.n
    public void L(boolean z) {
        Window window = this.m;
        if (window != null) {
            if (!z) {
                S(8192);
                return;
            } else {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                return;
            }
        }
        WindowInsetsController windowInsetsController = this.l;
        if (z) {
            windowInsetsController.setSystemBarsAppearance(8, 8);
        } else {
            windowInsetsController.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // org.jsoup.helper.n
    public void M() {
        Window window = this.m;
        if (window == null) {
            this.l.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        S(2048);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 4096);
    }

    public final void S(int i) {
        View decorView = this.m.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // org.jsoup.helper.n
    public final void x() {
        this.l.hide(519);
    }
}
