package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class bde extends aqp {
    public String bax;
    public String bmJ;
    public String glb;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.glb != null) {
                aVar.e(2, this.glb);
            }
            if (this.bmJ != null) {
                aVar.e(3, this.bmJ);
            }
            if (this.bax == null) {
                return 0;
            }
            aVar.e(4, this.bax);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.glb != null) {
                r0 += a.a.a.b.b.a.f(2, this.glb);
            }
            if (this.bmJ != null) {
                r0 += a.a.a.b.b.a.f(3, this.bmJ);
            }
            if (this.bax != null) {
                r0 += a.a.a.b.b.a.f(4, this.bax);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bde com_tencent_mm_protocal_c_bde = (bde) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bde.mPU = enVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bde.glb = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bde.bmJ = aVar3.pMj.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bde.bax = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
