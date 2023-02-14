package hackatone.test.demo.dto;

import org.apache.commons.math3.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ExcelRow {

    String key;
    String keyName;
    Map<String, String> values = new HashMap<>();

    public ExcelRow() {
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public void setValues(Map<String, String> values) {
        this.values = values;
    }

    public Map<String, String> getValues() {
        return values;
    }

    public void put(String key, String value) {
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExcelRow excelRow = (ExcelRow) o;
        return Objects.equals(key, excelRow.key) && Objects.equals(values, excelRow.values);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, values);
    }
}
