package model;

import java.util.HashMap;
import java.util.Map;

public class dictionary {
    static Map<String, String> dictionary = new HashMap<>();

    static {
        dictionary.put("one", "mot");
        dictionary.put("hello","Xin chao");
        dictionary.put("hi","Xin chao");
        dictionary.put("goodbye","Tam biet");
        dictionary.put("love","Tinh yeu");
        dictionary.put("pen","but bi");
        dictionary.put("rose","hoa hong");
    }
    public String findById(String id) {
       return dictionary.get(id);
    }
}
