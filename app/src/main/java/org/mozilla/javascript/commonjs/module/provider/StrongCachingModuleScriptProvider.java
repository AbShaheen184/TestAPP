package org.mozilla.javascript.commonjs.module.provider;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.mozilla.javascript.commonjs.module.ModuleScript;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public class StrongCachingModuleScriptProvider extends CachingModuleScriptProviderBase {
    private static final long serialVersionUID = 1;
    private final Map<String, CachingModuleScriptProviderBase.CachedModuleScript> modules;

    public StrongCachingModuleScriptProvider(ModuleSourceProvider moduleSourceProvider) {
        super(moduleSourceProvider);
        this.modules = new ConcurrentHashMap(16, 0.75f, CachingModuleScriptProviderBase.getConcurrencyLevel());
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase
    public CachingModuleScriptProviderBase.CachedModuleScript getLoadedModule(String str) {
        return this.modules.get(str);
    }

    @Override // org.mozilla.javascript.commonjs.module.provider.CachingModuleScriptProviderBase
    public void putLoadedModule(String str, ModuleScript moduleScript, Object obj) {
        this.modules.put(str, new CachingModuleScriptProviderBase.CachedModuleScript(moduleScript, obj));
    }
}
