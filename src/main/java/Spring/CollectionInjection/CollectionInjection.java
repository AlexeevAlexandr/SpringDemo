package Spring.CollectionInjection;

import java.util.*;

public class CollectionInjection {
    private List list;
    private Set set;
    private Map map;
    private Properties properties;

    List getList() {
        return list;
    }

    public void setList(List list) {
        System.out.println("List of documents: " + list);
        this.list = list;
    }

    Set getSet(){
        return set;
    }

    public void setSet(Set set) {
        System.out.println("Set of documents: " + set);
        this.set = set;
    }

    Map getMap(){
        return map;
    }

    public void setMap(Map map) {
        System.out.println("Map of documents: " + map);
        this.map = map;
    }

    Properties getProperties(){
        return properties;
    }

    public void setProperties(Properties properties) {
        System.out.println("Properties of documents: " + properties);
        this.properties = properties;
    }
}
