package com.google.android.gms.common.api.internal;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends Fragment {
    public final androidx.media3.exoplayer.dash.manifest.t e = new androidx.media3.exoplayer.dash.manifest.t(21);

    static {
        new WeakHashMap();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = ((Map) this.e.e).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = ((Map) this.e.e).values().iterator();
        if (it.hasNext()) {
            ((i) it.next()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        for (Map.Entry entry : ((Map) this.e.e).entrySet()) {
            ((i) entry.getValue()).b(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        tVar.getClass();
        Iterator it = ((Map) tVar.e).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).getClass();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        tVar.getClass();
        Iterator it = ((Map) tVar.e).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).d();
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        if (bundle == null) {
            tVar.getClass();
            return;
        }
        Iterator it = ((Map) tVar.e).entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            new Bundle();
            ((i) entry.getValue()).getClass();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        tVar.getClass();
        for (i iVar : ((Map) tVar.e).values()) {
            iVar.e = true;
            iVar.d();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        androidx.media3.exoplayer.dash.manifest.t tVar = this.e;
        tVar.getClass();
        Iterator it = ((Map) tVar.e).values().iterator();
        while (it.hasNext()) {
            ((i) it.next()).c();
        }
    }
}
