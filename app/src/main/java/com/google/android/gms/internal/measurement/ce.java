package com.google.android.gms.internal.measurement;

import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class ce extends ee implements zd {
    public final FileOutputStream e;
    public final File y;

    public ce(FileOutputStream fileOutputStream, File file) {
        super(fileOutputStream);
        this.e = fileOutputStream;
        this.y = file;
    }

    @Override // com.google.android.gms.internal.measurement.zd
    public final File a() {
        return this.y;
    }
}
