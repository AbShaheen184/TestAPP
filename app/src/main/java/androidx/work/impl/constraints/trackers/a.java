package androidx.work.impl.constraints.trackers;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.media3.common.util.s;
import androidx.navigation.u;
import androidx.work.y;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends u {
    public final s f;
    public final /* synthetic */ int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, androidx.work.impl.utils.taskexecutor.c cVar, int i) {
        super(context, cVar);
        this.g = i;
        this.f = new s(this, 2);
    }

    @Override // androidx.navigation.u
    public final Object c() {
        switch (this.g) {
            case 0:
                Intent intentRegisterReceiver = ((Context) this.b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null) {
                    y.e().c(b.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
                return Boolean.valueOf(intExtra == 2 || intExtra == 5);
            case 1:
                Intent intentRegisterReceiver2 = ((Context) this.b).registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver2 == null) {
                    y.e().c(c.a, "getInitialState - null intent received");
                    return Boolean.FALSE;
                }
                int intExtra2 = intentRegisterReceiver2.getIntExtra("status", -1);
                float intExtra3 = intentRegisterReceiver2.getIntExtra("level", -1) / intentRegisterReceiver2.getIntExtra("scale", -1);
                boolean z = true;
                if (intExtra2 != 1 && intExtra3 <= 0.15f) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                Intent intentRegisterReceiver3 = ((Context) this.b).registerReceiver(null, g());
                boolean z2 = true;
                if (intentRegisterReceiver3 != null && intentRegisterReceiver3.getAction() != null) {
                    String action = intentRegisterReceiver3.getAction();
                    if (action == null) {
                        z2 = false;
                    } else {
                        int iHashCode = action.hashCode();
                        if (iHashCode == -1181163412) {
                            action.equals("android.intent.action.DEVICE_STORAGE_LOW");
                        } else if (iHashCode != -730838620 || !action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                        }
                        z2 = false;
                    }
                }
                return Boolean.valueOf(z2);
        }
    }

    @Override // androidx.navigation.u
    public final void e() {
        y.e().a(d.a, getClass().getSimpleName().concat(": registering receiver"));
        ((Context) this.b).registerReceiver(this.f, g());
    }

    @Override // androidx.navigation.u
    public final void f() {
        y.e().a(d.a, getClass().getSimpleName().concat(": unregistering receiver"));
        ((Context) this.b).unregisterReceiver(this.f);
    }

    public final IntentFilter g() {
        switch (this.g) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.CHARGING");
                intentFilter.addAction("android.os.action.DISCHARGING");
                return intentFilter;
            case 1:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.BATTERY_OKAY");
                intentFilter2.addAction("android.intent.action.BATTERY_LOW");
                return intentFilter2;
            default:
                IntentFilter intentFilter3 = new IntentFilter();
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_OK");
                intentFilter3.addAction("android.intent.action.DEVICE_STORAGE_LOW");
                return intentFilter3;
        }
    }
}
