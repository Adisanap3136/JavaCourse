package principleOfOop.Shrikantsirinheritance;

class FileManager{
	private int noOfDrives;
	private String SystemName;
	private boolean recycleBean;
	
	public FileManager() {
	}

	public FileManager(int noOfDrives, String systemName, boolean recycleBean) {
		super();
		this.noOfDrives = noOfDrives;
		SystemName = systemName;
		this.recycleBean = recycleBean;
	}

	public void displayFileMnager() {
		System.out.println( "FileManager [noOfDrives=" + noOfDrives + ", SystemName=" + SystemName + ", recycleBean=" + recycleBean
				+ "]");
	}
	
}

class Drive extends FileManager{
	private String driveName;
	private String typeofDrive;
	private double spaceUsed;
	private double spaceFree;
	private double totalSize;
	private String fileSystem;
	
	public Drive() {
	}

	public Drive(String driveName, String typeofDrive, double spaceUsed, double spaceFree, double totalSize,String fileSystem,
			int noOfDrives, String systemName, boolean recycleBean) {
		super(noOfDrives, systemName, recycleBean);
		this.driveName = driveName;
		this.typeofDrive = typeofDrive;
		this.spaceUsed = spaceUsed;
		this.spaceFree = spaceFree;
		this.totalSize = totalSize;
		this.fileSystem = fileSystem;
	}

	public void displayDrive() {
		System.out.println("Drive [driveName=" + driveName + ", type=" + typeofDrive + ", spaceUsed=" + spaceUsed + ", spaceFree="
				+ spaceFree + ", totalSize=" + totalSize + ", fileSystem=" + fileSystem + "]");
	}
		
	
}

class Folder extends Drive{
	private String folderName;
	private String typeOfFolder;
	private String contains;
	private double size;
	private String dateFolderModified;
	private String dateFolderCreated;
	private String folderLocation;
	
	public Folder() {
	}

	public Folder(String folderName, String typeOfFolder, String contains, double size, String dateFolderModified,
			String dateFolderCreated, String folderLocation,
			String driveName, String typeofDrive, double spaceUsed, double spaceFree, double totalSize,String fileSystem,
			int noOfDrives, String systemName, boolean recycleBean) {
		super(driveName, typeofDrive, spaceUsed, spaceFree, totalSize, fileSystem, noOfDrives, systemName, recycleBean);
		this.folderName = folderName;
		this.typeOfFolder = typeOfFolder;
		this.contains = contains;
		this.size = size;
		this.dateFolderModified = dateFolderModified;
		this.dateFolderCreated = dateFolderCreated;
		this.folderLocation = folderLocation;
	}

	public void displayFolder() {
		System.out.println( "Folder [folderName=" + folderName + ", type=" + typeOfFolder + ", contains=" + contains + ", size=" + size
				+ ", dateFolderModified=" + dateFolderModified + ", dateFolderCreated=" + dateFolderCreated
				+ ", folderLocation=" + folderLocation + "]");
	}
	
	
}

class File extends Folder{
	private String fileName;
	private String typeOfFile;
	private String fileLocation;
	private double sizeOfFile;
	private String dateFileModified;
	private String dateFileCreated;	
	
	public File() {
	}

	public File(String fileName, String typeOfFile, String fileLocation, double sizeOfFile, String dateFileModified,String dateFileCreated,
			String folderName, String typeOfFolder, String contains, double size, String dateFolderModified,
			String dateFolderCreated, String folderLocation,
			String driveName, String typeofDrive, double spaceUsed, double spaceFree, double totalSize,String fileSystem,
			int noOfDrives, String systemName, boolean recycleBean) {
		super(folderName, typeOfFolder, contains, size, dateFolderModified, dateFolderCreated, folderLocation, driveName, typeofDrive, spaceUsed, spaceFree, totalSize, fileSystem, noOfDrives, systemName, recycleBean);
		this.fileName = fileName;
		this.typeOfFile = typeOfFile;
		this.fileLocation = fileLocation;
		this.sizeOfFile = sizeOfFile;
		this.dateFileModified = dateFileModified;
		this.dateFileCreated = dateFileCreated;
	}

	public void displayFile() {
		System.out.println( "File [fileName=" + fileName + ", type=" + typeOfFile + ", fileLocation=" + fileLocation + ", size=" + sizeOfFile
				+ ", dateFileModified=" + dateFileModified + ", dateFileCreated=" + dateFileCreated + "]");
	}
}

public class Multilevel2 {
	public static void main(String[] args) {
		File file = new File("SingleInheritance.java", ".java file", "D:\\JAVA\\OOP\\SingleInheritance", 1.2, "21-04-25 01:43AM", "21-04-25 01:30AM", "OOP", "File Folder", "1500 files 510 folder", 62, "21-04-25 01:43AM", "21-04-25 01:43AM", "D:\\JAVA\\OOP", "D:\\", "Local Disk", 35, 165, 244, "NTFS", 2, "ASUS\\ADISANAP", true);
		file.displayFileMnager();
		file.displayDrive();
		file.displayFolder();
		file.displayFile();
	}
}
