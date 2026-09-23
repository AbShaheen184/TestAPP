package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class be extends de implements zd {
    public final File e;

    public be(FileInputStream fileInputStream, File file) {
        super(fileInputStream);
        this.e = file;
    }

    @Override // com.google.android.gms.internal.measurement.zd
    public final File a() {
        return this.e;
    }
}
