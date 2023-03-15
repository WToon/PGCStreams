import proguard.classfile.ClassPool;
import proguard.classfile.ProgramClass;

import java.util.stream.StreamSupport;

public class Test
{
    public static void main(String[] args)
    {
        ClassPool pool = new ClassPool();
        ClassStream<ProgramClass> classStream = new ProgramClassStreamImpl(
                StreamSupport.stream(pool.classes().spliterator(), false)
                        .filter(clazz -> clazz instanceof ProgramClass)
                        .map(clazz -> (ProgramClass)clazz));

        classStream
            .filterOnName("someClass")
            .methods()
            .filterOnName("", null); // How do we know the relevant class at this point?
    }
}
