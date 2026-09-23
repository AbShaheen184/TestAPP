package com.google.gson.internal.sql;

import com.google.gson.h;
import com.google.gson.m;
import com.google.gson.n;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m {
    public static final a b = new a();
    public final SimpleDateFormat a;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public class a implements n {
        @Override // com.google.gson.n
        public final m a(com.google.gson.e eVar, com.google.gson.reflect.a aVar) {
            if (aVar.a() == Time.class) {
                return new b(0);
            }
            return null;
        }
    }

    private b() {
        this.a = new SimpleDateFormat("hh:mm:ss a");
    }

    @Override // com.google.gson.m
    public final Object b(com.google.gson.stream.a aVar) throws IOException {
        Time time;
        if (aVar.n0() == 9) {
            aVar.j0();
            return null;
        }
        String strL0 = aVar.l0();
        synchronized (this) {
            TimeZone timeZone = this.a.getTimeZone();
            try {
                try {
                    time = new Time(this.a.parse(strL0).getTime());
                    this.a.setTimeZone(timeZone);
                } catch (ParseException e) {
                    throw new h(8, "Failed parsing '" + strL0 + "' as SQL Time; at path " + aVar.Z(), e);
                }
            } catch (Throwable th) {
                this.a.setTimeZone(timeZone);
                throw th;
            }
        }
        return time;
    }

    @Override // com.google.gson.m
    public final void c(com.google.gson.stream.b bVar, Object obj) throws IOException {
        String str;
        Time time = (Time) obj;
        if (time == null) {
            bVar.Y();
            return;
        }
        synchronized (this) {
            str = this.a.format((Date) time);
        }
        bVar.h0(str);
    }

    public /* synthetic */ b(int i) {
        this();
    }
}
