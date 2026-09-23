package androidx.compose.ui.text.style;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final j e;
    public static final j y;
    public static final /* synthetic */ j[] z;

    static {
        j jVar = new j("Ltr", 0);
        e = jVar;
        j jVar2 = new j("Rtl", 1);
        y = jVar2;
        z = new j[]{jVar, jVar2};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) z.clone();
    }
}
