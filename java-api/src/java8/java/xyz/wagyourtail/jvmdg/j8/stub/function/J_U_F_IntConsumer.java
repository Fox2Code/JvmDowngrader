package xyz.wagyourtail.jvmdg.j8.stub.function;

import org.objectweb.asm.Opcodes;
import xyz.wagyourtail.jvmdg.version.Ref;
import xyz.wagyourtail.jvmdg.j8.stub.J_L_FunctionalInterface;
import xyz.wagyourtail.jvmdg.version.Stub;

@J_L_FunctionalInterface
@Stub(opcVers = Opcodes.V1_8, ref = @Ref("Ljava/util/function/IntConsumer"))
public interface J_U_F_IntConsumer {

    void accept(int value);

    J_U_F_IntConsumer andThen(J_U_F_IntConsumer after);

    class IntConsumerDefaults {

        @Stub(opcVers = Opcodes.V1_8, defaultMethod = true)
        public static J_U_F_IntConsumer andThen(final J_U_F_IntConsumer self, final J_U_F_IntConsumer after) {
            return new J_U_F_IntConsumer() {
                @Override
                public void accept(int value) {
                    self.accept(value);
                    after.accept(value);
                }

                @Override
                public J_U_F_IntConsumer andThen(J_U_F_IntConsumer after) {
                    return IntConsumerDefaults.andThen(this, after);
                }
            };
        }

    }
}
