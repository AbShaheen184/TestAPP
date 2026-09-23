package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends h0 {
    public static final String[] B = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public boolean A;
    public final l z;

    public p0(p1 p1Var) {
        super(p1Var);
        this.z = new l(this, ((p1) this.e).e);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final void A() {
        p1 p1Var = (p1) this.e;
        v();
        if (!this.A && p1Var.e.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i = 5;
            for (int i2 = 0; i2 < 5; i2++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseB = B();
                        if (sQLiteDatabaseB == null) {
                            this.A = true;
                            return;
                        }
                        sQLiteDatabaseB.beginTransaction();
                        sQLiteDatabaseB.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseB.setTransactionSuccessful();
                        sQLiteDatabaseB.endTransaction();
                        sQLiteDatabaseB.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i);
                        i += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e) {
                        u0 u0Var = p1Var.C;
                        p1.m(u0Var);
                        u0Var.C.b(e, "Error deleting app launch break from local database");
                        this.A = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th;
                        }
                    }
                    u0 u0Var2 = p1Var.C;
                    p1.m(u0Var2);
                    u0Var2.C.b(e2, "Error deleting app launch break from local database");
                    this.A = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            u0 u0Var3 = p1Var.C;
            p1.m(u0Var3);
            u0Var3.F.a("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase B() {
        if (this.A) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.z.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.A = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean C(byte[] bArr, int i) {
        SQLiteDatabase sQLiteDatabaseB;
        boolean z;
        boolean z2;
        Cursor cursorRawQuery;
        p1 p1Var = (p1) this.e;
        v();
        boolean z3 = false;
        z3 = false;
        if (!this.A) {
            g gVar = p1Var.A;
            u0 u0Var = p1Var.C;
            e0 e0Var = f0.W0;
            Cursor cursor = null;
            cursor = null;
            r4 r4VarZ = gVar.G(null, e0Var) ? p1Var.r().z(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i));
            contentValues.put("entry", bArr);
            if (p1Var.A.G(null, e0Var) && r4VarZ != null) {
                contentValues.put("app_version", r4VarZ.z);
                contentValues.put("app_version_int", Long.valueOf(r4VarZ.G));
            }
            int i2 = 5;
            int i3 = 0;
            for (int i4 = 5; i3 < i4; i4 = 5) {
                try {
                    sQLiteDatabaseB = B();
                    if (sQLiteDatabaseB == null) {
                        this.A = true;
                    } else {
                        try {
                            sQLiteDatabaseB.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseB.rawQuery("select count(1) from messages", null);
                            long j = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j = cursorRawQuery.getLong(z3 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z = z3 ? 1 : 0;
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteFullException e) {
                                        e = e;
                                        z = z3 ? 1 : 0;
                                        p1.m(u0Var);
                                        u0Var.C.b(e, "Error writing entry; local database full");
                                        this.A = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        z = z3 ? 1 : 0;
                                        z2 = true;
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.endTransaction();
                                        }
                                        p1.m(u0Var);
                                        u0Var.C.b(e, "Error writing entry to local database");
                                        this.A = z2;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseB != null) {
                                        sQLiteDatabaseB.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j >= 100000) {
                                p1.m(u0Var);
                                u0Var.C.a("Data loss, local db full");
                                long j2 = 100001 - j;
                                long jDelete = sQLiteDatabaseB.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j2)});
                                if (jDelete != j2) {
                                    p1.m(u0Var);
                                    s0 s0Var = u0Var.C;
                                    z = z3 ? 1 : 0;
                                    try {
                                        try {
                                            z2 = true;
                                            try {
                                                s0Var.d("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j2), Long.valueOf(jDelete), Long.valueOf(j2 - jDelete));
                                            } catch (SQLiteFullException e3) {
                                                e = e3;
                                                p1.m(u0Var);
                                                u0Var.C.b(e, "Error writing entry; local database full");
                                                this.A = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseB != null) {
                                                    sQLiteDatabaseB.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            } catch (SQLiteException e4) {
                                                e = e4;
                                                if (sQLiteDatabaseB != null) {
                                                    sQLiteDatabaseB.endTransaction();
                                                }
                                                p1.m(u0Var);
                                                u0Var.C.b(e, "Error writing entry to local database");
                                                this.A = z2;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseB != null) {
                                                    sQLiteDatabaseB.close();
                                                }
                                                i3++;
                                                z3 = z;
                                            }
                                        } catch (SQLiteFullException e5) {
                                            e = e5;
                                            p1.m(u0Var);
                                            u0Var.C.b(e, "Error writing entry; local database full");
                                            this.A = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        } catch (SQLiteException e6) {
                                            e = e6;
                                            z2 = true;
                                            if (sQLiteDatabaseB != null && sQLiteDatabaseB.inTransaction()) {
                                                sQLiteDatabaseB.endTransaction();
                                            }
                                            p1.m(u0Var);
                                            u0Var.C.b(e, "Error writing entry to local database");
                                            this.A = z2;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseB != null) {
                                                sQLiteDatabaseB.close();
                                            }
                                            i3++;
                                            z3 = z;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i2);
                                        i2 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseB != null) {
                                            sQLiteDatabaseB.close();
                                        }
                                        i3++;
                                        z3 = z;
                                    }
                                } else {
                                    z = z3 ? 1 : 0;
                                    z2 = true;
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                z2 = true;
                            }
                            sQLiteDatabaseB.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseB.setTransactionSuccessful();
                            sQLiteDatabaseB.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseB.close();
                            return z2;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e7) {
                            e = e7;
                            z = z3 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e8) {
                            e = e8;
                            z = z3 ? 1 : 0;
                            z2 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseB = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e9) {
                    e = e9;
                    z = z3 ? 1 : 0;
                    sQLiteDatabaseB = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e10) {
                    e = e10;
                    z = z3 ? 1 : 0;
                    z2 = true;
                    sQLiteDatabaseB = null;
                    cursorRawQuery = null;
                } catch (Throwable th3) {
                    th = th3;
                    sQLiteDatabaseB = null;
                }
            }
            boolean z4 = z3 ? 1 : 0;
            p1.m(u0Var);
            u0Var.K.a("Failed to write entry to local database");
            return z4;
        }
        return z3;
    }

    @Override // com.google.android.gms.measurement.internal.h0
    public final boolean y() {
        return false;
    }

    public final void z() {
        int iDelete;
        p1 p1Var = (p1) this.e;
        v();
        try {
            SQLiteDatabase sQLiteDatabaseB = B();
            if (sQLiteDatabaseB == null || (iDelete = sQLiteDatabaseB.delete("messages", null, null)) <= 0) {
                return;
            }
            u0 u0Var = p1Var.C;
            p1.m(u0Var);
            u0Var.K.b(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e) {
            u0 u0Var2 = p1Var.C;
            p1.m(u0Var2);
            u0Var2.C.b(e, "Error resetting local analytics data. error");
        }
    }
}
