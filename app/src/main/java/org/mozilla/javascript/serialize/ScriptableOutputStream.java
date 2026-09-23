package org.mozilla.javascript.serialize;

import androidx.room.b0;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import kotlinx.coroutines.future.a;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
import org.mozilla.javascript.UniqueTag;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ScriptableOutputStream extends ObjectOutputStream {
    private Scriptable scope;
    private Map<Object, String> table;

    /* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
    public static class PendingLookup implements Serializable {
        private static final long serialVersionUID = -2692990309789917727L;
        private String name;

        public PendingLookup(String str) {
            this.name = str;
        }

        public String getName() {
            return this.name;
        }
    }

    public ScriptableOutputStream(OutputStream outputStream, Scriptable scriptable) {
        super(outputStream);
        this.scope = scriptable;
        HashMap map = new HashMap();
        this.table = map;
        map.put(scriptable, "");
        enableReplaceObject(true);
        excludeStandardObjectNames();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object lookupQualifiedName(Scriptable scriptable, String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        while (stringTokenizer.hasMoreTokens()) {
            scriptable = ScriptableObject.getProperty((Scriptable) scriptable, stringTokenizer.nextToken());
            if (scriptable == 0 || !(scriptable instanceof Scriptable)) {
                break;
            }
        }
        return scriptable;
    }

    public void addExcludedName(String str) {
        Object objLookupQualifiedName = lookupQualifiedName(this.scope, str);
        if (objLookupQualifiedName instanceof Scriptable) {
            this.table.put(objLookupQualifiedName, str);
        } else {
            a.q(androidx.privacysandbox.ads.adservices.java.internal.a.r("Object for excluded name ", str, " not found."));
        }
    }

    public void addOptionalExcludedName(String str) {
        Object objLookupQualifiedName = lookupQualifiedName(this.scope, str);
        if (objLookupQualifiedName == null || objLookupQualifiedName == UniqueTag.NOT_FOUND) {
            return;
        }
        if (objLookupQualifiedName instanceof Scriptable) {
            this.table.put(objLookupQualifiedName, str);
        } else {
            a.q(b0.e("Object for excluded name ", str, " is not a Scriptable, it is ", objLookupQualifiedName.getClass().getName()));
        }
    }

    public void excludeAllIds(Object[] objArr) {
        for (Object obj : objArr) {
            if (obj instanceof String) {
                Scriptable scriptable = this.scope;
                String str = (String) obj;
                if (scriptable.get(str, scriptable) instanceof Scriptable) {
                    addExcludedName(str);
                }
            }
        }
    }

    public void excludeStandardObjectNames() {
        String[] strArr = {"Object", "Object.prototype", "Function", "Function.prototype", "String", "String.prototype", "Math", "Array", "Array.prototype", "Error", "Error.prototype", "Number", "Number.prototype", "Date", "Date.prototype", "RegExp", "RegExp.prototype", "Script", "Script.prototype", "Continuation", "Continuation.prototype"};
        for (int i = 0; i < 21; i++) {
            addExcludedName(strArr[i]);
        }
        String[] strArr2 = {"XML", "XML.prototype", "XMLList", "XMLList.prototype"};
        for (int i2 = 0; i2 < 4; i2++) {
            addOptionalExcludedName(strArr2[i2]);
        }
    }

    public boolean hasExcludedName(String str) {
        return this.table.get(str) != null;
    }

    public void removeExcludedName(String str) {
        this.table.remove(str);
    }

    @Override // java.io.ObjectOutputStream
    public Object replaceObject(Object obj) {
        String str = this.table.get(obj);
        return str == null ? obj : new PendingLookup(str);
    }
}
