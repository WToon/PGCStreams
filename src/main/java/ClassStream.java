import proguard.classfile.Clazz;
import proguard.classfile.ProgramMethod;

import java.util.function.Predicate;

public interface ClassStream<T> extends CustomStream<Clazz>
{
    ClassStream<T> filterOnName(String name);

    ClassStream<T> filter(Predicate<? super Clazz> predicate);

    MethodStream<ProgramMethod> methods();
}
