package com.store.android.data.model.other;

import lombok.Data;

@Data
public class Permission {
    private String action;
    private String description;
    private int id;
    private String name;
    private String nameGroup;
    private boolean showMenu;
    private int status;
}
