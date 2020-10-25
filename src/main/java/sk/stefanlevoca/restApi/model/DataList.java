package sk.stefanlevoca.restApi.model;

import java.util.ArrayList;
import java.util.List;

public class DataList {

    private List<Datum> data;

    public DataList() {
        this.data = new ArrayList<>();
    }

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataList{" + "\n" +
                "data=" + data + "\n" +
                '}';
    }
}
