package androidx.compose.ui.platform;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import com.app.mlounge.R;
import java.util.LinkedHashMap;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c3 {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final StateFlow a(Context context) {
        StateFlow stateFlow;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object objStateIn = linkedHashMap.get(context);
                if (objStateIn == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    Channel channelChannel$default = ChannelKt.Channel$default(-1, null, null, 6, null);
                    objStateIn = FlowKt.stateIn(FlowKt.flow(new androidx.compose.runtime.t2(contentResolver, uriFor, new b3(channelChannel$default, coil3.svg.internal.a.e(Looper.getMainLooper())), channelChannel$default, context, null)), CoroutineScopeKt.MainScope(), SharingStarted.Companion.WhileSubscribed$default(SharingStarted.Companion, 0L, 0L, 3, null), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, objStateIn);
                }
                stateFlow = (StateFlow) objStateIn;
            } catch (Throwable th) {
                throw th;
            }
        }
        return stateFlow;
    }

    public static final androidx.compose.runtime.w b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof androidx.compose.runtime.w) {
            return (androidx.compose.runtime.w) tag;
        }
        return null;
    }
}
