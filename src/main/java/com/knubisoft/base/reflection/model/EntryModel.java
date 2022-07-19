package com.knubisoft.base.reflection.model;

public abstract class EntryModel {
    private String tableName;
    private String schemaName;
    private String version;
    public String asd;

    public EntryModel(String tableName) {
        this.tableName = tableName;
    }

    public EntryModel(String tableName, String schemaName) {
        this.tableName = tableName;
        this.schemaName = schemaName;
    }

    public EntryModel(String tableName, String schemaName, String version) {
        this.tableName = tableName;
        this.schemaName = schemaName;
        this.version = version;
    }

    public EntryModel builder() {
        return this;
    }

    private String getUser() {
        return "";
    }

    private String getUser1() {
        return "";
    }
}
