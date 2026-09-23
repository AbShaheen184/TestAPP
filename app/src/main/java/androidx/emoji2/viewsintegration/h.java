package androidx.emoji2.viewsintegration;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.emoji2.text.h implements Runnable {
    public final WeakReference e;

    public h(EditText editText) {
        this.e = new WeakReference(editText);
    }

    @Override // androidx.emoji2.text.h
    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.e.get();
        if (editText == null || (handler = editText.getHandler()) == null) {
            return;
        }
        handler.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        i.a((EditText) this.e.get(), 1);
    }
}
