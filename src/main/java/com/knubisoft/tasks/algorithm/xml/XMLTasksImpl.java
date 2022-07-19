package com.knubisoft.tasks.algorithm.xml;

import com.knubisoft.tasks.algorithm.ModelRoot;
import lombok.SneakyThrows;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.namespace.QName;
import java.util.List;
import java.util.function.Function;

public class XMLTasksImpl implements XMLTasks {

    @Override
    @SneakyThrows
    public ModelRoot parseXML(String xml) {
        return null;
    }

    @Override
    public List<Integer> getAllIds(String xml) {
        return null;
    }

    @Override
    public List<String> getNameWithIdMoreThan1(String xml) {
        return null;
    }

    @SneakyThrows
    private Object xpath(String xml, String expression, QName q) {
        return null;
    }

    private <T> List<T> apply(NodeList nodeList, Function<Node, T> tFunction){
        return null;
    }
}
