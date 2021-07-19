package s9.ce47;

import java.util.List;

interface ISaveable {

    List<String> write();

    void read(List<String> list);
}