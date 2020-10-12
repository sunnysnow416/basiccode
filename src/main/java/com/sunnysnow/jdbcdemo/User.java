package com.sunnysnow.jdbcdemo;

/**
 * 用户实体类
 */
public class User {
    /**
     * 声明数据对象最好使用包装类，将int改为Integer
     */
    private int id;
    private String username;
    private String password;
    private String permission;
    private String sex;
    private String isDelete;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", permission='" + permission + '\'' +
                ", sex='" + sex + '\'' +
                ", isDelete='" + isDelete + '\'' +
                ", age=" + age +
                '}';
    }
}
