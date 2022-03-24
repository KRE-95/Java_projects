package hiof.no.kainater.interfaceses;
// merkelig navn pga. det ville ikke la meg lage package "interface"


import java.io.File;

public interface ObjectFileHandler<T> {

        void writeObjectToFile(T t, File file);

        T readObjectsFromFile(File file);

    }

    // tools