package com.caverock.androidsvg;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-e67002de5a40c891c754bff9e68f2bf8edbc7d2191d59a60e5e311fc3b432df9 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 implements Cloneable {
    public z0 A;
    public Float B;
    public c0 C;
    public Float D;
    public c0[] E;
    public c0 F;
    public Float G;
    public t H;
    public ArrayList I;
    public c0 J;
    public Integer K;
    public Boolean L;
    public com.google.firebase.messaging.n M;
    public String N;
    public String O;
    public String P;
    public Boolean Q;
    public Boolean R;
    public z0 S;
    public Float T;
    public String U;
    public String V;
    public z0 W;
    public Float X;
    public z0 Y;
    public Float Z;
    public int a0;
    public int b0;
    public int c0;
    public int d0;
    public long e = 0;
    public int e0;
    public int f0;
    public int g0;
    public int h0;
    public int i0;
    public int j0;
    public z0 y;
    public Float z;

    public static q0 a() {
        q0 q0Var = new q0();
        q0Var.e = -1L;
        t tVar = t.y;
        q0Var.y = tVar;
        q0Var.a0 = 1;
        Float fValueOf = Float.valueOf(1.0f);
        q0Var.z = fValueOf;
        q0Var.A = null;
        q0Var.B = fValueOf;
        q0Var.C = new c0(1.0f);
        q0Var.b0 = 1;
        q0Var.c0 = 1;
        q0Var.D = Float.valueOf(4.0f);
        q0Var.E = null;
        q0Var.F = new c0(0.0f);
        q0Var.G = fValueOf;
        q0Var.H = tVar;
        q0Var.I = null;
        q0Var.J = new c0(7, 12.0f);
        q0Var.K = 400;
        q0Var.d0 = 1;
        q0Var.e0 = 1;
        q0Var.f0 = 1;
        q0Var.g0 = 1;
        Boolean bool = Boolean.TRUE;
        q0Var.L = bool;
        q0Var.M = null;
        q0Var.N = null;
        q0Var.O = null;
        q0Var.P = null;
        q0Var.Q = bool;
        q0Var.R = bool;
        q0Var.S = tVar;
        q0Var.T = fValueOf;
        q0Var.U = null;
        q0Var.h0 = 1;
        q0Var.V = null;
        q0Var.W = null;
        q0Var.X = fValueOf;
        q0Var.Y = null;
        q0Var.Z = fValueOf;
        q0Var.i0 = 1;
        q0Var.j0 = 1;
        return q0Var;
    }

    public final Object clone() {
        q0 q0Var = (q0) super.clone();
        c0[] c0VarArr = this.E;
        if (c0VarArr != null) {
            q0Var.E = (c0[]) c0VarArr.clone();
        }
        return q0Var;
    }
}
