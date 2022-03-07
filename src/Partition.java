import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Partition {
    // méthode générique
    public static  <E> List<List<E>>  partition(List<E> list,int taille)
    {
        List<List<E>> result=new ArrayList<>();
/* eviter boucle infinit*/
        if(taille<1)
        {
            return null;
        }
        else if(taille>=list.size())
            {
                result.add(list);
                return result;
            }
        else
        {int i=0;
            /* calculer nbre des sous listes */
            int nbrSousListe=(int)Math.ceil((float)list.size()/(float)taille);
            System.out.println(nbrSousListe);
            for( i =0 ;i < nbrSousListe-1;i++)
            {
                result.add(list.subList(i*taille,(i+1)*taille));

            }
            /* ajouter les derniers element de la liste */
            result.add(list.subList(i*taille,list.size()));
            return result;
        }
    }

    public static void main(String args[]) {
      //  List<String> i = Arrays.asList("chiheb","smida" ,"2", "3","4","test");
        List<Integer> i = Arrays.asList(1,2,3,3,5,6,7);
        System.out.println(partition(i,0));
    }
}
