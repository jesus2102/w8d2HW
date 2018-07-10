package DB;

import models.Folder;
import models.Owner;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBOwner {
    private static Session session;

    public static List<Folder> getFoldersOfOwner(Owner owner){
        session = db.HibernateUtil.getSessionFactory().openSession();
        List<Folder> result = null;

        try {
            Criteria cr = session.createCriteria(Folder.class);
            cr.add(Restrictions.eq("owner", owner));
            result = cr.list();
        } catch (HibernateException e){
            e.printStackTrace();
        }finally {
            session.close();
        }


        return result;
    }
}
