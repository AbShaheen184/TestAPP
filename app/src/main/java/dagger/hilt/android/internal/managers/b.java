package dagger.hilt.android.internal.managers;

import android.app.Application;
import com.app.mlounge.MainActivity;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements dagger.hilt.internal.b {
    public final f A;
    public androidx.core.text.f B;
    public volatile com.app.mlounge.d e;
    public final Object y = new Object();
    public final MainActivity z;

    public b(MainActivity mainActivity) {
        this.z = mainActivity;
        this.A = new f(mainActivity);
    }

    @Override // dagger.hilt.internal.b
    public final Object a() {
        if (this.e == null) {
            synchronized (this.y) {
                try {
                    if (this.e == null) {
                        this.e = b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.e;
    }

    public final com.app.mlounge.d b() {
        String str;
        MainActivity mainActivity = this.z;
        if (mainActivity.getApplication() instanceof dagger.hilt.internal.b) {
            com.app.mlounge.f fVar = (com.app.mlounge.f) ((a) n.r(this.A, a.class));
            return new com.app.mlounge.d(fVar.a, fVar.b);
        }
        if (Application.class.equals(mainActivity.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + mainActivity.getApplication().getClass();
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. ".concat(str));
    }
}
