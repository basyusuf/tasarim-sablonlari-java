package prototype;

public interface ICloneFactoryArea<T> extends Cloneable
{
    T clone(String[] equipment) throws CloneNotSupportedException;
}
