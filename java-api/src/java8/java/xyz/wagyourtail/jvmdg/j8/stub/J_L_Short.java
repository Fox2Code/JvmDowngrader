package xyz.wagyourtail.jvmdg.j8.stub;

import org.objectweb.asm.Opcodes;
import xyz.wagyourtail.jvmdg.Ref;
import xyz.wagyourtail.jvmdg.stub.Stub;

public class J_L_Short {

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/lang/Short"))
    public static final int BYTES = Short.SIZE / Byte.SIZE;

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/lang/Short"))
    public static int hashCode(short value) {
        return value;
    }

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/lang/Short"))
    public static int toUnsignedInt(short value) {
        return value & 0xFFFF;
    }

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/lang/Short"))
    public static long toUnsignedLong(short value) {
        return value & 0xFFFFL;
    }

}