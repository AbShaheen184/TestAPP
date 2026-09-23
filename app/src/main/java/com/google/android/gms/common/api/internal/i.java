package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i implements DialogInterface.OnCancelListener {
    public volatile boolean e;

    public abstract Activity a();

    public abstract void b(Bundle bundle);

    public abstract void c();

    public abstract void d();
}
