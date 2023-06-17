package xyz.wagyourtail.jvmdg.j8.stub;

import org.objectweb.asm.Opcodes;
import xyz.wagyourtail.jvmdg.Ref;
import xyz.wagyourtail.jvmdg.j8.stub.function.J_U_F_Supplier;
import xyz.wagyourtail.jvmdg.stub.Stub;

public class J_U_Objects {

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/util/Objects"))
    public static boolean isNull(Object obj) {
        return obj == null;
    }

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/util/Objects"))
    public static boolean nonNull(Object obj) {
        return obj != null;
    }

    @Stub(javaVersion = Opcodes.V1_8, ref = @Ref("java/util/Objects"))
    public static <T> T requireNonNull(T obj, J_U_F_Supplier<String> messageSupplier) {
        if (obj == null) {
            throw new NullPointerException(messageSupplier == null ? null : messageSupplier.get());
        }
        return obj;
    }

}