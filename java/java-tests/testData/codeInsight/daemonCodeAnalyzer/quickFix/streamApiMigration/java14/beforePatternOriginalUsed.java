// "Fix all 'Loop can be collapsed with Stream API' problems in file" "true"
import java.util.List;
import java.util.ArrayList;

class X {
  void test(List<Object> list) {
    List<Object> result = new ArrayList<>();
    f<caret>or (Object o : list) {
      if (getObject(o) instanceof String s && !s.isEmpty()) {
        result.add(o);
      }
    }
  }
  
  native Object getObject(Object obj);
}