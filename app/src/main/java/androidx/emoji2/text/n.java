package androidx.emoji2.text;

import android.os.Trace;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {
    public final /* synthetic */ int e;

    public /* synthetic */ n(int i) {
        this.e = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                try {
                    int i = androidx.core.os.e.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (j.d()) {
                        j.a().e();
                        break;
                    }
                    return;
                } finally {
                    int i2 = androidx.core.os.e.a;
                    Trace.endSection();
                }
            default:
                return;
        }
    }

    private final void a() {
    }
}
