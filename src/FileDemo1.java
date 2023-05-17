import java.io.File;

public class FileDemo1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		int count=0;
		int dirCount=0;
		int fileCount=0;
		int jpgFileCount = 0;
		int txtFileCount = 0;
		int zipFileCount = 0;
		File f=new File("cricket.txt");
		System.out.println(f.exists());//false
		f.createNewFile();
		System.out.println(f.exists());//true
		
		File f1=new File("IPLDetails");
		System.out.println(f1.exists());
		
		f1.mkdir();
		System.out.println(f1.exists());

		
		File f2=new File("iNeuron");
		f2.mkdir();
		
		System.out.println(f1.exists());
		System.out.println("Is Directory" +f2.isDirectory());
		
		File f3= new File("Hello.txt");
		f3.createNewFile();
		System.out.println("Is File  : "+f3.isFile());
		
		String location="C:\\FileDemo";
		File f4=new File(location);
		
		f4.mkdir();
		File f5=new File(f4, "First.txt");
		f5.createNewFile();
		
		String locate="e:\\Smita";
		File f6=new File(locate);
		String[] names=f6.list();
		for (String name:names)
		{
		count++;
			//System.out.println(name);
			File f7=new File(f6, name);
			if(f7.isDirectory())
			{
				dirCount++;
			}
			if(f7.isFile())
			{
				fileCount++;
				if (name.endsWith(".docx"))
					jpgFileCount++;
					if(name.endsWith(".doc"))
					txtFileCount++;
					
			}
		
			
		
		}
		System.out.println("Total Count "+count);
		System.out.println("Directory count : "+dirCount);
		System.out.println("File count : " +fileCount);
		System.out.println("Total no of JPGfiles is :: "+jpgFileCount);
		System.out.println("Total no of txtfiles is :: "+txtFileCount);
		//System.out.println("Total no of Zipfiles is :: "+zipFileCount);
		
		
		

	}

}
