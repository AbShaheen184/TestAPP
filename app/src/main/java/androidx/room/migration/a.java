package androidx.room.migration;

import androidx.sqlite.db.framework.b;
import kotlin.j;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public final int a;
    public final int b;

    public a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(androidx.sqlite.a aVar) {
        aVar.getClass();
        if (!(aVar instanceof androidx.sqlite.driver.a)) {
            throw new j("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        b(((androidx.sqlite.driver.a) aVar).e);
    }

    public void b(b bVar) {
        bVar.getClass();
        throw new j("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }
}
