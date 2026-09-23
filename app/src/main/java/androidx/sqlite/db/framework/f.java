package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l;
import androidx.media3.exoplayer.dash.manifest.t;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends SQLiteOpenHelper {
    public static final /* synthetic */ int E = 0;
    public final boolean A;
    public boolean B;
    public final androidx.sqlite.util.a C;
    public boolean D;
    public final Context e;
    public final t y;
    public final l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final t tVar, final l lVar, boolean z) {
        String string;
        super(context, str, null, lVar.y, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.c
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = f.E;
                sQLiteDatabase.getClass();
                t tVar2 = tVar;
                b bVar = (b) tVar2.e;
                if (bVar == null || !bVar.e.equals(sQLiteDatabase)) {
                    bVar = new b(sQLiteDatabase);
                    tVar2.e = bVar;
                }
                SQLiteDatabase sQLiteDatabase2 = bVar.e;
                lVar.getClass();
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        l.e(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        bVar.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            l.e((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            l.e(path2);
                        }
                    }
                }
            }
        });
        context.getClass();
        lVar.getClass();
        this.e = context;
        this.y = tVar;
        this.z = lVar;
        this.A = z;
        if (str == null) {
            string = UUID.randomUUID().toString();
            string.getClass();
        } else {
            string = str;
        }
        this.C = new androidx.sqlite.util.a(string, context.getCacheDir(), false);
    }

    public final b a(boolean z) {
        androidx.sqlite.util.a aVar = this.C;
        try {
            aVar.a((this.D || getDatabaseName() == null) ? false : true);
            this.B = false;
            SQLiteDatabase sQLiteDatabaseN = n(z);
            if (!this.B) {
                return g(sQLiteDatabaseN);
            }
            close();
            return a(z);
        } finally {
            aVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        androidx.sqlite.util.a aVar = this.C;
        try {
            aVar.a(aVar.a);
            super.close();
            this.y.e = null;
            this.D = false;
        } finally {
            aVar.b();
        }
    }

    public final b g(SQLiteDatabase sQLiteDatabase) {
        t tVar = this.y;
        tVar.getClass();
        b bVar = (b) tVar.e;
        if (bVar != null && bVar.e.equals(sQLiteDatabase)) {
            return bVar;
        }
        b bVar2 = new b(sQLiteDatabase);
        tVar.e = bVar2;
        return bVar2;
    }

    public final SQLiteDatabase n(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.D;
        Context context = this.e;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof d) {
                    d dVar = (d) th;
                    int iOrdinal = dVar.e.ordinal();
                    th = dVar.y;
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw th;
                    }
                    if (iOrdinal != 4) {
                        coil3.g.a();
                        return null;
                    }
                    if (!(th instanceof SQLiteException)) {
                        throw th;
                    }
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.A) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (d e) {
                    throw e.y;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.B;
        l lVar = this.z;
        if (!z && lVar.y != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            g(sQLiteDatabase);
            lVar.getClass();
        } catch (Throwable th) {
            throw new d(e.e, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((androidx.constraintlayout.core.widgets.analyzer.e) this.z.z).j(new androidx.sqlite.driver.a(g(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new d(e.y, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.B = true;
        try {
            this.z.h(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new d(e.A, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.B) {
            try {
                l lVar = this.z;
                b bVarG = g(sQLiteDatabase);
                androidx.constraintlayout.core.widgets.analyzer.e eVar = (androidx.constraintlayout.core.widgets.analyzer.e) lVar.z;
                eVar.l(new androidx.sqlite.driver.a(bVarG));
                eVar.i = bVarG;
            } catch (Throwable th) {
                throw new d(e.B, th);
            }
        }
        this.D = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.B = true;
        try {
            this.z.h(g(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new d(e.z, th);
        }
    }
}
