package com.google.gson.internal.bind;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements com.google.gson.n {
    public final /* synthetic */ int e;
    public final /* synthetic */ com.google.gson.m y;

    public /* synthetic */ r(com.google.gson.m mVar, int i) {
        this.e = i;
        this.y = mVar;
    }

    @Override // com.google.gson.n
    public final com.google.gson.m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
        switch (this.e) {
            case 0:
                if (aVar.a() == Number.class) {
                    return (s) this.y;
                }
                return null;
            default:
                Class clsA = aVar.a();
                if (clsA == Calendar.class || clsA == GregorianCalendar.class) {
                    return (t0) this.y;
                }
                return null;
        }
    }

    public String toString() {
        switch (this.e) {
            case 1:
                return "Factory[type=" + Calendar.class.getName() + "+" + GregorianCalendar.class.getName() + ",adapter=" + ((t0) this.y) + "]";
            default:
                return super.toString();
        }
    }
}
