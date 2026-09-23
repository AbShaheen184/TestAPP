package androidx.privacysandbox.ads.adservices.measurement;

import android.adservices.measurement.MeasurementManager;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends c {
    /* JADX WARN: Illegal instructions before constructor call */
    public b(Context context, int i) {
        switch (i) {
            case 1:
                context.getClass();
                Object systemService = context.getSystemService((Class<Object>) MeasurementManager.class);
                systemService.getClass();
                super((MeasurementManager) systemService);
                break;
            default:
                context.getClass();
                MeasurementManager measurementManager = MeasurementManager.get(context);
                measurementManager.getClass();
                super(measurementManager);
                break;
        }
    }
}
