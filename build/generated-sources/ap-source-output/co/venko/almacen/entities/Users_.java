package co.venko.almacen.entities;

import co.venko.almacen.entities.Document;
import co.venko.almacen.entities.Groups;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-12T10:37:32")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> passwd;
    public static volatile ListAttribute<Users, Document> documentList;
    public static volatile ListAttribute<Users, Groups> groupsList;
    public static volatile SingularAttribute<Users, String> userName;

}