package co.com.mercadolibrer.humans.model.entity;

import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import com.vladmihalcea.hibernate.type.json.JsonStringType;

@TypeDefs({
    @TypeDef(name = "json", typeClass = JsonStringType.class)
})
@MappedSuperclass
public class BaseEntity {

}
