package com.google.firebase;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.impl.k;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public j(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        int i = com.google.android.gms.common.util.d.a;
        x.i("ApplicationId must be set.", true ^ (str == null || str.trim().isEmpty()));
        this.b = str;
        this.a = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    public static j a(Context context) {
        k kVar = new k(context, 24);
        String strN = kVar.n("google_app_id");
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        return new j(strN, kVar.n("google_api_key"), kVar.n("firebase_database_url"), kVar.n("ga_trackingId"), kVar.n("gcm_defaultSenderId"), kVar.n("google_storage_bucket"), kVar.n("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return x.j(this.b, jVar.b) && x.j(this.a, jVar.a) && x.j(this.c, jVar.c) && x.j(this.d, jVar.d) && x.j(this.e, jVar.e) && x.j(this.f, jVar.f) && x.j(this.g, jVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a, this.c, this.d, this.e, this.f, this.g});
    }

    public final String toString() {
        k kVar = new k(this);
        kVar.g(this.b, "applicationId");
        kVar.g(this.a, "apiKey");
        kVar.g(this.c, "databaseUrl");
        kVar.g(this.e, "gcmSenderId");
        kVar.g(this.f, "storageBucket");
        kVar.g(this.g, "projectId");
        return kVar.toString();
    }
}
