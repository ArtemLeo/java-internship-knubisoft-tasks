package com.knubisoft.base.reflection.model;

public class InheritedEntryModel extends EntryModel {

    public InheritedEntryModel(String tableName) {
        super(tableName);
    }

    public InheritedEntryModel(String tableName, String schemaName) {
        super(tableName, schemaName);
    }

    public InheritedEntryModel(String tableName, String schemaName, String version) {
        super(tableName, schemaName, version);
    }

    @Override
    public EntryModel builder() {
        return super.builder();
    }
}
