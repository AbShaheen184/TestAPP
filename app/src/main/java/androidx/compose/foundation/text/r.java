package androidx.compose.foundation.text;

import android.app.ActivityManager;
import android.content.Context;
import android.database.SQLException;
import com.app.mlounge.CinemaHQApp;
import com.app.mlounge.emulator.LibretroCore;
import com.google.firebase.crashlytics.internal.model.t1;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r(boolean z, androidx.compose.foundation.text.input.internal.t tVar) {
        this.e = 0;
        this.y = z;
        this.z = tVar;
    }

    @Override // kotlin.jvm.functions.a
    public final Object invoke() {
        MutableSharedFlow mutableSharedFlowJ;
        int largeMemoryClass;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        boolean z = this.y;
        Object obj = this.z;
        switch (i) {
            case 0:
                androidx.compose.foundation.text.input.internal.t tVar = (androidx.compose.foundation.text.input.internal.t) obj;
                if (z && (mutableSharedFlowJ = ((androidx.compose.foundation.text.input.internal.c) tVar).j()) != null) {
                    mutableSharedFlowJ.tryEmit(yVar);
                }
                return yVar;
            case 1:
                androidx.room.coroutines.e eVar = (androidx.room.coroutines.e) obj;
                String str = z ? "reader" : "writer";
                StringBuilder sb = new StringBuilder();
                sb.append("Timed out attempting to acquire a " + str + " connection.");
                sb.append("\n\nWriter pool:\n");
                eVar.y.d(sb);
                sb.append("Reader pool:");
                sb.append('\n');
                eVar.e.d(sb);
                try {
                    t1.B(5, sb.toString());
                    throw null;
                } catch (SQLException e) {
                    int i2 = eVar.D;
                    if (i2 == 1) {
                        throw e;
                    }
                    if (i2 == 2) {
                        e.printStackTrace();
                    }
                    return yVar;
                }
            default:
                Context context = (Context) obj;
                int i3 = CinemaHQApp.D;
                double d = z ? 0.12d : 0.25d;
                if (0.0d > d || d > 1.0d) {
                    kotlinx.coroutines.future.a.q("percent must be in the range [0.0, 1.0].");
                    return null;
                }
                androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l lVar = new androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l(7, (byte) 0);
                try {
                    Object systemService = context.getSystemService((Class<Object>) ActivityManager.class);
                    systemService.getClass();
                    ActivityManager activityManager = (ActivityManager) systemService;
                    largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
                    break;
                } catch (Exception unused) {
                    largeMemoryClass = LibretroCore.SCREEN_WIDTH;
                }
                return new coil3.memory.c(new androidx.compose.ui.input.pointer.util.b((long) (d * ((long) largeMemoryClass) * 1048576), lVar), lVar);
        }
    }

    public /* synthetic */ r(boolean z, int i, Object obj) {
        this.e = i;
        this.z = obj;
        this.y = z;
    }
}
