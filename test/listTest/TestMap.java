package test.listTest;

import java.util.*;
import java.util.function.BiConsumer;

public class TestMap {
    public static void main(String[] args) {
      /*一个键对应多个值，
      江苏省：南京市，无锡市
      * 辽宁省：大连市，沈阳市
      * 河北省：石家庄市，唐山市
      * hashmap
      * */

        HashMap<String, List<String>> map=new HashMap<>();
        List<String> stringList=new ArrayList<>();
        List<String> list=new ArrayList<>();
        list.add("南京市");
        list.add("无锡市");
        List<String> list2=new ArrayList<>();
        list2.add("大连市");
        list2.add("沈阳市");
        List<String> list3=new ArrayList<>();
        list3.add("石家庄市");
        list3.add("唐山市");
        map.put("江苏省",list);
        map.put("辽宁省",list2);
        map.put("河北省",list3);
       Set<Map.Entry<String,List<String>>> entries= map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            String key = entry.getKey();
            StringJoiner joiner=new StringJoiner(",",",","");
            List<String> value = entry.getValue();
            for (String s : value) {
                joiner.add(s);
            }
            System.out.println(key+joiner);
        }
    }
}
