package com.knubisoft.tasks.algorithm.json;

import com.knubisoft.tasks.algorithm.ModelRoot;
import org.apache.commons.io.IOUtils;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JsonTasksImplTest {

    private final JsonTasks object = new JsonTasksImpl();
    private final String content;

    public JsonTasksImplTest() throws IOException {
        content = IOUtils.toString(Objects.requireNonNull(
                getClass().getClassLoader().getResourceAsStream("json.json")), StandardCharsets.UTF_8);
    }

    @Test
    void parseJson() {
        ModelRoot result = object.parseJson(content);

        assertEquals(3, result.items.size());
        /*
            TODO add extra checks
         */
    }

    @Test
    void getAllIds() {
        List<Integer> result = object.getAllIds(content);

        assertEquals(Arrays.asList(1,2,3), result);
    }

    @Test
    void getNameWithIdMoreThan1() {
        List<String> result = object.getNameWithIdMoreThan1(content);
        assertEquals(Arrays.asList("Cake2","Cake3"), result);
    }

    @Test
    void getAllItems() {
        List<Map<String, String>> result = object.getAllItems(content);

        assertEquals(3, result.size());
         /*
            TODO add extra checks
         */
    }
}