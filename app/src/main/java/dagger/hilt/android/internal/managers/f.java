package dagger.hilt.android.internal.managers;

import androidx.lifecycle.w0;
import com.app.mlounge.MainActivity;
import kotlin.jvm.internal.a0;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements dagger.hilt.internal.b {
    public final Object A = new Object();
    public final MainActivity e;
    public final MainActivity y;
    public volatile com.app.mlounge.f z;

    public f(MainActivity mainActivity) {
        this.e = mainActivity;
        this.y = mainActivity;
    }

    public static w0 b(MainActivity mainActivity, MainActivity mainActivity2) {
        return new w0(mainActivity.getViewModelStore(), new androidx.lifecycle.viewmodel.d(mainActivity2, 2), mainActivity.getDefaultViewModelCreationExtras());
    }

    @Override // dagger.hilt.internal.b
    public final Object a() {
        if (this.z == null) {
            synchronized (this.A) {
                try {
                    if (this.z == null) {
                        this.z = ((d) b(this.e, this.y).a(a0.a(d.class))).b;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.z;
    }
}
