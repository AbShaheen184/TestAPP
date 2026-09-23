package androidx.room;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class v {
    public final /* synthetic */ int a;
    public final String b;
    public final boolean c;

    public v(String str, boolean z) {
        this.a = 0;
        this.c = z;
        this.b = str;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                String str = this.b;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.c);
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v(int i, String str, boolean z) {
        this.a = i;
        this.b = str;
        this.c = z;
    }
}
