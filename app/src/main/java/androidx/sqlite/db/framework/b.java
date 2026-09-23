package androidx.sqlite.db.framework;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import androidx.compose.runtime.c0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Closeable {
    public static final Object A;
    public static final Object B;
    public static final String[] y = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] z = new String[0];
    public final SQLiteDatabase e;

    static {
        c0 c0Var = new c0(14);
        kotlin.i iVar = kotlin.i.e;
        A = kotlin.a.c(iVar, c0Var);
        B = kotlin.a.c(iVar, new c0(15));
    }

    public b(SQLiteDatabase sQLiteDatabase) {
        this.e = sQLiteDatabase;
    }

    public final void A(String str) {
        str.getClass();
        this.e.execSQL(str);
    }

    public final boolean H() {
        return this.e.inTransaction();
    }

    public final void L(Object[] objArr) {
        this.e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", objArr);
    }

    public final Cursor N(androidx.sqlite.db.d dVar) {
        final androidx.compose.ui.text.platform.c cVar = new androidx.compose.ui.text.platform.c(dVar, 1);
        Cursor cursorRawQueryWithFactory = this.e.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) cVar.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, dVar.u(), z, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    public final void X() {
        this.e.setTransactionSuccessful();
    }

    public final void a() {
        this.e.beginTransaction();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e.close();
    }

    public final void g() {
        this.e.beginTransactionNonExclusive();
    }

    public final boolean isOpen() {
        return this.e.isOpen();
    }

    public final i n(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.e.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new i(sQLiteStatementCompileStatement);
    }

    public final void x() {
        this.e.endTransaction();
    }
}
