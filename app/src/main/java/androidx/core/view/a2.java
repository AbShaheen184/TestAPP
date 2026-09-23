package androidx.core.view;

import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class a2 extends org.jsoup.helper.n {
    public final Window l;
    public final com.google.firebase.platforminfo.d m;

    public a2(Window window, com.google.firebase.platforminfo.d dVar) {
        this.l = window;
        this.m = dVar;
    }

    @Override // org.jsoup.helper.n
    public final void L(boolean z) {
        if (!z) {
            T(8192);
            return;
        }
        Window window = this.l;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        S(8192);
    }

    @Override // org.jsoup.helper.n
    public final void M() {
        this.l.getDecorView().setTag(356039078, 2);
        T(2048);
        S(4096);
    }

    public final void S(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void T(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // org.jsoup.helper.n
    public final void x() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((519 & i) != 0) {
                if (i == 1) {
                    S(4);
                } else if (i == 2) {
                    S(2);
                } else if (i == 8) {
                    ((a0) this.m.e).a();
                }
            }
        }
    }
}
