package com.cursos.springsecuritycourse.util;



import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public enum Role {

    CUSTOMER(Arrays.asList(Permission.READ_ALL_PRODUCTS)),
    ADMINISTRATOR(Arrays.asList(Permission.SAVE_ONE_PRODUCT, Permission.READ_ALL_PRODUCTS));

    private List<Permission> permission;

    Role(List<Permission> permission) {
        this.permission = permission;
    }

    public List<Permission> getPermission() {
        return permission;
    }

    public void setPermission(List<Permission> permission) {
        this.permission = permission;
    }
}
