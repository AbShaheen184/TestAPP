package org.mozilla.javascript.commonjs.module;

import java.io.Serializable;
import java.net.URI;
import org.mozilla.javascript.Script;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class ModuleScript implements Serializable {
    private static final long serialVersionUID = 1;
    private final URI base;
    private final Script script;
    private final URI uri;

    public ModuleScript(Script script, URI uri, URI uri2) {
        this.script = script;
        this.uri = uri;
        this.base = uri2;
    }

    public URI getBase() {
        return this.base;
    }

    public Script getScript() {
        return this.script;
    }

    public URI getUri() {
        return this.uri;
    }

    public boolean isSandboxed() {
        URI uri;
        URI uri2 = this.base;
        return (uri2 == null || (uri = this.uri) == null || uri2.relativize(uri).isAbsolute()) ? false : true;
    }
}
