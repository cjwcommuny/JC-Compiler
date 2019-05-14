package classfile.attribute;

import java.util.List;

public class InnerClassesAttribute extends AttributeInfo {
    private List<InnerClassInfo> classes;

    public InnerClassesAttribute(int attributeNameIndex, List<InnerClassInfo> classes) {
        super(attributeNameIndex);
        this.classes = classes;
    }

    public int getNumberOfClasses() {
        return classes.size();
    }

    public static class InnerClassInfo {
        private int innerClassInfoIndex;
        private int outerClassInfoIndex;
        private int innerNameIndex;
        private int innerClassAccessFlags;

        public InnerClassInfo(int innerClassInfoIndex, int outerClassInfoIndex, int innerNameIndex, int innerClassAccessFlags) {
            this.innerClassInfoIndex = innerClassInfoIndex;
            this.outerClassInfoIndex = outerClassInfoIndex;
            this.innerNameIndex = innerNameIndex;
            this.innerClassAccessFlags = innerClassAccessFlags;
        }
    }
}
