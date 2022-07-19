package com.knubisoft.tasks.algorithm.json;

import com.knubisoft.tasks.algorithm.ModelRoot;
import lombok.SneakyThrows;

import java.util.List;
import java.util.Map;

public class JsonTasksImpl implements JsonTasks {

    @Override
    @SneakyThrows
    public ModelRoot parseJson(String json) {
        return null;
    }

    @Override
    public List<Integer> getAllIds(String json) {
        return null;
    }

    @Override
    public List<String> getNameWithIdMoreThan1(String json) {
        return null;
    }

    @Override
    public List<Map<String,String>> getAllItems(String json) {
        return null;
    }

}
