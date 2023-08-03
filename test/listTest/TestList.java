package test.listTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestList {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
//    "小晚风","小王","小李","小刘","小刚";
        //添加数据向集合里
        Collections.addAll(list, "小晚风", "小王", "小李", "小刘", "小刚");
        //随机点名
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第" + i + "次点名");
            Random random = new Random();
            int count = list.size();
            for (int j = 0; j < count; j++) {
                int index = random.nextInt(list.size());
                String name = list.get(index);
                list.remove(name);
                list2.add(name);
                System.out.println(name);
            }
            list.addAll(list2);
            list2.clear();

        }
    }


}
