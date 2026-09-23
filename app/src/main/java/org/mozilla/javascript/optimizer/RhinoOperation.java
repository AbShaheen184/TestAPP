package org.mozilla.javascript.optimizer;

import jdk.dynalink.Operation;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public enum RhinoOperation implements Operation {
    BIND,
    GETNOWARN,
    GETSUPER,
    GETWITHTHIS,
    GETWITHTHISOPTIONAL,
    GETELEMENT,
    GETELEMENTSUPER,
    GETINDEX,
    SETSTRICT,
    SETCONST,
    SETSUPER,
    SETELEMENT,
    SETELEMENTSUPER,
    SETINDEX,
    ADD,
    EQ,
    SHALLOWEQ,
    COMPARE_GT,
    COMPARE_LT,
    COMPARE_GE,
    COMPARE_LE,
    TOBOOLEAN,
    TOINT32,
    TOUINT32,
    TONUMBER,
    TONUMERIC
}
