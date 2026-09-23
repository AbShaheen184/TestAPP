package org.mozilla.javascript.commonjs.module;

import java.net.URI;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.TopLevel;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleScope extends TopLevel {
    private static final long serialVersionUID = 1;
    private final URI base;
    private final URI uri;

    public ModuleScope(Scriptable scriptable, URI uri, URI uri2) {
        this.uri = uri;
        this.base = uri2;
        setPrototype(scriptable);
        cacheBuiltins(scriptable, false);
    }

    public URI getBase() {
        return this.base;
    }

    public URI getUri() {
        return this.uri;
    }
}
