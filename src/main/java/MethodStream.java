import proguard.classfile.Clazz;
import proguard.classfile.Method;
import proguard.classfile.ProgramMethod;

import java.util.function.Predicate;

public interface MethodStream<T> extends CustomStream<Method>
{
    MethodStream<T> filterOnName(String name, Clazz clazz);

    MethodStream<ProgramMethod> filter(Predicate<? super Method> predicate);
}
