package shl.com.myandroidproject.bean;

/**
 * Created by Administrator on 2020/3/14.
 */

public class RecycleBean {
    private String sex;//绰号
    private String name;//名字
    private int type;//类型

    public RecycleBean(String sex, String name, int type) {
        this.sex = sex;
        this.name = name;
        this.type = type;
    }

    public int getType(){
        return  type;
    }
    public void setType(int type){
        this.type = type;
    }
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
