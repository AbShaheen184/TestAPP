package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.j;
import androidx.work.impl.v;
import coil3.network.g;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends v {
    public final /* synthetic */ int G = 0;
    public Context H;
    public Uri I;

    public a(Context context, Uri uri) {
        this.H = context;
        this.I = uri;
    }

    @Override // androidx.work.impl.v
    public final Uri C() {
        switch (this.G) {
            case 0:
                break;
        }
        return this.I;
    }

    @Override // androidx.work.impl.v
    public final boolean G() throws Throwable {
        switch (this.G) {
            case 0:
                String strB = g.B(this.H, this.I, "mime_type");
                return ("vnd.android.document/directory".equals(strB) || TextUtils.isEmpty(strB)) ? false : true;
            default:
                String strB2 = g.B(this.H, this.I, "mime_type");
                return ("vnd.android.document/directory".equals(strB2) || TextUtils.isEmpty(strB2)) ? false : true;
        }
    }

    public long T() {
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.H.getContentResolver().query(this.I, new String[]{"_size"}, null, null, null);
            if (!cursorQuery.moveToFirst() || cursorQuery.isNull(0)) {
                return 0L;
            }
            return cursorQuery.getLong(0);
        } catch (Exception e) {
            Log.w("DocumentFile", "Failed query: " + e);
            return 0L;
        } finally {
            g.i(cursorQuery);
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006c A[LOOP:1: B:23:0x0069->B:25:0x006c, LOOP_END] */
    public v[] U() {
        Uri[] uriArr;
        v[] vVarArr;
        Context context = this.H;
        ContentResolver contentResolver = context.getContentResolver();
        Uri uri = this.I;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                try {
                    cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                    while (cursorQuery.moveToNext()) {
                        arrayList.add(DocumentsContract.buildDocumentUriUsingTree(uri, cursorQuery.getString(0)));
                    }
                    try {
                        j.v(cursorQuery);
                    } catch (RuntimeException e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    Log.w("DocumentFile", "Failed query: " + e2);
                    if (cursorQuery != null) {
                        try {
                            j.v(cursorQuery);
                        } catch (RuntimeException e3) {
                            throw e3;
                        }
                    }
                    uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
                    vVarArr = new v[uriArr.length];
                    for (int i = 0; i < uriArr.length; i++) {
                        vVarArr[i] = new a(context, uriArr[i]);
                    }
                    return vVarArr;
                }
            } catch (Exception unused) {
            }
            uriArr = (Uri[]) arrayList.toArray(new Uri[0]);
            vVarArr = new v[uriArr.length];
            while (i < uriArr.length) {
                vVarArr[i] = new a(context, uriArr[i]);
            }
            return vVarArr;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                try {
                    j.v(cursorQuery);
                } catch (RuntimeException e4) {
                    throw e4;
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    @Override // androidx.work.impl.v
    public final boolean l() {
        switch (this.G) {
            case 0:
                try {
                    return DocumentsContract.deleteDocument(this.H.getContentResolver(), this.I);
                } catch (Exception unused) {
                    return false;
                }
            default:
                try {
                    return DocumentsContract.deleteDocument(this.H.getContentResolver(), this.I);
                } catch (Exception unused2) {
                    return false;
                }
        }
    }

    @Override // androidx.work.impl.v
    public final String y() {
        switch (this.G) {
            case 0:
                break;
        }
        return g.B(this.H, this.I, "_display_name");
    }

    public /* synthetic */ a() {
    }
}
