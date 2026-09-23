package androidx.media3.exoplayer.audio;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.google.common.collect.a1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public final Context a;
    public final androidx.activity.y b;
    public final Handler c;
    public final c d;
    public final androidx.media3.common.util.s e;
    public final d f;
    public androidx.media3.exoplayer.util.d g;
    public b h;
    public AudioDeviceInfo i;
    public androidx.media3.common.e j;
    public boolean k;

    public e(Context context, androidx.activity.y yVar, androidx.media3.common.e eVar, AudioDeviceInfo audioDeviceInfo) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = yVar;
        this.j = eVar;
        this.i = audioDeviceInfo;
        String str = androidx.media3.common.util.i0.a;
        Looper looperMyLooper = Looper.myLooper();
        Handler handler = new Handler(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, null);
        this.c = handler;
        this.d = new c(this);
        this.e = new androidx.media3.common.util.s(this, 1);
        a1 a1Var = b.e;
        String str2 = Build.MANUFACTURER;
        Uri uriFor = (str2.equals("Amazon") || str2.equals("Xiaomi")) ? Settings.Global.getUriFor("external_surround_sound_enabled") : null;
        this.f = uriFor != null ? new d(this, handler, applicationContext.getContentResolver(), uriFor) : null;
    }

    public final List a() {
        androidx.media3.exoplayer.util.d dVar;
        if (Build.VERSION.SDK_INT >= 32 && (dVar = this.g) != null) {
            return dVar.b();
        }
        com.google.common.collect.e0 e0Var = com.google.common.collect.h0.y;
        return a1.B;
    }

    public final void b(b bVar) {
        if (!this.k || bVar.equals(this.h)) {
            return;
        }
        this.h = bVar;
        f0 f0Var = (f0) this.b.y;
        f0Var.f();
        b bVar2 = f0Var.h;
        if (bVar2 == null || bVar.equals(bVar2)) {
            return;
        }
        f0Var.h = bVar;
        androidx.media3.common.util.o oVar = f0Var.f;
        if (oVar != null) {
            oVar.e(-1, new androidx.media3.exoplayer.analytics.d(27));
        }
    }

    public final void c() {
        List listA = a();
        androidx.media3.common.e eVar = this.j;
        AudioDeviceInfo audioDeviceInfo = this.i;
        a1 a1Var = b.e;
        IntentFilter intentFilter = new IntentFilter("android.media.action.HDMI_AUDIO_PLUG");
        Context context = this.a;
        b(b.b(context, context.registerReceiver(null, intentFilter), eVar, audioDeviceInfo, listA));
    }
}
