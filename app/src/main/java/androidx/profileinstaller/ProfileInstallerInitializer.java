package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements androidx.startup.b {
    @Override // androidx.startup.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.startup.b
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new d(this, context.getApplicationContext()));
        return new com.google.android.material.shape.f(16);
    }
}
