package xyz.wagyourtail.jvmdg.j17.stub;


import org.objectweb.asm.Opcodes;
import xyz.wagyourtail.jvmdg.stub.Stub;

import java.io.*;
import java.nio.charset.Charset;

public class J_L_Process {

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedReader inputReader(Process process) {
        return new BufferedReader(new InputStreamReader(process.getInputStream(), Charset.defaultCharset()));
    }

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedReader inputReader(Process process, Charset charset) {
        return new BufferedReader(new InputStreamReader(process.getInputStream(), charset));
    }

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedReader errorReader(Process process) {
        // get cs field
        return new BufferedReader(new InputStreamReader(process.getErrorStream(), Charset.defaultCharset()));
    }

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedReader errorReader(Process process, Charset charset) {
        // get cs field
        return new BufferedReader(new InputStreamReader(process.getErrorStream(), charset));
    }

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedWriter outputWriter(Process process) {
        // get cs field
        return new BufferedWriter(new OutputStreamWriter(process.getOutputStream(), Charset.defaultCharset()));
    }

    @Stub(javaVersion = Opcodes.V17)
    public static BufferedWriter outputWriter(Process process, Charset charset) {
        // get cs field
        return new BufferedWriter(new OutputStreamWriter(process.getOutputStream(), charset));
    }


}
