package org.boot.services.metadata;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndexes({
        @CompoundIndex(name = "group_name", def = "{'group': 1, 'name': 1}")
})
public class Metadata {

    @Id
    private ObjectId id;

    private String group;
    private String name;
    private Object value;

    public Metadata(String group, String name, Object value) {
        this.group = group;
        this.name = name;
        this.value = value;
    }

    public Metadata() {
    }

    public ObjectId getId() {
        return id;
    }

    public String getGroup() {
        return group;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
