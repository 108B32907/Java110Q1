class Data
{
   private String name;
   private Test score;

   class Test
   {
      private int english;
      private int math;

      public Test(int eng,int m)
      {
         english=eng;
         math=m;
      }
      public double avg()
      {
         return (english+math)/2.0;
      }
   }
   public Data(String na,int eng,int ma)
   {
      name=na;
      score=new Test(eng,ma);
   }
   public void show()
   {
      System.out.println(name+" "+score.english+" "+score.math+" "+score.avg());
   }
}

public class Class03
{
   public static void main(String args[])
   {
      Data stu=new Data("Annie",85,92);
      Data stu1=new Data("Brian",77,56);
      stu.show();
      stu1.show();
   }
}
