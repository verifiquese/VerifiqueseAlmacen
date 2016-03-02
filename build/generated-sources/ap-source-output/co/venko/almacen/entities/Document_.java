package co.venko.almacen.entities;

import co.venko.almacen.entities.Users;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-12-12T10:37:32")
@StaticMetamodel(Document.class)
public class Document_ { 

    public static volatile SingularAttribute<Document, String> country;
    public static volatile SingularAttribute<Document, String> latitud;
    public static volatile SingularAttribute<Document, Date> birthdate;
    public static volatile SingularAttribute<Document, String> documentType;
    public static volatile SingularAttribute<Document, Long> idDocument;
    public static volatile SingularAttribute<Document, String> bloodType;
    public static volatile SingularAttribute<Document, Date> creationDate;
    public static volatile SingularAttribute<Document, Users> userName;
    public static volatile SingularAttribute<Document, String> bloodRh;
    public static volatile SingularAttribute<Document, String> firstName;
    public static volatile SingularAttribute<Document, String> longitud;
    public static volatile SingularAttribute<Document, String> secondSurname;
    public static volatile SingularAttribute<Document, String> citizenId;
    public static volatile SingularAttribute<Document, String> firstSurname;
    public static volatile SingularAttribute<Document, String> readingDate;
    public static volatile SingularAttribute<Document, String> secondName;

}