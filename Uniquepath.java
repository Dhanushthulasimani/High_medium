import java.util.ArrayList;

public class Uniquepath {

static ArrayList<String> list=new ArrayList<>();
        static int count=0;
        public static void main(String args[])
        {

            int col =3;
            int row =3;
            unique(col,row,1,1," ");
            System.out.println(count);
            for(int i=0;i<list.size();i++)
            {
                System.out.println(list.get(i)+" ");
            }
            System.out.println(list);

        }
        public static void unique(int col,int row,int c,int r,String path)
        {
            if(col==c && row==r)
            {
                list.add(path);
                count++;
                return ;
            }
            if(c>col || r>row)
            {
                return;
            }
            unique(col,row,c+1,r,path + "V");
            unique(col,row,c,r+1,path +"H");
            unique(col,row,c+1,r+1,path+ "D");

        }
    }


