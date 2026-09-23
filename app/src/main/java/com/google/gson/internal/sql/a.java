package com.google.gson.internal.sql;

import com.google.gson.h;
import com.google.gson.m;
import com.google.gson.n;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {
    public static final C0000a b = new C0000a();
    public final SimpleDateFormat a;

    /* JADX INFO: renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public class C0000a implements n {
        @Override // com.google.gson.n
        public final m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.a() == Date.class) {
                return new a(0);
            }
            return null;
        }
    }

    private a() {
        this.a = new SimpleDateFormat("MMM d, yyyy");
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Date date;
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    date = new Date(this.a.parse(strL0).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new h(8, "Failed parsing '" + strL0 + "' as SQL Date; at path " + aVar.Z(), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return date;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        String str;
        Date date = (Date) obj;
        if (date == null) {
            bVar.Y();
            return;
        }
        synchronized (this) {
            str = this.a.format((java.util.Date) date);
        }
        bVar.h0(str);
    }

    public /* synthetic */ a(int i) {
        this();
    }
}
