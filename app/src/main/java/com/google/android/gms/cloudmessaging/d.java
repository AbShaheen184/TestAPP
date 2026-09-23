package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.s;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements com.google.android.gms.tasks.b, com.google.android.gms.tasks.h {
    public final /* synthetic */ int e;
    public static final /* synthetic */ d y = new d(0);
    public static final /* synthetic */ d z = new d(1);
    public static final /* synthetic */ d A = new d(2);

    public /* synthetic */ d(int i) {
        this.e = i;
    }

    @Override // com.google.android.gms.tasks.b
    public Object d(com.google.android.gms.tasks.i iVar) throws IOException {
        switch (this.e) {
            case 0:
                if (iVar.h()) {
                    return (Bundle) iVar.f();
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Error making request: ".concat(String.valueOf(iVar.e())));
                }
                throw new IOException("SERVICE_NOT_AVAILABLE", iVar.e());
            default:
                Intent intent = (Intent) ((Bundle) iVar.f()).getParcelable("notification_data");
                if (intent != null) {
                    return new a(intent);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.h
    public s g(Object obj) {
        Bundle bundle = (Bundle) obj;
        int i = b.h;
        return (bundle == null || !bundle.containsKey("google.messenger")) ? org.jsoup.helper.n.o(bundle) : org.jsoup.helper.n.o(null);
    }
}
