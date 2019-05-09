package classfile.constantpool;

import java.util.ArrayList;
import java.util.List;

public class ConstantPool<T> {
    private List<T> pool = new ArrayList<>();

    int getConstantPoolCount() {
        return pool.size() + 1;
    }

    T get(int i) {
        if (i == 0) {
            //TODO
        }
        return pool.get(i - 1);
    }
}
