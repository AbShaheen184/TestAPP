package org.mozilla.javascript.engine;

import javax.script.CompiledScript;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import org.mozilla.javascript.Script;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class RhinoCompiledScript extends CompiledScript {
    private final RhinoScriptEngine engine;
    private final Script script;

    public RhinoCompiledScript(RhinoScriptEngine rhinoScriptEngine, Script script) {
        this.engine = rhinoScriptEngine;
        this.script = script;
    }

    public Object eval(ScriptContext scriptContext) {
        return this.engine.eval(this.script, scriptContext);
    }

    public ScriptEngine getEngine() {
        return this.engine;
    }
}
