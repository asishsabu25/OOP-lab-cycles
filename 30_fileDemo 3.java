import java.io.file;
class File demo 1
{
   public static void main(String[]args);
   {
      File file= new file("/home/user/Documents/OOP lab cycles");
      String [] filelist=fileList();
      for(String str:fileList)
      {
        System.out.println(str);
      }
   }
}
